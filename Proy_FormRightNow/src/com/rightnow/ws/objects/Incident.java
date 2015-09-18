
/**
 * Incident.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.objects;
            

            /**
            *  Incident bean class
            */
        
        public  class Incident extends com.rightnow.ws.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Incident
                Namespace URI = urn:objects.ws.rightnow.com/v1_2
                Namespace Prefix = ns4
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:objects.ws.rightnow.com/v1_2")){
                return "ns4";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for Asset
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localAsset ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssetTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getAsset(){
                               return localAsset;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Asset
                               */
                               public void setAsset(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAssetTracker = true;
                                       } else {
                                          localAssetTracker = true;
                                              
                                       }
                                   
                                            this.localAsset=param;
                                    

                               }
                            

                        /**
                        * field for AssignedTo
                        */

                        
                                    protected com.rightnow.ws.objects.GroupAccount localAssignedTo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssignedToTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.GroupAccount
                           */
                           public  com.rightnow.ws.objects.GroupAccount getAssignedTo(){
                               return localAssignedTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssignedTo
                               */
                               public void setAssignedTo(com.rightnow.ws.objects.GroupAccount param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAssignedToTracker = true;
                                       } else {
                                          localAssignedToTracker = false;
                                              
                                       }
                                   
                                            this.localAssignedTo=param;
                                    

                               }
                            

                        /**
                        * field for Banner
                        */

                        
                                    protected com.rightnow.ws.objects.Banner localBanner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBannerTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.Banner
                           */
                           public  com.rightnow.ws.objects.Banner getBanner(){
                               return localBanner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Banner
                               */
                               public void setBanner(com.rightnow.ws.objects.Banner param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBannerTracker = true;
                                       } else {
                                          localBannerTracker = false;
                                              
                                       }
                                   
                                            this.localBanner=param;
                                    

                               }
                            

                        /**
                        * field for BilledMinutes
                        */

                        
                                    protected com.rightnow.ws.objects.TimeBilledList localBilledMinutes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBilledMinutesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.TimeBilledList
                           */
                           public  com.rightnow.ws.objects.TimeBilledList getBilledMinutes(){
                               return localBilledMinutes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BilledMinutes
                               */
                               public void setBilledMinutes(com.rightnow.ws.objects.TimeBilledList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBilledMinutesTracker = true;
                                       } else {
                                          localBilledMinutesTracker = true;
                                              
                                       }
                                   
                                            this.localBilledMinutes=param;
                                    

                               }
                            

                        /**
                        * field for Category
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCategoryTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getCategory(){
                               return localCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Category
                               */
                               public void setCategory(com.rightnow.ws.base.NamedIDHierarchy param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCategoryTracker = true;
                                       } else {
                                          localCategoryTracker = true;
                                              
                                       }
                                   
                                            this.localCategory=param;
                                    

                               }
                            

                        /**
                        * field for Channel
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localChannel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChannelTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getChannel(){
                               return localChannel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Channel
                               */
                               public void setChannel(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localChannelTracker = true;
                                       } else {
                                          localChannelTracker = true;
                                              
                                       }
                                   
                                            this.localChannel=param;
                                    

                               }
                            

                        /**
                        * field for ChatQueue
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localChatQueue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChatQueueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getChatQueue(){
                               return localChatQueue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChatQueue
                               */
                               public void setChatQueue(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localChatQueueTracker = true;
                                       } else {
                                          localChatQueueTracker = true;
                                              
                                       }
                                   
                                            this.localChatQueue=param;
                                    

                               }
                            

                        /**
                        * field for ClosedTime
                        */

                        
                                    protected java.util.Calendar localClosedTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClosedTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getClosedTime(){
                               return localClosedTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClosedTime
                               */
                               public void setClosedTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localClosedTimeTracker = true;
                                       } else {
                                          localClosedTimeTracker = true;
                                              
                                       }
                                   
                                            this.localClosedTime=param;
                                    

                               }
                            

                        /**
                        * field for CreatedByAccount
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localCreatedByAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreatedByAccountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getCreatedByAccount(){
                               return localCreatedByAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedByAccount
                               */
                               public void setCreatedByAccount(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCreatedByAccountTracker = true;
                                       } else {
                                          localCreatedByAccountTracker = true;
                                              
                                       }
                                   
                                            this.localCreatedByAccount=param;
                                    

                               }
                            

                        /**
                        * field for CustomFields
                        */

                        
                                    protected com.rightnow.ws.generic.GenericObject localCustomFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.GenericObject
                           */
                           public  com.rightnow.ws.generic.GenericObject getCustomFields(){
                               return localCustomFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomFields
                               */
                               public void setCustomFields(com.rightnow.ws.generic.GenericObject param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCustomFieldsTracker = true;
                                       } else {
                                          localCustomFieldsTracker = false;
                                              
                                       }
                                   
                                            this.localCustomFields=param;
                                    

                               }
                            

                        /**
                        * field for Disposition
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localDisposition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDispositionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getDisposition(){
                               return localDisposition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Disposition
                               */
                               public void setDisposition(com.rightnow.ws.base.NamedIDHierarchy param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDispositionTracker = true;
                                       } else {
                                          localDispositionTracker = true;
                                              
                                       }
                                   
                                            this.localDisposition=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rightnow.ws.objects.FileAttachmentIncidentList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.FileAttachmentIncidentList
                           */
                           public  com.rightnow.ws.objects.FileAttachmentIncidentList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rightnow.ws.objects.FileAttachmentIncidentList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFileAttachmentsTracker = true;
                                       } else {
                                          localFileAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for InitialResponseDueTime
                        */

                        
                                    protected java.util.Calendar localInitialResponseDueTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitialResponseDueTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInitialResponseDueTime(){
                               return localInitialResponseDueTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitialResponseDueTime
                               */
                               public void setInitialResponseDueTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInitialResponseDueTimeTracker = true;
                                       } else {
                                          localInitialResponseDueTimeTracker = true;
                                              
                                       }
                                   
                                            this.localInitialResponseDueTime=param;
                                    

                               }
                            

                        /**
                        * field for InitialSolutionTime
                        */

                        
                                    protected java.util.Calendar localInitialSolutionTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitialSolutionTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInitialSolutionTime(){
                               return localInitialSolutionTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitialSolutionTime
                               */
                               public void setInitialSolutionTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInitialSolutionTimeTracker = true;
                                       } else {
                                          localInitialSolutionTimeTracker = true;
                                              
                                       }
                                   
                                            this.localInitialSolutionTime=param;
                                    

                               }
                            

                        /**
                        * field for Interface
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localInterface ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInterfaceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getInterface(){
                               return localInterface;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Interface
                               */
                               public void setInterface(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInterfaceTracker = true;
                                       } else {
                                          localInterfaceTracker = false;
                                              
                                       }
                                   
                                            this.localInterface=param;
                                    

                               }
                            

                        /**
                        * field for Language
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localLanguage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getLanguage(){
                               return localLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Language
                               */
                               public void setLanguage(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLanguageTracker = true;
                                       } else {
                                          localLanguageTracker = true;
                                              
                                       }
                                   
                                            this.localLanguage=param;
                                    

                               }
                            

                        /**
                        * field for LastResponseTime
                        */

                        
                                    protected java.util.Calendar localLastResponseTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastResponseTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastResponseTime(){
                               return localLastResponseTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastResponseTime
                               */
                               public void setLastResponseTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLastResponseTimeTracker = true;
                                       } else {
                                          localLastResponseTimeTracker = true;
                                              
                                       }
                                   
                                            this.localLastResponseTime=param;
                                    

                               }
                            

                        /**
                        * field for Mailbox
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localMailbox ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMailboxTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getMailbox(){
                               return localMailbox;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mailbox
                               */
                               public void setMailbox(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMailboxTracker = true;
                                       } else {
                                          localMailboxTracker = true;
                                              
                                       }
                                   
                                            this.localMailbox=param;
                                    

                               }
                            

                        /**
                        * field for Mailing
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localMailing ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMailingTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getMailing(){
                               return localMailing;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mailing
                               */
                               public void setMailing(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMailingTracker = true;
                                       } else {
                                          localMailingTracker = true;
                                              
                                       }
                                   
                                            this.localMailing=param;
                                    

                               }
                            

                        /**
                        * field for Organization
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localOrganization ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrganizationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getOrganization(){
                               return localOrganization;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Organization
                               */
                               public void setOrganization(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOrganizationTracker = true;
                                       } else {
                                          localOrganizationTracker = true;
                                              
                                       }
                                   
                                            this.localOrganization=param;
                                    

                               }
                            

                        /**
                        * field for OtherContacts
                        */

                        
                                    protected com.rightnow.ws.objects.IncidentContactList localOtherContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOtherContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.IncidentContactList
                           */
                           public  com.rightnow.ws.objects.IncidentContactList getOtherContacts(){
                               return localOtherContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherContacts
                               */
                               public void setOtherContacts(com.rightnow.ws.objects.IncidentContactList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOtherContactsTracker = true;
                                       } else {
                                          localOtherContactsTracker = true;
                                              
                                       }
                                   
                                            this.localOtherContacts=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryContact
                        */

                        
                                    protected com.rightnow.ws.objects.IncidentContact localPrimaryContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryContactTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.IncidentContact
                           */
                           public  com.rightnow.ws.objects.IncidentContact getPrimaryContact(){
                               return localPrimaryContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryContact
                               */
                               public void setPrimaryContact(com.rightnow.ws.objects.IncidentContact param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPrimaryContactTracker = true;
                                       } else {
                                          localPrimaryContactTracker = false;
                                              
                                       }
                                   
                                            this.localPrimaryContact=param;
                                    

                               }
                            

                        /**
                        * field for Product
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localProduct ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getProduct(){
                               return localProduct;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Product
                               */
                               public void setProduct(com.rightnow.ws.base.NamedIDHierarchy param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProductTracker = true;
                                       } else {
                                          localProductTracker = true;
                                              
                                       }
                                   
                                            this.localProduct=param;
                                    

                               }
                            

                        /**
                        * field for Queue
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localQueue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getQueue(){
                               return localQueue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Queue
                               */
                               public void setQueue(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQueueTracker = true;
                                       } else {
                                          localQueueTracker = true;
                                              
                                       }
                                   
                                            this.localQueue=param;
                                    

                               }
                            

                        /**
                        * field for ReferenceNumber
                        */

                        
                                    protected java.lang.String localReferenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReferenceNumberTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReferenceNumber(){
                               return localReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReferenceNumber
                               */
                               public void setReferenceNumber(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReferenceNumberTracker = true;
                                       } else {
                                          localReferenceNumberTracker = false;
                                              
                                       }
                                   
                                            this.localReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for ResolutionInterval
                        */

                        
                                    protected int localResolutionInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResolutionIntervalTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResolutionInterval(){
                               return localResolutionInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResolutionInterval
                               */
                               public void setResolutionInterval(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localResolutionIntervalTracker = true;
                                              
                                       } else {
                                          localResolutionIntervalTracker = true;
                                       }
                                   
                                            this.localResolutionInterval=param;
                                    

                               }
                            

                        /**
                        * field for ResponseInterval
                        */

                        
                                    protected int localResponseInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseIntervalTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResponseInterval(){
                               return localResponseInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseInterval
                               */
                               public void setResponseInterval(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localResponseIntervalTracker = true;
                                              
                                       } else {
                                          localResponseIntervalTracker = true;
                                       }
                                   
                                            this.localResponseInterval=param;
                                    

                               }
                            

                        /**
                        * field for Severity
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localSeverity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeverityTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getSeverity(){
                               return localSeverity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Severity
                               */
                               public void setSeverity(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSeverityTracker = true;
                                       } else {
                                          localSeverityTracker = true;
                                              
                                       }
                                   
                                            this.localSeverity=param;
                                    

                               }
                            

                        /**
                        * field for SLAInstance
                        */

                        
                                    protected com.rightnow.ws.objects.AssignedSLAInstance localSLAInstance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSLAInstanceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.AssignedSLAInstance
                           */
                           public  com.rightnow.ws.objects.AssignedSLAInstance getSLAInstance(){
                               return localSLAInstance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SLAInstance
                               */
                               public void setSLAInstance(com.rightnow.ws.objects.AssignedSLAInstance param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSLAInstanceTracker = true;
                                       } else {
                                          localSLAInstanceTracker = true;
                                              
                                       }
                                   
                                            this.localSLAInstance=param;
                                    

                               }
                            

                        /**
                        * field for SmartSenseCustomer
                        */

                        
                                    protected int localSmartSenseCustomer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSmartSenseCustomerTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSmartSenseCustomer(){
                               return localSmartSenseCustomer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmartSenseCustomer
                               */
                               public void setSmartSenseCustomer(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localSmartSenseCustomerTracker = true;
                                              
                                       } else {
                                          localSmartSenseCustomerTracker = true;
                                       }
                                   
                                            this.localSmartSenseCustomer=param;
                                    

                               }
                            

                        /**
                        * field for SmartSenseStaff
                        */

                        
                                    protected int localSmartSenseStaff ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSmartSenseStaffTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSmartSenseStaff(){
                               return localSmartSenseStaff;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmartSenseStaff
                               */
                               public void setSmartSenseStaff(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localSmartSenseStaffTracker = true;
                                              
                                       } else {
                                          localSmartSenseStaffTracker = true;
                                       }
                                   
                                            this.localSmartSenseStaff=param;
                                    

                               }
                            

                        /**
                        * field for Source
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(com.rightnow.ws.base.NamedIDHierarchy param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSourceTracker = true;
                                       } else {
                                          localSourceTracker = false;
                                              
                                       }
                                   
                                            this.localSource=param;
                                    

                               }
                            

                        /**
                        * field for StatusWithType
                        */

                        
                                    protected com.rightnow.ws.objects.StatusWithType localStatusWithType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusWithTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.StatusWithType
                           */
                           public  com.rightnow.ws.objects.StatusWithType getStatusWithType(){
                               return localStatusWithType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusWithType
                               */
                               public void setStatusWithType(com.rightnow.ws.objects.StatusWithType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStatusWithTypeTracker = true;
                                       } else {
                                          localStatusWithTypeTracker = false;
                                              
                                       }
                                   
                                            this.localStatusWithType=param;
                                    

                               }
                            

                        /**
                        * field for Subject
                        */

                        
                                    protected java.lang.String localSubject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubjectTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubject(){
                               return localSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subject
                               */
                               public void setSubject(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSubjectTracker = true;
                                       } else {
                                          localSubjectTracker = true;
                                              
                                       }
                                   
                                            this.localSubject=param;
                                    

                               }
                            

                        /**
                        * field for Threads
                        */

                        
                                    protected com.rightnow.ws.objects.ThreadList localThreads ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localThreadsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ThreadList
                           */
                           public  com.rightnow.ws.objects.ThreadList getThreads(){
                               return localThreads;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Threads
                               */
                               public void setThreads(com.rightnow.ws.objects.ThreadList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localThreadsTracker = true;
                                       } else {
                                          localThreadsTracker = false;
                                              
                                       }
                                   
                                            this.localThreads=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rightnow.ws.nullfields.IncidentNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.nullfields.IncidentNullFields
                           */
                           public  com.rightnow.ws.nullfields.IncidentNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rightnow.ws.nullfields.IncidentNullFields param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localValidNullFieldsTracker = true;
                                       } else {
                                          localValidNullFieldsTracker = true;
                                              
                                       }
                                   
                                            this.localValidNullFields=param;
                                    

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
                       Incident.this.serialize(parentQName,factory,xmlWriter);
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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:objects.ws.rightnow.com/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Incident",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Incident",
                           xmlWriter);
                   }

                if (localIDTracker){
                                            if (localID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                            }
                                           localID.serialize(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2","ID"),
                                               factory,xmlWriter);
                                        } if (localLookupNameTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LookupName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LookupName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LookupName");
                                    }
                                

                                          if (localLookupName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLookupName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreatedTimeTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CreatedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CreatedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CreatedTime");
                                    }
                                

                                          if (localCreatedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdatedTimeTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"UpdatedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UpdatedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UpdatedTime");
                                    }
                                

                                          if (localUpdatedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAssetTracker){
                                    if (localAsset==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Asset", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Asset");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Asset");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAsset.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Asset"),
                                        factory,xmlWriter);
                                    }
                                } if (localAssignedToTracker){
                                            if (localAssignedTo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AssignedTo cannot be null!!");
                                            }
                                           localAssignedTo.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AssignedTo"),
                                               factory,xmlWriter);
                                        } if (localBannerTracker){
                                            if (localBanner==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Banner cannot be null!!");
                                            }
                                           localBanner.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Banner"),
                                               factory,xmlWriter);
                                        } if (localBilledMinutesTracker){
                                    if (localBilledMinutes==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"BilledMinutes", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"BilledMinutes");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("BilledMinutes");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBilledMinutes.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","BilledMinutes"),
                                        factory,xmlWriter);
                                    }
                                } if (localCategoryTracker){
                                    if (localCategory==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Category", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Category");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Category");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCategory.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Category"),
                                        factory,xmlWriter);
                                    }
                                } if (localChannelTracker){
                                    if (localChannel==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Channel", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Channel");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Channel");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChannel.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Channel"),
                                        factory,xmlWriter);
                                    }
                                } if (localChatQueueTracker){
                                    if (localChatQueue==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ChatQueue", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ChatQueue");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ChatQueue");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChatQueue.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ChatQueue"),
                                        factory,xmlWriter);
                                    }
                                } if (localClosedTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ClosedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ClosedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ClosedTime");
                                    }
                                

                                          if (localClosedTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreatedByAccountTracker){
                                    if (localCreatedByAccount==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CreatedByAccount", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CreatedByAccount");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CreatedByAccount");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCreatedByAccount.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CreatedByAccount"),
                                        factory,xmlWriter);
                                    }
                                } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localDispositionTracker){
                                    if (localDisposition==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Disposition", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Disposition");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Disposition");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDisposition.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Disposition"),
                                        factory,xmlWriter);
                                    }
                                } if (localFileAttachmentsTracker){
                                    if (localFileAttachments==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"FileAttachments", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"FileAttachments");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("FileAttachments");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFileAttachments.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","FileAttachments"),
                                        factory,xmlWriter);
                                    }
                                } if (localInitialResponseDueTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"InitialResponseDueTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"InitialResponseDueTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("InitialResponseDueTime");
                                    }
                                

                                          if (localInitialResponseDueTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialResponseDueTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInitialSolutionTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"InitialSolutionTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"InitialSolutionTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("InitialSolutionTime");
                                    }
                                

                                          if (localInitialSolutionTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialSolutionTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInterfaceTracker){
                                            if (localInterface==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Interface cannot be null!!");
                                            }
                                           localInterface.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Interface"),
                                               factory,xmlWriter);
                                        } if (localLanguageTracker){
                                    if (localLanguage==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Language", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Language");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Language");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLanguage.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Language"),
                                        factory,xmlWriter);
                                    }
                                } if (localLastResponseTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LastResponseTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LastResponseTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LastResponseTime");
                                    }
                                

                                          if (localLastResponseTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastResponseTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMailboxTracker){
                                    if (localMailbox==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Mailbox", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Mailbox");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Mailbox");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMailbox.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Mailbox"),
                                        factory,xmlWriter);
                                    }
                                } if (localMailingTracker){
                                    if (localMailing==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Mailing", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Mailing");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Mailing");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMailing.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Mailing"),
                                        factory,xmlWriter);
                                    }
                                } if (localOrganizationTracker){
                                    if (localOrganization==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Organization", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Organization");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Organization");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOrganization.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Organization"),
                                        factory,xmlWriter);
                                    }
                                } if (localOtherContactsTracker){
                                    if (localOtherContacts==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"OtherContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"OtherContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("OtherContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOtherContacts.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","OtherContacts"),
                                        factory,xmlWriter);
                                    }
                                } if (localPrimaryContactTracker){
                                            if (localPrimaryContact==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PrimaryContact cannot be null!!");
                                            }
                                           localPrimaryContact.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PrimaryContact"),
                                               factory,xmlWriter);
                                        } if (localProductTracker){
                                    if (localProduct==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Product", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Product");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Product");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProduct.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Product"),
                                        factory,xmlWriter);
                                    }
                                } if (localQueueTracker){
                                    if (localQueue==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Queue", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Queue");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Queue");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localQueue.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Queue"),
                                        factory,xmlWriter);
                                    }
                                } if (localReferenceNumberTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReferenceNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReferenceNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReferenceNumber");
                                    }
                                

                                          if (localReferenceNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReferenceNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReferenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResolutionIntervalTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ResolutionInterval", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ResolutionInterval");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ResolutionInterval");
                                    }
                                
                                               if (localResolutionInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResolutionInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResponseIntervalTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ResponseInterval", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ResponseInterval");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ResponseInterval");
                                    }
                                
                                               if (localResponseInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeverityTracker){
                                    if (localSeverity==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Severity", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Severity");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Severity");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSeverity.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Severity"),
                                        factory,xmlWriter);
                                    }
                                } if (localSLAInstanceTracker){
                                    if (localSLAInstance==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SLAInstance", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SLAInstance");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SLAInstance");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSLAInstance.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SLAInstance"),
                                        factory,xmlWriter);
                                    }
                                } if (localSmartSenseCustomerTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SmartSenseCustomer", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SmartSenseCustomer");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SmartSenseCustomer");
                                    }
                                
                                               if (localSmartSenseCustomer==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseCustomer));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSmartSenseStaffTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SmartSenseStaff", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SmartSenseStaff");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SmartSenseStaff");
                                    }
                                
                                               if (localSmartSenseStaff==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseStaff));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSourceTracker){
                                            if (localSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                            }
                                           localSource.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Source"),
                                               factory,xmlWriter);
                                        } if (localStatusWithTypeTracker){
                                            if (localStatusWithType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                            }
                                           localStatusWithType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","StatusWithType"),
                                               factory,xmlWriter);
                                        } if (localSubjectTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Subject", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Subject");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Subject");
                                    }
                                

                                          if (localSubject==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubject);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localThreadsTracker){
                                            if (localThreads==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Threads cannot be null!!");
                                            }
                                           localThreads.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Threads"),
                                               factory,xmlWriter);
                                        } if (localValidNullFieldsTracker){
                                    if (localValidNullFields==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ValidNullFields", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ValidNullFields");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ValidNullFields");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localValidNullFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ValidNullFields"),
                                        factory,xmlWriter);
                                    }
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Incident"));
                 if (localIDTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2",
                                                                      "ID"));
                            
                            
                                    if (localID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                    }
                                    elementList.add(localID);
                                } if (localLookupNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2",
                                                                      "LookupName"));
                                 
                                        if (localLookupName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLookupName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
                                        }
                                    } if (localCreatedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2",
                                                                      "CreatedTime"));
                                 
                                        if (localCreatedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
                                        }
                                    } if (localUpdatedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2",
                                                                      "UpdatedTime"));
                                 
                                        if (localUpdatedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
                                        }
                                    } if (localAssetTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Asset"));
                            
                            
                                    elementList.add(localAsset==null?null:
                                    localAsset);
                                } if (localAssignedToTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "AssignedTo"));
                            
                            
                                    if (localAssignedTo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AssignedTo cannot be null!!");
                                    }
                                    elementList.add(localAssignedTo);
                                } if (localBannerTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Banner"));
                            
                            
                                    if (localBanner==null){
                                         throw new org.apache.axis2.databinding.ADBException("Banner cannot be null!!");
                                    }
                                    elementList.add(localBanner);
                                } if (localBilledMinutesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "BilledMinutes"));
                            
                            
                                    elementList.add(localBilledMinutes==null?null:
                                    localBilledMinutes);
                                } if (localCategoryTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Category"));
                            
                            
                                    elementList.add(localCategory==null?null:
                                    localCategory);
                                } if (localChannelTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Channel"));
                            
                            
                                    elementList.add(localChannel==null?null:
                                    localChannel);
                                } if (localChatQueueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ChatQueue"));
                            
                            
                                    elementList.add(localChatQueue==null?null:
                                    localChatQueue);
                                } if (localClosedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ClosedTime"));
                                 
                                         elementList.add(localClosedTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedTime));
                                    } if (localCreatedByAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CreatedByAccount"));
                            
                            
                                    elementList.add(localCreatedByAccount==null?null:
                                    localCreatedByAccount);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localDispositionTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Disposition"));
                            
                            
                                    elementList.add(localDisposition==null?null:
                                    localDisposition);
                                } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localInitialResponseDueTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "InitialResponseDueTime"));
                                 
                                         elementList.add(localInitialResponseDueTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialResponseDueTime));
                                    } if (localInitialSolutionTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "InitialSolutionTime"));
                                 
                                         elementList.add(localInitialSolutionTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialSolutionTime));
                                    } if (localInterfaceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Interface"));
                            
                            
                                    if (localInterface==null){
                                         throw new org.apache.axis2.databinding.ADBException("Interface cannot be null!!");
                                    }
                                    elementList.add(localInterface);
                                } if (localLanguageTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Language"));
                            
                            
                                    elementList.add(localLanguage==null?null:
                                    localLanguage);
                                } if (localLastResponseTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "LastResponseTime"));
                                 
                                         elementList.add(localLastResponseTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastResponseTime));
                                    } if (localMailboxTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Mailbox"));
                            
                            
                                    elementList.add(localMailbox==null?null:
                                    localMailbox);
                                } if (localMailingTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Mailing"));
                            
                            
                                    elementList.add(localMailing==null?null:
                                    localMailing);
                                } if (localOrganizationTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Organization"));
                            
                            
                                    elementList.add(localOrganization==null?null:
                                    localOrganization);
                                } if (localOtherContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "OtherContacts"));
                            
                            
                                    elementList.add(localOtherContacts==null?null:
                                    localOtherContacts);
                                } if (localPrimaryContactTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PrimaryContact"));
                            
                            
                                    if (localPrimaryContact==null){
                                         throw new org.apache.axis2.databinding.ADBException("PrimaryContact cannot be null!!");
                                    }
                                    elementList.add(localPrimaryContact);
                                } if (localProductTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Product"));
                            
                            
                                    elementList.add(localProduct==null?null:
                                    localProduct);
                                } if (localQueueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Queue"));
                            
                            
                                    elementList.add(localQueue==null?null:
                                    localQueue);
                                } if (localReferenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ReferenceNumber"));
                                 
                                        if (localReferenceNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferenceNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReferenceNumber cannot be null!!");
                                        }
                                    } if (localResolutionIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ResolutionInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResolutionInterval));
                            } if (localResponseIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ResponseInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseInterval));
                            } if (localSeverityTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Severity"));
                            
                            
                                    elementList.add(localSeverity==null?null:
                                    localSeverity);
                                } if (localSLAInstanceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "SLAInstance"));
                            
                            
                                    elementList.add(localSLAInstance==null?null:
                                    localSLAInstance);
                                } if (localSmartSenseCustomerTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "SmartSenseCustomer"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseCustomer));
                            } if (localSmartSenseStaffTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "SmartSenseStaff"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseStaff));
                            } if (localSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Source"));
                            
                            
                                    if (localSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                    }
                                    elementList.add(localSource);
                                } if (localStatusWithTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "StatusWithType"));
                            
                            
                                    if (localStatusWithType==null){
                                         throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                    }
                                    elementList.add(localStatusWithType);
                                } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Subject"));
                                 
                                         elementList.add(localSubject==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                    } if (localThreadsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Threads"));
                            
                            
                                    if (localThreads==null){
                                         throw new org.apache.axis2.databinding.ADBException("Threads cannot be null!!");
                                    }
                                    elementList.add(localThreads);
                                } if (localValidNullFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ValidNullFields"));
                            
                            
                                    elementList.add(localValidNullFields==null?null:
                                    localValidNullFields);
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
        public static Incident parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Incident object =
                new Incident();

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
                    
                            if (!"Incident".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Incident)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2","ID").equals(reader.getName())){
                                
                                                object.setID(com.rightnow.ws.base.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2","LookupName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLookupName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2","CreatedTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2","UpdatedTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdatedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Asset").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAsset(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAsset(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AssignedTo").equals(reader.getName())){
                                
                                                object.setAssignedTo(com.rightnow.ws.objects.GroupAccount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Banner").equals(reader.getName())){
                                
                                                object.setBanner(com.rightnow.ws.objects.Banner.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","BilledMinutes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBilledMinutes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBilledMinutes(com.rightnow.ws.objects.TimeBilledList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Category").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCategory(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCategory(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Channel").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChannel(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChannel(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ChatQueue").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChatQueue(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChatQueue(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ClosedTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClosedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CreatedByAccount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCreatedByAccount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCreatedByAccount(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CustomFields").equals(reader.getName())){
                                
                                                object.setCustomFields(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Disposition").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDisposition(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDisposition(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","FileAttachments").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFileAttachments(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFileAttachments(com.rightnow.ws.objects.FileAttachmentIncidentList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","InitialResponseDueTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitialResponseDueTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","InitialSolutionTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitialSolutionTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Interface").equals(reader.getName())){
                                
                                                object.setInterface(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Language").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLanguage(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLanguage(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","LastResponseTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastResponseTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Mailbox").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMailbox(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMailbox(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Mailing").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMailing(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMailing(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Organization").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOrganization(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOrganization(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","OtherContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOtherContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOtherContacts(com.rightnow.ws.objects.IncidentContactList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PrimaryContact").equals(reader.getName())){
                                
                                                object.setPrimaryContact(com.rightnow.ws.objects.IncidentContact.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Product").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProduct(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProduct(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Queue").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setQueue(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setQueue(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ReferenceNumber").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ResolutionInterval").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResolutionInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setResolutionInterval(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResolutionInterval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ResponseInterval").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponseInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setResponseInterval(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResponseInterval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Severity").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSeverity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSeverity(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SLAInstance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSLAInstance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSLAInstance(com.rightnow.ws.objects.AssignedSLAInstance.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SmartSenseCustomer").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartSenseCustomer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSmartSenseCustomer(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSmartSenseCustomer(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SmartSenseStaff").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartSenseStaff(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSmartSenseStaff(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSmartSenseStaff(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Source").equals(reader.getName())){
                                
                                                object.setSource(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","StatusWithType").equals(reader.getName())){
                                
                                                object.setStatusWithType(com.rightnow.ws.objects.StatusWithType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Subject").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubject(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Threads").equals(reader.getName())){
                                
                                                object.setThreads(com.rightnow.ws.objects.ThreadList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ValidNullFields").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setValidNullFields(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setValidNullFields(com.rightnow.ws.nullfields.IncidentNullFields.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          