package zzz.progin.tubes4;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Kategori {

	@WebMethod
	public String sayTest(String txt){
		return "Test " + txt;
	}
}
