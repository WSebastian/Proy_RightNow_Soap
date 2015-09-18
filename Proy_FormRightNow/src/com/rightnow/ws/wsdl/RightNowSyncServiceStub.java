
/**
 * RightNowSyncServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package com.rightnow.ws.wsdl;

        

        /*
        *  RightNowSyncServiceStub java implementation
        */

        
        public class RightNowSyncServiceStub extends org.apache.axis2.client.Stub
        implements RightNowSyncService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("RightNowSyncService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[20];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "convertObjectToGeneric"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaDataForClass"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "queryCSV"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaDataLastChangeTime"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "update"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "runAnalyticsReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "convertGenericToObject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaData"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "queryObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "resetContactPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getFileData"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getValuesForNamedIDHierarchy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "get"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "create"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "destroy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "transferSubObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "batch"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "sendMailingToContact"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "executeMarketingFlow"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getValuesForNamedID"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","RequestErrorFault"),"com.rightnow.ws.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","UnexpectedErrorFault"),"com.rightnow.ws.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_2","ServerErrorFault"),"com.rightnow.ws.faults.ServerErrorFault");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public RightNowSyncServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public RightNowSyncServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public RightNowSyncServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://pacifico--dev.custhelp.com/cgi-bin/pacifico.cfg/services/soap" );
                
    }

    /**
     * Default Constructor
     */
    public RightNowSyncServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://pacifico--dev.custhelp.com/cgi-bin/pacifico.cfg/services/soap" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public RightNowSyncServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#convertObjectToGeneric
                     * @param convertObjectToGeneric166
                    
                     * @param clientInfoHeader168
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.RNObjectsResult convertObjectToGeneric(

                            com.rightnow.ws.base.RNObject[] rNObjects167,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader168)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("ConvertObjectToGeneric");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.ConvertObjectToGeneric dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects167,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "convertObjectToGeneric")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader168!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader168 = toOM(clientInfoHeader168, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "convertObjectToGeneric")));
                                                    addHeader(omElementclientInfoHeader168,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.ConvertObjectToGenericResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getConvertObjectToGenericResponseRNObjectsResult((com.rightnow.ws.messages.ConvertObjectToGenericResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startconvertObjectToGeneric
                    * @param convertObjectToGeneric166
                
                    * @param clientInfoHeader168
                
                */
                public  void startconvertObjectToGeneric(

                 com.rightnow.ws.base.RNObject[] rNObjects167,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader168,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("ConvertObjectToGeneric");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.ConvertObjectToGeneric dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects167,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "convertObjectToGeneric")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader168!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader168 = toOM(clientInfoHeader168, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "convertObjectToGeneric")));
                                                    addHeader(omElementclientInfoHeader168,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.ConvertObjectToGenericResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultconvertObjectToGeneric(
                                            getConvertObjectToGenericResponseRNObjectsResult((com.rightnow.ws.messages.ConvertObjectToGenericResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorconvertObjectToGeneric(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorconvertObjectToGeneric((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorconvertObjectToGeneric((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorconvertObjectToGeneric((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorconvertObjectToGeneric(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            }
									    } else {
										    callback.receiveErrorconvertObjectToGeneric(f);
									    }
									} else {
									    callback.receiveErrorconvertObjectToGeneric(f);
									}
								} else {
								    callback.receiveErrorconvertObjectToGeneric(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorconvertObjectToGeneric(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#getMetaDataForClass
                     * @param getMetaDataForClass171
                    
                     * @param clientInfoHeader175
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.metadata.MetaDataClass[] getMetaDataForClass(

                            java.lang.String[] className172,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName173,java.lang.String[] metaDataLink174,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader175)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("GetMetaDataForClass");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.GetMetaDataForClass dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    className172,
                                                    qualifiedClassName173,
                                                    metaDataLink174,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getMetaDataForClass")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader175!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader175 = toOM(clientInfoHeader175, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaDataForClass")));
                                                    addHeader(omElementclientInfoHeader175,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetMetaDataForClassResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataForClassResponseMetaDataClass((com.rightnow.ws.messages.GetMetaDataForClassResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startgetMetaDataForClass
                    * @param getMetaDataForClass171
                
                    * @param clientInfoHeader175
                
                */
                public  void startgetMetaDataForClass(

                 java.lang.String[] className172,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName173,java.lang.String[] metaDataLink174,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader175,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("GetMetaDataForClass");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.GetMetaDataForClass dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    className172,
                                                    qualifiedClassName173,
                                                    metaDataLink174,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getMetaDataForClass")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader175!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader175 = toOM(clientInfoHeader175, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaDataForClass")));
                                                    addHeader(omElementclientInfoHeader175,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetMetaDataForClassResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaDataForClass(
                                            getGetMetaDataForClassResponseMetaDataClass((com.rightnow.ws.messages.GetMetaDataForClassResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaDataForClass(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaDataForClass((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaDataForClass((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaDataForClass((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaDataForClass(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaDataForClass(f);
									    }
									} else {
									    callback.receiveErrorgetMetaDataForClass(f);
									}
								} else {
								    callback.receiveErrorgetMetaDataForClass(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaDataForClass(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#queryCSV
                     * @param queryCSV178
                    
                     * @param clientInfoHeader184
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.QueryCSVResponseMsg queryCSV(

                            java.lang.String query179,int pageSize180,java.lang.String delimiter181,boolean returnRawResult182,boolean disableMTOM183,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader184)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("QueryCSV");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.QueryCSV dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query179,
                                                    pageSize180,
                                                    delimiter181,
                                                    returnRawResult182,
                                                    disableMTOM183,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "queryCSV")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader184!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader184 = toOM(clientInfoHeader184, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "queryCSV")));
                                                    addHeader(omElementclientInfoHeader184,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.QueryCSVResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getQueryCSV((com.rightnow.ws.messages.QueryCSVResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startqueryCSV
                    * @param queryCSV178
                
                    * @param clientInfoHeader184
                
                */
                public  void startqueryCSV(

                 java.lang.String query179,int pageSize180,java.lang.String delimiter181,boolean returnRawResult182,boolean disableMTOM183,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader184,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("QueryCSV");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.QueryCSV dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query179,
                                                    pageSize180,
                                                    delimiter181,
                                                    returnRawResult182,
                                                    disableMTOM183,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "queryCSV")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader184!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader184 = toOM(clientInfoHeader184, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "queryCSV")));
                                                    addHeader(omElementclientInfoHeader184,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.QueryCSVResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryCSV(
                                            (com.rightnow.ws.messages.QueryCSVResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryCSV(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorqueryCSV((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorqueryCSV((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorqueryCSV((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryCSV(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            }
									    } else {
										    callback.receiveErrorqueryCSV(f);
									    }
									} else {
									    callback.receiveErrorqueryCSV(f);
									}
								} else {
								    callback.receiveErrorqueryCSV(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryCSV(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#getMetaDataLastChangeTime
                     * @param getMetaDataLastChangeTime188
                    
                     * @param clientInfoHeader189
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  java.util.Calendar getMetaDataLastChangeTime(

                            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader189)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("GetMetaDataLastChangeTime");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.GetMetaDataLastChangeTime dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getMetaDataLastChangeTime")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader189!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader189 = toOM(clientInfoHeader189, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaDataLastChangeTime")));
                                                    addHeader(omElementclientInfoHeader189,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataLastChangeTimeResponseLastChangeDateTime((com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startgetMetaDataLastChangeTime
                    * @param getMetaDataLastChangeTime188
                
                    * @param clientInfoHeader189
                
                */
                public  void startgetMetaDataLastChangeTime(

                 com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader189,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("GetMetaDataLastChangeTime");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.GetMetaDataLastChangeTime dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getMetaDataLastChangeTime")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader189!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader189 = toOM(clientInfoHeader189, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaDataLastChangeTime")));
                                                    addHeader(omElementclientInfoHeader189,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaDataLastChangeTime(
                                            getGetMetaDataLastChangeTimeResponseLastChangeDateTime((com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaDataLastChangeTime(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaDataLastChangeTime((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaDataLastChangeTime((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaDataLastChangeTime((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaDataLastChangeTime(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaDataLastChangeTime(f);
									    }
									} else {
									    callback.receiveErrorgetMetaDataLastChangeTime(f);
									}
								} else {
								    callback.receiveErrorgetMetaDataLastChangeTime(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaDataLastChangeTime(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#update
                     * @param update192
                    
                     * @param clientInfoHeader195
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.UpdateResponseMsg update(

                            com.rightnow.ws.base.RNObject[] rNObjects193,com.rightnow.ws.messages.UpdateProcessingOptions processingOptions194,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader195)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("Update");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.Update dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects193,
                                                    processingOptions194,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "update")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader195!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader195 = toOM(clientInfoHeader195, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "update")));
                                                    addHeader(omElementclientInfoHeader195,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.UpdateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getUpdate((com.rightnow.ws.messages.UpdateResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startupdate
                    * @param update192
                
                    * @param clientInfoHeader195
                
                */
                public  void startupdate(

                 com.rightnow.ws.base.RNObject[] rNObjects193,com.rightnow.ws.messages.UpdateProcessingOptions processingOptions194,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader195,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("Update");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.Update dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects193,
                                                    processingOptions194,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "update")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader195!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader195 = toOM(clientInfoHeader195, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "update")));
                                                    addHeader(omElementclientInfoHeader195,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.UpdateResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultupdate(
                                            (com.rightnow.ws.messages.UpdateResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorupdate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorupdate((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorupdate((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorupdate((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorupdate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            }
									    } else {
										    callback.receiveErrorupdate(f);
									    }
									} else {
									    callback.receiveErrorupdate(f);
									}
								} else {
								    callback.receiveErrorupdate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorupdate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#runAnalyticsReport
                     * @param runAnalyticsReport197
                    
                     * @param clientInfoHeader204
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.RunAnalyticsReportResponseMsg runAnalyticsReport(

                            com.rightnow.ws.objects.AnalyticsReport analyticsReport198,int limit199,int start200,java.lang.String delimiter201,boolean returnRawResult202,boolean disableMTOM203,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader204)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("RunAnalyticsReport");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.RunAnalyticsReport dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    analyticsReport198,
                                                    limit199,
                                                    start200,
                                                    delimiter201,
                                                    returnRawResult202,
                                                    disableMTOM203,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "runAnalyticsReport")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader204!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader204 = toOM(clientInfoHeader204, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "runAnalyticsReport")));
                                                    addHeader(omElementclientInfoHeader204,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.RunAnalyticsReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getRunAnalyticsReport((com.rightnow.ws.messages.RunAnalyticsReportResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startrunAnalyticsReport
                    * @param runAnalyticsReport197
                
                    * @param clientInfoHeader204
                
                */
                public  void startrunAnalyticsReport(

                 com.rightnow.ws.objects.AnalyticsReport analyticsReport198,int limit199,int start200,java.lang.String delimiter201,boolean returnRawResult202,boolean disableMTOM203,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader204,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("RunAnalyticsReport");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.RunAnalyticsReport dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    analyticsReport198,
                                                    limit199,
                                                    start200,
                                                    delimiter201,
                                                    returnRawResult202,
                                                    disableMTOM203,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "runAnalyticsReport")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader204!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader204 = toOM(clientInfoHeader204, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "runAnalyticsReport")));
                                                    addHeader(omElementclientInfoHeader204,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.RunAnalyticsReportResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrunAnalyticsReport(
                                            (com.rightnow.ws.messages.RunAnalyticsReportResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrunAnalyticsReport(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorrunAnalyticsReport((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorrunAnalyticsReport((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorrunAnalyticsReport((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorrunAnalyticsReport(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            }
									    } else {
										    callback.receiveErrorrunAnalyticsReport(f);
									    }
									} else {
									    callback.receiveErrorrunAnalyticsReport(f);
									}
								} else {
								    callback.receiveErrorrunAnalyticsReport(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrunAnalyticsReport(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#convertGenericToObject
                     * @param convertGenericToObject208
                    
                     * @param clientInfoHeader210
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.RNObjectsResult convertGenericToObject(

                            com.rightnow.ws.base.RNObject[] rNObjects209,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader210)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("ConvertGenericToObject");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.ConvertGenericToObject dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects209,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "convertGenericToObject")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader210!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader210 = toOM(clientInfoHeader210, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "convertGenericToObject")));
                                                    addHeader(omElementclientInfoHeader210,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.ConvertGenericToObjectResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getConvertGenericToObjectResponseRNObjectsResult((com.rightnow.ws.messages.ConvertGenericToObjectResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startconvertGenericToObject
                    * @param convertGenericToObject208
                
                    * @param clientInfoHeader210
                
                */
                public  void startconvertGenericToObject(

                 com.rightnow.ws.base.RNObject[] rNObjects209,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader210,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("ConvertGenericToObject");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.ConvertGenericToObject dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects209,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "convertGenericToObject")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader210!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader210 = toOM(clientInfoHeader210, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "convertGenericToObject")));
                                                    addHeader(omElementclientInfoHeader210,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.ConvertGenericToObjectResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultconvertGenericToObject(
                                            getConvertGenericToObjectResponseRNObjectsResult((com.rightnow.ws.messages.ConvertGenericToObjectResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorconvertGenericToObject(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorconvertGenericToObject((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorconvertGenericToObject((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorconvertGenericToObject((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorconvertGenericToObject(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            }
									    } else {
										    callback.receiveErrorconvertGenericToObject(f);
									    }
									} else {
									    callback.receiveErrorconvertGenericToObject(f);
									}
								} else {
								    callback.receiveErrorconvertGenericToObject(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorconvertGenericToObject(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#getMetaData
                     * @param getMetaData213
                    
                     * @param clientInfoHeader214
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.metadata.MetaDataClass[] getMetaData(

                            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader214)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("GetMetaData");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.GetMetaData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getMetaData")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader214!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader214 = toOM(clientInfoHeader214, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaData")));
                                                    addHeader(omElementclientInfoHeader214,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetMetaDataResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataResponseMetaDataClass((com.rightnow.ws.messages.GetMetaDataResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startgetMetaData
                    * @param getMetaData213
                
                    * @param clientInfoHeader214
                
                */
                public  void startgetMetaData(

                 com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader214,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("GetMetaData");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.GetMetaData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getMetaData")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader214!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader214 = toOM(clientInfoHeader214, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getMetaData")));
                                                    addHeader(omElementclientInfoHeader214,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetMetaDataResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaData(
                                            getGetMetaDataResponseMetaDataClass((com.rightnow.ws.messages.GetMetaDataResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaData(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaData((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaData((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaData((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaData(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaData(f);
									    }
									} else {
									    callback.receiveErrorgetMetaData(f);
									}
								} else {
								    callback.receiveErrorgetMetaData(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaData(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#queryObjects
                     * @param queryObjects217
                    
                     * @param clientInfoHeader221
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.QueryResultData[] queryObjects(

                            java.lang.String query218,com.rightnow.ws.base.RNObject[] objectTemplates219,int pageSize220,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader221)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("QueryObjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.QueryObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query218,
                                                    objectTemplates219,
                                                    pageSize220,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "queryObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader221!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader221 = toOM(clientInfoHeader221, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "queryObjects")));
                                                    addHeader(omElementclientInfoHeader221,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.QueryObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getQueryObjectsResponseResult((com.rightnow.ws.messages.QueryObjectsResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startqueryObjects
                    * @param queryObjects217
                
                    * @param clientInfoHeader221
                
                */
                public  void startqueryObjects(

                 java.lang.String query218,com.rightnow.ws.base.RNObject[] objectTemplates219,int pageSize220,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader221,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("QueryObjects");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.QueryObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query218,
                                                    objectTemplates219,
                                                    pageSize220,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "queryObjects")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader221!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader221 = toOM(clientInfoHeader221, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "queryObjects")));
                                                    addHeader(omElementclientInfoHeader221,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.QueryObjectsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryObjects(
                                            getQueryObjectsResponseResult((com.rightnow.ws.messages.QueryObjectsResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryObjects(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorqueryObjects((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorqueryObjects((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorqueryObjects((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryObjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            }
									    } else {
										    callback.receiveErrorqueryObjects(f);
									    }
									} else {
									    callback.receiveErrorqueryObjects(f);
									}
								} else {
								    callback.receiveErrorqueryObjects(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryObjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#resetContactPassword
                     * @param resetContactPassword224
                    
                     * @param clientInfoHeader226
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.ResetContactPasswordResponseMsg resetContactPassword(

                            com.rightnow.ws.base.ID contactID225,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader226)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("ResetContactPassword");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.ResetContactPassword dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID225,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "resetContactPassword")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader226!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader226 = toOM(clientInfoHeader226, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "resetContactPassword")));
                                                    addHeader(omElementclientInfoHeader226,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.ResetContactPasswordResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getResetContactPassword((com.rightnow.ws.messages.ResetContactPasswordResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startresetContactPassword
                    * @param resetContactPassword224
                
                    * @param clientInfoHeader226
                
                */
                public  void startresetContactPassword(

                 com.rightnow.ws.base.ID contactID225,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader226,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("ResetContactPassword");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.ResetContactPassword dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID225,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "resetContactPassword")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader226!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader226 = toOM(clientInfoHeader226, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "resetContactPassword")));
                                                    addHeader(omElementclientInfoHeader226,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.ResetContactPasswordResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultresetContactPassword(
                                            (com.rightnow.ws.messages.ResetContactPasswordResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorresetContactPassword(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorresetContactPassword((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorresetContactPassword((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorresetContactPassword((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorresetContactPassword(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            }
									    } else {
										    callback.receiveErrorresetContactPassword(f);
									    }
									} else {
									    callback.receiveErrorresetContactPassword(f);
									}
								} else {
								    callback.receiveErrorresetContactPassword(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorresetContactPassword(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#getFileData
                     * @param getFileData228
                    
                     * @param clientInfoHeader232
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  javax.activation.DataHandler getFileData(

                            com.rightnow.ws.base.RNObject rNObject229,com.rightnow.ws.base.ID fileID230,boolean disableMTOM231,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader232)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("GetFileData");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.GetFileData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObject229,
                                                    fileID230,
                                                    disableMTOM231,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getFileData")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader232!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader232 = toOM(clientInfoHeader232, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getFileData")));
                                                    addHeader(omElementclientInfoHeader232,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetFileDataResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetFileDataResponseFileData((com.rightnow.ws.messages.GetFileDataResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startgetFileData
                    * @param getFileData228
                
                    * @param clientInfoHeader232
                
                */
                public  void startgetFileData(

                 com.rightnow.ws.base.RNObject rNObject229,com.rightnow.ws.base.ID fileID230,boolean disableMTOM231,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader232,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("GetFileData");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.GetFileData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObject229,
                                                    fileID230,
                                                    disableMTOM231,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getFileData")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader232!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader232 = toOM(clientInfoHeader232, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getFileData")));
                                                    addHeader(omElementclientInfoHeader232,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetFileDataResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFileData(
                                            getGetFileDataResponseFileData((com.rightnow.ws.messages.GetFileDataResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFileData(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorgetFileData((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetFileData((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorgetFileData((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFileData(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            }
									    } else {
										    callback.receiveErrorgetFileData(f);
									    }
									} else {
									    callback.receiveErrorgetFileData(f);
									}
								} else {
								    callback.receiveErrorgetFileData(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFileData(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#getValuesForNamedIDHierarchy
                     * @param getValuesForNamedIDHierarchy235
                    
                     * @param clientInfoHeader237
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.base.NamedIDWithParent[] getValuesForNamedIDHierarchy(

                            java.lang.String fieldName236,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader237)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("GetValuesForNamedIDHierarchy");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.GetValuesForNamedIDHierarchy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fieldName236,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getValuesForNamedIDHierarchy")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader237!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader237 = toOM(clientInfoHeader237, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getValuesForNamedIDHierarchy")));
                                                    addHeader(omElementclientInfoHeader237,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetValuesForNamedIDHierarchyResponseEntry((com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startgetValuesForNamedIDHierarchy
                    * @param getValuesForNamedIDHierarchy235
                
                    * @param clientInfoHeader237
                
                */
                public  void startgetValuesForNamedIDHierarchy(

                 java.lang.String fieldName236,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader237,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("GetValuesForNamedIDHierarchy");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.GetValuesForNamedIDHierarchy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fieldName236,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getValuesForNamedIDHierarchy")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader237!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader237 = toOM(clientInfoHeader237, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getValuesForNamedIDHierarchy")));
                                                    addHeader(omElementclientInfoHeader237,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetValuesForNamedIDHierarchy(
                                            getGetValuesForNamedIDHierarchyResponseEntry((com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetValuesForNamedIDHierarchy(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorgetValuesForNamedIDHierarchy((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetValuesForNamedIDHierarchy((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorgetValuesForNamedIDHierarchy((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetValuesForNamedIDHierarchy(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            }
									    } else {
										    callback.receiveErrorgetValuesForNamedIDHierarchy(f);
									    }
									} else {
									    callback.receiveErrorgetValuesForNamedIDHierarchy(f);
									}
								} else {
								    callback.receiveErrorgetValuesForNamedIDHierarchy(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetValuesForNamedIDHierarchy(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#get
                     * @param get240
                    
                     * @param clientInfoHeader243
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.RNObjectsResult get(

                            com.rightnow.ws.base.RNObject[] rNObjects241,com.rightnow.ws.messages.GetProcessingOptions processingOptions242,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader243)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("Get");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.Get dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects241,
                                                    processingOptions242,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "get")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader243!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader243 = toOM(clientInfoHeader243, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "get")));
                                                    addHeader(omElementclientInfoHeader243,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetResponseRNObjectsResult((com.rightnow.ws.messages.GetResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startget
                    * @param get240
                
                    * @param clientInfoHeader243
                
                */
                public  void startget(

                 com.rightnow.ws.base.RNObject[] rNObjects241,com.rightnow.ws.messages.GetProcessingOptions processingOptions242,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader243,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("Get");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.Get dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects241,
                                                    processingOptions242,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "get")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader243!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader243 = toOM(clientInfoHeader243, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "get")));
                                                    addHeader(omElementclientInfoHeader243,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultget(
                                            getGetResponseRNObjectsResult((com.rightnow.ws.messages.GetResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorget(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorget((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorget((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorget((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorget(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            }
									    } else {
										    callback.receiveErrorget(f);
									    }
									} else {
									    callback.receiveErrorget(f);
									}
								} else {
								    callback.receiveErrorget(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorget(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#create
                     * @param create246
                    
                     * @param clientInfoHeader249
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.RNObjectsResult create(

                            com.rightnow.ws.base.RNObject[] rNObjects247,com.rightnow.ws.messages.CreateProcessingOptions processingOptions248,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader249)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("Create");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.Create dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects247,
                                                    processingOptions248,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "create")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader249!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader249 = toOM(clientInfoHeader249, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "create")));
                                                    addHeader(omElementclientInfoHeader249,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.CreateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getCreateResponseRNObjectsResult((com.rightnow.ws.messages.CreateResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startcreate
                    * @param create246
                
                    * @param clientInfoHeader249
                
                */
                public  void startcreate(

                 com.rightnow.ws.base.RNObject[] rNObjects247,com.rightnow.ws.messages.CreateProcessingOptions processingOptions248,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader249,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("Create");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.Create dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects247,
                                                    processingOptions248,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "create")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader249!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader249 = toOM(clientInfoHeader249, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "create")));
                                                    addHeader(omElementclientInfoHeader249,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.CreateResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcreate(
                                            getCreateResponseRNObjectsResult((com.rightnow.ws.messages.CreateResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcreate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorcreate((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorcreate((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorcreate((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcreate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            }
									    } else {
										    callback.receiveErrorcreate(f);
									    }
									} else {
									    callback.receiveErrorcreate(f);
									}
								} else {
								    callback.receiveErrorcreate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcreate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#destroy
                     * @param destroy252
                    
                     * @param clientInfoHeader255
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.DestroyResponseMsg destroy(

                            com.rightnow.ws.base.RNObject[] rNObjects253,com.rightnow.ws.messages.DestroyProcessingOptions processingOptions254,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader255)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("Destroy");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.Destroy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects253,
                                                    processingOptions254,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "destroy")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader255!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader255 = toOM(clientInfoHeader255, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "destroy")));
                                                    addHeader(omElementclientInfoHeader255,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.DestroyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getDestroy((com.rightnow.ws.messages.DestroyResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startdestroy
                    * @param destroy252
                
                    * @param clientInfoHeader255
                
                */
                public  void startdestroy(

                 com.rightnow.ws.base.RNObject[] rNObjects253,com.rightnow.ws.messages.DestroyProcessingOptions processingOptions254,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader255,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("Destroy");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.Destroy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects253,
                                                    processingOptions254,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "destroy")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader255!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader255 = toOM(clientInfoHeader255, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "destroy")));
                                                    addHeader(omElementclientInfoHeader255,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.DestroyResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdestroy(
                                            (com.rightnow.ws.messages.DestroyResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordestroy(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrordestroy((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrordestroy((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrordestroy((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrordestroy(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            }
									    } else {
										    callback.receiveErrordestroy(f);
									    }
									} else {
									    callback.receiveErrordestroy(f);
									}
								} else {
								    callback.receiveErrordestroy(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordestroy(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[14].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#transferSubObjects
                     * @param transferSubObjects257
                    
                     * @param clientInfoHeader260
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.TransferSubObjectsResponseMsg transferSubObjects(

                            com.rightnow.ws.base.RNObject destinationRNObject258,com.rightnow.ws.base.RNObject[] sourceRNObjects259,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader260)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("TransferSubObjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.TransferSubObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    destinationRNObject258,
                                                    sourceRNObjects259,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "transferSubObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader260!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader260 = toOM(clientInfoHeader260, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "transferSubObjects")));
                                                    addHeader(omElementclientInfoHeader260,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.TransferSubObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getTransferSubObjects((com.rightnow.ws.messages.TransferSubObjectsResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#starttransferSubObjects
                    * @param transferSubObjects257
                
                    * @param clientInfoHeader260
                
                */
                public  void starttransferSubObjects(

                 com.rightnow.ws.base.RNObject destinationRNObject258,com.rightnow.ws.base.RNObject[] sourceRNObjects259,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader260,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("TransferSubObjects");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.TransferSubObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    destinationRNObject258,
                                                    sourceRNObjects259,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "transferSubObjects")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader260!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader260 = toOM(clientInfoHeader260, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "transferSubObjects")));
                                                    addHeader(omElementclientInfoHeader260,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.TransferSubObjectsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResulttransferSubObjects(
                                            (com.rightnow.ws.messages.TransferSubObjectsResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrortransferSubObjects(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrortransferSubObjects((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrortransferSubObjects((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrortransferSubObjects((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrortransferSubObjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            }
									    } else {
										    callback.receiveErrortransferSubObjects(f);
									    }
									} else {
									    callback.receiveErrortransferSubObjects(f);
									}
								} else {
								    callback.receiveErrortransferSubObjects(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrortransferSubObjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[15].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#batch
                     * @param batch262
                    
                     * @param clientInfoHeader264
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.BatchResponseItem[] batch(

                            com.rightnow.ws.messages.BatchRequestItem[] batchRequestItem263,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader264)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("Batch");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.Batch dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    batchRequestItem263,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "batch")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader264!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader264 = toOM(clientInfoHeader264, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "batch")));
                                                    addHeader(omElementclientInfoHeader264,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.BatchResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getBatchResponseBatchResponseItem((com.rightnow.ws.messages.BatchResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startbatch
                    * @param batch262
                
                    * @param clientInfoHeader264
                
                */
                public  void startbatch(

                 com.rightnow.ws.messages.BatchRequestItem[] batchRequestItem263,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader264,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("Batch");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.Batch dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    batchRequestItem263,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "batch")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader264!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader264 = toOM(clientInfoHeader264, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "batch")));
                                                    addHeader(omElementclientInfoHeader264,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.BatchResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultbatch(
                                            getBatchResponseBatchResponseItem((com.rightnow.ws.messages.BatchResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorbatch(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorbatch((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorbatch((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorbatch((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorbatch(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            }
									    } else {
										    callback.receiveErrorbatch(f);
									    }
									} else {
									    callback.receiveErrorbatch(f);
									}
								} else {
								    callback.receiveErrorbatch(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorbatch(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[16].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#sendMailingToContact
                     * @param sendMailingToContact267
                    
                     * @param clientInfoHeader274
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.SendMailingToContactResponseMsg sendMailingToContact(

                            com.rightnow.ws.base.ID contactID268,com.rightnow.ws.base.ID mailingID269,java.util.Calendar scheduledTime270,com.rightnow.ws.base.ID incidentID271,com.rightnow.ws.base.ID opportunityID272,com.rightnow.ws.base.ID chatID273,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader274)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("SendMailingToContact");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.SendMailingToContact dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID268,
                                                    mailingID269,
                                                    scheduledTime270,
                                                    incidentID271,
                                                    opportunityID272,
                                                    chatID273,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "sendMailingToContact")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader274!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader274 = toOM(clientInfoHeader274, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "sendMailingToContact")));
                                                    addHeader(omElementclientInfoHeader274,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.SendMailingToContactResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getSendMailingToContact((com.rightnow.ws.messages.SendMailingToContactResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startsendMailingToContact
                    * @param sendMailingToContact267
                
                    * @param clientInfoHeader274
                
                */
                public  void startsendMailingToContact(

                 com.rightnow.ws.base.ID contactID268,com.rightnow.ws.base.ID mailingID269,java.util.Calendar scheduledTime270,com.rightnow.ws.base.ID incidentID271,com.rightnow.ws.base.ID opportunityID272,com.rightnow.ws.base.ID chatID273,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader274,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("SendMailingToContact");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.SendMailingToContact dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID268,
                                                    mailingID269,
                                                    scheduledTime270,
                                                    incidentID271,
                                                    opportunityID272,
                                                    chatID273,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "sendMailingToContact")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader274!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader274 = toOM(clientInfoHeader274, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "sendMailingToContact")));
                                                    addHeader(omElementclientInfoHeader274,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.SendMailingToContactResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultsendMailingToContact(
                                            (com.rightnow.ws.messages.SendMailingToContactResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorsendMailingToContact(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorsendMailingToContact((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorsendMailingToContact((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorsendMailingToContact((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorsendMailingToContact(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            }
									    } else {
										    callback.receiveErrorsendMailingToContact(f);
									    }
									} else {
									    callback.receiveErrorsendMailingToContact(f);
									}
								} else {
								    callback.receiveErrorsendMailingToContact(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorsendMailingToContact(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[17].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#executeMarketingFlow
                     * @param executeMarketingFlow276
                    
                     * @param clientInfoHeader280
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg executeMarketingFlow(

                            com.rightnow.ws.base.ID contactID277,com.rightnow.ws.base.ID campaignID278,java.lang.String entryPoint279,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader280)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("ExecuteMarketingFlow");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.ExecuteMarketingFlow dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID277,
                                                    campaignID278,
                                                    entryPoint279,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "executeMarketingFlow")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader280!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader280 = toOM(clientInfoHeader280, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "executeMarketingFlow")));
                                                    addHeader(omElementclientInfoHeader280,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.ExecuteMarketingFlowResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getExecuteMarketingFlow((com.rightnow.ws.messages.ExecuteMarketingFlowResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startexecuteMarketingFlow
                    * @param executeMarketingFlow276
                
                    * @param clientInfoHeader280
                
                */
                public  void startexecuteMarketingFlow(

                 com.rightnow.ws.base.ID contactID277,com.rightnow.ws.base.ID campaignID278,java.lang.String entryPoint279,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader280,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("ExecuteMarketingFlow");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.ExecuteMarketingFlow dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID277,
                                                    campaignID278,
                                                    entryPoint279,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "executeMarketingFlow")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader280!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader280 = toOM(clientInfoHeader280, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "executeMarketingFlow")));
                                                    addHeader(omElementclientInfoHeader280,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.ExecuteMarketingFlowResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultexecuteMarketingFlow(
                                            (com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorexecuteMarketingFlow(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorexecuteMarketingFlow((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorexecuteMarketingFlow((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorexecuteMarketingFlow((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorexecuteMarketingFlow(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            }
									    } else {
										    callback.receiveErrorexecuteMarketingFlow(f);
									    }
									} else {
									    callback.receiveErrorexecuteMarketingFlow(f);
									}
								} else {
								    callback.receiveErrorexecuteMarketingFlow(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorexecuteMarketingFlow(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[18].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rightnow.ws.wsdl.RightNowSyncService#getValuesForNamedID
                     * @param getValuesForNamedID282
                    
                     * @param clientInfoHeader285
                    
                     * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
                     * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
                     * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rightnow.ws.base.NamedID[] getValuesForNamedID(

                            java.lang.String packageName283,java.lang.String fieldName284,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader285)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rightnow.ws.wsdl.RequestErrorFault
                        ,com.rightnow.ws.wsdl.UnexpectedErrorFault
                        ,com.rightnow.ws.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("GetValuesForNamedID");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rightnow.ws.messages.GetValuesForNamedID dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    packageName283,
                                                    fieldName284,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getValuesForNamedID")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader285!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader285 = toOM(clientInfoHeader285, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getValuesForNamedID")));
                                                    addHeader(omElementclientInfoHeader285,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rightnow.ws.messages.GetValuesForNamedIDResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetValuesForNamedIDResponseEntry((com.rightnow.ws.messages.GetValuesForNamedIDResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
                          throw (com.rightnow.ws.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
                          throw (com.rightnow.ws.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
                          throw (com.rightnow.ws.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rightnow.ws.wsdl.RightNowSyncService#startgetValuesForNamedID
                    * @param getValuesForNamedID282
                
                    * @param clientInfoHeader285
                
                */
                public  void startgetValuesForNamedID(

                 java.lang.String packageName283,java.lang.String fieldName284,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader285,
                    

                  final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("GetValuesForNamedID");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rightnow.ws.messages.GetValuesForNamedID dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    packageName283,
                                                    fieldName284,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2",
                                                    "getValuesForNamedID")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader285!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader285 = toOM(clientInfoHeader285, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_2", "getValuesForNamedID")));
                                                    addHeader(omElementclientInfoHeader285,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rightnow.ws.messages.GetValuesForNamedIDResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetValuesForNamedID(
                                            getGetValuesForNamedIDResponseEntry((com.rightnow.ws.messages.GetValuesForNamedIDResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetValuesForNamedID(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rightnow.ws.wsdl.RequestErrorFault){
														callback.receiveErrorgetValuesForNamedID((com.rightnow.ws.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetValuesForNamedID((com.rightnow.ws.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rightnow.ws.wsdl.ServerErrorFault){
														callback.receiveErrorgetValuesForNamedID((com.rightnow.ws.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetValuesForNamedID(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            }
									    } else {
										    callback.receiveErrorgetValuesForNamedID(f);
									    }
									} else {
									    callback.receiveErrorgetValuesForNamedID(f);
									}
								} else {
								    callback.receiveErrorgetValuesForNamedID(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetValuesForNamedID(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[19].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[19].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://pacifico--dev.custhelp.com/cgi-bin/pacifico.cfg/services/soap
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ConvertObjectToGeneric param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ConvertObjectToGeneric.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ConvertObjectToGenericResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ConvertObjectToGenericResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.faults.RequestErrorFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.faults.RequestErrorFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.faults.UnexpectedErrorFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.faults.UnexpectedErrorFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.faults.ServerErrorFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.faults.ServerErrorFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ClientInfoHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ClientInfoHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetMetaDataForClass param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetMetaDataForClass.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetMetaDataForClassResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetMetaDataForClassResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.QueryCSV param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.QueryCSV.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.QueryCSVResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.QueryCSVResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetMetaDataLastChangeTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetMetaDataLastChangeTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.Update param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.Update.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.UpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.UpdateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.RunAnalyticsReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.RunAnalyticsReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.RunAnalyticsReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.RunAnalyticsReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ConvertGenericToObject param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ConvertGenericToObject.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ConvertGenericToObjectResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ConvertGenericToObjectResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetMetaData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetMetaData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetMetaDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetMetaDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.QueryObjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.QueryObjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.QueryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.QueryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ResetContactPassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ResetContactPassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ResetContactPasswordResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ResetContactPasswordResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetFileData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetFileData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetFileDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetFileDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetValuesForNamedIDHierarchy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetValuesForNamedIDHierarchy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.Get param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.Get.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.Create param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.Create.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.CreateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.CreateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.Destroy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.Destroy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.DestroyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.DestroyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.TransferSubObjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.TransferSubObjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.TransferSubObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.TransferSubObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.Batch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.Batch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.BatchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.BatchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.SendMailingToContact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.SendMailingToContact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.SendMailingToContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.SendMailingToContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ExecuteMarketingFlow param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ExecuteMarketingFlow.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.ExecuteMarketingFlowResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.ExecuteMarketingFlowResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetValuesForNamedID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetValuesForNamedID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rightnow.ws.messages.GetValuesForNamedIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rightnow.ws.messages.GetValuesForNamedIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String[] param1,
                                    com.rightnow.ws.generic.RNObjectType[] param2,
                                    java.lang.String[] param3,
                                    com.rightnow.ws.messages.GetMetaDataForClass dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.GetMetaDataForClass wrappedType = new com.rightnow.ws.messages.GetMetaDataForClass();

                                 com.rightnow.ws.messages.GetMetaDataForClassMsg wrappedComplexType = new com.rightnow.ws.messages.GetMetaDataForClassMsg();
                                          
                                              wrappedComplexType.setClassName(param1);
                                         
                                              wrappedComplexType.setQualifiedClassName(param2);
                                         
                                              wrappedComplexType.setMetaDataLink(param3);
                                         
                                         wrappedType.setGetMetaDataForClass(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.GetMetaDataForClass.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetMetaDataForClassMsg getGetMetaDataForClass(
                                com.rightnow.ws.messages.GetMetaDataForClass wrappedType){
                                    return wrappedType.getGetMetaDataForClass();
                                }

                                private com.rightnow.ws.messages.GetMetaDataForClass wrapGetMetaDataForClass(
                                com.rightnow.ws.messages.GetMetaDataForClassMsg innerType){
                                    com.rightnow.ws.messages.GetMetaDataForClass wrappedElement = new com.rightnow.ws.messages.GetMetaDataForClass();
                                    wrappedElement.setGetMetaDataForClass(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.metadata.MetaDataClass[] getGetMetaDataForClassResponseMetaDataClass(
                                com.rightnow.ws.messages.GetMetaDataForClassResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataForClassResponse().getMetaDataClass();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetMetaDataForClassResponseMsg getGetMetaDataForClass(
                                com.rightnow.ws.messages.GetMetaDataForClassResponse wrappedType){
                                    return wrappedType.getGetMetaDataForClassResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject[] param1,
                                    com.rightnow.ws.messages.ConvertObjectToGeneric dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.ConvertObjectToGeneric wrappedType = new com.rightnow.ws.messages.ConvertObjectToGeneric();

                                 com.rightnow.ws.messages.ConvertObjectMsg wrappedComplexType = new com.rightnow.ws.messages.ConvertObjectMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                         wrappedType.setConvertObjectToGeneric(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.ConvertObjectToGeneric.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.ConvertObjectMsg getConvertObjectToGeneric(
                                com.rightnow.ws.messages.ConvertObjectToGeneric wrappedType){
                                    return wrappedType.getConvertObjectToGeneric();
                                }

                                private com.rightnow.ws.messages.ConvertObjectToGeneric wrapConvertObjectToGeneric(
                                com.rightnow.ws.messages.ConvertObjectMsg innerType){
                                    com.rightnow.ws.messages.ConvertObjectToGeneric wrappedElement = new com.rightnow.ws.messages.ConvertObjectToGeneric();
                                    wrappedElement.setConvertObjectToGeneric(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.RNObjectsResult getConvertObjectToGenericResponseRNObjectsResult(
                                com.rightnow.ws.messages.ConvertObjectToGenericResponse wrappedType){
                                
                                        return wrappedType.getConvertObjectToGenericResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rightnow.ws.messages.ConvertObjectResponseMsg getConvertObjectToGeneric(
                                com.rightnow.ws.messages.ConvertObjectToGenericResponse wrappedType){
                                    return wrappedType.getConvertObjectToGenericResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    int param2,
                                    java.lang.String param3,
                                    boolean param4,
                                    boolean param5,
                                    com.rightnow.ws.messages.QueryCSV dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.QueryCSV wrappedType = new com.rightnow.ws.messages.QueryCSV();

                                 com.rightnow.ws.messages.QueryMsg wrappedComplexType = new com.rightnow.ws.messages.QueryMsg();
                                          
                                              wrappedComplexType.setQuery(param1);
                                         
                                              wrappedComplexType.setPageSize(param2);
                                         
                                              wrappedComplexType.setDelimiter(param3);
                                         
                                              wrappedComplexType.setReturnRawResult(param4);
                                         
                                              wrappedComplexType.setDisableMTOM(param5);
                                         
                                         wrappedType.setQueryCSV(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.QueryCSV.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.QueryMsg getQueryCSV(
                                com.rightnow.ws.messages.QueryCSV wrappedType){
                                    return wrappedType.getQueryCSV();
                                }

                                private com.rightnow.ws.messages.QueryCSV wrapQueryCSV(
                                com.rightnow.ws.messages.QueryMsg innerType){
                                    com.rightnow.ws.messages.QueryCSV wrappedElement = new com.rightnow.ws.messages.QueryCSV();
                                    wrappedElement.setQueryCSV(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.CSVTableSet getQueryCSVResponseCSVTableSet(
                                com.rightnow.ws.messages.QueryCSVResponse wrappedType){
                                
                                        return wrappedType.getQueryCSVResponse().getCSVTableSet();
                                    
                                }
                             

                                
                                private javax.activation.DataHandler getQueryCSVResponseFileData(
                                com.rightnow.ws.messages.QueryCSVResponse wrappedType){
                                
                                        return wrappedType.getQueryCSVResponse().getFileData();
                                    
                                }
                             

                                private com.rightnow.ws.messages.QueryCSVResponseMsg getQueryCSV(
                                com.rightnow.ws.messages.QueryCSVResponse wrappedType){
                                    return wrappedType.getQueryCSVResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.messages.GetMetaDataLastChangeTime dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.GetMetaDataLastChangeTime wrappedType = new com.rightnow.ws.messages.GetMetaDataLastChangeTime();

                                 com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg wrappedComplexType = new com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg();
                                          
                                         wrappedType.setGetMetaDataLastChangeTime(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.GetMetaDataLastChangeTime.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTime(
                                com.rightnow.ws.messages.GetMetaDataLastChangeTime wrappedType){
                                    return wrappedType.getGetMetaDataLastChangeTime();
                                }

                                private com.rightnow.ws.messages.GetMetaDataLastChangeTime wrapGetMetaDataLastChangeTime(
                                com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg innerType){
                                    com.rightnow.ws.messages.GetMetaDataLastChangeTime wrappedElement = new com.rightnow.ws.messages.GetMetaDataLastChangeTime();
                                    wrappedElement.setGetMetaDataLastChangeTime(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private java.util.Calendar getGetMetaDataLastChangeTimeResponseLastChangeDateTime(
                                com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataLastChangeTimeResponse().getLastChangeDateTime();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg getGetMetaDataLastChangeTime(
                                com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse wrappedType){
                                    return wrappedType.getGetMetaDataLastChangeTimeResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject[] param1,
                                    com.rightnow.ws.messages.UpdateProcessingOptions param2,
                                    com.rightnow.ws.messages.Update dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.Update wrappedType = new com.rightnow.ws.messages.Update();

                                 com.rightnow.ws.messages.UpdateMsg wrappedComplexType = new com.rightnow.ws.messages.UpdateMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setUpdate(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.Update.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.UpdateMsg getUpdate(
                                com.rightnow.ws.messages.Update wrappedType){
                                    return wrappedType.getUpdate();
                                }

                                private com.rightnow.ws.messages.Update wrapUpdate(
                                com.rightnow.ws.messages.UpdateMsg innerType){
                                    com.rightnow.ws.messages.Update wrappedElement = new com.rightnow.ws.messages.Update();
                                    wrappedElement.setUpdate(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rightnow.ws.messages.UpdateResponseMsg getUpdate(
                                com.rightnow.ws.messages.UpdateResponse wrappedType){
                                    return wrappedType.getUpdateResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.objects.AnalyticsReport param1,
                                    int param2,
                                    int param3,
                                    java.lang.String param4,
                                    boolean param5,
                                    boolean param6,
                                    com.rightnow.ws.messages.RunAnalyticsReport dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.RunAnalyticsReport wrappedType = new com.rightnow.ws.messages.RunAnalyticsReport();

                                 com.rightnow.ws.messages.RunAnalyticsReportMsg wrappedComplexType = new com.rightnow.ws.messages.RunAnalyticsReportMsg();
                                          
                                              wrappedComplexType.setAnalyticsReport(param1);
                                         
                                              wrappedComplexType.setLimit(param2);
                                         
                                              wrappedComplexType.setStart(param3);
                                         
                                              wrappedComplexType.setDelimiter(param4);
                                         
                                              wrappedComplexType.setReturnRawResult(param5);
                                         
                                              wrappedComplexType.setDisableMTOM(param6);
                                         
                                         wrappedType.setRunAnalyticsReport(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.RunAnalyticsReport.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.RunAnalyticsReportMsg getRunAnalyticsReport(
                                com.rightnow.ws.messages.RunAnalyticsReport wrappedType){
                                    return wrappedType.getRunAnalyticsReport();
                                }

                                private com.rightnow.ws.messages.RunAnalyticsReport wrapRunAnalyticsReport(
                                com.rightnow.ws.messages.RunAnalyticsReportMsg innerType){
                                    com.rightnow.ws.messages.RunAnalyticsReport wrappedElement = new com.rightnow.ws.messages.RunAnalyticsReport();
                                    wrappedElement.setRunAnalyticsReport(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.CSVTableSet getRunAnalyticsReportResponseCSVTableSet(
                                com.rightnow.ws.messages.RunAnalyticsReportResponse wrappedType){
                                
                                        return wrappedType.getRunAnalyticsReportResponse().getCSVTableSet();
                                    
                                }
                             

                                
                                private javax.activation.DataHandler getRunAnalyticsReportResponseFileData(
                                com.rightnow.ws.messages.RunAnalyticsReportResponse wrappedType){
                                
                                        return wrappedType.getRunAnalyticsReportResponse().getFileData();
                                    
                                }
                             

                                private com.rightnow.ws.messages.RunAnalyticsReportResponseMsg getRunAnalyticsReport(
                                com.rightnow.ws.messages.RunAnalyticsReportResponse wrappedType){
                                    return wrappedType.getRunAnalyticsReportResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.messages.GetMetaData dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.GetMetaData wrappedType = new com.rightnow.ws.messages.GetMetaData();

                                 com.rightnow.ws.messages.GetMetaDataMsg wrappedComplexType = new com.rightnow.ws.messages.GetMetaDataMsg();
                                          
                                         wrappedType.setGetMetaData(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.GetMetaData.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetMetaDataMsg getGetMetaData(
                                com.rightnow.ws.messages.GetMetaData wrappedType){
                                    return wrappedType.getGetMetaData();
                                }

                                private com.rightnow.ws.messages.GetMetaData wrapGetMetaData(
                                com.rightnow.ws.messages.GetMetaDataMsg innerType){
                                    com.rightnow.ws.messages.GetMetaData wrappedElement = new com.rightnow.ws.messages.GetMetaData();
                                    wrappedElement.setGetMetaData(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.metadata.MetaDataClass[] getGetMetaDataResponseMetaDataClass(
                                com.rightnow.ws.messages.GetMetaDataResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataResponse().getMetaDataClass();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetMetaDataResponseMsg getGetMetaData(
                                com.rightnow.ws.messages.GetMetaDataResponse wrappedType){
                                    return wrappedType.getGetMetaDataResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject[] param1,
                                    com.rightnow.ws.messages.ConvertGenericToObject dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.ConvertGenericToObject wrappedType = new com.rightnow.ws.messages.ConvertGenericToObject();

                                 com.rightnow.ws.messages.ConvertObjectMsg wrappedComplexType = new com.rightnow.ws.messages.ConvertObjectMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                         wrappedType.setConvertGenericToObject(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.ConvertGenericToObject.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.ConvertObjectMsg getConvertGenericToObject(
                                com.rightnow.ws.messages.ConvertGenericToObject wrappedType){
                                    return wrappedType.getConvertGenericToObject();
                                }

                                private com.rightnow.ws.messages.ConvertGenericToObject wrapConvertGenericToObject(
                                com.rightnow.ws.messages.ConvertObjectMsg innerType){
                                    com.rightnow.ws.messages.ConvertGenericToObject wrappedElement = new com.rightnow.ws.messages.ConvertGenericToObject();
                                    wrappedElement.setConvertGenericToObject(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.RNObjectsResult getConvertGenericToObjectResponseRNObjectsResult(
                                com.rightnow.ws.messages.ConvertGenericToObjectResponse wrappedType){
                                
                                        return wrappedType.getConvertGenericToObjectResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rightnow.ws.messages.ConvertObjectResponseMsg getConvertGenericToObject(
                                com.rightnow.ws.messages.ConvertGenericToObjectResponse wrappedType){
                                    return wrappedType.getConvertGenericToObjectResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    com.rightnow.ws.base.RNObject[] param2,
                                    int param3,
                                    com.rightnow.ws.messages.QueryObjects dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.QueryObjects wrappedType = new com.rightnow.ws.messages.QueryObjects();

                                 com.rightnow.ws.messages.QueryObjectsMsg wrappedComplexType = new com.rightnow.ws.messages.QueryObjectsMsg();
                                          
                                              wrappedComplexType.setQuery(param1);
                                         
                                              wrappedComplexType.setObjectTemplates(param2);
                                         
                                              wrappedComplexType.setPageSize(param3);
                                         
                                         wrappedType.setQueryObjects(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.QueryObjects.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.QueryObjectsMsg getQueryObjects(
                                com.rightnow.ws.messages.QueryObjects wrappedType){
                                    return wrappedType.getQueryObjects();
                                }

                                private com.rightnow.ws.messages.QueryObjects wrapQueryObjects(
                                com.rightnow.ws.messages.QueryObjectsMsg innerType){
                                    com.rightnow.ws.messages.QueryObjects wrappedElement = new com.rightnow.ws.messages.QueryObjects();
                                    wrappedElement.setQueryObjects(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.QueryResultData[] getQueryObjectsResponseResult(
                                com.rightnow.ws.messages.QueryObjectsResponse wrappedType){
                                
                                        return wrappedType.getQueryObjectsResponse().getResult();
                                    
                                }
                             

                                private com.rightnow.ws.messages.QueryObjectsResponseMsg getQueryObjects(
                                com.rightnow.ws.messages.QueryObjectsResponse wrappedType){
                                    return wrappedType.getQueryObjectsResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.ID param1,
                                    com.rightnow.ws.messages.ResetContactPassword dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.ResetContactPassword wrappedType = new com.rightnow.ws.messages.ResetContactPassword();

                                 com.rightnow.ws.messages.ResetContactPasswordMsg wrappedComplexType = new com.rightnow.ws.messages.ResetContactPasswordMsg();
                                          
                                              wrappedComplexType.setContactID(param1);
                                         
                                         wrappedType.setResetContactPassword(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.ResetContactPassword.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.ResetContactPasswordMsg getResetContactPassword(
                                com.rightnow.ws.messages.ResetContactPassword wrappedType){
                                    return wrappedType.getResetContactPassword();
                                }

                                private com.rightnow.ws.messages.ResetContactPassword wrapResetContactPassword(
                                com.rightnow.ws.messages.ResetContactPasswordMsg innerType){
                                    com.rightnow.ws.messages.ResetContactPassword wrappedElement = new com.rightnow.ws.messages.ResetContactPassword();
                                    wrappedElement.setResetContactPassword(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rightnow.ws.messages.ResetContactPasswordResponseMsg getResetContactPassword(
                                com.rightnow.ws.messages.ResetContactPasswordResponse wrappedType){
                                    return wrappedType.getResetContactPasswordResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject param1,
                                    com.rightnow.ws.base.ID param2,
                                    boolean param3,
                                    com.rightnow.ws.messages.GetFileData dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.GetFileData wrappedType = new com.rightnow.ws.messages.GetFileData();

                                 com.rightnow.ws.messages.GetFileDataMsg wrappedComplexType = new com.rightnow.ws.messages.GetFileDataMsg();
                                          
                                              wrappedComplexType.setRNObject(param1);
                                         
                                              wrappedComplexType.setFileID(param2);
                                         
                                              wrappedComplexType.setDisableMTOM(param3);
                                         
                                         wrappedType.setGetFileData(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.GetFileData.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetFileDataMsg getGetFileData(
                                com.rightnow.ws.messages.GetFileData wrappedType){
                                    return wrappedType.getGetFileData();
                                }

                                private com.rightnow.ws.messages.GetFileData wrapGetFileData(
                                com.rightnow.ws.messages.GetFileDataMsg innerType){
                                    com.rightnow.ws.messages.GetFileData wrappedElement = new com.rightnow.ws.messages.GetFileData();
                                    wrappedElement.setGetFileData(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private javax.activation.DataHandler getGetFileDataResponseFileData(
                                com.rightnow.ws.messages.GetFileDataResponse wrappedType){
                                
                                        return wrappedType.getGetFileDataResponse().getFileData();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetFileDataResponseMsg getGetFileData(
                                com.rightnow.ws.messages.GetFileDataResponse wrappedType){
                                    return wrappedType.getGetFileDataResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    com.rightnow.ws.messages.GetValuesForNamedIDHierarchy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.GetValuesForNamedIDHierarchy wrappedType = new com.rightnow.ws.messages.GetValuesForNamedIDHierarchy();

                                 com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg wrappedComplexType = new com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg();
                                          
                                              wrappedComplexType.setFieldName(param1);
                                         
                                         wrappedType.setGetValuesForNamedIDHierarchy(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.GetValuesForNamedIDHierarchy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchy(
                                com.rightnow.ws.messages.GetValuesForNamedIDHierarchy wrappedType){
                                    return wrappedType.getGetValuesForNamedIDHierarchy();
                                }

                                private com.rightnow.ws.messages.GetValuesForNamedIDHierarchy wrapGetValuesForNamedIDHierarchy(
                                com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg innerType){
                                    com.rightnow.ws.messages.GetValuesForNamedIDHierarchy wrappedElement = new com.rightnow.ws.messages.GetValuesForNamedIDHierarchy();
                                    wrappedElement.setGetValuesForNamedIDHierarchy(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.base.NamedIDWithParent[] getGetValuesForNamedIDHierarchyResponseEntry(
                                com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse wrappedType){
                                
                                        return wrappedType.getGetValuesForNamedIDHierarchyResponse().getEntry();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg getGetValuesForNamedIDHierarchy(
                                com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse wrappedType){
                                    return wrappedType.getGetValuesForNamedIDHierarchyResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject[] param1,
                                    com.rightnow.ws.messages.GetProcessingOptions param2,
                                    com.rightnow.ws.messages.Get dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.Get wrappedType = new com.rightnow.ws.messages.Get();

                                 com.rightnow.ws.messages.GetMsg wrappedComplexType = new com.rightnow.ws.messages.GetMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setGet(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.Get.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetMsg getGet(
                                com.rightnow.ws.messages.Get wrappedType){
                                    return wrappedType.getGet();
                                }

                                private com.rightnow.ws.messages.Get wrapGet(
                                com.rightnow.ws.messages.GetMsg innerType){
                                    com.rightnow.ws.messages.Get wrappedElement = new com.rightnow.ws.messages.Get();
                                    wrappedElement.setGet(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.RNObjectsResult getGetResponseRNObjectsResult(
                                com.rightnow.ws.messages.GetResponse wrappedType){
                                
                                        return wrappedType.getGetResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetResponseMsg getGet(
                                com.rightnow.ws.messages.GetResponse wrappedType){
                                    return wrappedType.getGetResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject[] param1,
                                    com.rightnow.ws.messages.CreateProcessingOptions param2,
                                    com.rightnow.ws.messages.Create dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.Create wrappedType = new com.rightnow.ws.messages.Create();

                                 com.rightnow.ws.messages.CreateMsg wrappedComplexType = new com.rightnow.ws.messages.CreateMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setCreate(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.Create.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.CreateMsg getCreate(
                                com.rightnow.ws.messages.Create wrappedType){
                                    return wrappedType.getCreate();
                                }

                                private com.rightnow.ws.messages.Create wrapCreate(
                                com.rightnow.ws.messages.CreateMsg innerType){
                                    com.rightnow.ws.messages.Create wrappedElement = new com.rightnow.ws.messages.Create();
                                    wrappedElement.setCreate(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.RNObjectsResult getCreateResponseRNObjectsResult(
                                com.rightnow.ws.messages.CreateResponse wrappedType){
                                
                                        return wrappedType.getCreateResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rightnow.ws.messages.CreateResponseMsg getCreate(
                                com.rightnow.ws.messages.CreateResponse wrappedType){
                                    return wrappedType.getCreateResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject[] param1,
                                    com.rightnow.ws.messages.DestroyProcessingOptions param2,
                                    com.rightnow.ws.messages.Destroy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.Destroy wrappedType = new com.rightnow.ws.messages.Destroy();

                                 com.rightnow.ws.messages.DestroyMsg wrappedComplexType = new com.rightnow.ws.messages.DestroyMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setDestroy(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.Destroy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.DestroyMsg getDestroy(
                                com.rightnow.ws.messages.Destroy wrappedType){
                                    return wrappedType.getDestroy();
                                }

                                private com.rightnow.ws.messages.Destroy wrapDestroy(
                                com.rightnow.ws.messages.DestroyMsg innerType){
                                    com.rightnow.ws.messages.Destroy wrappedElement = new com.rightnow.ws.messages.Destroy();
                                    wrappedElement.setDestroy(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rightnow.ws.messages.DestroyResponseMsg getDestroy(
                                com.rightnow.ws.messages.DestroyResponse wrappedType){
                                    return wrappedType.getDestroyResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.RNObject param1,
                                    com.rightnow.ws.base.RNObject[] param2,
                                    com.rightnow.ws.messages.TransferSubObjects dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.TransferSubObjects wrappedType = new com.rightnow.ws.messages.TransferSubObjects();

                                 com.rightnow.ws.messages.TransferSubObjectsMsg wrappedComplexType = new com.rightnow.ws.messages.TransferSubObjectsMsg();
                                          
                                              wrappedComplexType.setDestinationRNObject(param1);
                                         
                                              wrappedComplexType.setSourceRNObjects(param2);
                                         
                                         wrappedType.setTransferSubObjects(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.TransferSubObjects.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.TransferSubObjectsMsg getTransferSubObjects(
                                com.rightnow.ws.messages.TransferSubObjects wrappedType){
                                    return wrappedType.getTransferSubObjects();
                                }

                                private com.rightnow.ws.messages.TransferSubObjects wrapTransferSubObjects(
                                com.rightnow.ws.messages.TransferSubObjectsMsg innerType){
                                    com.rightnow.ws.messages.TransferSubObjects wrappedElement = new com.rightnow.ws.messages.TransferSubObjects();
                                    wrappedElement.setTransferSubObjects(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rightnow.ws.messages.TransferSubObjectsResponseMsg getTransferSubObjects(
                                com.rightnow.ws.messages.TransferSubObjectsResponse wrappedType){
                                    return wrappedType.getTransferSubObjectsResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.messages.BatchRequestItem[] param1,
                                    com.rightnow.ws.messages.Batch dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.Batch wrappedType = new com.rightnow.ws.messages.Batch();

                                 com.rightnow.ws.messages.BatchMsg wrappedComplexType = new com.rightnow.ws.messages.BatchMsg();
                                          
                                              wrappedComplexType.setBatchRequestItem(param1);
                                         
                                         wrappedType.setBatch(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.Batch.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.BatchMsg getBatch(
                                com.rightnow.ws.messages.Batch wrappedType){
                                    return wrappedType.getBatch();
                                }

                                private com.rightnow.ws.messages.Batch wrapBatch(
                                com.rightnow.ws.messages.BatchMsg innerType){
                                    com.rightnow.ws.messages.Batch wrappedElement = new com.rightnow.ws.messages.Batch();
                                    wrappedElement.setBatch(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.messages.BatchResponseItem[] getBatchResponseBatchResponseItem(
                                com.rightnow.ws.messages.BatchResponse wrappedType){
                                
                                        return wrappedType.getBatchResponse().getBatchResponseItem();
                                    
                                }
                             

                                private com.rightnow.ws.messages.BatchResponseMsg getBatch(
                                com.rightnow.ws.messages.BatchResponse wrappedType){
                                    return wrappedType.getBatchResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.ID param1,
                                    com.rightnow.ws.base.ID param2,
                                    java.util.Calendar param3,
                                    com.rightnow.ws.base.ID param4,
                                    com.rightnow.ws.base.ID param5,
                                    com.rightnow.ws.base.ID param6,
                                    com.rightnow.ws.messages.SendMailingToContact dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.SendMailingToContact wrappedType = new com.rightnow.ws.messages.SendMailingToContact();

                                 com.rightnow.ws.messages.SendMailingToContactMsg wrappedComplexType = new com.rightnow.ws.messages.SendMailingToContactMsg();
                                          
                                              wrappedComplexType.setContactID(param1);
                                         
                                              wrappedComplexType.setMailingID(param2);
                                         
                                              wrappedComplexType.setScheduledTime(param3);
                                         
                                              wrappedComplexType.setIncidentID(param4);
                                         
                                              wrappedComplexType.setOpportunityID(param5);
                                         
                                              wrappedComplexType.setChatID(param6);
                                         
                                         wrappedType.setSendMailingToContact(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.SendMailingToContact.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.SendMailingToContactMsg getSendMailingToContact(
                                com.rightnow.ws.messages.SendMailingToContact wrappedType){
                                    return wrappedType.getSendMailingToContact();
                                }

                                private com.rightnow.ws.messages.SendMailingToContact wrapSendMailingToContact(
                                com.rightnow.ws.messages.SendMailingToContactMsg innerType){
                                    com.rightnow.ws.messages.SendMailingToContact wrappedElement = new com.rightnow.ws.messages.SendMailingToContact();
                                    wrappedElement.setSendMailingToContact(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rightnow.ws.messages.SendMailingToContactResponseMsg getSendMailingToContact(
                                com.rightnow.ws.messages.SendMailingToContactResponse wrappedType){
                                    return wrappedType.getSendMailingToContactResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rightnow.ws.base.ID param1,
                                    com.rightnow.ws.base.ID param2,
                                    java.lang.String param3,
                                    com.rightnow.ws.messages.ExecuteMarketingFlow dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.ExecuteMarketingFlow wrappedType = new com.rightnow.ws.messages.ExecuteMarketingFlow();

                                 com.rightnow.ws.messages.ExecuteMarketingFlowMsg wrappedComplexType = new com.rightnow.ws.messages.ExecuteMarketingFlowMsg();
                                          
                                              wrappedComplexType.setContactID(param1);
                                         
                                              wrappedComplexType.setCampaignID(param2);
                                         
                                              wrappedComplexType.setEntryPoint(param3);
                                         
                                         wrappedType.setExecuteMarketingFlow(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.ExecuteMarketingFlow.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.ExecuteMarketingFlowMsg getExecuteMarketingFlow(
                                com.rightnow.ws.messages.ExecuteMarketingFlow wrappedType){
                                    return wrappedType.getExecuteMarketingFlow();
                                }

                                private com.rightnow.ws.messages.ExecuteMarketingFlow wrapExecuteMarketingFlow(
                                com.rightnow.ws.messages.ExecuteMarketingFlowMsg innerType){
                                    com.rightnow.ws.messages.ExecuteMarketingFlow wrappedElement = new com.rightnow.ws.messages.ExecuteMarketingFlow();
                                    wrappedElement.setExecuteMarketingFlow(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg getExecuteMarketingFlow(
                                com.rightnow.ws.messages.ExecuteMarketingFlowResponse wrappedType){
                                    return wrappedType.getExecuteMarketingFlowResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    com.rightnow.ws.messages.GetValuesForNamedID dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rightnow.ws.messages.GetValuesForNamedID wrappedType = new com.rightnow.ws.messages.GetValuesForNamedID();

                                 com.rightnow.ws.messages.GetValuesForNamedIDMsg wrappedComplexType = new com.rightnow.ws.messages.GetValuesForNamedIDMsg();
                                          
                                              wrappedComplexType.setPackageName(param1);
                                         
                                              wrappedComplexType.setFieldName(param2);
                                         
                                         wrappedType.setGetValuesForNamedID(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rightnow.ws.messages.GetValuesForNamedID.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rightnow.ws.messages.GetValuesForNamedIDMsg getGetValuesForNamedID(
                                com.rightnow.ws.messages.GetValuesForNamedID wrappedType){
                                    return wrappedType.getGetValuesForNamedID();
                                }

                                private com.rightnow.ws.messages.GetValuesForNamedID wrapGetValuesForNamedID(
                                com.rightnow.ws.messages.GetValuesForNamedIDMsg innerType){
                                    com.rightnow.ws.messages.GetValuesForNamedID wrappedElement = new com.rightnow.ws.messages.GetValuesForNamedID();
                                    wrappedElement.setGetValuesForNamedID(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rightnow.ws.base.NamedID[] getGetValuesForNamedIDResponseEntry(
                                com.rightnow.ws.messages.GetValuesForNamedIDResponse wrappedType){
                                
                                        return wrappedType.getGetValuesForNamedIDResponse().getEntry();
                                    
                                }
                             

                                private com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg getGetValuesForNamedID(
                                com.rightnow.ws.messages.GetValuesForNamedIDResponse wrappedType){
                                    return wrappedType.getGetValuesForNamedIDResponse();
                                }

                                
                                
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.rightnow.ws.messages.ConvertObjectToGeneric.class.equals(type)){
                
                           return com.rightnow.ws.messages.ConvertObjectToGeneric.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ConvertObjectToGenericResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.ConvertObjectToGenericResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetMetaDataForClass.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetMetaDataForClass.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetMetaDataForClassResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetMetaDataForClassResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.QueryCSV.class.equals(type)){
                
                           return com.rightnow.ws.messages.QueryCSV.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.QueryCSVResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.QueryCSVResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetMetaDataLastChangeTime.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetMetaDataLastChangeTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.Update.class.equals(type)){
                
                           return com.rightnow.ws.messages.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.UpdateResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.RunAnalyticsReport.class.equals(type)){
                
                           return com.rightnow.ws.messages.RunAnalyticsReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.RunAnalyticsReportResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.RunAnalyticsReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ConvertGenericToObject.class.equals(type)){
                
                           return com.rightnow.ws.messages.ConvertGenericToObject.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ConvertGenericToObjectResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.ConvertGenericToObjectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetMetaData.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetMetaData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetMetaDataResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetMetaDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.QueryObjects.class.equals(type)){
                
                           return com.rightnow.ws.messages.QueryObjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.QueryObjectsResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.QueryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ResetContactPassword.class.equals(type)){
                
                           return com.rightnow.ws.messages.ResetContactPassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ResetContactPasswordResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.ResetContactPasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetFileData.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetFileData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetFileDataResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetFileDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetValuesForNamedIDHierarchy.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetValuesForNamedIDHierarchy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.Get.class.equals(type)){
                
                           return com.rightnow.ws.messages.Get.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.Create.class.equals(type)){
                
                           return com.rightnow.ws.messages.Create.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.CreateResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.CreateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.Destroy.class.equals(type)){
                
                           return com.rightnow.ws.messages.Destroy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.DestroyResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.DestroyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.TransferSubObjects.class.equals(type)){
                
                           return com.rightnow.ws.messages.TransferSubObjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.TransferSubObjectsResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.TransferSubObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.Batch.class.equals(type)){
                
                           return com.rightnow.ws.messages.Batch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.BatchResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.BatchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.SendMailingToContact.class.equals(type)){
                
                           return com.rightnow.ws.messages.SendMailingToContact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.SendMailingToContactResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.SendMailingToContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ExecuteMarketingFlow.class.equals(type)){
                
                           return com.rightnow.ws.messages.ExecuteMarketingFlow.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ExecuteMarketingFlowResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.ExecuteMarketingFlowResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetValuesForNamedID.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetValuesForNamedID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.GetValuesForNamedIDResponse.class.equals(type)){
                
                           return com.rightnow.ws.messages.GetValuesForNamedIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rightnow.ws.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rightnow.ws.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rightnow.ws.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   