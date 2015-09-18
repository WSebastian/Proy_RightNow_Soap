
/**
 * MetaDataAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.metadata;
            

            /**
            *  MetaDataAttribute bean class
            */
        
        public  class MetaDataAttribute
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MetaDataAttribute
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
                        * field for DataType
                        */

                        
                                    protected com.rightnow.ws.generic.DataTypeEnum localDataType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.DataTypeEnum
                           */
                           public  com.rightnow.ws.generic.DataTypeEnum getDataType(){
                               return localDataType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataType
                               */
                               public void setDataType(com.rightnow.ws.generic.DataTypeEnum param){
                            
                                            this.localDataType=param;
                                    

                               }
                            

                        /**
                        * field for DataTypeName
                        */

                        
                                    protected java.lang.String localDataTypeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDataTypeNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDataTypeName(){
                               return localDataTypeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataTypeName
                               */
                               public void setDataTypeName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDataTypeNameTracker = true;
                                       } else {
                                          localDataTypeNameTracker = false;
                                              
                                       }
                                   
                                            this.localDataTypeName=param;
                                    

                               }
                            

                        /**
                        * field for MetaDataLink
                        */

                        
                                    protected java.lang.String localMetaDataLink ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMetaDataLinkTracker = false ;
                           

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
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMetaDataLinkTracker = true;
                                       } else {
                                          localMetaDataLinkTracker = false;
                                              
                                       }
                                   
                                            this.localMetaDataLink=param;
                                    

                               }
                            

                        /**
                        * field for IsDeprecated
                        */

                        
                                    protected boolean localIsDeprecated ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsDeprecated(){
                               return localIsDeprecated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsDeprecated
                               */
                               public void setIsDeprecated(boolean param){
                            
                                            this.localIsDeprecated=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for MaxLength
                        */

                        
                                    protected int localMaxLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaxLength(){
                               return localMaxLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxLength
                               */
                               public void setMaxLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localMaxLengthTracker = false;
                                              
                                       } else {
                                          localMaxLengthTracker = true;
                                       }
                                   
                                            this.localMaxLength=param;
                                    

                               }
                            

                        /**
                        * field for MaxValue
                        */

                        
                                    protected int localMaxValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaxValue(){
                               return localMaxValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxValue
                               */
                               public void setMaxValue(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localMaxValueTracker = false;
                                              
                                       } else {
                                          localMaxValueTracker = true;
                                       }
                                   
                                            this.localMaxValue=param;
                                    

                               }
                            

                        /**
                        * field for MinValue
                        */

                        
                                    protected int localMinValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMinValue(){
                               return localMinValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinValue
                               */
                               public void setMinValue(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localMinValueTracker = false;
                                              
                                       } else {
                                          localMinValueTracker = true;
                                       }
                                   
                                            this.localMinValue=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                

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
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Nullable
                        */

                        
                                    protected boolean localNullable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNullable(){
                               return localNullable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nullable
                               */
                               public void setNullable(boolean param){
                            
                                            this.localNullable=param;
                                    

                               }
                            

                        /**
                        * field for Pattern
                        */

                        
                                    protected java.lang.String localPattern ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPatternTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPattern(){
                               return localPattern;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pattern
                               */
                               public void setPattern(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPatternTracker = true;
                                       } else {
                                          localPatternTracker = false;
                                              
                                       }
                                   
                                            this.localPattern=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnCreate
                        */

                        
                                    protected com.rightnow.ws.metadata.MetaDataUsageEnum localUsageOnCreate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.metadata.MetaDataUsageEnum
                           */
                           public  com.rightnow.ws.metadata.MetaDataUsageEnum getUsageOnCreate(){
                               return localUsageOnCreate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnCreate
                               */
                               public void setUsageOnCreate(com.rightnow.ws.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnCreate=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnDestroy
                        */

                        
                                    protected com.rightnow.ws.metadata.MetaDataUsageEnum localUsageOnDestroy ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.metadata.MetaDataUsageEnum
                           */
                           public  com.rightnow.ws.metadata.MetaDataUsageEnum getUsageOnDestroy(){
                               return localUsageOnDestroy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnDestroy
                               */
                               public void setUsageOnDestroy(com.rightnow.ws.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnDestroy=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnGet
                        */

                        
                                    protected com.rightnow.ws.metadata.MetaDataUsageEnum localUsageOnGet ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.metadata.MetaDataUsageEnum
                           */
                           public  com.rightnow.ws.metadata.MetaDataUsageEnum getUsageOnGet(){
                               return localUsageOnGet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnGet
                               */
                               public void setUsageOnGet(com.rightnow.ws.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnGet=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnUpdate
                        */

                        
                                    protected com.rightnow.ws.metadata.MetaDataUsageEnum localUsageOnUpdate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.metadata.MetaDataUsageEnum
                           */
                           public  com.rightnow.ws.metadata.MetaDataUsageEnum getUsageOnUpdate(){
                               return localUsageOnUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnUpdate
                               */
                               public void setUsageOnUpdate(com.rightnow.ws.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnUpdate=param;
                                    

                               }
                            

                        /**
                        * field for UsedAsName
                        */

                        
                                    protected boolean localUsedAsName ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUsedAsName(){
                               return localUsedAsName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsedAsName
                               */
                               public void setUsedAsName(boolean param){
                            
                                            this.localUsedAsName=param;
                                    

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
                       MetaDataAttribute.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":MetaDataAttribute",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MetaDataAttribute",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDataType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DataType cannot be null!!");
                                            }
                                           localDataType.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","DataType"),
                                               factory,xmlWriter);
                                         if (localDataTypeNameTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DataTypeName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DataTypeName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DataTypeName");
                                    }
                                

                                          if (localDataTypeName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DataTypeName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDataTypeName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMetaDataLinkTracker){
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
                             }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"IsDeprecated", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"IsDeprecated");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("IsDeprecated");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IsDeprecated cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsDeprecated));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Description", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Description");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Description");
                                    }
                                

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localMaxLengthTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaxLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaxLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaxLength");
                                    }
                                
                                               if (localMaxLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxValueTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaxValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaxValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaxValue");
                                    }
                                
                                               if (localMaxValue==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMinValueTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MinValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MinValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MinValue");
                                    }
                                
                                               if (localMinValue==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MinValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
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
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Nullable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Nullable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Nullable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Nullable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNullable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localPatternTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Pattern", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Pattern");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Pattern");
                                    }
                                

                                          if (localPattern==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Pattern cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPattern);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localUsageOnCreate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnCreate cannot be null!!");
                                            }
                                           localUsageOnCreate.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnCreate"),
                                               factory,xmlWriter);
                                        
                                            if (localUsageOnDestroy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnDestroy cannot be null!!");
                                            }
                                           localUsageOnDestroy.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnDestroy"),
                                               factory,xmlWriter);
                                        
                                            if (localUsageOnGet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnGet cannot be null!!");
                                            }
                                           localUsageOnGet.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnGet"),
                                               factory,xmlWriter);
                                        
                                            if (localUsageOnUpdate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnUpdate cannot be null!!");
                                            }
                                           localUsageOnUpdate.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnUpdate"),
                                               factory,xmlWriter);
                                        
                                    namespace = "urn:metadata.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"UsedAsName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UsedAsName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UsedAsName");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("UsedAsName cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsedAsName));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
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

                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "DataType"));
                            
                            
                                    if (localDataType==null){
                                         throw new org.apache.axis2.databinding.ADBException("DataType cannot be null!!");
                                    }
                                    elementList.add(localDataType);
                                 if (localDataTypeNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "DataTypeName"));
                                 
                                        if (localDataTypeName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataTypeName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DataTypeName cannot be null!!");
                                        }
                                    } if (localMetaDataLinkTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "MetaDataLink"));
                                 
                                        if (localMetaDataLink != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMetaDataLink));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "IsDeprecated"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsDeprecated));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "Description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        }
                                     if (localMaxLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "MaxLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxLength));
                            } if (localMaxValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "MaxValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxValue));
                            } if (localMinValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "MinValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinValue));
                            }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "Nullable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNullable));
                             if (localPatternTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "Pattern"));
                                 
                                        if (localPattern != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPattern));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Pattern cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "UsageOnCreate"));
                            
                            
                                    if (localUsageOnCreate==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnCreate cannot be null!!");
                                    }
                                    elementList.add(localUsageOnCreate);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "UsageOnDestroy"));
                            
                            
                                    if (localUsageOnDestroy==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnDestroy cannot be null!!");
                                    }
                                    elementList.add(localUsageOnDestroy);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "UsageOnGet"));
                            
                            
                                    if (localUsageOnGet==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnGet cannot be null!!");
                                    }
                                    elementList.add(localUsageOnGet);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "UsageOnUpdate"));
                            
                            
                                    if (localUsageOnUpdate==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnUpdate cannot be null!!");
                                    }
                                    elementList.add(localUsageOnUpdate);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2",
                                                                      "UsedAsName"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsedAsName));
                            

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
        public static MetaDataAttribute parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MetaDataAttribute object =
                new MetaDataAttribute();

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
                    
                            if (!"MetaDataAttribute".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MetaDataAttribute)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","DataType").equals(reader.getName())){
                                
                                                object.setDataType(com.rightnow.ws.generic.DataTypeEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","DataTypeName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDataTypeName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","IsDeprecated").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsDeprecated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Description").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","MaxLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","MaxValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxValue(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","MinValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMinValue(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Nullable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNullable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","Pattern").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPattern(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnCreate").equals(reader.getName())){
                                
                                                object.setUsageOnCreate(com.rightnow.ws.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnDestroy").equals(reader.getName())){
                                
                                                object.setUsageOnDestroy(com.rightnow.ws.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnGet").equals(reader.getName())){
                                
                                                object.setUsageOnGet(com.rightnow.ws.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsageOnUpdate").equals(reader.getName())){
                                
                                                object.setUsageOnUpdate(com.rightnow.ws.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_2","UsedAsName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsedAsName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
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
           
          