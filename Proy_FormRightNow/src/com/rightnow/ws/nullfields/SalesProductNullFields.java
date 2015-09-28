
/**
 * SalesProductNullFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.nullfields;
            

            /**
            *  SalesProductNullFields bean class
            */
        
        public  class SalesProductNullFields
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SalesProductNullFields
                Namespace URI = urn:nullfields.ws.rightnow.com/v1_2
                Namespace Prefix = ns3
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:nullfields.ws.rightnow.com/v1_2")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for AdminVisibleInterfaces
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdminVisibleInterfaces =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdminVisibleInterfaces(){
                               return localAdminVisibleInterfaces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminVisibleInterfaces
                               */
                               public void setAdminVisibleInterfaces(boolean param){
                            
                                            this.localAdminVisibleInterfaces=param;
                                    

                               }
                            

                        /**
                        * field for Descriptions
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDescriptions =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDescriptions(){
                               return localDescriptions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Descriptions
                               */
                               public void setDescriptions(boolean param){
                            
                                            this.localDescriptions=param;
                                    

                               }
                            

                        /**
                        * field for Folder
                        * This was an Attribute!
                        */

                        
                                    protected boolean localFolder =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getFolder(){
                               return localFolder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Folder
                               */
                               public void setFolder(boolean param){
                            
                                            this.localFolder=param;
                                    

                               }
                            

                        /**
                        * field for PartNumber
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPartNumber =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPartNumber(){
                               return localPartNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PartNumber
                               */
                               public void setPartNumber(boolean param){
                            
                                            this.localPartNumber=param;
                                    

                               }
                            

                        /**
                        * field for Schedules
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSchedules =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSchedules(){
                               return localSchedules;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Schedules
                               */
                               public void setSchedules(boolean param){
                            
                                            this.localSchedules=param;
                                    

                               }
                            

                        /**
                        * field for ServiceProduct
                        * This was an Attribute!
                        */

                        
                                    protected boolean localServiceProduct =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServiceProduct(){
                               return localServiceProduct;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceProduct
                               */
                               public void setServiceProduct(boolean param){
                            
                                            this.localServiceProduct=param;
                                    

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
                       SalesProductNullFields.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:nullfields.ws.rightnow.com/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SalesProductNullFields",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SalesProductNullFields",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdminVisibleInterfaces",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminVisibleInterfaces), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Descriptions",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescriptions), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Folder",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolder), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "PartNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartNumber), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Schedules",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchedules), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "ServiceProduct",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceProduct), xmlWriter);

                                            
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","AdminVisibleInterfaces"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminVisibleInterfaces));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Descriptions"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescriptions));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Folder"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolder));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PartNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Schedules"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchedules));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ServiceProduct"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceProduct));
                                

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
        public static SalesProductNullFields parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SalesProductNullFields object =
                new SalesProductNullFields();

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
                    
                            if (!"SalesProductNullFields".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SalesProductNullFields)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    // handle attribute "AdminVisibleInterfaces"
                    java.lang.String tempAttribAdminVisibleInterfaces =
                        
                                reader.getAttributeValue(null,"AdminVisibleInterfaces");
                            
                   if (tempAttribAdminVisibleInterfaces!=null){
                         java.lang.String content = tempAttribAdminVisibleInterfaces;
                        
                                                 object.setAdminVisibleInterfaces(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdminVisibleInterfaces));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdminVisibleInterfaces");
                    
                    // handle attribute "Descriptions"
                    java.lang.String tempAttribDescriptions =
                        
                                reader.getAttributeValue(null,"Descriptions");
                            
                   if (tempAttribDescriptions!=null){
                         java.lang.String content = tempAttribDescriptions;
                        
                                                 object.setDescriptions(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDescriptions));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Descriptions");
                    
                    // handle attribute "Folder"
                    java.lang.String tempAttribFolder =
                        
                                reader.getAttributeValue(null,"Folder");
                            
                   if (tempAttribFolder!=null){
                         java.lang.String content = tempAttribFolder;
                        
                                                 object.setFolder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribFolder));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Folder");
                    
                    // handle attribute "PartNumber"
                    java.lang.String tempAttribPartNumber =
                        
                                reader.getAttributeValue(null,"PartNumber");
                            
                   if (tempAttribPartNumber!=null){
                         java.lang.String content = tempAttribPartNumber;
                        
                                                 object.setPartNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPartNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PartNumber");
                    
                    // handle attribute "Schedules"
                    java.lang.String tempAttribSchedules =
                        
                                reader.getAttributeValue(null,"Schedules");
                            
                   if (tempAttribSchedules!=null){
                         java.lang.String content = tempAttribSchedules;
                        
                                                 object.setSchedules(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSchedules));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Schedules");
                    
                    // handle attribute "ServiceProduct"
                    java.lang.String tempAttribServiceProduct =
                        
                                reader.getAttributeValue(null,"ServiceProduct");
                            
                   if (tempAttribServiceProduct!=null){
                         java.lang.String content = tempAttribServiceProduct;
                        
                                                 object.setServiceProduct(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribServiceProduct));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ServiceProduct");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          