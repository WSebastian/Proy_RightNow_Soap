package test;

import rn.service.IServiceRightNow;
import rn.service.impl.IServiceRightNowImpl;

public class TestGetTabla
{

	IServiceRightNow iServiceRightNow = new IServiceRightNowImpl();
	
	public static void main(String[] args)
	{
		
		new TestGetTabla().getAccounts();
	}

	private void getAccounts()
	{
		
		iServiceRightNow.getAnswer("Juan Perez");
		
		
	}

}
