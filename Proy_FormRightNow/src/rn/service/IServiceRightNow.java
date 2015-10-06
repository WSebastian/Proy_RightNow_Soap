package rn.service;

import com.rightnow.ws.objects.Answer;
import com.rightnow.ws.objects.AnswerNotification;
import com.rightnow.ws.objects.ChannelType;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.FileAttachment;

public interface IServiceRightNow
{

	
	

	
	

	
	
	ChannelType getChannelType();
	
	FileAttachment getFileAttachment();
	
	AnswerNotification getAnswerNotification();
	
	

	
	
	
	
	void getList_NamedIDDeltaList(String query);
	
	
	void getList_NamedIDHierarchyList(String query);
	
	

}
