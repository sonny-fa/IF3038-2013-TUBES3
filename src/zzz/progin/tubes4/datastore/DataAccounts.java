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
	private int idAccounts;

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

	public DataAccounts(String username, String password, String email,
			String namaLengkap, Date tanggalLahir, String avatar) {
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		this.setNamaLengkap(namaLengkap);
		this.setTanggalLahir(tanggalLahir);
		this.setAvatar(avatar);
	}


	public int getIdAccounts() {
		return idAccounts;
	}


	public void setIdAccounts(int idAccounts) {
		this.idAccounts = idAccounts;
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

	
}
