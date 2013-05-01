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
	private Long idKategori;
	
	@Persistent
	private String namaKategori;
	
	@Persistent
	private Long pembuat;
	
	
	
	public DataKategori(String namaKategori, Long pembuat){
		super();
		this.setNamaKategori(namaKategori);
		this.pembuat = pembuat;
	}



	public Long getIdKategori() {
		return idKategori;
	}



	public void setIdKategori(Long idKategori) {
		this.idKategori = idKategori;
	}



	public String getNamaKategori() {
		return namaKategori;
	}



	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}



	public Long getPembuat() {
		return pembuat;
	}



	public void setPembuat(Long pembuat) {
		this.pembuat = pembuat;
	}

	
	
}
