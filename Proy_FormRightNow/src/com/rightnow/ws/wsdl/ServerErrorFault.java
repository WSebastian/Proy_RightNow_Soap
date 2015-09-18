
/**
 * ServerErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.rightnow.ws.wsdl;

public class ServerErrorFault extends java.lang.Exception{
    
    private com.rightnow.ws.faults.ServerErrorFault faultMessage;

    
        public ServerErrorFault() {
            super("ServerErrorFault");
        }

        public ServerErrorFault(java.lang.String s) {
           super(s);
        }

        public ServerErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServerErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rightnow.ws.faults.ServerErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rightnow.ws.faults.ServerErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    