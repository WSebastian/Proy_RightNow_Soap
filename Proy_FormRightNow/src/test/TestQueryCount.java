package test;

import java.util.List;


public class TestQueryCount<T>
{
	public static void main(String[] args)
	{

		new TestQueryCount<>().getAllRow();
	}

	public void getAllRow()
	{
		String sql = "SELECT * FROM Contact";

		List<String> incidents = new GenericClass().getListString(sql);
		
		System.out.println("::::::: Tamaño de la lista :::::::: "+incidents.size());
		
		for (int i = 0; i < incidents.size(); i++)
		{
			
			System.out.println(":::::::: "+incidents.get(i));
			
			
			
			
			
		}

	}

}
