
/**
 * MetaDataClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.metadata;
            

            /**
            *  MetaDataClass bean class
            */
        
        public  class MetaDataClass
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MetaDataClass
                Namespace URI = urn:metadata.ws.rightnow.com/v1_2
                Namespace Prefix = ns5
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:metadata.ws.rightnow.com/v1_2")){
                return "ns5";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for Attributes
                        */

                        
                                    protected com.rightnow.ws.metadata.MetaDataAttributeList localAttributes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttributesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.metadata.MetaDataAttributeList
                           */
                           public  com.rightnow.ws.metadata.MetaDataAttributeList getAttributes(){
                               return localAttributes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attributes
                               */
                               public void setAttributes(com.rightnow.ws.metadata.MetaDataAttributeList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAttributesTracker = true;
                                       } else {
                                          localAttributesTracker = false;
                                              
                                       }
                                   
                                            this.localAttributes=param;
                                    

                               }
                            

                        /**
                        * field for CanCreate
                        */

                        
                                    protected boolean localCanCreate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCanCreate(){
                               return localCanCreate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CanCreate
                               */
                               public void setCanCreate(boolean param){
                            
                                            this.localCanCreate=param;
                                    

                               }
                            

                        /**
                        * field for CanDestroy
                        */

                        
                                    protected boolean localCanDestroy ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCanDestroy(){
                               return localCanDestroy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CanDestroy
                               */
                               public void setCanDestroy(boolean param){
                            
                                            this.localCanDestroy=param;
                                    

                               }
                            

                        /**
                        * field for CanGet
                        */

                        
                                    protected boolean localCanGet ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCanGet(){
                               return localCanGet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CanGet
                               */
                               public void setCanGet(boolean param){
                            
                                            this.localCanGet=param;
                                    

                               }
                            

                        /**
                        * field for CanUpdate
                        */

                        
                                    protected boolean localCanUpdate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCanUpdate(){
                               return localCanUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CanUpdate
                               */
                               public void setCanUpdate(boolean param){
                            
                                            this.localCanUpdate=param;
                                    

                               }
                            

                        /**
                        * field for DerivedFrom
                        */

                        
                                    protected com.rightnow.ws.generic.RNObjectType localDerivedFrom ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDerivedFromTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.RNObjectType
                           */
                           public  com.rightnow.ws.generic.RNObjectType getDerivedFrom(){
                               return localDerivedFrom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DerivedFrom
                               */
                               public void setDerivedFrom(com.rightnow.ws.generic.RNObjectType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDerivedFromTracker = true;
                                       } else {
                                          localDerivedFromTracker = false;
                                              
                                       }
                                   
                                            this.localDerivedFrom=param;
                                    

                               }
                            

                        /**
                        * field for MetaDataLink
                        */

                        
                                    protected java.lang.String localMetaDataLink ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMetaDataLink(){
                               return localMetaDataLink;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MetaDataLink
                               */
                               public void setMetaDataLink(java.lang.String param){
                            
                                            this.localMetaDataLink=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected com.rightnow.ws.generic.RNObjectType localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.RNObjectType
                           */
                           public  com.rightnow.ws.generic.RNObjectType getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(com.rightnow.ws.generic.RNObjectType param){
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Relationships
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.metadata.MetaDataRelationship[] localRelationships ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelationshipsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.metadata.MetaDataRelationship[]
                           */
                           public  com.rightnow.ws.metadata.MetaDataRelationship[] getRelationships(){
                               return localRelationships;
                           }

                           
                        


                               
                              /**
                               * validate the array for Relationships
                               */
                              protected void validateRelationships(com.rightnow.ws.metadata.MetaDataRelationship[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Relationships
                              */
                              public void setRelationships(com.rightnow.ws.metadata.MetaDataRelationship[] param){
                              
                                   validateRelationships(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localRelationshipsTracker = true;
                                          } else {
                                             localRelationshipsTracker = false;
                                                 
                                          }
                                      
                                      this.localRelationships=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.metadata.MetaDataRelationship
                             */
                             public void addRelationships(com.rightnow.ws.metadata.MetaDataRelationship param){
                                   if (localRelationships == null){
                                   localRelationships = new com.rightnow.ws.metadata.MetaDataRelationship[]{};
                                   }

                            
                                 //update the setting tracker
                                localRelationshipsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelationships);
                               list.add(param);
                               this.localRelationships =
                             (com.rightnow.ws.metadata.MetaDataRelationship[])list.toArray(
                            new com.rightnow.ws.metadata.MetaDataRelationship[list.size()]);

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
                       MetaDataClass.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:metadata.ws.rightnow.com/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MetaDataClass",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MetaDataClass",
                           xmlWriter);
                   }

               
                   }
                if (localAttributesTracker){
                                            if (localAttributes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Attributes cannot be null!!");
                                            }
                                           localAttributes.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Attributes"),
                                               factory,xmlWriter);
                                        }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CanCreate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CanCreate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CanCreate");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CanCreate cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanCreate));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CanDestroy", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CanDestroy");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CanDestroy");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CanDestroy cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanDestroy));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CanGet", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CanGet");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CanGet");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CanGet cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanGet));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CanUpdate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CanUpdate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CanUpdate");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CanUpdate cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanUpdate));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localDerivedFromTracker){
                                            if (localDerivedFrom==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DerivedFrom cannot be null!!");
                                            }
                                           localDerivedFrom.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","DerivedFrom"),
                                               factory,xmlWriter);
                                        }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MetaDataLink", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MetaDataLink");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MetaDataLink");
                                    }
                                

                                          if (localMetaDataLink==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMetaDataLink);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                            }
                                           localName.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Name"),
                                               factory,xmlWriter);
                                         if (localRelationshipsTracker){
                                       if (localRelationships!=null){
                                            for (int i = 0;i < localRelationships.length;i++){
                                                if (localRelationships[i] != null){
                                                 localRelationships[i].serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Relationships"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Relationships cannot be null!!");
                                        
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

                 if (localAttributesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "Attributes"));
                            
                            
                                    if (localAttributes==null){
                                         throw new org.apache.axis2.databinding.ADBException("Attributes cannot be null!!");
                                    }
                                    elementList.add(localAttributes);
                                }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "CanCreate"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanCreate));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "CanDestroy"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanDestroy));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "CanGet"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanGet));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "CanUpdate"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanUpdate));
                             if (localDerivedFromTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "DerivedFrom"));
                            
                            
                                    if (localDerivedFrom==null){
                                         throw new org.apache.axis2.databinding.ADBException("DerivedFrom cannot be null!!");
                                    }
                                    elementList.add(localDerivedFrom);
                                }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "MetaDataLink"));
                                 
                                        if (localMetaDataLink != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMetaDataLink));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "Name"));
                            
                            
                                    if (localName==null){
                                         throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                    }
                                    elementList.add(localName);
                                 if (localRelationshipsTracker){
                             if (localRelationships!=null) {
                                 for (int i = 0;i < localRelationships.length;i++){

                                    if (localRelationships[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                          "Relationships"));
                                         elementList.add(localRelationships[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Relationships cannot be null!!");
                                    
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
        public static MetaDataClass parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MetaDataClass object =
                new MetaDataClass();

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
                    
                            if (!"MetaDataClass".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MetaDataClass)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Attributes").equals(reader.getName())){
                                
                                                object.setAttributes(com.rightnow.ws.metadata.MetaDataAttributeList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","CanCreate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCanCreate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","CanDestroy").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCanDestroy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","CanGet").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCanGet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","CanUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCanUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","DerivedFrom").equals(reader.getName())){
                                
                                                object.setDerivedFrom(com.rightnow.ws.generic.RNObjectType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","MetaDataLink").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMetaDataLink(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Name").equals(reader.getName())){
                                
                                                object.setName(com.rightnow.ws.generic.RNObjectType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Relationships").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.rightnow.ws.metadata.MetaDataRelationship.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
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
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Relationships").equals(reader.getName())){
                                                                    list9.add(com.rightnow.ws.metadata.MetaDataRelationship.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRelationships((com.rightnow.ws.metadata.MetaDataRelationship[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.metadata.MetaDataRelationship.class,
                                                                list9));
                                                            
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
           
          