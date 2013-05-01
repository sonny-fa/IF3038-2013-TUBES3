package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Assignee_has_kategori {

	@Persistent
	private int accounts_idAccount;
	
	@Persistent
	private int kategori_idKategori;
	
	public Assignee_has_kategori(int accounts_idAccount, int kategori_idKategori){
		this.setAccounts_idAccount(accounts_idAccount);
		this.setKategori_idKategori(kategori_idKategori);
	}

	public int getAccounts_idAccount() {
		return accounts_idAccount;
	}

	public void setAccounts_idAccount(int accounts_idAccount) {
		this.accounts_idAccount = accounts_idAccount;
	}

	public int getKategori_idKategori() {
		return kategori_idKategori;
	}

	public void setKategori_idKategori(int kategori_idKategori) {
		this.kategori_idKategori = kategori_idKategori;
	}
}
