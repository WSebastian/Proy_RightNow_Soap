
/**
 * DataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.generic;
            

            /**
            *  DataValue bean class
            */
        
        public  class DataValue
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DataValue
                Namespace URI = urn:generic.ws.rightnow.com/v1_2
                Namespace Prefix = ns2
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:generic.ws.rightnow.com/v1_2")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localBase64BinaryValueTracker = false;
                
                   localBooleanValueTracker = false;
                
                   localBooleanValueListTracker = false;
                
                   localDateTimeValueTracker = false;
                
                   localDateTimeValueListTracker = false;
                
                   localDateValueTracker = false;
                
                   localDateValueListTracker = false;
                
                   localDecimalValueTracker = false;
                
                   localDecimalValueListTracker = false;
                
                   localIDValueTracker = false;
                
                   localIDValueListTracker = false;
                
                   localIntegerValueTracker = false;
                
                   localIntegerValueListTracker = false;
                
                   localLongValueTracker = false;
                
                   localLongValueListTracker = false;
                
                   localNamedIDDeltaValueListTracker = false;
                
                   localNamedIDHierarchyValueTracker = false;
                
                   localNamedIDHierarchyValueListTracker = false;
                
                   localNamedIDValueTracker = false;
                
                   localNamedIDValueListTracker = false;
                
                   localObjectValueTracker = false;
                
                   localObjectValueListTracker = false;
                
                   localStringValueTracker = false;
                
                   localStringValueListTracker = false;
                
            }
        

                        /**
                        * field for Base64BinaryValue
                        */

                        
                                    protected javax.activation.DataHandler localBase64BinaryValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBase64BinaryValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getBase64BinaryValue(){
                               return localBase64BinaryValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Base64BinaryValue
                               */
                               public void setBase64BinaryValue(javax.activation.DataHandler param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBase64BinaryValueTracker = true;
                                       } else {
                                          localBase64BinaryValueTracker = false;
                                              
                                       }
                                   
                                            this.localBase64BinaryValue=param;
                                    

                               }
                            

                        /**
                        * field for BooleanValue
                        */

                        
                                    protected boolean localBooleanValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBooleanValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getBooleanValue(){
                               return localBooleanValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BooleanValue
                               */
                               public void setBooleanValue(boolean param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localBooleanValueTracker = false;
                                              
                                       } else {
                                          localBooleanValueTracker = true;
                                       }
                                   
                                            this.localBooleanValue=param;
                                    

                               }
                            

                        /**
                        * field for BooleanValueList
                        * This was an Array!
                        */

                        
                                    protected boolean[] localBooleanValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBooleanValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean[]
                           */
                           public  boolean[] getBooleanValueList(){
                               return localBooleanValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for BooleanValueList
                               */
                              protected void validateBooleanValueList(boolean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BooleanValueList
                              */
                              public void setBooleanValueList(boolean[] param){
                              
                                   validateBooleanValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localBooleanValueListTracker = true;
                                          } else {
                                             localBooleanValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localBooleanValueList=param;
                              }

                               
                             

                        /**
                        * field for DateTimeValue
                        */

                        
                                    protected java.util.Calendar localDateTimeValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateTimeValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getDateTimeValue(){
                               return localDateTimeValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateTimeValue
                               */
                               public void setDateTimeValue(java.util.Calendar param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDateTimeValueTracker = true;
                                       } else {
                                          localDateTimeValueTracker = false;
                                              
                                       }
                                   
                                            this.localDateTimeValue=param;
                                    

                               }
                            

                        /**
                        * field for DateTimeValueList
                        * This was an Array!
                        */

                        
                                    protected java.util.Calendar[] localDateTimeValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateTimeValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar[]
                           */
                           public  java.util.Calendar[] getDateTimeValueList(){
                               return localDateTimeValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for DateTimeValueList
                               */
                              protected void validateDateTimeValueList(java.util.Calendar[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DateTimeValueList
                              */
                              public void setDateTimeValueList(java.util.Calendar[] param){
                              
                                   validateDateTimeValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localDateTimeValueListTracker = true;
                                          } else {
                                             localDateTimeValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localDateTimeValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.util.Calendar
                             */
                             public void addDateTimeValueList(java.util.Calendar param){
                                   if (localDateTimeValueList == null){
                                   localDateTimeValueList = new java.util.Calendar[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localDateTimeValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDateTimeValueList);
                               list.add(param);
                               this.localDateTimeValueList =
                             (java.util.Calendar[])list.toArray(
                            new java.util.Calendar[list.size()]);

                             }
                             

                        /**
                        * field for DateValue
                        */

                        
                                    protected java.util.Date localDateValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDateValue(){
                               return localDateValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateValue
                               */
                               public void setDateValue(java.util.Date param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDateValueTracker = true;
                                       } else {
                                          localDateValueTracker = false;
                                              
                                       }
                                   
                                            this.localDateValue=param;
                                    

                               }
                            

                        /**
                        * field for DateValueList
                        * This was an Array!
                        */

                        
                                    protected java.util.Date[] localDateValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date[]
                           */
                           public  java.util.Date[] getDateValueList(){
                               return localDateValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for DateValueList
                               */
                              protected void validateDateValueList(java.util.Date[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DateValueList
                              */
                              public void setDateValueList(java.util.Date[] param){
                              
                                   validateDateValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localDateValueListTracker = true;
                                          } else {
                                             localDateValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localDateValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.util.Date
                             */
                             public void addDateValueList(java.util.Date param){
                                   if (localDateValueList == null){
                                   localDateValueList = new java.util.Date[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localDateValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDateValueList);
                               list.add(param);
                               this.localDateValueList =
                             (java.util.Date[])list.toArray(
                            new java.util.Date[list.size()]);

                             }
                             

                        /**
                        * field for DecimalValue
                        */

                        
                                    protected double localDecimalValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDecimalValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getDecimalValue(){
                               return localDecimalValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DecimalValue
                               */
                               public void setDecimalValue(double param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localDecimalValueTracker = false;
                                              
                                       } else {
                                          localDecimalValueTracker = true;
                                       }
                                   
                                            this.localDecimalValue=param;
                                    

                               }
                            

                        /**
                        * field for DecimalValueList
                        * This was an Array!
                        */

                        
                                    protected double[] localDecimalValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDecimalValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double[]
                           */
                           public  double[] getDecimalValueList(){
                               return localDecimalValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for DecimalValueList
                               */
                              protected void validateDecimalValueList(double[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DecimalValueList
                              */
                              public void setDecimalValueList(double[] param){
                              
                                   validateDecimalValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localDecimalValueListTracker = true;
                                          } else {
                                             localDecimalValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localDecimalValueList=param;
                              }

                               
                             

                        /**
                        * field for IDValue
                        */

                        
                                    protected com.rightnow.ws.base.ID localIDValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIDValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.ID
                           */
                           public  com.rightnow.ws.base.ID getIDValue(){
                               return localIDValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IDValue
                               */
                               public void setIDValue(com.rightnow.ws.base.ID param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localIDValueTracker = true;
                                       } else {
                                          localIDValueTracker = false;
                                              
                                       }
                                   
                                            this.localIDValue=param;
                                    

                               }
                            

                        /**
                        * field for IDValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.ID[] localIDValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIDValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.ID[]
                           */
                           public  com.rightnow.ws.base.ID[] getIDValueList(){
                               return localIDValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for IDValueList
                               */
                              protected void validateIDValueList(com.rightnow.ws.base.ID[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IDValueList
                              */
                              public void setIDValueList(com.rightnow.ws.base.ID[] param){
                              
                                   validateIDValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localIDValueListTracker = true;
                                          } else {
                                             localIDValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localIDValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.ID
                             */
                             public void addIDValueList(com.rightnow.ws.base.ID param){
                                   if (localIDValueList == null){
                                   localIDValueList = new com.rightnow.ws.base.ID[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localIDValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIDValueList);
                               list.add(param);
                               this.localIDValueList =
                             (com.rightnow.ws.base.ID[])list.toArray(
                            new com.rightnow.ws.base.ID[list.size()]);

                             }
                             

                        /**
                        * field for IntegerValue
                        */

                        
                                    protected int localIntegerValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntegerValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getIntegerValue(){
                               return localIntegerValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntegerValue
                               */
                               public void setIntegerValue(int param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localIntegerValueTracker = false;
                                              
                                       } else {
                                          localIntegerValueTracker = true;
                                       }
                                   
                                            this.localIntegerValue=param;
                                    

                               }
                            

                        /**
                        * field for IntegerValueList
                        * This was an Array!
                        */

                        
                                    protected int[] localIntegerValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntegerValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int[]
                           */
                           public  int[] getIntegerValueList(){
                               return localIntegerValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for IntegerValueList
                               */
                              protected void validateIntegerValueList(int[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IntegerValueList
                              */
                              public void setIntegerValueList(int[] param){
                              
                                   validateIntegerValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localIntegerValueListTracker = true;
                                          } else {
                                             localIntegerValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localIntegerValueList=param;
                              }

                               
                             

                        /**
                        * field for LongValue
                        */

                        
                                    protected long localLongValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLongValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getLongValue(){
                               return localLongValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LongValue
                               */
                               public void setLongValue(long param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localLongValueTracker = false;
                                              
                                       } else {
                                          localLongValueTracker = true;
                                       }
                                   
                                            this.localLongValue=param;
                                    

                               }
                            

                        /**
                        * field for LongValueList
                        * This was an Array!
                        */

                        
                                    protected long[] localLongValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLongValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long[]
                           */
                           public  long[] getLongValueList(){
                               return localLongValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for LongValueList
                               */
                              protected void validateLongValueList(long[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LongValueList
                              */
                              public void setLongValueList(long[] param){
                              
                                   validateLongValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localLongValueListTracker = true;
                                          } else {
                                             localLongValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localLongValueList=param;
                              }

                               
                             

                        /**
                        * field for NamedIDDeltaValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDDelta[] localNamedIDDeltaValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDDeltaValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDDelta[]
                           */
                           public  com.rightnow.ws.base.NamedIDDelta[] getNamedIDDeltaValueList(){
                               return localNamedIDDeltaValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NamedIDDeltaValueList
                               */
                              protected void validateNamedIDDeltaValueList(com.rightnow.ws.base.NamedIDDelta[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NamedIDDeltaValueList
                              */
                              public void setNamedIDDeltaValueList(com.rightnow.ws.base.NamedIDDelta[] param){
                              
                                   validateNamedIDDeltaValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localNamedIDDeltaValueListTracker = true;
                                          } else {
                                             localNamedIDDeltaValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localNamedIDDeltaValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.NamedIDDelta
                             */
                             public void addNamedIDDeltaValueList(com.rightnow.ws.base.NamedIDDelta param){
                                   if (localNamedIDDeltaValueList == null){
                                   localNamedIDDeltaValueList = new com.rightnow.ws.base.NamedIDDelta[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localNamedIDDeltaValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNamedIDDeltaValueList);
                               list.add(param);
                               this.localNamedIDDeltaValueList =
                             (com.rightnow.ws.base.NamedIDDelta[])list.toArray(
                            new com.rightnow.ws.base.NamedIDDelta[list.size()]);

                             }
                             

                        /**
                        * field for NamedIDHierarchyValue
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localNamedIDHierarchyValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDHierarchyValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getNamedIDHierarchyValue(){
                               return localNamedIDHierarchyValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NamedIDHierarchyValue
                               */
                               public void setNamedIDHierarchyValue(com.rightnow.ws.base.NamedIDHierarchy param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNamedIDHierarchyValueTracker = true;
                                       } else {
                                          localNamedIDHierarchyValueTracker = false;
                                              
                                       }
                                   
                                            this.localNamedIDHierarchyValue=param;
                                    

                               }
                            

                        /**
                        * field for NamedIDHierarchyValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy[] localNamedIDHierarchyValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDHierarchyValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy[]
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy[] getNamedIDHierarchyValueList(){
                               return localNamedIDHierarchyValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NamedIDHierarchyValueList
                               */
                              protected void validateNamedIDHierarchyValueList(com.rightnow.ws.base.NamedIDHierarchy[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NamedIDHierarchyValueList
                              */
                              public void setNamedIDHierarchyValueList(com.rightnow.ws.base.NamedIDHierarchy[] param){
                              
                                   validateNamedIDHierarchyValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localNamedIDHierarchyValueListTracker = true;
                                          } else {
                                             localNamedIDHierarchyValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localNamedIDHierarchyValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.NamedIDHierarchy
                             */
                             public void addNamedIDHierarchyValueList(com.rightnow.ws.base.NamedIDHierarchy param){
                                   if (localNamedIDHierarchyValueList == null){
                                   localNamedIDHierarchyValueList = new com.rightnow.ws.base.NamedIDHierarchy[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localNamedIDHierarchyValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNamedIDHierarchyValueList);
                               list.add(param);
                               this.localNamedIDHierarchyValueList =
                             (com.rightnow.ws.base.NamedIDHierarchy[])list.toArray(
                            new com.rightnow.ws.base.NamedIDHierarchy[list.size()]);

                             }
                             

                        /**
                        * field for NamedIDValue
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localNamedIDValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getNamedIDValue(){
                               return localNamedIDValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NamedIDValue
                               */
                               public void setNamedIDValue(com.rightnow.ws.base.NamedID param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNamedIDValueTracker = true;
                                       } else {
                                          localNamedIDValueTracker = false;
                                              
                                       }
                                   
                                            this.localNamedIDValue=param;
                                    

                               }
                            

                        /**
                        * field for NamedIDValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.NamedID[] localNamedIDValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID[]
                           */
                           public  com.rightnow.ws.base.NamedID[] getNamedIDValueList(){
                               return localNamedIDValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NamedIDValueList
                               */
                              protected void validateNamedIDValueList(com.rightnow.ws.base.NamedID[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NamedIDValueList
                              */
                              public void setNamedIDValueList(com.rightnow.ws.base.NamedID[] param){
                              
                                   validateNamedIDValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localNamedIDValueListTracker = true;
                                          } else {
                                             localNamedIDValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localNamedIDValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.NamedID
                             */
                             public void addNamedIDValueList(com.rightnow.ws.base.NamedID param){
                                   if (localNamedIDValueList == null){
                                   localNamedIDValueList = new com.rightnow.ws.base.NamedID[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localNamedIDValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNamedIDValueList);
                               list.add(param);
                               this.localNamedIDValueList =
                             (com.rightnow.ws.base.NamedID[])list.toArray(
                            new com.rightnow.ws.base.NamedID[list.size()]);

                             }
                             

                        /**
                        * field for ObjectValue
                        */

                        
                                    protected com.rightnow.ws.generic.GenericObject localObjectValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localObjectValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.GenericObject
                           */
                           public  com.rightnow.ws.generic.GenericObject getObjectValue(){
                               return localObjectValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ObjectValue
                               */
                               public void setObjectValue(com.rightnow.ws.generic.GenericObject param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localObjectValueTracker = true;
                                       } else {
                                          localObjectValueTracker = false;
                                              
                                       }
                                   
                                            this.localObjectValue=param;
                                    

                               }
                            

                        /**
                        * field for ObjectValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.generic.GenericObject[] localObjectValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localObjectValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.GenericObject[]
                           */
                           public  com.rightnow.ws.generic.GenericObject[] getObjectValueList(){
                               return localObjectValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for ObjectValueList
                               */
                              protected void validateObjectValueList(com.rightnow.ws.generic.GenericObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ObjectValueList
                              */
                              public void setObjectValueList(com.rightnow.ws.generic.GenericObject[] param){
                              
                                   validateObjectValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localObjectValueListTracker = true;
                                          } else {
                                             localObjectValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localObjectValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.generic.GenericObject
                             */
                             public void addObjectValueList(com.rightnow.ws.generic.GenericObject param){
                                   if (localObjectValueList == null){
                                   localObjectValueList = new com.rightnow.ws.generic.GenericObject[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localObjectValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localObjectValueList);
                               list.add(param);
                               this.localObjectValueList =
                             (com.rightnow.ws.generic.GenericObject[])list.toArray(
                            new com.rightnow.ws.generic.GenericObject[list.size()]);

                             }
                             

                        /**
                        * field for StringValue
                        */

                        
                                    protected java.lang.String localStringValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStringValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStringValue(){
                               return localStringValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StringValue
                               */
                               public void setStringValue(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStringValueTracker = true;
                                       } else {
                                          localStringValueTracker = false;
                                              
                                       }
                                   
                                            this.localStringValue=param;
                                    

                               }
                            

                        /**
                        * field for StringValueList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localStringValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStringValueListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getStringValueList(){
                               return localStringValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for StringValueList
                               */
                              protected void validateStringValueList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param StringValueList
                              */
                              public void setStringValueList(java.lang.String[] param){
                              
                                   validateStringValueList(param);

                               
                                   clearAllSettingTrackers();
                               
                                          if (param != null){
                                             //update the setting tracker
                                             localStringValueListTracker = true;
                                          } else {
                                             localStringValueListTracker = false;
                                                 
                                          }
                                      
                                      this.localStringValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addStringValueList(java.lang.String param){
                                   if (localStringValueList == null){
                                   localStringValueList = new java.lang.String[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localStringValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localStringValueList);
                               list.add(param);
                               this.localStringValueList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

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
                       DataValue.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:generic.ws.rightnow.com/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DataValue",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DataValue",
                           xmlWriter);
                   }

               
                   }
                if (localBase64BinaryValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Base64BinaryValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Base64BinaryValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Base64BinaryValue");
                                    }
                                
                                        
                                    if (localBase64BinaryValue!=null)
                                    {
                                       xmlWriter.writeDataHandler(localBase64BinaryValue);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localBooleanValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"BooleanValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"BooleanValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("BooleanValue");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("BooleanValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBooleanValueListTracker){
                             if (localBooleanValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localBooleanValueList.length;i++){
                                        
                                                   if (true) {
                                               
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"BooleanValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"BooleanValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("BooleanValueList");
                                                }

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("BooleanValueList cannot be null!!");
                                    
                             }

                        } if (localDateTimeValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DateTimeValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DateTimeValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DateTimeValue");
                                    }
                                

                                          if (localDateTimeValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DateTimeValue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValue));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDateTimeValueListTracker){
                             if (localDateTimeValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localDateTimeValueList.length;i++){
                                        
                                            if (localDateTimeValueList[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"DateTimeValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"DateTimeValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("DateTimeValueList");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValueList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("DateTimeValueList cannot be null!!");
                                    
                             }

                        } if (localDateValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DateValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DateValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DateValue");
                                    }
                                

                                          if (localDateValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DateValue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValue));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDateValueListTracker){
                             if (localDateValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localDateValueList.length;i++){
                                        
                                            if (localDateValueList[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"DateValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"DateValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("DateValueList");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValueList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("DateValueList cannot be null!!");
                                    
                             }

                        } if (localDecimalValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DecimalValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DecimalValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DecimalValue");
                                    }
                                
                                               if (java.lang.Double.isNaN(localDecimalValue)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("DecimalValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDecimalValueListTracker){
                             if (localDecimalValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localDecimalValueList.length;i++){
                                        
                                                   if (!java.lang.Double.isNaN(localDecimalValueList[i])) {
                                               
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"DecimalValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"DecimalValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("DecimalValueList");
                                                }

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("DecimalValueList cannot be null!!");
                                    
                             }

                        } if (localIDValueTracker){
                                            if (localIDValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IDValue cannot be null!!");
                                            }
                                           localIDValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IDValue"),
                                               factory,xmlWriter);
                                        } if (localIDValueListTracker){
                                       if (localIDValueList!=null){
                                            for (int i = 0;i < localIDValueList.length;i++){
                                                if (localIDValueList[i] != null){
                                                 localIDValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IDValueList"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("IDValueList cannot be null!!");
                                        
                                    }
                                 } if (localIntegerValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"IntegerValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"IntegerValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("IntegerValue");
                                    }
                                
                                               if (localIntegerValue==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IntegerValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIntegerValueListTracker){
                             if (localIntegerValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localIntegerValueList.length;i++){
                                        
                                                   if (localIntegerValueList[i]!=java.lang.Integer.MIN_VALUE) {
                                               
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"IntegerValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"IntegerValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("IntegerValueList");
                                                }

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("IntegerValueList cannot be null!!");
                                    
                             }

                        } if (localLongValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LongValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LongValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LongValue");
                                    }
                                
                                               if (localLongValue==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("LongValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLongValueListTracker){
                             if (localLongValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localLongValueList.length;i++){
                                        
                                                   if (localLongValueList[i]!=java.lang.Long.MIN_VALUE) {
                                               
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"LongValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"LongValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("LongValueList");
                                                }

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("LongValueList cannot be null!!");
                                    
                             }

                        } if (localNamedIDDeltaValueListTracker){
                                       if (localNamedIDDeltaValueList!=null){
                                            for (int i = 0;i < localNamedIDDeltaValueList.length;i++){
                                                if (localNamedIDDeltaValueList[i] != null){
                                                 localNamedIDDeltaValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDDeltaValueList"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("NamedIDDeltaValueList cannot be null!!");
                                        
                                    }
                                 } if (localNamedIDHierarchyValueTracker){
                                            if (localNamedIDHierarchyValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValue cannot be null!!");
                                            }
                                           localNamedIDHierarchyValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDHierarchyValue"),
                                               factory,xmlWriter);
                                        } if (localNamedIDHierarchyValueListTracker){
                                       if (localNamedIDHierarchyValueList!=null){
                                            for (int i = 0;i < localNamedIDHierarchyValueList.length;i++){
                                                if (localNamedIDHierarchyValueList[i] != null){
                                                 localNamedIDHierarchyValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDHierarchyValueList"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValueList cannot be null!!");
                                        
                                    }
                                 } if (localNamedIDValueTracker){
                                            if (localNamedIDValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NamedIDValue cannot be null!!");
                                            }
                                           localNamedIDValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDValue"),
                                               factory,xmlWriter);
                                        } if (localNamedIDValueListTracker){
                                       if (localNamedIDValueList!=null){
                                            for (int i = 0;i < localNamedIDValueList.length;i++){
                                                if (localNamedIDValueList[i] != null){
                                                 localNamedIDValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDValueList"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("NamedIDValueList cannot be null!!");
                                        
                                    }
                                 } if (localObjectValueTracker){
                                            if (localObjectValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ObjectValue cannot be null!!");
                                            }
                                           localObjectValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","ObjectValue"),
                                               factory,xmlWriter);
                                        } if (localObjectValueListTracker){
                                       if (localObjectValueList!=null){
                                            for (int i = 0;i < localObjectValueList.length;i++){
                                                if (localObjectValueList[i] != null){
                                                 localObjectValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","ObjectValueList"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("ObjectValueList cannot be null!!");
                                        
                                    }
                                 } if (localStringValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"StringValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"StringValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("StringValue");
                                    }
                                

                                          if (localStringValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("StringValue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStringValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStringValueListTracker){
                             if (localStringValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localStringValueList.length;i++){
                                        
                                            if (localStringValueList[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"StringValueList", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"StringValueList");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("StringValueList");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStringValueList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("StringValueList cannot be null!!");
                                    
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

                 if (localBase64BinaryValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                        "Base64BinaryValue"));
                                
                            elementList.add(localBase64BinaryValue);
                        } if (localBooleanValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "BooleanValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValue));
                            } if (localBooleanValueListTracker){
                            if (localBooleanValueList!=null){
                                  for (int i = 0;i < localBooleanValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                                                                       "BooleanValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("BooleanValueList cannot be null!!");
                                
                            }

                        } if (localDateTimeValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "DateTimeValue"));
                                 
                                        if (localDateTimeValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DateTimeValue cannot be null!!");
                                        }
                                    } if (localDateTimeValueListTracker){
                            if (localDateTimeValueList!=null){
                                  for (int i = 0;i < localDateTimeValueList.length;i++){
                                      
                                         if (localDateTimeValueList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                              "DateTimeValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValueList[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("DateTimeValueList cannot be null!!");
                                
                            }

                        } if (localDateValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "DateValue"));
                                 
                                        if (localDateValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DateValue cannot be null!!");
                                        }
                                    } if (localDateValueListTracker){
                            if (localDateValueList!=null){
                                  for (int i = 0;i < localDateValueList.length;i++){
                                      
                                         if (localDateValueList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                              "DateValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValueList[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("DateValueList cannot be null!!");
                                
                            }

                        } if (localDecimalValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "DecimalValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValue));
                            } if (localDecimalValueListTracker){
                            if (localDecimalValueList!=null){
                                  for (int i = 0;i < localDecimalValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                                                                       "DecimalValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("DecimalValueList cannot be null!!");
                                
                            }

                        } if (localIDValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "IDValue"));
                            
                            
                                    if (localIDValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("IDValue cannot be null!!");
                                    }
                                    elementList.add(localIDValue);
                                } if (localIDValueListTracker){
                             if (localIDValueList!=null) {
                                 for (int i = 0;i < localIDValueList.length;i++){

                                    if (localIDValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                          "IDValueList"));
                                         elementList.add(localIDValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("IDValueList cannot be null!!");
                                    
                             }

                        } if (localIntegerValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "IntegerValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValue));
                            } if (localIntegerValueListTracker){
                            if (localIntegerValueList!=null){
                                  for (int i = 0;i < localIntegerValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                                                                       "IntegerValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("IntegerValueList cannot be null!!");
                                
                            }

                        } if (localLongValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "LongValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValue));
                            } if (localLongValueListTracker){
                            if (localLongValueList!=null){
                                  for (int i = 0;i < localLongValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                                                                       "LongValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("LongValueList cannot be null!!");
                                
                            }

                        } if (localNamedIDDeltaValueListTracker){
                             if (localNamedIDDeltaValueList!=null) {
                                 for (int i = 0;i < localNamedIDDeltaValueList.length;i++){

                                    if (localNamedIDDeltaValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                          "NamedIDDeltaValueList"));
                                         elementList.add(localNamedIDDeltaValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("NamedIDDeltaValueList cannot be null!!");
                                    
                             }

                        } if (localNamedIDHierarchyValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "NamedIDHierarchyValue"));
                            
                            
                                    if (localNamedIDHierarchyValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValue cannot be null!!");
                                    }
                                    elementList.add(localNamedIDHierarchyValue);
                                } if (localNamedIDHierarchyValueListTracker){
                             if (localNamedIDHierarchyValueList!=null) {
                                 for (int i = 0;i < localNamedIDHierarchyValueList.length;i++){

                                    if (localNamedIDHierarchyValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                          "NamedIDHierarchyValueList"));
                                         elementList.add(localNamedIDHierarchyValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValueList cannot be null!!");
                                    
                             }

                        } if (localNamedIDValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "NamedIDValue"));
                            
                            
                                    if (localNamedIDValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("NamedIDValue cannot be null!!");
                                    }
                                    elementList.add(localNamedIDValue);
                                } if (localNamedIDValueListTracker){
                             if (localNamedIDValueList!=null) {
                                 for (int i = 0;i < localNamedIDValueList.length;i++){

                                    if (localNamedIDValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                          "NamedIDValueList"));
                                         elementList.add(localNamedIDValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("NamedIDValueList cannot be null!!");
                                    
                             }

                        } if (localObjectValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "ObjectValue"));
                            
                            
                                    if (localObjectValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("ObjectValue cannot be null!!");
                                    }
                                    elementList.add(localObjectValue);
                                } if (localObjectValueListTracker){
                             if (localObjectValueList!=null) {
                                 for (int i = 0;i < localObjectValueList.length;i++){

                                    if (localObjectValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                          "ObjectValueList"));
                                         elementList.add(localObjectValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("ObjectValueList cannot be null!!");
                                    
                             }

                        } if (localStringValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                      "StringValue"));
                                 
                                        if (localStringValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStringValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("StringValue cannot be null!!");
                                        }
                                    } if (localStringValueListTracker){
                            if (localStringValueList!=null){
                                  for (int i = 0;i < localStringValueList.length;i++){
                                      
                                         if (localStringValueList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2",
                                                                              "StringValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStringValueList[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("StringValueList cannot be null!!");
                                
                            }

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
        public static DataValue parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DataValue object =
                new DataValue();

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
                    
                            if (!"DataValue".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DataValue)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                        java.util.ArrayList list13 = new java.util.ArrayList();
                    
                        java.util.ArrayList list15 = new java.util.ArrayList();
                    
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                        java.util.ArrayList list18 = new java.util.ArrayList();
                    
                        java.util.ArrayList list20 = new java.util.ArrayList();
                    
                        java.util.ArrayList list22 = new java.util.ArrayList();
                    
                        java.util.ArrayList list24 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","Base64BinaryValue").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setBase64BinaryValue(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setBase64BinaryValue(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setBase64BinaryValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","BooleanValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBooleanValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","BooleanValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","BooleanValueList").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setBooleanValueList((boolean[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            boolean.class,list3));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DateTimeValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDateTimeValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DateTimeValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DateTimeValueList").equals(reader.getName())){
                                                         list5.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setDateTimeValueList((java.util.Calendar[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            java.util.Calendar.class,list5));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DateValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDateValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DateValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone7 = false;
                                            while(!loopDone7){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone7 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DateValueList").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setDateValueList((java.util.Date[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            java.util.Date.class,list7));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DecimalValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDecimalValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DecimalValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone9 = false;
                                            while(!loopDone9){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone9 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","DecimalValueList").equals(reader.getName())){
                                                         list9.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone9 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setDecimalValueList((double[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            double.class,list9));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IDValue").equals(reader.getName())){
                                
                                                object.setIDValue(com.rightnow.ws.base.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IDValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list11.add(com.rightnow.ws.base.ID.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone11 = false;
                                                        while(!loopDone11){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone11 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IDValueList").equals(reader.getName())){
                                                                    list11.add(com.rightnow.ws.base.ID.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone11 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setIDValueList((com.rightnow.ws.base.ID[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.ID.class,
                                                                list11));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IntegerValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntegerValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IntegerValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list13.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone13 = false;
                                            while(!loopDone13){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone13 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","IntegerValueList").equals(reader.getName())){
                                                         list13.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone13 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setIntegerValueList((int[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            int.class,list13));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","LongValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLongValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","LongValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list15.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone15 = false;
                                            while(!loopDone15){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone15 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","LongValueList").equals(reader.getName())){
                                                         list15.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone15 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setLongValueList((long[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            long.class,list15));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDDeltaValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list16.add(com.rightnow.ws.base.NamedIDDelta.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone16 = false;
                                                        while(!loopDone16){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone16 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDDeltaValueList").equals(reader.getName())){
                                                                    list16.add(com.rightnow.ws.base.NamedIDDelta.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone16 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNamedIDDeltaValueList((com.rightnow.ws.base.NamedIDDelta[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.NamedIDDelta.class,
                                                                list16));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDHierarchyValue").equals(reader.getName())){
                                
                                                object.setNamedIDHierarchyValue(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDHierarchyValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list18.add(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone18 = false;
                                                        while(!loopDone18){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone18 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDHierarchyValueList").equals(reader.getName())){
                                                                    list18.add(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone18 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNamedIDHierarchyValueList((com.rightnow.ws.base.NamedIDHierarchy[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.NamedIDHierarchy.class,
                                                                list18));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDValue").equals(reader.getName())){
                                
                                                object.setNamedIDValue(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list20.add(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone20 = false;
                                                        while(!loopDone20){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone20 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","NamedIDValueList").equals(reader.getName())){
                                                                    list20.add(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone20 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNamedIDValueList((com.rightnow.ws.base.NamedID[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.NamedID.class,
                                                                list20));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","ObjectValue").equals(reader.getName())){
                                
                                                object.setObjectValue(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","ObjectValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list22.add(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone22 = false;
                                                        while(!loopDone22){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone22 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","ObjectValueList").equals(reader.getName())){
                                                                    list22.add(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone22 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setObjectValueList((com.rightnow.ws.generic.GenericObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.generic.GenericObject.class,
                                                                list22));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","StringValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStringValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","StringValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list24.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone24 = false;
                                            while(!loopDone24){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone24 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_2","StringValueList").equals(reader.getName())){
                                                         list24.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone24 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setStringValueList((java.lang.String[])
                                                        list24.toArray(new java.lang.String[list24.size()]));
                                                
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
           
          