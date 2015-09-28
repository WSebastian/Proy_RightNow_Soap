
/**
 * GetMetaDataForClassMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.messages;
            

            /**
            *  GetMetaDataForClassMsg bean class
            */
        
        public  class GetMetaDataForClassMsg
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GetMetaDataForClassMsg
                Namespace URI = urn:messages.ws.rightnow.com/v1_2
                Namespace Prefix = ns7
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:messages.ws.rightnow.com/v1_2")){
                return "ns7";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for ClassName
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localClassName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClassNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getClassName(){
                               return localClassName;
                           }

                           
                        


                               
                              /**
                               * validate the array for ClassName
                               */
                              protected void validateClassName(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ClassName
                              */
                              public void setClassName(java.lang.String[] param){
                              
                                   validateClassName(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localClassNameTracker = true;
                                          } else {
                                             localClassNameTracker = false;
                                                 
                                          }
                                      
                                      this.localClassName=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addClassName(java.lang.String param){
                                   if (localClassName == null){
                                   localClassName = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localClassNameTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localClassName);
                               list.add(param);
                               this.localClassName =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for QualifiedClassName
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.generic.RNObjectType[] localQualifiedClassName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQualifiedClassNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.RNObjectType[]
                           */
                           public  com.rightnow.ws.generic.RNObjectType[] getQualifiedClassName(){
                               return localQualifiedClassName;
                           }

                           
                        


                               
                              /**
                               * validate the array for QualifiedClassName
                               */
                              protected void validateQualifiedClassName(com.rightnow.ws.generic.RNObjectType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param QualifiedClassName
                              */
                              public void setQualifiedClassName(com.rightnow.ws.generic.RNObjectType[] param){
                              
                                   validateQualifiedClassName(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localQualifiedClassNameTracker = true;
                                          } else {
                                             localQualifiedClassNameTracker = false;
                                                 
                                          }
                                      
                                      this.localQualifiedClassName=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.generic.RNObjectType
                             */
                             public void addQualifiedClassName(com.rightnow.ws.generic.RNObjectType param){
                                   if (localQualifiedClassName == null){
                                   localQualifiedClassName = new com.rightnow.ws.generic.RNObjectType[]{};
                                   }

                            
                                 //update the setting tracker
                                localQualifiedClassNameTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localQualifiedClassName);
                               list.add(param);
                               this.localQualifiedClassName =
                             (com.rightnow.ws.generic.RNObjectType[])list.toArray(
                            new com.rightnow.ws.generic.RNObjectType[list.size()]);

                             }
                             

                        /**
                        * field for MetaDataLink
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localMetaDataLink ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMetaDataLinkTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getMetaDataLink(){
                               return localMetaDataLink;
                           }

                           
                        


                               
                              /**
                               * validate the array for MetaDataLink
                               */
                              protected void validateMetaDataLink(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MetaDataLink
                              */
                              public void setMetaDataLink(java.lang.String[] param){
                              
                                   validateMetaDataLink(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localMetaDataLinkTracker = true;
                                          } else {
                                             localMetaDataLinkTracker = false;
                                                 
                                          }
                                      
                                      this.localMetaDataLink=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addMetaDataLink(java.lang.String param){
                                   if (localMetaDataLink == null){
                                   localMetaDataLink = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localMetaDataLinkTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMetaDataLink);
                               list.add(param);
                               this.localMetaDataLink =
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
                       GetMetaDataForClassMsg.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":GetMetaDataForClassMsg",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GetMetaDataForClassMsg",
                           xmlWriter);
                   }

               
                   }
                if (localClassNameTracker){
                             if (localClassName!=null) {
                                   namespace = "urn:messages.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localClassName.length;i++){
                                        
                                            if (localClassName[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"ClassName", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"ClassName");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("ClassName");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClassName[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("ClassName cannot be null!!");
                                    
                             }

                        } if (localQualifiedClassNameTracker){
                                       if (localQualifiedClassName!=null){
                                            for (int i = 0;i < localQualifiedClassName.length;i++){
                                                if (localQualifiedClassName[i] != null){
                                                 localQualifiedClassName[i].serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QualifiedClassName"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("QualifiedClassName cannot be null!!");
                                        
                                    }
                                 } if (localMetaDataLinkTracker){
                             if (localMetaDataLink!=null) {
                                   namespace = "urn:messages.ws.rightnow.com/v1_2";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localMetaDataLink.length;i++){
                                        
                                            if (localMetaDataLink[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"MetaDataLink", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"MetaDataLink");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("MetaDataLink");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMetaDataLink[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                    
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

                 if (localClassNameTracker){
                            if (localClassName!=null){
                                  for (int i = 0;i < localClassName.length;i++){
                                      
                                         if (localClassName[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                              "ClassName"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClassName[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("ClassName cannot be null!!");
                                
                            }

                        } if (localQualifiedClassNameTracker){
                             if (localQualifiedClassName!=null) {
                                 for (int i = 0;i < localQualifiedClassName.length;i++){

                                    if (localQualifiedClassName[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                          "QualifiedClassName"));
                                         elementList.add(localQualifiedClassName[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("QualifiedClassName cannot be null!!");
                                    
                             }

                        } if (localMetaDataLinkTracker){
                            if (localMetaDataLink!=null){
                                  for (int i = 0;i < localMetaDataLink.length;i++){
                                      
                                         if (localMetaDataLink[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2",
                                                                              "MetaDataLink"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMetaDataLink[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                
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
        public static GetMetaDataForClassMsg parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GetMetaDataForClassMsg object =
                new GetMetaDataForClassMsg();

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
                    
                            if (!"GetMetaDataForClassMsg".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetMetaDataForClassMsg)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ClassName").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
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
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","ClassName").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setClassName((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QualifiedClassName").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.rightnow.ws.generic.RNObjectType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","QualifiedClassName").equals(reader.getName())){
                                                                    list2.add(com.rightnow.ws.generic.RNObjectType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setQualifiedClassName((com.rightnow.ws.generic.RNObjectType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.generic.RNObjectType.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","MetaDataLink").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_2","MetaDataLink").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setMetaDataLink((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
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
           
          