package zzz.progin.tubes4.datastore;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import org.datanucleus.store.types.sco.simple.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public final class DBUtils {
	private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("transactions-optional");
	
	private DBUtils(){}
	
	public static PersistenceManagerFactory get(){
		return pmfInstance;
	}
	
	public static void saveToDataStore(Object data) throws Exception{
		PersistenceManager pm = get().getPersistenceManager();
		try{
			pm.makePersistent(data);
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			pm.close();
		}
	}
	
	public static List<DataAccounts> cobaAmbil(){
		
		PersistenceManager pm = get().getPersistenceManager();
		Query query = pm.newQuery(DataAccounts.class);
		query.setFilter("username == pUserName");
		query.declareParameters("String pUserName");
		List<DataAccounts> hasil = null;
		try{
			hasil = (List<DataAccounts>) query.execute("wtf");
		}
		finally{
			query.closeAll();
		}
		
		return hasil;
	}
}
