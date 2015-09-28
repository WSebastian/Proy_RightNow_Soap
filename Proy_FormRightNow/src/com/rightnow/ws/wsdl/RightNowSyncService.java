

/**
 * RightNowSyncService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package com.rightnow.ws.wsdl;

    /*
     *  RightNowSyncService java interface
     */

    public interface RightNowSyncService {
          

        /**
          * Auto generated method signature
          * 
                    * @param convertObjectToGeneric44
                
                    * @param clientInfoHeader46
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult convertObjectToGeneric(

                        com.rightnow.ws.base.RNObject[] rNObjects45,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader46)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param convertObjectToGeneric44
            
                * @param clientInfoHeader46
            
          */
        public void startconvertObjectToGeneric(

            com.rightnow.ws.base.RNObject[] rNObjects45,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader46,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataForClass49
                
                    * @param clientInfoHeader53
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.metadata.MetaDataClass[] getMetaDataForClass(

                        java.lang.String[] className50,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName51,java.lang.String[] metaDataLink52,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader53)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataForClass49
            
                * @param clientInfoHeader53
            
          */
        public void startgetMetaDataForClass(

            java.lang.String[] className50,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName51,java.lang.String[] metaDataLink52,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader53,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryCSV56
                
                    * @param clientInfoHeader62
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.QueryCSVResponseMsg queryCSV(

                        java.lang.String query57,int pageSize58,java.lang.String delimiter59,boolean returnRawResult60,boolean disableMTOM61,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader62)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryCSV56
            
                * @param clientInfoHeader62
            
          */
        public void startqueryCSV(

            java.lang.String query57,int pageSize58,java.lang.String delimiter59,boolean returnRawResult60,boolean disableMTOM61,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader62,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataLastChangeTime66
                
                    * @param clientInfoHeader67
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public java.util.Calendar getMetaDataLastChangeTime(

                        com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader67)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataLastChangeTime66
            
                * @param clientInfoHeader67
            
          */
        public void startgetMetaDataLastChangeTime(

            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader67,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param update70
                
                    * @param clientInfoHeader73
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.UpdateResponseMsg update(

                        com.rightnow.ws.base.RNObject[] rNObjects71,com.rightnow.ws.messages.UpdateProcessingOptions processingOptions72,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader73)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param update70
            
                * @param clientInfoHeader73
            
          */
        public void startupdate(

            com.rightnow.ws.base.RNObject[] rNObjects71,com.rightnow.ws.messages.UpdateProcessingOptions processingOptions72,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader73,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param runAnalyticsReport75
                
                    * @param clientInfoHeader82
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RunAnalyticsReportResponseMsg runAnalyticsReport(

                        com.rightnow.ws.objects.AnalyticsReport analyticsReport76,int limit77,int start78,java.lang.String delimiter79,boolean returnRawResult80,boolean disableMTOM81,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader82)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param runAnalyticsReport75
            
                * @param clientInfoHeader82
            
          */
        public void startrunAnalyticsReport(

            com.rightnow.ws.objects.AnalyticsReport analyticsReport76,int limit77,int start78,java.lang.String delimiter79,boolean returnRawResult80,boolean disableMTOM81,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader82,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param convertGenericToObject86
                
                    * @param clientInfoHeader88
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult convertGenericToObject(

                        com.rightnow.ws.base.RNObject[] rNObjects87,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader88)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param convertGenericToObject86
            
                * @param clientInfoHeader88
            
          */
        public void startconvertGenericToObject(

            com.rightnow.ws.base.RNObject[] rNObjects87,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader88,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaData91
                
                    * @param clientInfoHeader92
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.metadata.MetaDataClass[] getMetaData(

                        com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader92)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaData91
            
                * @param clientInfoHeader92
            
          */
        public void startgetMetaData(

            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader92,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryObjects95
                
                    * @param clientInfoHeader99
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.QueryResultData[] queryObjects(

                        java.lang.String query96,com.rightnow.ws.base.RNObject[] objectTemplates97,int pageSize98,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader99)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryObjects95
            
                * @param clientInfoHeader99
            
          */
        public void startqueryObjects(

            java.lang.String query96,com.rightnow.ws.base.RNObject[] objectTemplates97,int pageSize98,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader99,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param resetContactPassword102
                
                    * @param clientInfoHeader104
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.ResetContactPasswordResponseMsg resetContactPassword(

                        com.rightnow.ws.base.ID contactID103,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader104)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param resetContactPassword102
            
                * @param clientInfoHeader104
            
          */
        public void startresetContactPassword(

            com.rightnow.ws.base.ID contactID103,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader104,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getFileData106
                
                    * @param clientInfoHeader110
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public javax.activation.DataHandler getFileData(

                        com.rightnow.ws.base.RNObject rNObject107,com.rightnow.ws.base.ID fileID108,boolean disableMTOM109,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader110)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getFileData106
            
                * @param clientInfoHeader110
            
          */
        public void startgetFileData(

            com.rightnow.ws.base.RNObject rNObject107,com.rightnow.ws.base.ID fileID108,boolean disableMTOM109,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader110,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getValuesForNamedIDHierarchy113
                
                    * @param clientInfoHeader115
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.base.NamedIDWithParent[] getValuesForNamedIDHierarchy(

                        java.lang.String fieldName114,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader115)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getValuesForNamedIDHierarchy113
            
                * @param clientInfoHeader115
            
          */
        public void startgetValuesForNamedIDHierarchy(

            java.lang.String fieldName114,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader115,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param get118
                
                    * @param clientInfoHeader121
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult get(

                        com.rightnow.ws.base.RNObject[] rNObjects119,com.rightnow.ws.messages.GetProcessingOptions processingOptions120,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader121)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param get118
            
                * @param clientInfoHeader121
            
          */
        public void startget(

            com.rightnow.ws.base.RNObject[] rNObjects119,com.rightnow.ws.messages.GetProcessingOptions processingOptions120,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader121,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param create124
                
                    * @param clientInfoHeader127
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult create(

                        com.rightnow.ws.base.RNObject[] rNObjects125,com.rightnow.ws.messages.CreateProcessingOptions processingOptions126,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader127)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param create124
            
                * @param clientInfoHeader127
            
          */
        public void startcreate(

            com.rightnow.ws.base.RNObject[] rNObjects125,com.rightnow.ws.messages.CreateProcessingOptions processingOptions126,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader127,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param destroy130
                
                    * @param clientInfoHeader133
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.DestroyResponseMsg destroy(

                        com.rightnow.ws.base.RNObject[] rNObjects131,com.rightnow.ws.messages.DestroyProcessingOptions processingOptions132,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader133)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param destroy130
            
                * @param clientInfoHeader133
            
          */
        public void startdestroy(

            com.rightnow.ws.base.RNObject[] rNObjects131,com.rightnow.ws.messages.DestroyProcessingOptions processingOptions132,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader133,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param transferSubObjects135
                
                    * @param clientInfoHeader138
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.TransferSubObjectsResponseMsg transferSubObjects(

                        com.rightnow.ws.base.RNObject destinationRNObject136,com.rightnow.ws.base.RNObject[] sourceRNObjects137,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader138)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param transferSubObjects135
            
                * @param clientInfoHeader138
            
          */
        public void starttransferSubObjects(

            com.rightnow.ws.base.RNObject destinationRNObject136,com.rightnow.ws.base.RNObject[] sourceRNObjects137,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader138,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param batch140
                
                    * @param clientInfoHeader142
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.BatchResponseItem[] batch(

                        com.rightnow.ws.messages.BatchRequestItem[] batchRequestItem141,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader142)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param batch140
            
                * @param clientInfoHeader142
            
          */
        public void startbatch(

            com.rightnow.ws.messages.BatchRequestItem[] batchRequestItem141,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader142,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sendMailingToContact145
                
                    * @param clientInfoHeader152
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.SendMailingToContactResponseMsg sendMailingToContact(

                        com.rightnow.ws.base.ID contactID146,com.rightnow.ws.base.ID mailingID147,java.util.Calendar scheduledTime148,com.rightnow.ws.base.ID incidentID149,com.rightnow.ws.base.ID opportunityID150,com.rightnow.ws.base.ID chatID151,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader152)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendMailingToContact145
            
                * @param clientInfoHeader152
            
          */
        public void startsendMailingToContact(

            com.rightnow.ws.base.ID contactID146,com.rightnow.ws.base.ID mailingID147,java.util.Calendar scheduledTime148,com.rightnow.ws.base.ID incidentID149,com.rightnow.ws.base.ID opportunityID150,com.rightnow.ws.base.ID chatID151,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader152,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param executeMarketingFlow154
                
                    * @param clientInfoHeader158
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg executeMarketingFlow(

                        com.rightnow.ws.base.ID contactID155,com.rightnow.ws.base.ID campaignID156,java.lang.String entryPoint157,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader158)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param executeMarketingFlow154
            
                * @param clientInfoHeader158
            
          */
        public void startexecuteMarketingFlow(

            com.rightnow.ws.base.ID contactID155,com.rightnow.ws.base.ID campaignID156,java.lang.String entryPoint157,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader158,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getValuesForNamedID160
                
                    * @param clientInfoHeader163
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.base.NamedID[] getValuesForNamedID(

                        java.lang.String packageName161,java.lang.String fieldName162,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader163)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getValuesForNamedID160
            
                * @param clientInfoHeader163
            
          */
        public void startgetValuesForNamedID(

            java.lang.String packageName161,java.lang.String fieldName162,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader163,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    