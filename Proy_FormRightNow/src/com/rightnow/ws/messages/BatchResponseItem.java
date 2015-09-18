
/**
 * BatchResponseItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.messages;
            

            /**
            *  BatchResponseItem bean class
            */
        
        public  class BatchResponseItem
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BatchResponseItem
                Namespace URI = urn:messages.ws.rightnow.com/v1_2
                Namespace Prefix = ns7
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:messages.ws.rightnow.com/v1_2")){
                return "ns7";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localCreateResponseMsgTracker = false;
                
                   localGetResponseMsgTracker = false;
                
                   localUpdateResponseMsgTracker = false;
                
                   localDestroyResponseMsgTracker = false;
                
                   localQueryCSVResponseMsgTracker = false;
                
                   localQueryObjectsResponseMsgTracker = false;
                
                   localExecuteMarketingFlowResponseMsgTracker = false;
                
                   localGetFileDataResponseMsgTracker = false;
                
                   localResetContactPasswordResponseMsgTracker = false;
                
                   localSendMailingToContactResponseMsgTracker = false;
                
                   localGetMetaDataResponseMsgTracker = false;
                
                   localTransferSubObjectsResponseMsgTracker = false;
                
                   localGetMetaDataForClassResponseMsgTracker = false;
                
                   localGetMetaDataLastChangeTimeResponseMsgTracker = false;
                
                   localGetValuesForNamedIDResponseMsgTracker = false;
                
                   localGetValuesForNamedIDHierarchyResponseMsgTracker = false;
                
                   localRunAnalyticsReportResponseMsgTracker = false;
                
                   localRequestErrorFaultTracker = false;
                
                   localServerErrorFaultTracker = false;
                
                   localUnexpectedErrorFaultTracker = false;
                
            }
        

                        /**
                        * field for CreateResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.CreateResponseMsg localCreateResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.CreateResponseMsg
                           */
                           public  com.rightnow.ws.messages.CreateResponseMsg getCreateResponseMsg(){
                               return localCreateResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateResponseMsg
                               */
                               public void setCreateResponseMsg(com.rightnow.ws.messages.CreateResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCreateResponseMsgTracker = true;
                                       } else {
                                          localCreateResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localCreateResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetResponseMsg localGetResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetResponseMsg getGetResponseMsg(){
                               return localGetResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetResponseMsg
                               */
                               public void setGetResponseMsg(com.rightnow.ws.messages.GetResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetResponseMsgTracker = true;
                                       } else {
                                          localGetResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for UpdateResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.UpdateResponseMsg localUpdateResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdateResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.UpdateResponseMsg
                           */
                           public  com.rightnow.ws.messages.UpdateResponseMsg getUpdateResponseMsg(){
                               return localUpdateResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateResponseMsg
                               */
                               public void setUpdateResponseMsg(com.rightnow.ws.messages.UpdateResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUpdateResponseMsgTracker = true;
                                       } else {
                                          localUpdateResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localUpdateResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for DestroyResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.DestroyResponseMsg localDestroyResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestroyResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.DestroyResponseMsg
                           */
                           public  com.rightnow.ws.messages.DestroyResponseMsg getDestroyResponseMsg(){
                               return localDestroyResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestroyResponseMsg
                               */
                               public void setDestroyResponseMsg(com.rightnow.ws.messages.DestroyResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDestroyResponseMsgTracker = true;
                                       } else {
                                          localDestroyResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localDestroyResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for QueryCSVResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.QueryCSVResponseMsg localQueryCSVResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryCSVResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.QueryCSVResponseMsg
                           */
                           public  com.rightnow.ws.messages.QueryCSVResponseMsg getQueryCSVResponseMsg(){
                               return localQueryCSVResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryCSVResponseMsg
                               */
                               public void setQueryCSVResponseMsg(com.rightnow.ws.messages.QueryCSVResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQueryCSVResponseMsgTracker = true;
                                       } else {
                                          localQueryCSVResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localQueryCSVResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for QueryObjectsResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.QueryObjectsResponseMsg localQueryObjectsResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryObjectsResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.QueryObjectsResponseMsg
                           */
                           public  com.rightnow.ws.messages.QueryObjectsResponseMsg getQueryObjectsResponseMsg(){
                               return localQueryObjectsResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryObjectsResponseMsg
                               */
                               public void setQueryObjectsResponseMsg(com.rightnow.ws.messages.QueryObjectsResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQueryObjectsResponseMsgTracker = true;
                                       } else {
                                          localQueryObjectsResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localQueryObjectsResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for ExecuteMarketingFlowResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg localExecuteMarketingFlowResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExecuteMarketingFlowResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg
                           */
                           public  com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg getExecuteMarketingFlowResponseMsg(){
                               return localExecuteMarketingFlowResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExecuteMarketingFlowResponseMsg
                               */
                               public void setExecuteMarketingFlowResponseMsg(com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExecuteMarketingFlowResponseMsgTracker = true;
                                       } else {
                                          localExecuteMarketingFlowResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localExecuteMarketingFlowResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetFileDataResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetFileDataResponseMsg localGetFileDataResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetFileDataResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetFileDataResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetFileDataResponseMsg getGetFileDataResponseMsg(){
                               return localGetFileDataResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetFileDataResponseMsg
                               */
                               public void setGetFileDataResponseMsg(com.rightnow.ws.messages.GetFileDataResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetFileDataResponseMsgTracker = true;
                                       } else {
                                          localGetFileDataResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetFileDataResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for ResetContactPasswordResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.ResetContactPasswordResponseMsg localResetContactPasswordResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResetContactPasswordResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.ResetContactPasswordResponseMsg
                           */
                           public  com.rightnow.ws.messages.ResetContactPasswordResponseMsg getResetContactPasswordResponseMsg(){
                               return localResetContactPasswordResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResetContactPasswordResponseMsg
                               */
                               public void setResetContactPasswordResponseMsg(com.rightnow.ws.messages.ResetContactPasswordResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localResetContactPasswordResponseMsgTracker = true;
                                       } else {
                                          localResetContactPasswordResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localResetContactPasswordResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for SendMailingToContactResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.SendMailingToContactResponseMsg localSendMailingToContactResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendMailingToContactResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.SendMailingToContactResponseMsg
                           */
                           public  com.rightnow.ws.messages.SendMailingToContactResponseMsg getSendMailingToContactResponseMsg(){
                               return localSendMailingToContactResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendMailingToContactResponseMsg
                               */
                               public void setSendMailingToContactResponseMsg(com.rightnow.ws.messages.SendMailingToContactResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSendMailingToContactResponseMsgTracker = true;
                                       } else {
                                          localSendMailingToContactResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localSendMailingToContactResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataResponseMsg localGetMetaDataResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataResponseMsg getGetMetaDataResponseMsg(){
                               return localGetMetaDataResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataResponseMsg
                               */
                               public void setGetMetaDataResponseMsg(com.rightnow.ws.messages.GetMetaDataResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataResponseMsgTracker = true;
                                       } else {
                                          localGetMetaDataResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for TransferSubObjectsResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.TransferSubObjectsResponseMsg localTransferSubObjectsResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransferSubObjectsResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.TransferSubObjectsResponseMsg
                           */
                           public  com.rightnow.ws.messages.TransferSubObjectsResponseMsg getTransferSubObjectsResponseMsg(){
                               return localTransferSubObjectsResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransferSubObjectsResponseMsg
                               */
                               public void setTransferSubObjectsResponseMsg(com.rightnow.ws.messages.TransferSubObjectsResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTransferSubObjectsResponseMsgTracker = true;
                                       } else {
                                          localTransferSubObjectsResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localTransferSubObjectsResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataForClassResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataForClassResponseMsg localGetMetaDataForClassResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataForClassResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataForClassResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataForClassResponseMsg getGetMetaDataForClassResponseMsg(){
                               return localGetMetaDataForClassResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataForClassResponseMsg
                               */
                               public void setGetMetaDataForClassResponseMsg(com.rightnow.ws.messages.GetMetaDataForClassResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataForClassResponseMsgTracker = true;
                                       } else {
                                          localGetMetaDataForClassResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataForClassResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataLastChangeTimeResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg localGetMetaDataLastChangeTimeResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataLastChangeTimeResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg getGetMetaDataLastChangeTimeResponseMsg(){
                               return localGetMetaDataLastChangeTimeResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataLastChangeTimeResponseMsg
                               */
                               public void setGetMetaDataLastChangeTimeResponseMsg(com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataLastChangeTimeResponseMsgTracker = true;
                                       } else {
                                          localGetMetaDataLastChangeTimeResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataLastChangeTimeResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetValuesForNamedIDResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg localGetValuesForNamedIDResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetValuesForNamedIDResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg getGetValuesForNamedIDResponseMsg(){
                               return localGetValuesForNamedIDResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetValuesForNamedIDResponseMsg
                               */
                               public void setGetValuesForNamedIDResponseMsg(com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetValuesForNamedIDResponseMsgTracker = true;
                                       } else {
                                          localGetValuesForNamedIDResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetValuesForNamedIDResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetValuesForNamedIDHierarchyResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg localGetValuesForNamedIDHierarchyResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetValuesForNamedIDHierarchyResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg
                           */
                           public  com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg getGetValuesForNamedIDHierarchyResponseMsg(){
                               return localGetValuesForNamedIDHierarchyResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetValuesForNamedIDHierarchyResponseMsg
                               */
                               public void setGetValuesForNamedIDHierarchyResponseMsg(com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetValuesForNamedIDHierarchyResponseMsgTracker = true;
                                       } else {
                                          localGetValuesForNamedIDHierarchyResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetValuesForNamedIDHierarchyResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for RunAnalyticsReportResponseMsg
                        */

                        
                                    protected com.rightnow.ws.messages.RunAnalyticsReportResponseMsg localRunAnalyticsReportResponseMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRunAnalyticsReportResponseMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.RunAnalyticsReportResponseMsg
                           */
                           public  com.rightnow.ws.messages.RunAnalyticsReportResponseMsg getRunAnalyticsReportResponseMsg(){
                               return localRunAnalyticsReportResponseMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RunAnalyticsReportResponseMsg
                               */
                               public void setRunAnalyticsReportResponseMsg(com.rightnow.ws.messages.RunAnalyticsReportResponseMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRunAnalyticsReportResponseMsgTracker = true;
                                       } else {
                                          localRunAnalyticsReportResponseMsgTracker = false;
                                              
                                       }
                                   
                                            this.localRunAnalyticsReportResponseMsg=param;
                                    

                               }
                            

                        /**
                        * field for RequestErrorFault
                        */

                        
                                    protected com.rightnow.ws.faults.RequestErrorFaultType localRequestErrorFault ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestErrorFaultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.faults.RequestErrorFaultType
                           */
                           public  com.rightnow.ws.faults.RequestErrorFaultType getRequestErrorFault(){
                               return localRequestErrorFault;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestErrorFault
                               */
                               public void setRequestErrorFault(com.rightnow.ws.faults.RequestErrorFaultType param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRequestErrorFaultTracker = true;
                                       } else {
                                          localRequestErrorFaultTracker = false;
                                              
                                       }
                                   
                                            this.localRequestErrorFault=param;
                                    

                               }
                            

                        /**
                        * field for ServerErrorFault
                        */

                        
                                    protected com.rightnow.ws.faults.ServerErrorFaultType localServerErrorFault ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerErrorFaultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.faults.ServerErrorFaultType
                           */
                           public  com.rightnow.ws.faults.ServerErrorFaultType getServerErrorFault(){
                               return localServerErrorFault;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerErrorFault
                               */
                               public void setServerErrorFault(com.rightnow.ws.faults.ServerErrorFaultType param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServerErrorFaultTracker = true;
                                       } else {
                                          localServerErrorFaultTracker = false;
                                              
                                       }
                                   
                                            this.localServerErrorFault=param;
                                    

                               }
                            

                        /**
                        * field for UnexpectedErrorFault
                        */

                        
                                    protected com.rightnow.ws.faults.UnexpectedErrorFaultType localUnexpectedErrorFault ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnexpectedErrorFaultTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.faults.UnexpectedErrorFaultType
                           */
                           public  com.rightnow.ws.faults.UnexpectedErrorFaultType getUnexpectedErrorFault(){
                               return localUnexpectedErrorFault;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnexpectedErrorFault
                               */
                               public void setUnexpectedErrorFault(com.rightnow.ws.faults.UnexpectedErrorFaultType param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUnexpectedErrorFaultTracker = true;
                                       } else {
                                          localUnexpectedErrorFaultTracker = false;
                                              
                                       }
                                   
                                            this.localUnexpectedErrorFault=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       BatchResponseItem.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:messages.ws.rightnow.com/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BatchResponseItem",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BatchResponseItem",
                           xmlWriter);
                   }

               
                   }
                if (localCreateResponseMsgTracker){
                                            if (localCreateResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreateResponseMsg cannot be null!!");
                                            }
                                           localCreateResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","CreateResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetResponseMsgTracker){
                                            if (localGetResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetResponseMsg cannot be null!!");
                                            }
                                           localGetResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localUpdateResponseMsgTracker){
                                            if (localUpdateResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UpdateResponseMsg cannot be null!!");
                                            }
                                           localUpdateResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","UpdateResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localDestroyResponseMsgTracker){
                                            if (localDestroyResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DestroyResponseMsg cannot be null!!");
                                            }
                                           localDestroyResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","DestroyResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localQueryCSVResponseMsgTracker){
                                            if (localQueryCSVResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryCSVResponseMsg cannot be null!!");
                                            }
                                           localQueryCSVResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QueryCSVResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localQueryObjectsResponseMsgTracker){
                                            if (localQueryObjectsResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryObjectsResponseMsg cannot be null!!");
                                            }
                                           localQueryObjectsResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QueryObjectsResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localExecuteMarketingFlowResponseMsgTracker){
                                            if (localExecuteMarketingFlowResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExecuteMarketingFlowResponseMsg cannot be null!!");
                                            }
                                           localExecuteMarketingFlowResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ExecuteMarketingFlowResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetFileDataResponseMsgTracker){
                                            if (localGetFileDataResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetFileDataResponseMsg cannot be null!!");
                                            }
                                           localGetFileDataResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetFileDataResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localResetContactPasswordResponseMsgTracker){
                                            if (localResetContactPasswordResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResetContactPasswordResponseMsg cannot be null!!");
                                            }
                                           localResetContactPasswordResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ResetContactPasswordResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localSendMailingToContactResponseMsgTracker){
                                            if (localSendMailingToContactResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SendMailingToContactResponseMsg cannot be null!!");
                                            }
                                           localSendMailingToContactResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","SendMailingToContactResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataResponseMsgTracker){
                                            if (localGetMetaDataResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataResponseMsg cannot be null!!");
                                            }
                                           localGetMetaDataResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetMetaDataResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localTransferSubObjectsResponseMsgTracker){
                                            if (localTransferSubObjectsResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TransferSubObjectsResponseMsg cannot be null!!");
                                            }
                                           localTransferSubObjectsResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","TransferSubObjectsResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataForClassResponseMsgTracker){
                                            if (localGetMetaDataForClassResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataForClassResponseMsg cannot be null!!");
                                            }
                                           localGetMetaDataForClassResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetMetaDataForClassResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataLastChangeTimeResponseMsgTracker){
                                            if (localGetMetaDataLastChangeTimeResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataLastChangeTimeResponseMsg cannot be null!!");
                                            }
                                           localGetMetaDataLastChangeTimeResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetMetaDataLastChangeTimeResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetValuesForNamedIDResponseMsgTracker){
                                            if (localGetValuesForNamedIDResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDResponseMsg cannot be null!!");
                                            }
                                           localGetValuesForNamedIDResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetValuesForNamedIDResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localGetValuesForNamedIDHierarchyResponseMsgTracker){
                                            if (localGetValuesForNamedIDHierarchyResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDHierarchyResponseMsg cannot be null!!");
                                            }
                                           localGetValuesForNamedIDHierarchyResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetValuesForNamedIDHierarchyResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localRunAnalyticsReportResponseMsgTracker){
                                            if (localRunAnalyticsReportResponseMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RunAnalyticsReportResponseMsg cannot be null!!");
                                            }
                                           localRunAnalyticsReportResponseMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","RunAnalyticsReportResponseMsg"),
                                               factory,xmlWriter);
                                        } if (localRequestErrorFaultTracker){
                                            if (localRequestErrorFault==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RequestErrorFault cannot be null!!");
                                            }
                                           localRequestErrorFault.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","RequestErrorFault"),
                                               factory,xmlWriter);
                                        } if (localServerErrorFaultTracker){
                                            if (localServerErrorFault==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServerErrorFault cannot be null!!");
                                            }
                                           localServerErrorFault.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ServerErrorFault"),
                                               factory,xmlWriter);
                                        } if (localUnexpectedErrorFaultTracker){
                                            if (localUnexpectedErrorFault==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UnexpectedErrorFault cannot be null!!");
                                            }
                                           localUnexpectedErrorFault.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","UnexpectedErrorFault"),
                                               factory,xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCreateResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "CreateResponseMsg"));
                            
                            
                                    if (localCreateResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreateResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localCreateResponseMsg);
                                } if (localGetResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetResponseMsg"));
                            
                            
                                    if (localGetResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetResponseMsg);
                                } if (localUpdateResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "UpdateResponseMsg"));
                            
                            
                                    if (localUpdateResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("UpdateResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localUpdateResponseMsg);
                                } if (localDestroyResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "DestroyResponseMsg"));
                            
                            
                                    if (localDestroyResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("DestroyResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localDestroyResponseMsg);
                                } if (localQueryCSVResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "QueryCSVResponseMsg"));
                            
                            
                                    if (localQueryCSVResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryCSVResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localQueryCSVResponseMsg);
                                } if (localQueryObjectsResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "QueryObjectsResponseMsg"));
                            
                            
                                    if (localQueryObjectsResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryObjectsResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localQueryObjectsResponseMsg);
                                } if (localExecuteMarketingFlowResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "ExecuteMarketingFlowResponseMsg"));
                            
                            
                                    if (localExecuteMarketingFlowResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExecuteMarketingFlowResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localExecuteMarketingFlowResponseMsg);
                                } if (localGetFileDataResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetFileDataResponseMsg"));
                            
                            
                                    if (localGetFileDataResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetFileDataResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetFileDataResponseMsg);
                                } if (localResetContactPasswordResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "ResetContactPasswordResponseMsg"));
                            
                            
                                    if (localResetContactPasswordResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResetContactPasswordResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localResetContactPasswordResponseMsg);
                                } if (localSendMailingToContactResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "SendMailingToContactResponseMsg"));
                            
                            
                                    if (localSendMailingToContactResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("SendMailingToContactResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localSendMailingToContactResponseMsg);
                                } if (localGetMetaDataResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetMetaDataResponseMsg"));
                            
                            
                                    if (localGetMetaDataResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataResponseMsg);
                                } if (localTransferSubObjectsResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "TransferSubObjectsResponseMsg"));
                            
                            
                                    if (localTransferSubObjectsResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("TransferSubObjectsResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localTransferSubObjectsResponseMsg);
                                } if (localGetMetaDataForClassResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetMetaDataForClassResponseMsg"));
                            
                            
                                    if (localGetMetaDataForClassResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataForClassResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataForClassResponseMsg);
                                } if (localGetMetaDataLastChangeTimeResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetMetaDataLastChangeTimeResponseMsg"));
                            
                            
                                    if (localGetMetaDataLastChangeTimeResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataLastChangeTimeResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataLastChangeTimeResponseMsg);
                                } if (localGetValuesForNamedIDResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetValuesForNamedIDResponseMsg"));
                            
                            
                                    if (localGetValuesForNamedIDResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetValuesForNamedIDResponseMsg);
                                } if (localGetValuesForNamedIDHierarchyResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "GetValuesForNamedIDHierarchyResponseMsg"));
                            
                            
                                    if (localGetValuesForNamedIDHierarchyResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDHierarchyResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localGetValuesForNamedIDHierarchyResponseMsg);
                                } if (localRunAnalyticsReportResponseMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "RunAnalyticsReportResponseMsg"));
                            
                            
                                    if (localRunAnalyticsReportResponseMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("RunAnalyticsReportResponseMsg cannot be null!!");
                                    }
                                    elementList.add(localRunAnalyticsReportResponseMsg);
                                } if (localRequestErrorFaultTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "RequestErrorFault"));
                            
                            
                                    if (localRequestErrorFault==null){
                                         throw new org.apache.axis2.databinding.ADBException("RequestErrorFault cannot be null!!");
                                    }
                                    elementList.add(localRequestErrorFault);
                                } if (localServerErrorFaultTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "ServerErrorFault"));
                            
                            
                                    if (localServerErrorFault==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServerErrorFault cannot be null!!");
                                    }
                                    elementList.add(localServerErrorFault);
                                } if (localUnexpectedErrorFaultTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                      "UnexpectedErrorFault"));
                            
                            
                                    if (localUnexpectedErrorFault==null){
                                         throw new org.apache.axis2.databinding.ADBException("UnexpectedErrorFault cannot be null!!");
                                    }
                                    elementList.add(localUnexpectedErrorFault);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static BatchResponseItem parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BatchResponseItem object =
                new BatchResponseItem();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"BatchResponseItem".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BatchResponseItem)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","CreateResponseMsg").equals(reader.getName())){
                                
                                                object.setCreateResponseMsg(com.rightnow.ws.messages.CreateResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetResponseMsg").equals(reader.getName())){
                                
                                                object.setGetResponseMsg(com.rightnow.ws.messages.GetResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","UpdateResponseMsg").equals(reader.getName())){
                                
                                                object.setUpdateResponseMsg(com.rightnow.ws.messages.UpdateResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","DestroyResponseMsg").equals(reader.getName())){
                                
                                                object.setDestroyResponseMsg(com.rightnow.ws.messages.DestroyResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QueryCSVResponseMsg").equals(reader.getName())){
                                
                                                object.setQueryCSVResponseMsg(com.rightnow.ws.messages.QueryCSVResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QueryObjectsResponseMsg").equals(reader.getName())){
                                
                                                object.setQueryObjectsResponseMsg(com.rightnow.ws.messages.QueryObjectsResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ExecuteMarketingFlowResponseMsg").equals(reader.getName())){
                                
                                                object.setExecuteMarketingFlowResponseMsg(com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetFileDataResponseMsg").equals(reader.getName())){
                                
                                                object.setGetFileDataResponseMsg(com.rightnow.ws.messages.GetFileDataResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ResetContactPasswordResponseMsg").equals(reader.getName())){
                                
                                                object.setResetContactPasswordResponseMsg(com.rightnow.ws.messages.ResetContactPasswordResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","SendMailingToContactResponseMsg").equals(reader.getName())){
                                
                                                object.setSendMailingToContactResponseMsg(com.rightnow.ws.messages.SendMailingToContactResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetMetaDataResponseMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataResponseMsg(com.rightnow.ws.messages.GetMetaDataResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","TransferSubObjectsResponseMsg").equals(reader.getName())){
                                
                                                object.setTransferSubObjectsResponseMsg(com.rightnow.ws.messages.TransferSubObjectsResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetMetaDataForClassResponseMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataForClassResponseMsg(com.rightnow.ws.messages.GetMetaDataForClassResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetMetaDataLastChangeTimeResponseMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataLastChangeTimeResponseMsg(com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetValuesForNamedIDResponseMsg").equals(reader.getName())){
                                
                                                object.setGetValuesForNamedIDResponseMsg(com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","GetValuesForNamedIDHierarchyResponseMsg").equals(reader.getName())){
                                
                                                object.setGetValuesForNamedIDHierarchyResponseMsg(com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","RunAnalyticsReportResponseMsg").equals(reader.getName())){
                                
                                                object.setRunAnalyticsReportResponseMsg(com.rightnow.ws.messages.RunAnalyticsReportResponseMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","RequestErrorFault").equals(reader.getName())){
                                
                                                object.setRequestErrorFault(com.rightnow.ws.faults.RequestErrorFaultType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ServerErrorFault").equals(reader.getName())){
                                
                                                object.setServerErrorFault(com.rightnow.ws.faults.ServerErrorFaultType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","UnexpectedErrorFault").equals(reader.getName())){
                                
                                                object.setUnexpectedErrorFault(com.rightnow.ws.faults.UnexpectedErrorFaultType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          