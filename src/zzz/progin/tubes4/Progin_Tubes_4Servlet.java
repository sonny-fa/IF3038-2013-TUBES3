package zzz.progin.tubes4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import zzz.progin.tubes4.datastore.DBUtils;
import zzz.progin.tubes4.datastore.DataAccounts;
import zzz.progin.tubes4.datastore.DataKategori;


@SuppressWarnings("serial")
public class Progin_Tubes_4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
//		DataAccounts da = new DataAccounts("wtf", "pass rahasia", "dafuq@test.com", "Coba Coba", new Date(1992, 02, 23), "link_avatar");
//		PersistenceManager pm = DBUtils.get().getPersistenceManager();
//		DataKategori dk = new DataKategori("kategori super");
//		DataAccounts da = pm.getObjectById(DataAccounts.class, 35);
//		dk.setAccountPembuat(da);
//		pm.close();
		try {
			
//			DBUtils.saveToDataStore(da);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<DataAccounts> hasil = DBUtils.cobaAmbil();
		hasil.get(0).addKategori_yang_dibuat(new DataKategori("kategori xxx"));
//		//System.out.println(hasil.get(0).getUsername());
//		PrintWriter out = resp.getWriter();
		//out.println(hasil.get(0).getKey());
	}
}
