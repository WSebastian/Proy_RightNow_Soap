
/**
 * Answer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.objects;
            

            /**
            *  Answer bean class
            */
        
        public  class Answer extends com.rightnow.ws.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Answer
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
                        * field for AccessLevels
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDDeltaList localAccessLevels ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccessLevelsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDDeltaList
                           */
                           public  com.rightnow.ws.base.NamedIDDeltaList getAccessLevels(){
                               return localAccessLevels;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccessLevels
                               */
                               public void setAccessLevels(com.rightnow.ws.base.NamedIDDeltaList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAccessLevelsTracker = true;
                                       } else {
                                          localAccessLevelsTracker = true;
                                              
                                       }
                                   
                                            this.localAccessLevels=param;
                                    

                               }
                            

                        /**
                        * field for AdminLastAccessTime
                        */

                        
                                    protected java.util.Calendar localAdminLastAccessTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdminLastAccessTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getAdminLastAccessTime(){
                               return localAdminLastAccessTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminLastAccessTime
                               */
                               public void setAdminLastAccessTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAdminLastAccessTimeTracker = true;
                                       } else {
                                          localAdminLastAccessTimeTracker = true;
                                              
                                       }
                                   
                                            this.localAdminLastAccessTime=param;
                                    

                               }
                            

                        /**
                        * field for AnswerType
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localAnswerType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnswerTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getAnswerType(){
                               return localAnswerType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AnswerType
                               */
                               public void setAnswerType(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAnswerTypeTracker = true;
                                       } else {
                                          localAnswerTypeTracker = false;
                                              
                                       }
                                   
                                            this.localAnswerType=param;
                                    

                               }
                            

                        /**
                        * field for AssignedSibling
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localAssignedSibling ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssignedSiblingTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getAssignedSibling(){
                               return localAssignedSibling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssignedSibling
                               */
                               public void setAssignedSibling(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAssignedSiblingTracker = true;
                                       } else {
                                          localAssignedSiblingTracker = true;
                                              
                                       }
                                   
                                            this.localAssignedSibling=param;
                                    

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
                                          localBannerTracker = true;
                                              
                                       }
                                   
                                            this.localBanner=param;
                                    

                               }
                            

                        /**
                        * field for Categories
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchyList localCategories ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCategoriesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchyList
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchyList getCategories(){
                               return localCategories;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Categories
                               */
                               public void setCategories(com.rightnow.ws.base.NamedIDHierarchyList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCategoriesTracker = true;
                                       } else {
                                          localCategoriesTracker = true;
                                              
                                       }
                                   
                                            this.localCategories=param;
                                    

                               }
                            

                        /**
                        * field for Comment
                        */

                        
                                    protected java.lang.String localComment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getComment(){
                               return localComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comment
                               */
                               public void setComment(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCommentTracker = true;
                                       } else {
                                          localCommentTracker = true;
                                              
                                       }
                                   
                                            this.localComment=param;
                                    

                               }
                            

                        /**
                        * field for CommonAttachments
                        */

                        
                                    protected com.rightnow.ws.objects.FileAttachmentSharedList localCommonAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommonAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.FileAttachmentSharedList
                           */
                           public  com.rightnow.ws.objects.FileAttachmentSharedList getCommonAttachments(){
                               return localCommonAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommonAttachments
                               */
                               public void setCommonAttachments(com.rightnow.ws.objects.FileAttachmentSharedList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCommonAttachmentsTracker = true;
                                       } else {
                                          localCommonAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localCommonAttachments=param;
                                    

                               }
                            

                        /**
                        * field for CommonComment
                        */

                        
                                    protected java.lang.String localCommonComment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommonCommentTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCommonComment(){
                               return localCommonComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommonComment
                               */
                               public void setCommonComment(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCommonCommentTracker = true;
                                       } else {
                                          localCommonCommentTracker = true;
                                              
                                       }
                                   
                                            this.localCommonComment=param;
                                    

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
                        * field for ExpiresDate
                        */

                        
                                    protected java.util.Date localExpiresDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpiresDateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getExpiresDate(){
                               return localExpiresDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpiresDate
                               */
                               public void setExpiresDate(java.util.Date param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExpiresDateTracker = true;
                                       } else {
                                          localExpiresDateTracker = true;
                                              
                                       }
                                   
                                            this.localExpiresDate=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rightnow.ws.objects.FileAttachmentAnswerList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.FileAttachmentAnswerList
                           */
                           public  com.rightnow.ws.objects.FileAttachmentAnswerList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rightnow.ws.objects.FileAttachmentAnswerList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFileAttachmentsTracker = true;
                                       } else {
                                          localFileAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for GuidedAssistance
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localGuidedAssistance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuidedAssistanceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getGuidedAssistance(){
                               return localGuidedAssistance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuidedAssistance
                               */
                               public void setGuidedAssistance(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGuidedAssistanceTracker = true;
                                       } else {
                                          localGuidedAssistanceTracker = true;
                                              
                                       }
                                   
                                            this.localGuidedAssistance=param;
                                    

                               }
                            

                        /**
                        * field for Keywords
                        */

                        
                                    protected java.lang.String localKeywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeywordsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeywords(){
                               return localKeywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Keywords
                               */
                               public void setKeywords(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localKeywordsTracker = true;
                                       } else {
                                          localKeywordsTracker = true;
                                              
                                       }
                                   
                                            this.localKeywords=param;
                                    

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
                                          localLanguageTracker = false;
                                              
                                       }
                                   
                                            this.localLanguage=param;
                                    

                               }
                            

                        /**
                        * field for LastAccessTime
                        */

                        
                                    protected java.util.Calendar localLastAccessTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAccessTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastAccessTime(){
                               return localLastAccessTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAccessTime
                               */
                               public void setLastAccessTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLastAccessTimeTracker = true;
                                       } else {
                                          localLastAccessTimeTracker = true;
                                              
                                       }
                                   
                                            this.localLastAccessTime=param;
                                    

                               }
                            

                        /**
                        * field for LastNotificationTime
                        */

                        
                                    protected java.util.Calendar localLastNotificationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNotificationTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastNotificationTime(){
                               return localLastNotificationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastNotificationTime
                               */
                               public void setLastNotificationTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLastNotificationTimeTracker = true;
                                       } else {
                                          localLastNotificationTimeTracker = true;
                                              
                                       }
                                   
                                            this.localLastNotificationTime=param;
                                    

                               }
                            

                        /**
                        * field for Links
                        */

                        
                                    protected com.rightnow.ws.objects.AnswerLinkList localLinks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLinksTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.AnswerLinkList
                           */
                           public  com.rightnow.ws.objects.AnswerLinkList getLinks(){
                               return localLinks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Links
                               */
                               public void setLinks(com.rightnow.ws.objects.AnswerLinkList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLinksTracker = true;
                                       } else {
                                          localLinksTracker = true;
                                              
                                       }
                                   
                                            this.localLinks=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameTracker = true;
                                       } else {
                                          localNameTracker = false;
                                              
                                       }
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for NextNotificationTime
                        */

                        
                                    protected java.util.Calendar localNextNotificationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextNotificationTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getNextNotificationTime(){
                               return localNextNotificationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextNotificationTime
                               */
                               public void setNextNotificationTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNextNotificationTimeTracker = true;
                                       } else {
                                          localNextNotificationTimeTracker = true;
                                              
                                       }
                                   
                                            this.localNextNotificationTime=param;
                                    

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
                        * field for OriginalReferenceNumber
                        */

                        
                                    protected java.lang.String localOriginalReferenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOriginalReferenceNumberTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOriginalReferenceNumber(){
                               return localOriginalReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginalReferenceNumber
                               */
                               public void setOriginalReferenceNumber(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOriginalReferenceNumberTracker = true;
                                       } else {
                                          localOriginalReferenceNumberTracker = true;
                                              
                                       }
                                   
                                            this.localOriginalReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for PositionInList
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localPositionInList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPositionInListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getPositionInList(){
                               return localPositionInList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PositionInList
                               */
                               public void setPositionInList(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPositionInListTracker = true;
                                       } else {
                                          localPositionInListTracker = false;
                                              
                                       }
                                   
                                            this.localPositionInList=param;
                                    

                               }
                            

                        /**
                        * field for Products
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchyList localProducts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchyList
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchyList getProducts(){
                               return localProducts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Products
                               */
                               public void setProducts(com.rightnow.ws.base.NamedIDHierarchyList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProductsTracker = true;
                                       } else {
                                          localProductsTracker = true;
                                              
                                       }
                                   
                                            this.localProducts=param;
                                    

                               }
                            

                        /**
                        * field for PublishOnDate
                        */

                        
                                    protected java.util.Date localPublishOnDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPublishOnDateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getPublishOnDate(){
                               return localPublishOnDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PublishOnDate
                               */
                               public void setPublishOnDate(java.util.Date param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPublishOnDateTracker = true;
                                       } else {
                                          localPublishOnDateTracker = true;
                                              
                                       }
                                   
                                            this.localPublishOnDate=param;
                                    

                               }
                            

                        /**
                        * field for Question
                        */

                        
                                    protected java.lang.String localQuestion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuestionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuestion(){
                               return localQuestion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Question
                               */
                               public void setQuestion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQuestionTracker = true;
                                       } else {
                                          localQuestionTracker = true;
                                              
                                       }
                                   
                                            this.localQuestion=param;
                                    

                               }
                            

                        /**
                        * field for SiblingAnswers
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDList localSiblingAnswers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSiblingAnswersTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDList
                           */
                           public  com.rightnow.ws.base.NamedIDList getSiblingAnswers(){
                               return localSiblingAnswers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiblingAnswers
                               */
                               public void setSiblingAnswers(com.rightnow.ws.base.NamedIDList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSiblingAnswersTracker = true;
                                       } else {
                                          localSiblingAnswersTracker = true;
                                              
                                       }
                                   
                                            this.localSiblingAnswers=param;
                                    

                               }
                            

                        /**
                        * field for Solution
                        */

                        
                                    protected java.lang.String localSolution ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSolutionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSolution(){
                               return localSolution;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Solution
                               */
                               public void setSolution(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSolutionTracker = true;
                                       } else {
                                          localSolutionTracker = true;
                                              
                                       }
                                   
                                            this.localSolution=param;
                                    

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
                        * field for Summary
                        */

                        
                                    protected java.lang.String localSummary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSummaryTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSummary(){
                               return localSummary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Summary
                               */
                               public void setSummary(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSummaryTracker = true;
                                       } else {
                                          localSummaryTracker = false;
                                              
                                       }
                                   
                                            this.localSummary=param;
                                    

                               }
                            

                        /**
                        * field for UpdatedByAccount
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localUpdatedByAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdatedByAccountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getUpdatedByAccount(){
                               return localUpdatedByAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdatedByAccount
                               */
                               public void setUpdatedByAccount(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUpdatedByAccountTracker = true;
                                       } else {
                                          localUpdatedByAccountTracker = true;
                                              
                                       }
                                   
                                            this.localUpdatedByAccount=param;
                                    

                               }
                            

                        /**
                        * field for URL
                        */

                        
                                    protected java.lang.String localURL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localURLTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getURL(){
                               return localURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param URL
                               */
                               public void setURL(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localURLTracker = true;
                                       } else {
                                          localURLTracker = true;
                                              
                                       }
                                   
                                            this.localURL=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rightnow.ws.nullfields.AnswerNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.nullfields.AnswerNullFields
                           */
                           public  com.rightnow.ws.nullfields.AnswerNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rightnow.ws.nullfields.AnswerNullFields param){
                            
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
                       Answer.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":Answer",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Answer",
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
                             } if (localAccessLevelsTracker){
                                    if (localAccessLevels==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AccessLevels", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AccessLevels");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AccessLevels");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccessLevels.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AccessLevels"),
                                        factory,xmlWriter);
                                    }
                                } if (localAdminLastAccessTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdminLastAccessTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdminLastAccessTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdminLastAccessTime");
                                    }
                                

                                          if (localAdminLastAccessTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminLastAccessTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAnswerTypeTracker){
                                            if (localAnswerType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AnswerType cannot be null!!");
                                            }
                                           localAnswerType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AnswerType"),
                                               factory,xmlWriter);
                                        } if (localAssignedSiblingTracker){
                                    if (localAssignedSibling==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AssignedSibling", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AssignedSibling");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AssignedSibling");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAssignedSibling.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AssignedSibling"),
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
                                } if (localCategoriesTracker){
                                    if (localCategories==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Categories", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Categories");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Categories");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCategories.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Categories"),
                                        factory,xmlWriter);
                                    }
                                } if (localCommentTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Comment", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Comment");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Comment");
                                    }
                                

                                          if (localComment==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCommonAttachmentsTracker){
                                    if (localCommonAttachments==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CommonAttachments", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CommonAttachments");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CommonAttachments");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCommonAttachments.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CommonAttachments"),
                                        factory,xmlWriter);
                                    }
                                } if (localCommonCommentTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CommonComment", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CommonComment");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CommonComment");
                                    }
                                

                                          if (localCommonComment==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCommonComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localExpiresDateTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ExpiresDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ExpiresDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ExpiresDate");
                                    }
                                

                                          if (localExpiresDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiresDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                                } if (localGuidedAssistanceTracker){
                                    if (localGuidedAssistance==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"GuidedAssistance", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"GuidedAssistance");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("GuidedAssistance");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGuidedAssistance.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","GuidedAssistance"),
                                        factory,xmlWriter);
                                    }
                                } if (localKeywordsTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Keywords", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Keywords");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Keywords");
                                    }
                                

                                          if (localKeywords==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKeywords);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLanguageTracker){
                                            if (localLanguage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                            }
                                           localLanguage.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Language"),
                                               factory,xmlWriter);
                                        } if (localLastAccessTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LastAccessTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LastAccessTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LastAccessTime");
                                    }
                                

                                          if (localLastAccessTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastAccessTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastNotificationTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LastNotificationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LastNotificationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LastNotificationTime");
                                    }
                                

                                          if (localLastNotificationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNotificationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLinksTracker){
                                    if (localLinks==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Links", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Links");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Links");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLinks.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Links"),
                                        factory,xmlWriter);
                                    }
                                } if (localNameTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNextNotificationTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"NextNotificationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"NextNotificationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("NextNotificationTime");
                                    }
                                

                                          if (localNextNotificationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextNotificationTime));
                                            
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
                                } if (localOriginalReferenceNumberTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OriginalReferenceNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OriginalReferenceNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OriginalReferenceNumber");
                                    }
                                

                                          if (localOriginalReferenceNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOriginalReferenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPositionInListTracker){
                                            if (localPositionInList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PositionInList cannot be null!!");
                                            }
                                           localPositionInList.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PositionInList"),
                                               factory,xmlWriter);
                                        } if (localProductsTracker){
                                    if (localProducts==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Products", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Products");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Products");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProducts.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Products"),
                                        factory,xmlWriter);
                                    }
                                } if (localPublishOnDateTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PublishOnDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PublishOnDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PublishOnDate");
                                    }
                                

                                          if (localPublishOnDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPublishOnDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuestionTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Question", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Question");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Question");
                                    }
                                

                                          if (localQuestion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQuestion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSiblingAnswersTracker){
                                    if (localSiblingAnswers==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SiblingAnswers", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SiblingAnswers");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SiblingAnswers");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSiblingAnswers.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SiblingAnswers"),
                                        factory,xmlWriter);
                                    }
                                } if (localSolutionTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Solution", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Solution");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Solution");
                                    }
                                

                                          if (localSolution==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSolution);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusWithTypeTracker){
                                            if (localStatusWithType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                            }
                                           localStatusWithType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","StatusWithType"),
                                               factory,xmlWriter);
                                        } if (localSummaryTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Summary", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Summary");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Summary");
                                    }
                                

                                          if (localSummary==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Summary cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSummary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdatedByAccountTracker){
                                    if (localUpdatedByAccount==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"UpdatedByAccount", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"UpdatedByAccount");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("UpdatedByAccount");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUpdatedByAccount.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","UpdatedByAccount"),
                                        factory,xmlWriter);
                                    }
                                } if (localURLTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"URL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"URL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("URL");
                                    }
                                

                                          if (localURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localURL);
                                            
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
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Answer"));
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
                                    } if (localAccessLevelsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "AccessLevels"));
                            
                            
                                    elementList.add(localAccessLevels==null?null:
                                    localAccessLevels);
                                } if (localAdminLastAccessTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "AdminLastAccessTime"));
                                 
                                         elementList.add(localAdminLastAccessTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminLastAccessTime));
                                    } if (localAnswerTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "AnswerType"));
                            
                            
                                    if (localAnswerType==null){
                                         throw new org.apache.axis2.databinding.ADBException("AnswerType cannot be null!!");
                                    }
                                    elementList.add(localAnswerType);
                                } if (localAssignedSiblingTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "AssignedSibling"));
                            
                            
                                    elementList.add(localAssignedSibling==null?null:
                                    localAssignedSibling);
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
                            
                            
                                    elementList.add(localBanner==null?null:
                                    localBanner);
                                } if (localCategoriesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Categories"));
                            
                            
                                    elementList.add(localCategories==null?null:
                                    localCategories);
                                } if (localCommentTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Comment"));
                                 
                                         elementList.add(localComment==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComment));
                                    } if (localCommonAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CommonAttachments"));
                            
                            
                                    elementList.add(localCommonAttachments==null?null:
                                    localCommonAttachments);
                                } if (localCommonCommentTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CommonComment"));
                                 
                                         elementList.add(localCommonComment==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommonComment));
                                    } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localExpiresDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ExpiresDate"));
                                 
                                         elementList.add(localExpiresDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiresDate));
                                    } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localGuidedAssistanceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "GuidedAssistance"));
                            
                            
                                    elementList.add(localGuidedAssistance==null?null:
                                    localGuidedAssistance);
                                } if (localKeywordsTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Keywords"));
                                 
                                         elementList.add(localKeywords==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeywords));
                                    } if (localLanguageTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Language"));
                            
                            
                                    if (localLanguage==null){
                                         throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                    }
                                    elementList.add(localLanguage);
                                } if (localLastAccessTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "LastAccessTime"));
                                 
                                         elementList.add(localLastAccessTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastAccessTime));
                                    } if (localLastNotificationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "LastNotificationTime"));
                                 
                                         elementList.add(localLastNotificationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNotificationTime));
                                    } if (localLinksTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Links"));
                            
                            
                                    elementList.add(localLinks==null?null:
                                    localLinks);
                                } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    } if (localNextNotificationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "NextNotificationTime"));
                                 
                                         elementList.add(localNextNotificationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextNotificationTime));
                                    } if (localNotesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Notes"));
                            
                            
                                    elementList.add(localNotes==null?null:
                                    localNotes);
                                } if (localOriginalReferenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "OriginalReferenceNumber"));
                                 
                                         elementList.add(localOriginalReferenceNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalReferenceNumber));
                                    } if (localPositionInListTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PositionInList"));
                            
                            
                                    if (localPositionInList==null){
                                         throw new org.apache.axis2.databinding.ADBException("PositionInList cannot be null!!");
                                    }
                                    elementList.add(localPositionInList);
                                } if (localProductsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Products"));
                            
                            
                                    elementList.add(localProducts==null?null:
                                    localProducts);
                                } if (localPublishOnDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PublishOnDate"));
                                 
                                         elementList.add(localPublishOnDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPublishOnDate));
                                    } if (localQuestionTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Question"));
                                 
                                         elementList.add(localQuestion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuestion));
                                    } if (localSiblingAnswersTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "SiblingAnswers"));
                            
                            
                                    elementList.add(localSiblingAnswers==null?null:
                                    localSiblingAnswers);
                                } if (localSolutionTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Solution"));
                                 
                                         elementList.add(localSolution==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolution));
                                    } if (localStatusWithTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "StatusWithType"));
                            
                            
                                    if (localStatusWithType==null){
                                         throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                    }
                                    elementList.add(localStatusWithType);
                                } if (localSummaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Summary"));
                                 
                                        if (localSummary != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummary));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Summary cannot be null!!");
                                        }
                                    } if (localUpdatedByAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "UpdatedByAccount"));
                            
                            
                                    elementList.add(localUpdatedByAccount==null?null:
                                    localUpdatedByAccount);
                                } if (localURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "URL"));
                                 
                                         elementList.add(localURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localURL));
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
        public static Answer parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Answer object =
                new Answer();

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
                    
                            if (!"Answer".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Answer)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AccessLevels").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccessLevels(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccessLevels(com.rightnow.ws.base.NamedIDDeltaList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AdminLastAccessTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdminLastAccessTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AnswerType").equals(reader.getName())){
                                
                                                object.setAnswerType(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","AssignedSibling").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAssignedSibling(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAssignedSibling(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Categories").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCategories(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCategories(com.rightnow.ws.base.NamedIDHierarchyList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Comment").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CommonAttachments").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCommonAttachments(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCommonAttachments(com.rightnow.ws.objects.FileAttachmentSharedList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","CommonComment").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCommonComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ExpiresDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpiresDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
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
                                    
                                                object.setFileAttachments(com.rightnow.ws.objects.FileAttachmentAnswerList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","GuidedAssistance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGuidedAssistance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGuidedAssistance(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Keywords").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setKeywords(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Language").equals(reader.getName())){
                                
                                                object.setLanguage(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","LastAccessTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastAccessTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","LastNotificationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastNotificationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Links").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLinks(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLinks(com.rightnow.ws.objects.AnswerLinkList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","NextNotificationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNextNotificationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","OriginalReferenceNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriginalReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PositionInList").equals(reader.getName())){
                                
                                                object.setPositionInList(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Products").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProducts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProducts(com.rightnow.ws.base.NamedIDHierarchyList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PublishOnDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPublishOnDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Question").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuestion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SiblingAnswers").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSiblingAnswers(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSiblingAnswers(com.rightnow.ws.base.NamedIDList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Solution").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSolution(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Summary").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSummary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","UpdatedByAccount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUpdatedByAccount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUpdatedByAccount(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","URL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setURL(
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
                                    
                                                object.setValidNullFields(com.rightnow.ws.nullfields.AnswerNullFields.Factory.parse(reader));
                                              
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
           
          