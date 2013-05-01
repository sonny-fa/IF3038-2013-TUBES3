package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Account_has_tugas {

	@Persistent
	private Long account_idAccount;
	
	@Persistent
	private Long tugas_idTugas;
	
	@Persistent
	private boolean isPembuat;
	
	public Account_has_tugas(Long idAccount, Long idTugas, boolean isPembuat){
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

	public Long getTugas_idTugas() {
		return tugas_idTugas;
	}

	public void setTugas_idTugas(Long tugas_idTugas) {
		this.tugas_idTugas = tugas_idTugas;
	}

	public Long getAccount_idAccount() {
		return account_idAccount;
	}

	public void setAccount_idAccount(Long account_idAccount) {
		this.account_idAccount = account_idAccount;
	}
}
