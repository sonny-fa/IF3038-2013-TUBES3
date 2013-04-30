package zzz.progin.tubes4.datastore;

import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class DataTag {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nama;
	
	//foreign keys
	
	@Persistent
	private ArrayList<DataTugas> listTugas;	
	
	public DataTag(String nama){
		this.setNama(nama);
		setListTugas(new ArrayList<DataTugas>());
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public ArrayList<DataTugas> getListTugas() {
		return listTugas;
	}

	public void setListTugas(ArrayList<DataTugas> listTugas) {
		this.listTugas = listTugas;
	}
	
	public void addTugas(DataTugas dataTugas){
		listTugas.add(dataTugas);
	}
}
