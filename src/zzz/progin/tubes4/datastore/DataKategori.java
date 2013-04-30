package zzz.progin.tubes4.datastore;

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
	private DataAccounts dataAccount;
	
	public DataKategori(String namaKategori, DataAccounts dataAccounts){
		super();
		this.setNamaKategori(namaKategori);
		this.setDataAccount(dataAccounts);
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

	public DataAccounts getDataAccount() {
		return dataAccount;
	}

	public void setDataAccount(DataAccounts dataAccount) {
		this.dataAccount = dataAccount;
	}
}
