package zzz.progin.tubes4.datastore;

import java.util.ArrayList;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class DataTugas {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private int idTugas;
	
	@Persistent
	private String nama;
	
	@Persistent
	private Date deadline;
	
	@Persistent
	private boolean status_selesai;
	
	@Persistent
	private int kategori_idKategori;
	
	public DataTugas(String nama, Date deadline, int idKategori){
		this.setNama(nama);
		this.setDeadline(deadline);		
		this.status_selesai = false;
		this.setKategori_idKategori(idKategori);
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public boolean isStatus_selesai() {
		return status_selesai;
	}

	public void setStatus_selesai(boolean status_selesai) {
		this.status_selesai = status_selesai;
	}

	public int getIdTugas() {
		return idTugas;
	}

	public void setIdTugas(int idTugas) {
		this.idTugas = idTugas;
	}

	public int getKategori_idKategori() {
		return kategori_idKategori;
	}

	public void setKategori_idKategori(int kategori_idKategori) {
		this.kategori_idKategori = kategori_idKategori;
	}
}
