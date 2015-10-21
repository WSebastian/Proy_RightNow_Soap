package dao.impl;


import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;
import dao.PacificoDAO;

public class PacificoDAOImpl extends RightNowClient implements PacificoDAO
{

	@Override
	public void getPacificoHistorialDeLlamada()
	{
		try
		{
			String sql = "SELECT ID, "
					+ "          CreatedTime,"
					+ "          TipoDellamada,"
					+ "          CreatedByAccount,"
					+ "          Incident"
					+ " FROM Pacifico.HistorialDeLlamada LIMIT 10";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");
				
				System.out.println("Pacifico.HistorialDeLlamada_ID: "+arrayStrings[0]);
				System.out.println("Pacifico.HistorialDeLlamada_CreatedTime: "+arrayStrings[1]);
				System.out.println("Pacifico.HistorialDeLlamada_TipoDellamada: "+arrayStrings[2]);
				System.out.println("Pacifico.HistorialDeLlamada_CreatedByAccount: "+arrayStrings[3]);
				System.out.println("Pacifico.HistorialDeLlamada_Incident: "+arrayStrings[4]);
				
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void getPacificoEsic()
	{
		try
		{
			String sql = "SELECT ID,"
					+ "          CreatedTime,"
					+ "          CreatedByAccount,"
					+ "          ESIC,"
					+ "          Incident "
					+ "   FROM Pacifico.ESIC";
			
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");
				
				System.out.println("Pacifico.ESIC_ID: "+arrayStrings[0]);
				System.out.println("Pacifico.ESIC_CreatedTime: "+arrayStrings[1]);
				System.out.println("Pacifico.ESIC_CreatedByAccount: "+arrayStrings[2]);
				System.out.println("Pacifico.ESIC_ESIC: "+arrayStrings[3]);
				System.out.println("Pacifico.ESIC_INCIDENT: "+arrayStrings[4]);
		
				
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

			}
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
