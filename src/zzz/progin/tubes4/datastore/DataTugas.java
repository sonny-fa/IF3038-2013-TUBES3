package zzz.progin.tubes4.datastore;

import java.util.ArrayList;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class DataTugas {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nama;
	
	@Persistent
	private Date deadline;
	
	@Persistent
	private boolean status_selesai;
	
	
	//foreignkeys
	@Persistent
	private DataKategori dataKategori;
	
	@Persistent
	private DataAccounts accountPembuatTugas;
	
	@Persistent
	private ArrayList<DataAccounts> accountPesertaTugas;
	
	@Persistent(mappedBy = "dataTugas")
	private ArrayList<DataKomentar> listKomentar;
	
	@Persistent
	private ArrayList<DataTag> listTag;
	
	@Persistent(mappedBy = "pemilikAttachment")
	private ArrayList<DataAttachment> dataAttachment;
	
	public DataTugas(String nama, Date deadline){
		this.setNama(nama);
		this.setDeadline(deadline);
		setAccountPesertaTugas(new ArrayList<DataAccounts>());
		setListKomentar(new ArrayList<DataKomentar>());
		setListTag(new ArrayList<DataTag>());
		setDataAttachment(new ArrayList<DataAttachment>());
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

	public DataKategori getDataKategori() {
		return dataKategori;
	}

	public void setDataKategori(DataKategori dataKategori) {
		this.dataKategori = dataKategori;
	}

	public DataAccounts getAccountPembuatTugas() {
		return accountPembuatTugas;
	}

	public void setAccountPembuatTugas(DataAccounts accountPembuatTugas) {
		this.accountPembuatTugas = accountPembuatTugas;
	}

	public ArrayList<DataAccounts> getAccountPesertaTugas() {
		return accountPesertaTugas;
	}

	public void setAccountPesertaTugas(ArrayList<DataAccounts> accountPesertaTugas) {
		this.accountPesertaTugas = accountPesertaTugas;
	}

	public ArrayList<DataKomentar> getListKomentar() {
		return listKomentar;
	}

	public void setListKomentar(ArrayList<DataKomentar> listKomentar) {
		this.listKomentar = listKomentar;
	}

	public ArrayList<DataTag> getListTag() {
		return listTag;
	}

	public void setListTag(ArrayList<DataTag> listTag) {
		this.listTag = listTag;
	}

	public ArrayList<DataAttachment> getDataAttachment() {
		return dataAttachment;
	}

	public void setDataAttachment(ArrayList<DataAttachment> dataAttachment) {
		this.dataAttachment = dataAttachment;
	}
	
	public void addPesertaTugas(DataAccounts dataAccounts){
		accountPesertaTugas.add(dataAccounts);
	}
	
	public void addKomentar(DataKomentar dataKomentar){
		listKomentar.add(dataKomentar);
	}
	
	public void addTag(DataTag dataTag){
		listTag.add(dataTag);
	}
	
	public void addAttachment(DataAttachment dataAttachment){
		this.dataAttachment.add(dataAttachment);
	}
}
