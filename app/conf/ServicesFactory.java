package conf;

import business.AdminONGService;
import business.EmployeeService;
import business.GeneralAdminService;
import business.GeneralService;
import business.impl.AdminONGServiceImpl;
import business.impl.EmployeeServiceImpl;
import business.impl.GeneralAdminServiceImpl;
import business.impl.GeneralServiceImpl;

public class ServicesFactory {
	
	public static EmployeeService getEmployeeService()
	{
		return new EmployeeServiceImpl();
	}
	

	public static AdminONGService getAdminAdminONGService()
	{
		return new AdminONGServiceImpl();
	}
	
	public static GeneralAdminService getGeneralAdminService()
	{
		return new GeneralAdminServiceImpl();
	}
	
	public static GeneralService getGeneralService(){
		return new GeneralServiceImpl();
	}
}
