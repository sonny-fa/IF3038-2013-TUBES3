package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class DataKomentar {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private int idKomentar;
	
	@Persistent
	private String isi;
	
	@Persistent
	private int tugas_idTugas;
	
	@Persistent
	private int account_idAccount;
	
	public DataKomentar(String isi, int idTugas, int idAccount){
		this.isi = isi;
		this.tugas_idTugas = idTugas;
		this.account_idAccount = idAccount;
	}
}
