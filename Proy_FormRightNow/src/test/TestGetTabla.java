package test;

import rn.service.IServiceRightNow;
import rn.service.impl.IServiceRightNowImpl;

public class TestGetTabla
{

	IServiceRightNow iServiceRightNow = new IServiceRightNowImpl();
	
	public static void main(String[] args)
	{
		
		new TestGetTabla().getAnswerNotification();
	}

	private void getFileAttachment()
	{
		iServiceRightNow.getFileAttachment();
	}

	private void getChannelType()
	{
		iServiceRightNow.getChannelType();
	}

	private void getAnswer()
	{
		iServiceRightNow.getAnswer();
	}
	
	private void getAnswerNotification()
	{
		iServiceRightNow.getAnswerNotification();
	}

}
