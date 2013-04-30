package zzz.progin.tubes4.datastore;

import java.util.ArrayList;
import java.util.Date;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class DataAccounts {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idAccounts;

	@Persistent
	private String username;

	@Persistent
	private String password;

	@Persistent
	private String email;

	@Persistent
	private String namaLengkap;

	@Persistent
	private Date tanggalLahir;

	@Persistent
	private String avatar;

	// data dari kelas lain. Semacam foreign key

	@Persistent(mappedBy = "accountPembuat")
	private ArrayList<DataKategori> kategori_yang_dibuat;

	@Persistent
	private ArrayList<DataKategori> kategori_yang_dimiliki;

	@Persistent(mappedBy = "accountPembuat")
	private ArrayList<DataTugas> tugas_yang_dibuat;

	@Persistent
	private ArrayList<DataTugas> tugas_yang_dimiliki;

	@Persistent(mappedBy = "pembuatKomentar")
	private ArrayList<DataKomentar> komentar_yang_dibuat;

	public DataAccounts(String username, String password, String email,
			String namaLengkap, Date tanggalLahir, String avatar) {
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		this.setNamaLengkap(namaLengkap);
		this.setTanggalLahir(tanggalLahir);
		this.setAvatar(avatar);
		setKategori_yang_dibuat(new ArrayList<DataKategori>());
		setKategori_yang_dimiliki(new ArrayList<DataKategori>());
		setTugas_yang_dibuat(new ArrayList<DataTugas>());
		setTugas_yang_dimiliki(new ArrayList<DataTugas>());
		setKomentar_yang_dibuat(new ArrayList<DataKomentar>());
	}

	public Key getKey() {
		return idAccounts;
	}

	public void setKey(Key key) {
		this.idAccounts = key;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public ArrayList<DataKategori> getKategori_yang_dibuat() {
		return kategori_yang_dibuat;
	}

	public void setKategori_yang_dibuat(
			ArrayList<DataKategori> kategori_yang_dibuat) {
		this.kategori_yang_dibuat = kategori_yang_dibuat;
	}

	public void addKategori_yang_dibuat(DataKategori dataKategori) {
		kategori_yang_dibuat.add(dataKategori);
	}

	public ArrayList<DataKategori> getKategori_yang_dimiliki() {
		return kategori_yang_dimiliki;
	}

	public void setKategori_yang_dimiliki(
			ArrayList<DataKategori> kategori_yang_dimiliki) {
		this.kategori_yang_dimiliki = kategori_yang_dimiliki;
	}

	public void addKategori_yang_dimiliki(DataKategori dataKategori) {
		kategori_yang_dimiliki.add(dataKategori);
	}

	public ArrayList<DataTugas> getTugas_yang_dibuat() {
		return tugas_yang_dibuat;
	}

	public void setTugas_yang_dibuat(ArrayList<DataTugas> tugas_yang_dibuat) {
		this.tugas_yang_dibuat = tugas_yang_dibuat;
	}

	public void addTugas_yang_dibuat(DataTugas dataTugas) {
		tugas_yang_dibuat.add(dataTugas);
	}

	public ArrayList<DataTugas> getTugas_yang_dimiliki() {
		return tugas_yang_dimiliki;
	}

	public void setTugas_yang_dimiliki(ArrayList<DataTugas> tugas_yang_dimiliki) {
		this.tugas_yang_dimiliki = tugas_yang_dimiliki;
	}
	
	public void addTugas_yang_dimiliki(DataTugas dataTugas) {
		tugas_yang_dimiliki.add(dataTugas);
	}

	public ArrayList<DataKomentar> getKomentar_yang_dibuat() {
		return komentar_yang_dibuat;
	}

	public void setKomentar_yang_dibuat(ArrayList<DataKomentar> komentar_yang_dibuat) {
		this.komentar_yang_dibuat = komentar_yang_dibuat;
	}
	
	public void addKomentar_yang_dibuat(DataKomentar dataKomentar) {
		komentar_yang_dibuat.add(dataKomentar);
	}
}
