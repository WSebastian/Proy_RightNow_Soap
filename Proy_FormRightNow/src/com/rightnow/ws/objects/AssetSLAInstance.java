
/**
 * AssetSLAInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.objects;
            

            /**
            *  AssetSLAInstance bean class
            */
        
        public  class AssetSLAInstance
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AssetSLAInstance
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
                        * field for ActiveDate
                        */

                        
                                    protected java.util.Date localActiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActiveDateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getActiveDate(){
                               return localActiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveDate
                               */
                               public void setActiveDate(java.util.Date param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localActiveDateTracker = true;
                                       } else {
                                          localActiveDateTracker = false;
                                              
                                       }
                                   
                                            this.localActiveDate=param;
                                    

                               }
                            

                        /**
                        * field for ExpireDate
                        */

                        
                                    protected java.util.Date localExpireDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpireDateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getExpireDate(){
                               return localExpireDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpireDate
                               */
                               public void setExpireDate(java.util.Date param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExpireDateTracker = true;
                                       } else {
                                          localExpireDateTracker = false;
                                              
                                       }
                                   
                                            this.localExpireDate=param;
                                    

                               }
                            

                        /**
                        * field for ID
                        */

                        
                                    protected com.rightnow.ws.base.ID localID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.ID
                           */
                           public  com.rightnow.ws.base.ID getID(){
                               return localID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ID
                               */
                               public void setID(com.rightnow.ws.base.ID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localIDTracker = true;
                                       } else {
                                          localIDTracker = false;
                                              
                                       }
                                   
                                            this.localID=param;
                                    

                               }
                            

                        /**
                        * field for NameOfSLA
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localNameOfSLA ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameOfSLATracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getNameOfSLA(){
                               return localNameOfSLA;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameOfSLA
                               */
                               public void setNameOfSLA(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameOfSLATracker = true;
                                       } else {
                                          localNameOfSLATracker = true;
                                              
                                       }
                                   
                                            this.localNameOfSLA=param;
                                    

                               }
                            

                        /**
                        * field for RemainingFromChat
                        */

                        
                                    protected int localRemainingFromChat ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemainingFromChatTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRemainingFromChat(){
                               return localRemainingFromChat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemainingFromChat
                               */
                               public void setRemainingFromChat(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localRemainingFromChatTracker = true;
                                              
                                       } else {
                                          localRemainingFromChatTracker = true;
                                       }
                                   
                                            this.localRemainingFromChat=param;
                                    

                               }
                            

                        /**
                        * field for RemainingFromCSR
                        */

                        
                                    protected int localRemainingFromCSR ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemainingFromCSRTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRemainingFromCSR(){
                               return localRemainingFromCSR;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemainingFromCSR
                               */
                               public void setRemainingFromCSR(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localRemainingFromCSRTracker = true;
                                              
                                       } else {
                                          localRemainingFromCSRTracker = true;
                                       }
                                   
                                            this.localRemainingFromCSR=param;
                                    

                               }
                            

                        /**
                        * field for RemainingFromEmail
                        */

                        
                                    protected int localRemainingFromEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemainingFromEmailTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRemainingFromEmail(){
                               return localRemainingFromEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemainingFromEmail
                               */
                               public void setRemainingFromEmail(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localRemainingFromEmailTracker = true;
                                              
                                       } else {
                                          localRemainingFromEmailTracker = true;
                                       }
                                   
                                            this.localRemainingFromEmail=param;
                                    

                               }
                            

                        /**
                        * field for RemainingFromWeb
                        */

                        
                                    protected int localRemainingFromWeb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemainingFromWebTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRemainingFromWeb(){
                               return localRemainingFromWeb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemainingFromWeb
                               */
                               public void setRemainingFromWeb(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localRemainingFromWebTracker = true;
                                              
                                       } else {
                                          localRemainingFromWebTracker = true;
                                       }
                                   
                                            this.localRemainingFromWeb=param;
                                    

                               }
                            

                        /**
                        * field for RemainingTotal
                        */

                        
                                    protected int localRemainingTotal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemainingTotalTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRemainingTotal(){
                               return localRemainingTotal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemainingTotal
                               */
                               public void setRemainingTotal(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localRemainingTotalTracker = true;
                                              
                                       } else {
                                          localRemainingTotalTracker = true;
                                       }
                                   
                                            this.localRemainingTotal=param;
                                    

                               }
                            

                        /**
                        * field for SLASet
                        */

                        
                                    protected int localSLASet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSLASetTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSLASet(){
                               return localSLASet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SLASet
                               */
                               public void setSLASet(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localSLASetTracker = false;
                                              
                                       } else {
                                          localSLASetTracker = true;
                                       }
                                   
                                            this.localSLASet=param;
                                    

                               }
                            

                        /**
                        * field for StateOfSLA
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localStateOfSLA ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateOfSLATracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getStateOfSLA(){
                               return localStateOfSLA;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateOfSLA
                               */
                               public void setStateOfSLA(com.rightnow.ws.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStateOfSLATracker = true;
                                       } else {
                                          localStateOfSLATracker = false;
                                              
                                       }
                                   
                                            this.localStateOfSLA=param;
                                    

                               }
                            

                        /**
                        * field for Action
                        * This was an Attribute!
                        */

                        
                                    protected com.rightnow.ws.base.ActionEnum localAction ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.ActionEnum
                           */
                           public  com.rightnow.ws.base.ActionEnum getAction(){
                               return localAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Action
                               */
                               public void setAction(com.rightnow.ws.base.ActionEnum param){
                            
                                            this.localAction=param;
                                    

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
                       AssetSLAInstance.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:objects.ws.rightnow.com/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AssetSLAInstance",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AssetSLAInstance",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localAction != null){
                                        writeAttribute("",
                                           "action",
                                           localAction.toString(), xmlWriter);
                                    }
                                     if (localActiveDateTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ActiveDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ActiveDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ActiveDate");
                                    }
                                

                                          if (localActiveDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ActiveDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActiveDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExpireDateTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ExpireDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ExpireDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ExpireDate");
                                    }
                                

                                          if (localExpireDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ExpireDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpireDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIDTracker){
                                            if (localID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                            }
                                           localID.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ID"),
                                               factory,xmlWriter);
                                        } if (localNameOfSLATracker){
                                    if (localNameOfSLA==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"NameOfSLA", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"NameOfSLA");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("NameOfSLA");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNameOfSLA.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","NameOfSLA"),
                                        factory,xmlWriter);
                                    }
                                } if (localRemainingFromChatTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RemainingFromChat", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RemainingFromChat");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RemainingFromChat");
                                    }
                                
                                               if (localRemainingFromChat==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromChat));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemainingFromCSRTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RemainingFromCSR", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RemainingFromCSR");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RemainingFromCSR");
                                    }
                                
                                               if (localRemainingFromCSR==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromCSR));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemainingFromEmailTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RemainingFromEmail", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RemainingFromEmail");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RemainingFromEmail");
                                    }
                                
                                               if (localRemainingFromEmail==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromEmail));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemainingFromWebTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RemainingFromWeb", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RemainingFromWeb");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RemainingFromWeb");
                                    }
                                
                                               if (localRemainingFromWeb==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromWeb));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemainingTotalTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RemainingTotal", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RemainingTotal");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RemainingTotal");
                                    }
                                
                                               if (localRemainingTotal==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingTotal));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSLASetTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SLASet", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SLASet");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SLASet");
                                    }
                                
                                               if (localSLASet==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SLASet cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSLASet));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateOfSLATracker){
                                            if (localStateOfSLA==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StateOfSLA cannot be null!!");
                                            }
                                           localStateOfSLA.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","StateOfSLA"),
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

                 if (localActiveDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ActiveDate"));
                                 
                                        if (localActiveDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActiveDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ActiveDate cannot be null!!");
                                        }
                                    } if (localExpireDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ExpireDate"));
                                 
                                        if (localExpireDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpireDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ExpireDate cannot be null!!");
                                        }
                                    } if (localIDTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ID"));
                            
                            
                                    if (localID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                    }
                                    elementList.add(localID);
                                } if (localNameOfSLATracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "NameOfSLA"));
                            
                            
                                    elementList.add(localNameOfSLA==null?null:
                                    localNameOfSLA);
                                } if (localRemainingFromChatTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "RemainingFromChat"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromChat));
                            } if (localRemainingFromCSRTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "RemainingFromCSR"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromCSR));
                            } if (localRemainingFromEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "RemainingFromEmail"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromEmail));
                            } if (localRemainingFromWebTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "RemainingFromWeb"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingFromWeb));
                            } if (localRemainingTotalTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "RemainingTotal"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemainingTotal));
                            } if (localSLASetTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "SLASet"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSLASet));
                            } if (localStateOfSLATracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "StateOfSLA"));
                            
                            
                                    if (localStateOfSLA==null){
                                         throw new org.apache.axis2.databinding.ADBException("StateOfSLA cannot be null!!");
                                    }
                                    elementList.add(localStateOfSLA);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","action"));
                            
                                      attribList.add(localAction.toString());
                                

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
        public static AssetSLAInstance parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AssetSLAInstance object =
                new AssetSLAInstance();

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
                    
                            if (!"AssetSLAInstance".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AssetSLAInstance)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    // handle attribute "action"
                    java.lang.String tempAttribAction =
                        
                                reader.getAttributeValue(null,"action");
                            
                   if (tempAttribAction!=null){
                         java.lang.String content = tempAttribAction;
                        
                                                  object.setAction(
                                                        com.rightnow.ws.base.ActionEnum.Factory.fromString(reader,tempAttribAction));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("action");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ActiveDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ExpireDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpireDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ID").equals(reader.getName())){
                                
                                                object.setID(com.rightnow.ws.base.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","NameOfSLA").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNameOfSLA(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNameOfSLA(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","RemainingFromChat").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRemainingFromChat(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRemainingFromChat(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRemainingFromChat(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","RemainingFromCSR").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRemainingFromCSR(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRemainingFromCSR(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRemainingFromCSR(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","RemainingFromEmail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRemainingFromEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRemainingFromEmail(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRemainingFromEmail(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","RemainingFromWeb").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRemainingFromWeb(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRemainingFromWeb(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRemainingFromWeb(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","RemainingTotal").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRemainingTotal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRemainingTotal(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRemainingTotal(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","SLASet").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSLASet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSLASet(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","StateOfSLA").equals(reader.getName())){
                                
                                                object.setStateOfSLA(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
          