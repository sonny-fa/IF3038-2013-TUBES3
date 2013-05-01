package zzz.progin.tubes4.datastore;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import org.datanucleus.store.types.sco.simple.Collection;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class DBUtils {
	private static final PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");

	private DBUtils() {
	}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}

	public static void saveToDataStore(Object data) throws Exception {
		PersistenceManager pm = get().getPersistenceManager();
		try {
			pm.makePersistent(data);
		} catch (Exception ex) {
			throw ex;
		} finally {
			pm.close();
		}
	}

	public static List<DataAccounts> cobaAmbil(){
		
		PersistenceManager pm = get().getPersistenceManager();
//		Query query = pm.newQuery("select from "+DataAccounts.class.getSimpleName() + " where email == 'deadliner@dead.com'");
		Query query = pm.newQuery(DataAccounts.class);
		query.setFilter("username == pUsername");
		query.declareParameters("String pUsername");		
//		query.setResultClass(DataAccounts.class);
//		DataKategori dk = (DataKategori) pm.getObjectById(DataKategori.class, 51);
//		System.out.prLongln("hasil = "+dk.getNamaKategori());
		
		List<DataAccounts> hasil = 	(List<DataAccounts>) query.execute("DeadlineRanger");
		
		query.closeAll();
		DataAccounts da= (DataAccounts) pm.getObjectById(DataAccounts.class, 59);
		
		return hasil;
	}

	// query-query tambah data baru
	public static void buatDataAccount(DataAccounts dataAccount){
		try {
			saveToDataStore(dataAccount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void buatDataKategori(String namaKategori, Long idAccount){
		DataKategori dk = new DataKategori(namaKategori, idAccount);
		try {
			saveToDataStore(dk);
			saveToDataStore(new Assignee_has_kategori(idAccount, dk.getIdKategori()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void buatDataTugas(String namaTugas, Date deadline, Long idAccount, Long idKategori){
		DataTugas dt = new DataTugas(namaTugas, deadline, idKategori);
		try{
			saveToDataStore(dt);
			saveToDataStore(new Account_has_tugas(idAccount, dt.getIdTugas(), true));
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void buatDataKomentar(String isi, Long idAccount, Long idTugas){
		DataKomentar dk = new DataKomentar(isi, idTugas, idAccount);
		try{
			saveToDataStore(dk);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	// public static void buatDataKategori(String nama, String username) throws
	// Exception{
	// PersistenceManager pm = get().getPersistenceManager();
	// Query query = pm.newQuery(DataAccounts.class);
	// query.setFilter("username == pUsername");
	// query.declareParameters("String pUsername");
	//
	// List<DataAccounts> hasil = null;
	// try{
	// hasil = (List<DataAccounts>) query.execute(username);
	// }
	// finally{
	// query.closeAll();
	// }
	//
	// if(!hasil.isEmpty()){
	// DataKategori dk = new DataKategori(nama);
	// hasil.get(0).addKategori_yang_dibuat(dk);
	// }
	//
	// pm.close();
	// }
	//
	// public static void buatTugas(String nama, Date deadline, String
	// namaKategori, String username){
	// PersistenceManager pm = get().getPersistenceManager();
	// Query query = pm.newQuery(DataKategori.class);
	// query.setFilter("namaKategori == pNama");
	// query.declareParameters("String pNamaKategori");
	//
	// List<DataKategori> hasil = null;
	// try{
	// hasil = (List<DataKategori>) query.execute(namaKategori);
	// }
	// finally{
	// query.closeAll();
	// }
	// DataTugas dt = null;
	// if(!hasil.isEmpty()){
	// System.out.prLongln(hasil.get(0).getNamaKategori());
	// dt = new DataTugas(nama, deadline);
	// System.out.prLongln(dt.getNama());
	// System.out.prLongln(dt.getDeadline());
	// System.out.prLongln(hasil.get(0).getNamaKategori());
	//
	// hasil.get(0).addListTugas(dt);
	// }
	// Query query2 = pm.newQuery(DataAccounts.class);
	// query2.setFilter("username == pUsername");
	// query2.declareParameters("String pUsername");
	//
	// List<DataAccounts> hasil2 = null;
	// try{
	// hasil2 = (List<DataAccounts>) query2.execute(username);
	// }
	// finally{
	// query2.closeAll();
	// }
	//
	// if(!hasil2.isEmpty()){
	//
	// hasil2.get(0).addTugas_yang_dibuat(dt);
	// }
	//
	// pm.close();
	// }
	//
	// public static void buatKomentar(String isi, String namaTugas, String
	// username){
	// PersistenceManager pm = get().getPersistenceManager();
	// Query query = pm.newQuery(DataTugas.class);
	// query.setFilter("nama == pNama");
	// query.declareParameters("String pNama");
	//
	// List<DataTugas> hasil = null;
	// try{
	// hasil = (List<DataTugas>) query.execute(namaTugas);
	// }
	// finally{
	// query.closeAll();
	// }
	//
	// Query query2 = pm.newQuery(DataAccounts.class);
	// query2.setFilter("username == pUsername");
	// query2.declareParameters("String pUsername");
	//
	// List<DataAccounts> hasil2 = null;
	// try{
	// hasil2 = (List<DataAccounts>) query2.execute(username);
	// }
	// finally{
	// query2.closeAll();
	// }
	//
	// if(!hasil.isEmpty() && !hasil2.isEmpty()){
	// DataKomentar dk = new DataKomentar(isi);
	//
	// hasil.get(0).addKomentar(dk);
	// hasil2.get(0).addKomentar_yang_dibuat(dk);
	// }
	//
	// pm.close();
	// }
}
