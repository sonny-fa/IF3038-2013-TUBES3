package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class DataKomentar {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String isi;
	
	//foreign key
	@Persistent
	private DataAccounts pembuatKomentar;
	
	@Persistent
	private DataTugas dataTugas;
	
	public DataKomentar(String isi){
		this.setIsi(isi);
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}

	public DataAccounts getPembuatKomentar() {
		return pembuatKomentar;
	}

	public void setPembuatKomentar(DataAccounts pembuatKomentar) {
		this.pembuatKomentar = pembuatKomentar;
	}

	public DataTugas getDataTugas() {
		return dataTugas;
	}

	public void setDataTugas(DataTugas dataTugas) {
		this.dataTugas = dataTugas;
	}
}
