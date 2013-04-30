package zzz.progin.tubes4.datastore;

import java.util.ArrayList;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class DataKategori {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idKategori;
	
	@Persistent
	private String namaKategori;
	
	@Persistent
	private DataAccounts accountPembuat;
	
	@Persistent
	private ArrayList<DataAccounts> user_yang_punya_kategori;
	
	@Persistent(mappedBy = "dataKategori")
	private ArrayList<DataTugas> listTugas;
	
	public DataKategori(String namaKategori){
		super();
		this.setNamaKategori(namaKategori);
		setUser_yang_punya_kategori(new ArrayList<DataAccounts>());
		setListTugas(new ArrayList<DataTugas>());
	}

	public Key getIdKategori() {
		return idKategori;
	}

	public void setIdKategori(Key idKategori) {
		this.idKategori = idKategori;
	}

	public String getNamaKategori() {
		return namaKategori;
	}

	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}

	public DataAccounts getAccountPembuat() {
		return accountPembuat;
	}

	public void setAccountPembuat(DataAccounts accountPembuat) {
		this.accountPembuat = accountPembuat;
	}

	public ArrayList<DataAccounts> getUser_yang_punya_kategori() {
		return user_yang_punya_kategori;
	}

	public void setUser_yang_punya_kategori(ArrayList<DataAccounts> user_yang_punya_kategori) {
		this.user_yang_punya_kategori = user_yang_punya_kategori;
	}

	public void addUser_yang_punya_kategori(DataAccounts dataAccounts){
		user_yang_punya_kategori.add(dataAccounts);
	}

	public ArrayList<DataTugas> getListTugas() {
		return listTugas;
	}

	public void setListTugas(ArrayList<DataTugas> listTugas) {
		this.listTugas = listTugas;
	}
	
	public void addListTugas(DataTugas dataTugas){
		listTugas.add(dataTugas);
	}
	
}
