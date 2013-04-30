package zzz.progin.tubes4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.*;

import zzz.progin.tubes4.datastore.DBUtils;
import zzz.progin.tubes4.datastore.DataAccounts;


@SuppressWarnings("serial")
public class Progin_Tubes_4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		DataAccounts da = new DataAccounts("wtf", "pass rahasia", "dafuq@test.com", "Coba Coba", new Date(1992, 02, 23), "link_avatar");
		
		
		try {
			
			DBUtils.saveToDataStore(da);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<DataAccounts> hasil = DBUtils.cobaAmbil();
		System.out.println(hasil.get(0).getUsername());
		PrintWriter out = resp.getWriter();
		out.println(hasil.get(0).getUsername());
	}
}
