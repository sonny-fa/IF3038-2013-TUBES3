package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Assignee_has_kategori {

	@Persistent
	private Long accounts_idAccount;
	
	@Persistent
	private Long kategori_idKategori;
	
	public Assignee_has_kategori(Long accounts_idAccount, Long kategori_idKategori){
		this.setAccounts_idAccount(accounts_idAccount);
		this.setKategori_idKategori(kategori_idKategori);
	}

	public Long getAccounts_idAccount() {
		return accounts_idAccount;
	}

	public void setAccounts_idAccount(Long accounts_idAccount) {
		this.accounts_idAccount = accounts_idAccount;
	}

	public Long getKategori_idKategori() {
		return kategori_idKategori;
	}

	public void setKategori_idKategori(Long kategori_idKategori) {
		this.kategori_idKategori = kategori_idKategori;
	}
}
