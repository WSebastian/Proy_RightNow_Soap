package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.csvreader.CsvWriter;


public class TestQueryCount<T>
{
	public static void main(String[] args)
	{

		new TestQueryCount<>().getAllRow();
		

		
	}

	public void getAllRow()
	{
		String sql = "SELECT * FROM Opportunity";

		List<String> incidents = new GenericClass().getListString(sql);
		
		System.out.println("::::::: Tama�o de la lista :::::::: "+incidents.size());
		
		String outputFile = "test/export.csv";
		boolean alreadyExists = new File(outputFile).exists();
		
		if(alreadyExists){
            File ficheroUsuarios = new File(outputFile);
            ficheroUsuarios.delete();
        }
		
		try{
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Codigo");
            csvOutput.write("Nombres");
            csvOutput.write("Apellidos");
            csvOutput.write("Correo");
            csvOutput.endRecord();
            
            for (int i = 0; i < incidents.size(); i++)
    		{
    			
    			System.out.println(":::::::: "+incidents.get(i));

    		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
