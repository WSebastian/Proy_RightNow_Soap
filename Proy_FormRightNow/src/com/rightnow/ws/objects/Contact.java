
/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.objects;
            

            /**
            *  Contact bean class
            */
        
        public  class Contact extends com.rightnow.ws.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Contact
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
                        * field for Address
                        */

                        
                                    protected com.rightnow.ws.objects.Address localAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.Address
                           */
                           public  com.rightnow.ws.objects.Address getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.rightnow.ws.objects.Address param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAddressTracker = true;
                                       } else {
                                          localAddressTracker = true;
                                              
                                       }
                                   
                                            this.localAddress=param;
                                    

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
                                          localBannerTracker = true;
                                              
                                       }
                                   
                                            this.localBanner=param;
                                    

                               }
                            

                        /**
                        * field for ChannelUsernames
                        */

                        
                                    protected com.rightnow.ws.objects.ChannelUsernameList localChannelUsernames ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChannelUsernamesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ChannelUsernameList
                           */
                           public  com.rightnow.ws.objects.ChannelUsernameList getChannelUsernames(){
                               return localChannelUsernames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChannelUsernames
                               */
                               public void setChannelUsernames(com.rightnow.ws.objects.ChannelUsernameList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localChannelUsernamesTracker = true;
                                       } else {
                                          localChannelUsernamesTracker = true;
                                              
                                       }
                                   
                                            this.localChannelUsernames=param;
                                    

                               }
                            

                        /**
                        * field for ContactType
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localContactType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContactTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getContactType(){
                               return localContactType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactType
                               */
                               public void setContactType(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localContactTypeTracker = true;
                                       } else {
                                          localContactTypeTracker = true;
                                              
                                       }
                                   
                                            this.localContactType=param;
                                    

                               }
                            

                        /**
                        * field for CRMModules
                        */

                        
                                    protected com.rightnow.ws.objects.CRMModules localCRMModules ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCRMModulesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.CRMModules
                           */
                           public  com.rightnow.ws.objects.CRMModules getCRMModules(){
                               return localCRMModules;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CRMModules
                               */
                               public void setCRMModules(com.rightnow.ws.objects.CRMModules param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCRMModulesTracker = true;
                                       } else {
                                          localCRMModulesTracker = false;
                                              
                                       }
                                   
                                            this.localCRMModules=param;
                                    

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
                        * field for Disabled
                        */

                        
                                    protected boolean localDisabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisabledTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDisabled(){
                               return localDisabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Disabled
                               */
                               public void setDisabled(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localDisabledTracker = false;
                                              
                                       } else {
                                          localDisabledTracker = true;
                                       }
                                   
                                            this.localDisabled=param;
                                    

                               }
                            

                        /**
                        * field for Emails
                        */

                        
                                    protected com.rightnow.ws.objects.EmailList localEmails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.EmailList
                           */
                           public  com.rightnow.ws.objects.EmailList getEmails(){
                               return localEmails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Emails
                               */
                               public void setEmails(com.rightnow.ws.objects.EmailList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localEmailsTracker = true;
                                       } else {
                                          localEmailsTracker = true;
                                              
                                       }
                                   
                                            this.localEmails=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rightnow.ws.objects.FileAttachmentCommonList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.FileAttachmentCommonList
                           */
                           public  com.rightnow.ws.objects.FileAttachmentCommonList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rightnow.ws.objects.FileAttachmentCommonList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFileAttachmentsTracker = true;
                                       } else {
                                          localFileAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for Login
                        */

                        
                                    protected java.lang.String localLogin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoginTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogin(){
                               return localLogin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Login
                               */
                               public void setLogin(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLoginTracker = true;
                                       } else {
                                          localLoginTracker = true;
                                              
                                       }
                                   
                                            this.localLogin=param;
                                    

                               }
                            

                        /**
                        * field for MarketingSettings
                        */

                        
                                    protected com.rightnow.ws.objects.ContactMarketingSettings localMarketingSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMarketingSettingsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ContactMarketingSettings
                           */
                           public  com.rightnow.ws.objects.ContactMarketingSettings getMarketingSettings(){
                               return localMarketingSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingSettings
                               */
                               public void setMarketingSettings(com.rightnow.ws.objects.ContactMarketingSettings param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMarketingSettingsTracker = true;
                                       } else {
                                          localMarketingSettingsTracker = false;
                                              
                                       }
                                   
                                            this.localMarketingSettings=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected com.rightnow.ws.objects.PersonName localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.PersonName
                           */
                           public  com.rightnow.ws.objects.PersonName getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(com.rightnow.ws.objects.PersonName param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameTracker = true;
                                       } else {
                                          localNameTracker = false;
                                              
                                       }
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for NameFurigana
                        */

                        
                                    protected com.rightnow.ws.objects.PersonName localNameFurigana ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameFuriganaTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.PersonName
                           */
                           public  com.rightnow.ws.objects.PersonName getNameFurigana(){
                               return localNameFurigana;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameFurigana
                               */
                               public void setNameFurigana(com.rightnow.ws.objects.PersonName param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameFuriganaTracker = true;
                                       } else {
                                          localNameFuriganaTracker = false;
                                              
                                       }
                                   
                                            this.localNameFurigana=param;
                                    

                               }
                            

                        /**
                        * field for NewPassword
                        */

                        
                                    protected java.lang.String localNewPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNewPasswordTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNewPassword(){
                               return localNewPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NewPassword
                               */
                               public void setNewPassword(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNewPasswordTracker = true;
                                       } else {
                                          localNewPasswordTracker = true;
                                              
                                       }
                                   
                                            this.localNewPassword=param;
                                    

                               }
                            

                        /**
                        * field for Notes
                        */

                        
                                    protected com.rightnow.ws.objects.NoteList localNotes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNotesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.NoteList
                           */
                           public  com.rightnow.ws.objects.NoteList getNotes(){
                               return localNotes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Notes
                               */
                               public void setNotes(com.rightnow.ws.objects.NoteList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNotesTracker = true;
                                       } else {
                                          localNotesTracker = true;
                                              
                                       }
                                   
                                            this.localNotes=param;
                                    

                               }
                            

                        /**
                        * field for OpenIDAccounts
                        */

                        
                                    protected com.rightnow.ws.objects.ContactOpenIDAccountList localOpenIDAccounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOpenIDAccountsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ContactOpenIDAccountList
                           */
                           public  com.rightnow.ws.objects.ContactOpenIDAccountList getOpenIDAccounts(){
                               return localOpenIDAccounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpenIDAccounts
                               */
                               public void setOpenIDAccounts(com.rightnow.ws.objects.ContactOpenIDAccountList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOpenIDAccountsTracker = true;
                                       } else {
                                          localOpenIDAccountsTracker = false;
                                              
                                       }
                                   
                                            this.localOpenIDAccounts=param;
                                    

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
                        * field for PasswordEmailExpirationTime
                        */

                        
                                    protected java.util.Calendar localPasswordEmailExpirationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordEmailExpirationTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getPasswordEmailExpirationTime(){
                               return localPasswordEmailExpirationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordEmailExpirationTime
                               */
                               public void setPasswordEmailExpirationTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPasswordEmailExpirationTimeTracker = true;
                                       } else {
                                          localPasswordEmailExpirationTimeTracker = true;
                                              
                                       }
                                   
                                            this.localPasswordEmailExpirationTime=param;
                                    

                               }
                            

                        /**
                        * field for PasswordExpirationTime
                        */

                        
                                    protected java.util.Calendar localPasswordExpirationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordExpirationTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getPasswordExpirationTime(){
                               return localPasswordExpirationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordExpirationTime
                               */
                               public void setPasswordExpirationTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPasswordExpirationTimeTracker = true;
                                       } else {
                                          localPasswordExpirationTimeTracker = true;
                                              
                                       }
                                   
                                            this.localPasswordExpirationTime=param;
                                    

                               }
                            

                        /**
                        * field for Phones
                        */

                        
                                    protected com.rightnow.ws.objects.PhoneList localPhones ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhonesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.PhoneList
                           */
                           public  com.rightnow.ws.objects.PhoneList getPhones(){
                               return localPhones;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Phones
                               */
                               public void setPhones(com.rightnow.ws.objects.PhoneList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPhonesTracker = true;
                                       } else {
                                          localPhonesTracker = false;
                                              
                                       }
                                   
                                            this.localPhones=param;
                                    

                               }
                            

                        /**
                        * field for SalesSettings
                        */

                        
                                    protected com.rightnow.ws.objects.ContactSalesSettings localSalesSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSalesSettingsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ContactSalesSettings
                           */
                           public  com.rightnow.ws.objects.ContactSalesSettings getSalesSettings(){
                               return localSalesSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SalesSettings
                               */
                               public void setSalesSettings(com.rightnow.ws.objects.ContactSalesSettings param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSalesSettingsTracker = true;
                                       } else {
                                          localSalesSettingsTracker = false;
                                              
                                       }
                                   
                                            this.localSalesSettings=param;
                                    

                               }
                            

                        /**
                        * field for ServiceSettings
                        */

                        
                                    protected com.rightnow.ws.objects.ContactServiceSettings localServiceSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceSettingsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ContactServiceSettings
                           */
                           public  com.rightnow.ws.objects.ContactServiceSettings getServiceSettings(){
                               return localServiceSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceSettings
                               */
                               public void setServiceSettings(com.rightnow.ws.objects.ContactServiceSettings param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServiceSettingsTracker = true;
                                       } else {
                                          localServiceSettingsTracker = false;
                                              
                                       }
                                   
                                            this.localServiceSettings=param;
                                    

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
                        * field for Title
                        */

                        
                                    protected java.lang.String localTitle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTitleTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTitle(){
                               return localTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Title
                               */
                               public void setTitle(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTitleTracker = true;
                                       } else {
                                          localTitleTracker = true;
                                              
                                       }
                                   
                                            this.localTitle=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rightnow.ws.nullfields.ContactNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.nullfields.ContactNullFields
                           */
                           public  com.rightnow.ws.nullfields.ContactNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rightnow.ws.nullfields.ContactNullFields param){
                            
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
                       Contact.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":Contact",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Contact",
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
                             } if (localAddressTracker){
                                    if (localAddress==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Address", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Address");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Address");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAddress.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Address"),
                                        factory,xmlWriter);
                                    }
                                } if (localBannerTracker){
                                    if (localBanner==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Banner", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Banner");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Banner");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBanner.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Banner"),
                                        factory,xmlWriter);
                                    }
                                } if (localChannelUsernamesTracker){
                                    if (localChannelUsernames==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ChannelUsernames", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ChannelUsernames");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ChannelUsernames");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChannelUsernames.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ChannelUsernames"),
                                        factory,xmlWriter);
                                    }
                                } if (localContactTypeTracker){
                                    if (localContactType==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ContactType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ContactType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ContactType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localContactType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ContactType"),
                                        factory,xmlWriter);
                                    }
                                } if (localCRMModulesTracker){
                                            if (localCRMModules==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CRMModules cannot be null!!");
                                            }
                                           localCRMModules.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CRMModules"),
                                               factory,xmlWriter);
                                        } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localDisabledTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Disabled", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Disabled");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Disabled");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Disabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailsTracker){
                                    if (localEmails==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Emails", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Emails");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Emails");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEmails.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Emails"),
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
                                } if (localLoginTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Login", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Login");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Login");
                                    }
                                

                                          if (localLogin==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMarketingSettingsTracker){
                                            if (localMarketingSettings==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MarketingSettings cannot be null!!");
                                            }
                                           localMarketingSettings.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","MarketingSettings"),
                                               factory,xmlWriter);
                                        } if (localNameTracker){
                                            if (localName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                            }
                                           localName.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Name"),
                                               factory,xmlWriter);
                                        } if (localNameFuriganaTracker){
                                            if (localNameFurigana==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameFurigana cannot be null!!");
                                            }
                                           localNameFurigana.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","NameFurigana"),
                                               factory,xmlWriter);
                                        } if (localNewPasswordTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"NewPassword", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"NewPassword");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("NewPassword");
                                    }
                                

                                          if (localNewPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNewPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNotesTracker){
                                    if (localNotes==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Notes", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Notes");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Notes");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotes.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Notes"),
                                        factory,xmlWriter);
                                    }
                                } if (localOpenIDAccountsTracker){
                                            if (localOpenIDAccounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OpenIDAccounts cannot be null!!");
                                            }
                                           localOpenIDAccounts.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","OpenIDAccounts"),
                                               factory,xmlWriter);
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
                                } if (localPasswordEmailExpirationTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordEmailExpirationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordEmailExpirationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordEmailExpirationTime");
                                    }
                                

                                          if (localPasswordEmailExpirationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordEmailExpirationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordExpirationTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordExpirationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordExpirationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordExpirationTime");
                                    }
                                

                                          if (localPasswordExpirationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordExpirationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPhonesTracker){
                                            if (localPhones==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Phones cannot be null!!");
                                            }
                                           localPhones.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Phones"),
                                               factory,xmlWriter);
                                        } if (localSalesSettingsTracker){
                                            if (localSalesSettings==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SalesSettings cannot be null!!");
                                            }
                                           localSalesSettings.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SalesSettings"),
                                               factory,xmlWriter);
                                        } if (localServiceSettingsTracker){
                                            if (localServiceSettings==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServiceSettings cannot be null!!");
                                            }
                                           localServiceSettings.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ServiceSettings"),
                                               factory,xmlWriter);
                                        } if (localSourceTracker){
                                            if (localSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                            }
                                           localSource.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Source"),
                                               factory,xmlWriter);
                                        } if (localTitleTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Title", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Title");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Title");
                                    }
                                

                                          if (localTitle==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Contact"));
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
                                    } if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Address"));
                            
                            
                                    elementList.add(localAddress==null?null:
                                    localAddress);
                                } if (localBannerTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Banner"));
                            
                            
                                    elementList.add(localBanner==null?null:
                                    localBanner);
                                } if (localChannelUsernamesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ChannelUsernames"));
                            
                            
                                    elementList.add(localChannelUsernames==null?null:
                                    localChannelUsernames);
                                } if (localContactTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ContactType"));
                            
                            
                                    elementList.add(localContactType==null?null:
                                    localContactType);
                                } if (localCRMModulesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CRMModules"));
                            
                            
                                    if (localCRMModules==null){
                                         throw new org.apache.axis2.databinding.ADBException("CRMModules cannot be null!!");
                                    }
                                    elementList.add(localCRMModules);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localDisabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Disabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisabled));
                            } if (localEmailsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Emails"));
                            
                            
                                    elementList.add(localEmails==null?null:
                                    localEmails);
                                } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localLoginTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Login"));
                                 
                                         elementList.add(localLogin==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogin));
                                    } if (localMarketingSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "MarketingSettings"));
                            
                            
                                    if (localMarketingSettings==null){
                                         throw new org.apache.axis2.databinding.ADBException("MarketingSettings cannot be null!!");
                                    }
                                    elementList.add(localMarketingSettings);
                                } if (localNameTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Name"));
                            
                            
                                    if (localName==null){
                                         throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                    }
                                    elementList.add(localName);
                                } if (localNameFuriganaTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "NameFurigana"));
                            
                            
                                    if (localNameFurigana==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameFurigana cannot be null!!");
                                    }
                                    elementList.add(localNameFurigana);
                                } if (localNewPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "NewPassword"));
                                 
                                         elementList.add(localNewPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewPassword));
                                    } if (localNotesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Notes"));
                            
                            
                                    elementList.add(localNotes==null?null:
                                    localNotes);
                                } if (localOpenIDAccountsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "OpenIDAccounts"));
                            
                            
                                    if (localOpenIDAccounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("OpenIDAccounts cannot be null!!");
                                    }
                                    elementList.add(localOpenIDAccounts);
                                } if (localOrganizationTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Organization"));
                            
                            
                                    elementList.add(localOrganization==null?null:
                                    localOrganization);
                                } if (localPasswordEmailExpirationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PasswordEmailExpirationTime"));
                                 
                                         elementList.add(localPasswordEmailExpirationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordEmailExpirationTime));
                                    } if (localPasswordExpirationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PasswordExpirationTime"));
                                 
                                         elementList.add(localPasswordExpirationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordExpirationTime));
                                    } if (localPhonesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Phones"));
                            
                            
                                    if (localPhones==null){
                                         throw new org.apache.axis2.databinding.ADBException("Phones cannot be null!!");
                                    }
                                    elementList.add(localPhones);
                                } if (localSalesSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "SalesSettings"));
                            
                            
                                    if (localSalesSettings==null){
                                         throw new org.apache.axis2.databinding.ADBException("SalesSettings cannot be null!!");
                                    }
                                    elementList.add(localSalesSettings);
                                } if (localServiceSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ServiceSettings"));
                            
                            
                                    if (localServiceSettings==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServiceSettings cannot be null!!");
                                    }
                                    elementList.add(localServiceSettings);
                                } if (localSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Source"));
                            
                            
                                    if (localSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                    }
                                    elementList.add(localSource);
                                } if (localTitleTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Title"));
                                 
                                         elementList.add(localTitle==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitle));
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
        public static Contact parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Contact object =
                new Contact();

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
                    
                            if (!"Contact".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Contact)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Address").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAddress(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAddress(com.rightnow.ws.objects.Address.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Banner").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBanner(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBanner(com.rightnow.ws.objects.Banner.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ChannelUsernames").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChannelUsernames(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChannelUsernames(com.rightnow.ws.objects.ChannelUsernameList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ContactType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setContactType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setContactType(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CRMModules").equals(reader.getName())){
                                
                                                object.setCRMModules(com.rightnow.ws.objects.CRMModules.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Disabled").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDisabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Emails").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEmails(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEmails(com.rightnow.ws.objects.EmailList.Factory.parse(reader));
                                              
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
                                    
                                                object.setFileAttachments(com.rightnow.ws.objects.FileAttachmentCommonList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Login").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","MarketingSettings").equals(reader.getName())){
                                
                                                object.setMarketingSettings(com.rightnow.ws.objects.ContactMarketingSettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Name").equals(reader.getName())){
                                
                                                object.setName(com.rightnow.ws.objects.PersonName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","NameFurigana").equals(reader.getName())){
                                
                                                object.setNameFurigana(com.rightnow.ws.objects.PersonName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","NewPassword").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNewPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Notes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotes(com.rightnow.ws.objects.NoteList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","OpenIDAccounts").equals(reader.getName())){
                                
                                                object.setOpenIDAccounts(com.rightnow.ws.objects.ContactOpenIDAccountList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PasswordEmailExpirationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordEmailExpirationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PasswordExpirationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordExpirationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Phones").equals(reader.getName())){
                                
                                                object.setPhones(com.rightnow.ws.objects.PhoneList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SalesSettings").equals(reader.getName())){
                                
                                                object.setSalesSettings(com.rightnow.ws.objects.ContactSalesSettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ServiceSettings").equals(reader.getName())){
                                
                                                object.setServiceSettings(com.rightnow.ws.objects.ContactServiceSettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Source").equals(reader.getName())){
                                
                                                object.setSource(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Title").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
                                    
                                                object.setValidNullFields(com.rightnow.ws.nullfields.ContactNullFields.Factory.parse(reader));
                                              
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
           
          