package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;

public class GenericClass extends RightNowClient
{
	
	private static final Logger logger = LogManager.getLogger(GenericClass.class);

	public List<String> getListString(String sql)
	{
		List<String> listString = new ArrayList<String>();
		List<CSVRow> csvRows = getAllRows(sql);
		logger.trace("Salio::::::::: tamaño de paquetes: " + csvRows.size());
		System.out.println("Salio::::::::: tamaño de paquetes: " + csvRows.size());
		logger.trace("Antes de llenar");
		System.out.println("Antes de llenar");
		
		int c=0;
		for (int i = 0; i < csvRows.size(); i++)
		{
			
			
			
			CSVRow csvRow = csvRows.get(i);
			for (int j = 0; j < csvRow.getRow().length; j++)
			{
				String fila = csvRow.getRow()[j];
				listString.add(fila);
			}
		}
		return listString;
	}

	private List<CSVRow> getAllRows(String sql)
	{
		List<CSVRow> csvRows = null;
		try
		{
			Integer rowCounts = getRowCounts(sql.split("FROM")[1]);
			logger.trace("Tamaño de registros contados devuelto: " + rowCounts);
			System.out.println("Tamaño de registros contados devuelto: " + rowCounts);

			CSVRow csvRow;
			csvRows = new ArrayList<CSVRow>();

			if (rowCounts > 10001)
			{
				String resultado[] = generateGave(rowCounts).split(",");

				Integer divisor = Integer.parseInt(resultado[0].trim());
				Integer cociente = Integer.parseInt(resultado[1].trim());
				Integer residuo = Integer.parseInt(resultado[2].trim());
				Integer count = 0;

				logger.trace("Divisor: " + divisor);
				logger.trace("cociente: " + cociente);
				logger.trace("residuo: " + residuo);
				System.out.println("Divisor: " + divisor);
				System.out.println("cociente: " + cociente);
				System.out.println("residuo: " + residuo);
				String sqlGenerate = null;

				if (residuo != 0)
				{
					divisor = divisor - 1;
				}

				do
				{
					

					if (count == 0)
					{
						sqlGenerate = sql + " LIMIT 10000 OFFSET 1";
					} 
					else
					{
						sqlGenerate = sql + " LIMIT 10000 OFFSET " + (count * 10000);

					}
					logger.trace("Query Generado: " + sqlGenerate);
					System.out.println("Query Generado: " + sqlGenerate);

					
					csvRow = getResultQueryCSVRow(sqlGenerate);
					
					
				

					csvRows.add(csvRow);
					
					count++;

				} while (count < divisor+1);



			} else
			{
				csvRow = getResultQueryCSVRow(sql);

				csvRows.add(csvRow);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return csvRows;

	}

	public String generateGave(Integer rowCounts)
	{
		Integer cociente = 0;
		Integer residuo = 0;

		Integer divisor = 0;
		do
		{
			divisor++;
			cociente = rowCounts / divisor;
			residuo = rowCounts % divisor;

		} while (!(cociente <= 10000));

		return divisor + ", " + cociente + ", " + residuo;
	}

	private Integer getRowCounts(String entityName)
	{

		CSVRow csvRow = getResultQueryCSVRow("SELECT count(*) FROM " + entityName);
		Integer count = Integer.parseInt(csvRow.getRow()[0]);
		return count;

	}

	private CSVRow getResultQueryCSVRow(String sql)
	{
		CSVRow csvRow = null;
		try
		{
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, "$", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));
			csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return csvRow;
	}

}
