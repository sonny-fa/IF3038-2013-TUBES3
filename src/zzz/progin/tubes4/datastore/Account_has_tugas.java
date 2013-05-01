package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Account_has_tugas {

	@Persistent
	private int account_idAccount;
	
	@Persistent
	private int tugas_idTugas;
	
	@Persistent
	private boolean isPembuat;
	
	public Account_has_tugas(int idAccount, int idTugas, boolean isPembuat){
		this.setAccount_idAccount(idAccount);
		this.setTugas_idTugas(idTugas);
		this.setPembuat(isPembuat);
	}

	public boolean isPembuat() {
		return isPembuat;
	}

	public void setPembuat(boolean isPembuat) {
		this.isPembuat = isPembuat;
	}

	public int getTugas_idTugas() {
		return tugas_idTugas;
	}

	public void setTugas_idTugas(int tugas_idTugas) {
		this.tugas_idTugas = tugas_idTugas;
	}

	public int getAccount_idAccount() {
		return account_idAccount;
	}

	public void setAccount_idAccount(int account_idAccount) {
		this.account_idAccount = account_idAccount;
	}
}
