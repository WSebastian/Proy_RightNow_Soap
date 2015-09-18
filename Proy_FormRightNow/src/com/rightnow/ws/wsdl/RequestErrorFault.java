
/**
 * RequestErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.rightnow.ws.wsdl;

public class RequestErrorFault extends java.lang.Exception{
    
    private com.rightnow.ws.faults.RequestErrorFault faultMessage;

    
        public RequestErrorFault() {
            super("RequestErrorFault");
        }

        public RequestErrorFault(java.lang.String s) {
           super(s);
        }

        public RequestErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RequestErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rightnow.ws.faults.RequestErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rightnow.ws.faults.RequestErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    