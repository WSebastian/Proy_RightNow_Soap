package dao;

import com.rightnow.ws.objects.Answer;

public interface AnswerDAO
{

	void map_prod_hierarchy();
	
	void map_cat_hierarchy();
	
	void getAnswerNotification();
	
	Answer access_id();
}
