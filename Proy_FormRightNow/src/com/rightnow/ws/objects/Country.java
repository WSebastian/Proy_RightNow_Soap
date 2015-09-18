
/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rightnow.ws.objects;
            

            /**
            *  Country bean class
            */
        
        public  class Country extends com.rightnow.ws.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Country
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
                        * field for Abbreviation
                        */

                        
                                    protected java.lang.String localAbbreviation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAbbreviationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAbbreviation(){
                               return localAbbreviation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Abbreviation
                               */
                               public void setAbbreviation(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAbbreviationTracker = true;
                                       } else {
                                          localAbbreviationTracker = false;
                                              
                                       }
                                   
                                            this.localAbbreviation=param;
                                    

                               }
                            

                        /**
                        * field for DisplayOrder
                        */

                        
                                    protected int localDisplayOrder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplayOrderTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getDisplayOrder(){
                               return localDisplayOrder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayOrder
                               */
                               public void setDisplayOrder(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localDisplayOrderTracker = false;
                                              
                                       } else {
                                          localDisplayOrderTracker = true;
                                       }
                                   
                                            this.localDisplayOrder=param;
                                    

                               }
                            

                        /**
                        * field for ISOCode
                        */

                        
                                    protected java.lang.String localISOCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localISOCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getISOCode(){
                               return localISOCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ISOCode
                               */
                               public void setISOCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localISOCodeTracker = true;
                                       } else {
                                          localISOCodeTracker = false;
                                              
                                       }
                                   
                                            this.localISOCode=param;
                                    

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
                        * field for Names
                        */

                        
                                    protected com.rightnow.ws.objects.LabelRequiredList localNames ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.LabelRequiredList
                           */
                           public  com.rightnow.ws.objects.LabelRequiredList getNames(){
                               return localNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Names
                               */
                               public void setNames(com.rightnow.ws.objects.LabelRequiredList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNamesTracker = true;
                                       } else {
                                          localNamesTracker = false;
                                              
                                       }
                                   
                                            this.localNames=param;
                                    

                               }
                            

                        /**
                        * field for PhoneCode
                        */

                        
                                    protected java.lang.String localPhoneCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhoneCode(){
                               return localPhoneCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneCode
                               */
                               public void setPhoneCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPhoneCodeTracker = true;
                                       } else {
                                          localPhoneCodeTracker = false;
                                              
                                       }
                                   
                                            this.localPhoneCode=param;
                                    

                               }
                            

                        /**
                        * field for PhoneMask
                        */

                        
                                    protected java.lang.String localPhoneMask ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneMaskTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhoneMask(){
                               return localPhoneMask;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneMask
                               */
                               public void setPhoneMask(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPhoneMaskTracker = true;
                                       } else {
                                          localPhoneMaskTracker = false;
                                              
                                       }
                                   
                                            this.localPhoneMask=param;
                                    

                               }
                            

                        /**
                        * field for PostalMask
                        */

                        
                                    protected java.lang.String localPostalMask ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostalMaskTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPostalMask(){
                               return localPostalMask;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostalMask
                               */
                               public void setPostalMask(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPostalMaskTracker = true;
                                       } else {
                                          localPostalMaskTracker = false;
                                              
                                       }
                                   
                                            this.localPostalMask=param;
                                    

                               }
                            

                        /**
                        * field for Provinces
                        */

                        
                                    protected com.rightnow.ws.objects.ProvinceList localProvinces ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProvincesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ProvinceList
                           */
                           public  com.rightnow.ws.objects.ProvinceList getProvinces(){
                               return localProvinces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Provinces
                               */
                               public void setProvinces(com.rightnow.ws.objects.ProvinceList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProvincesTracker = true;
                                       } else {
                                          localProvincesTracker = true;
                                              
                                       }
                                   
                                            this.localProvinces=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rightnow.ws.nullfields.CountryNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.nullfields.CountryNullFields
                           */
                           public  com.rightnow.ws.nullfields.CountryNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rightnow.ws.nullfields.CountryNullFields param){
                            
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
                       Country.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":Country",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Country",
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
                             } if (localAbbreviationTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Abbreviation", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Abbreviation");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Abbreviation");
                                    }
                                

                                          if (localAbbreviation==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Abbreviation cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAbbreviation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDisplayOrderTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DisplayOrder", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DisplayOrder");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DisplayOrder");
                                    }
                                
                                               if (localDisplayOrder==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("DisplayOrder cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplayOrder));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localISOCodeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ISOCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ISOCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ISOCode");
                                    }
                                

                                          if (localISOCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ISOCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localISOCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                             } if (localNamesTracker){
                                            if (localNames==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Names cannot be null!!");
                                            }
                                           localNames.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Names"),
                                               factory,xmlWriter);
                                        } if (localPhoneCodeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PhoneCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PhoneCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PhoneCode");
                                    }
                                

                                          if (localPhoneCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PhoneCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPhoneCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPhoneMaskTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PhoneMask", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PhoneMask");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PhoneMask");
                                    }
                                

                                          if (localPhoneMask==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PhoneMask cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPhoneMask);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostalMaskTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_2";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PostalMask", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PostalMask");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PostalMask");
                                    }
                                

                                          if (localPostalMask==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PostalMask cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPostalMask);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProvincesTracker){
                                    if (localProvinces==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Provinces", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Provinces");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Provinces");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProvinces.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Provinces"),
                                        factory,xmlWriter);
                                    }
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
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Country"));
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
                                    } if (localAbbreviationTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Abbreviation"));
                                 
                                        if (localAbbreviation != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAbbreviation));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Abbreviation cannot be null!!");
                                        }
                                    } if (localDisplayOrderTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "DisplayOrder"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplayOrder));
                            } if (localISOCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "ISOCode"));
                                 
                                        if (localISOCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISOCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ISOCode cannot be null!!");
                                        }
                                    } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    } if (localNamesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Names"));
                            
                            
                                    if (localNames==null){
                                         throw new org.apache.axis2.databinding.ADBException("Names cannot be null!!");
                                    }
                                    elementList.add(localNames);
                                } if (localPhoneCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PhoneCode"));
                                 
                                        if (localPhoneCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PhoneCode cannot be null!!");
                                        }
                                    } if (localPhoneMaskTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PhoneMask"));
                                 
                                        if (localPhoneMask != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneMask));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PhoneMask cannot be null!!");
                                        }
                                    } if (localPostalMaskTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "PostalMask"));
                                 
                                        if (localPostalMask != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostalMask));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PostalMask cannot be null!!");
                                        }
                                    } if (localProvincesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
                                                                      "Provinces"));
                            
                            
                                    elementList.add(localProvinces==null?null:
                                    localProvinces);
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
        public static Country parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Country object =
                new Country();

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
                    
                            if (!"Country".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Country)com.rightnow.ws.generic.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Abbreviation").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAbbreviation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","DisplayOrder").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDisplayOrder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDisplayOrder(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","ISOCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setISOCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Names").equals(reader.getName())){
                                
                                                object.setNames(com.rightnow.ws.objects.LabelRequiredList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PhoneCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPhoneCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PhoneMask").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPhoneMask(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","PostalMask").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPostalMask(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2","Provinces").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProvinces(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProvinces(com.rightnow.ws.objects.ProvinceList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                    
                                                object.setValidNullFields(com.rightnow.ws.nullfields.CountryNullFields.Factory.parse(reader));
                                              
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
           
          