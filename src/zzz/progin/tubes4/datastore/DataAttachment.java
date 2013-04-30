package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class DataAttachment {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nama;
	
	@Persistent
	private String path;
	
	
	//foreign keys
	@Persistent
	private DataTugas pemilikAttachment;
	
	public DataAttachment(String nama){
		this.setNama(nama);
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public DataTugas getPemilikAttachment() {
		return pemilikAttachment;
	}

	public void setPemilikAttachment(DataTugas pemilikAttachment) {
		this.pemilikAttachment = pemilikAttachment;
	}
}
