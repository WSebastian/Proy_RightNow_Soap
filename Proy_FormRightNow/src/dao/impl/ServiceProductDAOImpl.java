package dao.impl;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;
import dao.ServiceCategoriesDAO;
import dao.ServiceProductDAO;

public class ServiceProductDAOImpl extends RightNowClient implements ServiceProductDAO
{
	@Override
	public void prod_lvl1_id()
	{
		try
		{
			String sql2 = "Select                                   " 
		            + "             ID,                             "
					+ "             LookupName,                     " 
		            + "             DisplayOrder,                   "
					+ "             Name                            " 
		            + "From                                         "
					+ "    ServiceProduct  LIMIT 1000";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql2, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");

				System.out.println("ServiceProduct_id :: {" + arrayStrings[0] + "}");
				System.out.println("ServiceProduct_LookupName :: {" + arrayStrings[1] + "}");
				System.out.println("ServiceProduct_DisplayOrder :: {" + arrayStrings[2] + "}");
				System.out.println("ServiceProduct_Name :: {" + arrayStrings[3] + "}");

				System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}


	
}
