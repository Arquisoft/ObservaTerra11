package conf;

import business.impl.AdminONGServiceImpl;
import business.impl.EmployeeServiceImpl;
import business.impl.GeneralAdminServiceImpl;

public class ServicesFactory {
	
	public static EmployeeServiceImpl getEmployeeServiceImpl()
	{
		return new EmployeeServiceImpl();
	}
	

	public static AdminONGServiceImpl getAdminAdminONGServiceImpl()
	{
		return new AdminONGServiceImpl();
	}
	
	public static GeneralAdminServiceImpl getGeneralAdminServiceImpl()
	{
		return new GeneralAdminServiceImpl();
	}
	
}
