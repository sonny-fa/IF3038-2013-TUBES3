package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class DataAttachment {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private int idAttachment;
	
	@Persistent
	private String nama;
	
	@Persistent
	private String path;
	
	@Persistent
	private int idTugas;
	
	public DataAttachment(String nama, int idTugas){
		this.setNama(nama);
		this.path = "";
		this.setIdTugas(idTugas);
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

	public int getIdAttachment() {
		return idAttachment;
	}

	public void setIdAttachment(int idAttachment) {
		this.idAttachment = idAttachment;
	}


	public int getIdTugas() {
		return idTugas;
	}


	public void setIdTugas(int idTugas) {
		this.idTugas = idTugas;
	}
}
