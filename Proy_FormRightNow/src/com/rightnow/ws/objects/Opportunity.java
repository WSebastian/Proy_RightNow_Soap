
/**
 * Opportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

package com.rightnow.ws.objects;

/**
 * Opportunity bean class
 */

public class Opportunity extends com.rightnow.ws.base.RNObject implements org.apache.axis2.databinding.ADBBean
{
	/*
	 * This type was generated from the piece of schema that had name =
	 * Opportunity Namespace URI = urn:objects.ws.rightnow.com/v1_2 Namespace
	 * Prefix = ns4
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace)
	{
		if (namespace.equals("urn:objects.ws.rightnow.com/v1_2"))
		{
			return "ns4";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for AccountHierarchy
	 */

	protected com.rightnow.ws.base.NamedIDList localAccountHierarchy;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAccountHierarchyTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedIDList
	 */
	public com.rightnow.ws.base.NamedIDList getAccountHierarchy()
	{
		return localAccountHierarchy;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AccountHierarchy
	 */
	public void setAccountHierarchy(com.rightnow.ws.base.NamedIDList param)
	{

		if (param != null)
		{
			// update the setting tracker
			localAccountHierarchyTracker = true;
		} else
		{
			localAccountHierarchyTracker = true;

		}

		this.localAccountHierarchy = param;

	}

	/**
	 * field for AssignedToAccount
	 */

	protected com.rightnow.ws.base.NamedIDHierarchy localAssignedToAccount;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAssignedToAccountTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedIDHierarchy
	 */
	public com.rightnow.ws.base.NamedIDHierarchy getAssignedToAccount()
	{
		return localAssignedToAccount;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AssignedToAccount
	 */
	public void setAssignedToAccount(com.rightnow.ws.base.NamedIDHierarchy param)
	{

		if (param != null)
		{
			// update the setting tracker
			localAssignedToAccountTracker = true;
		} else
		{
			localAssignedToAccountTracker = true;

		}

		this.localAssignedToAccount = param;

	}

	/**
	 * field for Banner
	 */

	protected com.rightnow.ws.objects.Banner localBanner;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localBannerTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.Banner
	 */
	public com.rightnow.ws.objects.Banner getBanner()
	{
		return localBanner;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Banner
	 */
	public void setBanner(com.rightnow.ws.objects.Banner param)
	{

		if (param != null)
		{
			// update the setting tracker
			localBannerTracker = true;
		} else
		{
			localBannerTracker = true;

		}

		this.localBanner = param;

	}

	/**
	 * field for Campaign
	 */

	protected com.rightnow.ws.base.NamedID localCampaign;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCampaignTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedID
	 */
	public com.rightnow.ws.base.NamedID getCampaign()
	{
		return localCampaign;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Campaign
	 */
	public void setCampaign(com.rightnow.ws.base.NamedID param)
	{

		if (param != null)
		{
			// update the setting tracker
			localCampaignTracker = true;
		} else
		{
			localCampaignTracker = true;

		}

		this.localCampaign = param;

	}

	/**
	 * field for ClosedTime
	 */

	protected java.util.Calendar localClosedTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localClosedTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getClosedTime()
	{
		return localClosedTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ClosedTime
	 */
	public void setClosedTime(java.util.Calendar param)
	{

		if (param != null)
		{
			// update the setting tracker
			localClosedTimeTracker = true;
		} else
		{
			localClosedTimeTracker = true;

		}

		this.localClosedTime = param;

	}

	/**
	 * field for ClosedValue
	 */

	protected com.rightnow.ws.objects.MonetaryValue localClosedValue;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localClosedValueTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.MonetaryValue
	 */
	public com.rightnow.ws.objects.MonetaryValue getClosedValue()
	{
		return localClosedValue;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ClosedValue
	 */
	public void setClosedValue(com.rightnow.ws.objects.MonetaryValue param)
	{

		if (param != null)
		{
			// update the setting tracker
			localClosedValueTracker = true;
		} else
		{
			localClosedValueTracker = true;

		}

		this.localClosedValue = param;

	}

	/**
	 * field for CostOfSale
	 */

	protected com.rightnow.ws.objects.MonetaryValue localCostOfSale;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCostOfSaleTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.MonetaryValue
	 */
	public com.rightnow.ws.objects.MonetaryValue getCostOfSale()
	{
		return localCostOfSale;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CostOfSale
	 */
	public void setCostOfSale(com.rightnow.ws.objects.MonetaryValue param)
	{

		if (param != null)
		{
			// update the setting tracker
			localCostOfSaleTracker = true;
		} else
		{
			localCostOfSaleTracker = true;

		}

		this.localCostOfSale = param;

	}

	/**
	 * field for CustomFields
	 */

	protected com.rightnow.ws.generic.GenericObject localCustomFields;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCustomFieldsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.generic.GenericObject
	 */
	public com.rightnow.ws.generic.GenericObject getCustomFields()
	{
		return localCustomFields;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CustomFields
	 */
	public void setCustomFields(com.rightnow.ws.generic.GenericObject param)
	{

		if (param != null)
		{
			// update the setting tracker
			localCustomFieldsTracker = true;
		} else
		{
			localCustomFieldsTracker = false;

		}

		this.localCustomFields = param;

	}

	/**
	 * field for FileAttachments
	 */

	protected com.rightnow.ws.objects.FileAttachmentCommonList localFileAttachments;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFileAttachmentsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.FileAttachmentCommonList
	 */
	public com.rightnow.ws.objects.FileAttachmentCommonList getFileAttachments()
	{
		return localFileAttachments;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FileAttachments
	 */
	public void setFileAttachments(com.rightnow.ws.objects.FileAttachmentCommonList param)
	{

		if (param != null)
		{
			// update the setting tracker
			localFileAttachmentsTracker = true;
		} else
		{
			localFileAttachmentsTracker = true;

		}

		this.localFileAttachments = param;

	}

	/**
	 * field for ForecastCloseDate
	 */

	protected java.util.Date localForecastCloseDate;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localForecastCloseDateTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Date
	 */
	public java.util.Date getForecastCloseDate()
	{
		return localForecastCloseDate;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ForecastCloseDate
	 */
	public void setForecastCloseDate(java.util.Date param)
	{

		if (param != null)
		{
			// update the setting tracker
			localForecastCloseDateTracker = true;
		} else
		{
			localForecastCloseDateTracker = true;

		}

		this.localForecastCloseDate = param;

	}

	/**
	 * field for InitialContactDate
	 */

	protected java.util.Date localInitialContactDate;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localInitialContactDateTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Date
	 */
	public java.util.Date getInitialContactDate()
	{
		return localInitialContactDate;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            InitialContactDate
	 */
	public void setInitialContactDate(java.util.Date param)
	{

		if (param != null)
		{
			// update the setting tracker
			localInitialContactDateTracker = true;
		} else
		{
			localInitialContactDateTracker = true;

		}

		this.localInitialContactDate = param;

	}

	/**
	 * field for Interface
	 */

	protected com.rightnow.ws.base.NamedID localInterface;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localInterfaceTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedID
	 */
	public com.rightnow.ws.base.NamedID getInterface()
	{
		return localInterface;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Interface
	 */
	public void setInterface(com.rightnow.ws.base.NamedID param)
	{

		if (param != null)
		{
			// update the setting tracker
			localInterfaceTracker = true;
		} else
		{
			localInterfaceTracker = false;

		}

		this.localInterface = param;

	}

	/**
	 * field for LeadRejectDateTime
	 */

	protected java.util.Calendar localLeadRejectDateTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLeadRejectDateTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getLeadRejectDateTime()
	{
		return localLeadRejectDateTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LeadRejectDateTime
	 */
	public void setLeadRejectDateTime(java.util.Calendar param)
	{

		if (param != null)
		{
			// update the setting tracker
			localLeadRejectDateTimeTracker = true;
		} else
		{
			localLeadRejectDateTimeTracker = true;

		}

		this.localLeadRejectDateTime = param;

	}

	/**
	 * field for LeadRejectDescription
	 */

	protected java.lang.String localLeadRejectDescription;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLeadRejectDescriptionTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getLeadRejectDescription()
	{
		return localLeadRejectDescription;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LeadRejectDescription
	 */
	public void setLeadRejectDescription(java.lang.String param)
	{

		if (param != null)
		{
			// update the setting tracker
			localLeadRejectDescriptionTracker = true;
		} else
		{
			localLeadRejectDescriptionTracker = true;

		}

		this.localLeadRejectDescription = param;

	}

	/**
	 * field for LeadRejectReason
	 */

	protected com.rightnow.ws.base.NamedID localLeadRejectReason;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLeadRejectReasonTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedID
	 */
	public com.rightnow.ws.base.NamedID getLeadRejectReason()
	{
		return localLeadRejectReason;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LeadRejectReason
	 */
	public void setLeadRejectReason(com.rightnow.ws.base.NamedID param)
	{

		if (param != null)
		{
			// update the setting tracker
			localLeadRejectReasonTracker = true;
		} else
		{
			localLeadRejectReasonTracker = true;

		}

		this.localLeadRejectReason = param;

	}

	/**
	 * field for LostTime
	 */

	protected java.util.Calendar localLostTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLostTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getLostTime()
	{
		return localLostTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LostTime
	 */
	public void setLostTime(java.util.Calendar param)
	{

		if (param != null)
		{
			// update the setting tracker
			localLostTimeTracker = true;
		} else
		{
			localLostTimeTracker = true;

		}

		this.localLostTime = param;

	}

	/**
	 * field for ManagerCommit
	 */

	protected boolean localManagerCommit;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localManagerCommitTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getManagerCommit()
	{
		return localManagerCommit;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ManagerCommit
	 */
	public void setManagerCommit(boolean param)
	{

		// setting primitive attribute tracker to true

		if (false)
		{
			localManagerCommitTracker = false;

		} else
		{
			localManagerCommitTracker = true;
		}

		this.localManagerCommit = param;

	}

	/**
	 * field for ManagerValue
	 */

	protected com.rightnow.ws.objects.MonetaryValue localManagerValue;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localManagerValueTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.MonetaryValue
	 */
	public com.rightnow.ws.objects.MonetaryValue getManagerValue()
	{
		return localManagerValue;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ManagerValue
	 */
	public void setManagerValue(com.rightnow.ws.objects.MonetaryValue param)
	{

		if (param != null)
		{
			// update the setting tracker
			localManagerValueTracker = true;
		} else
		{
			localManagerValueTracker = true;

		}

		this.localManagerValue = param;

	}

	/**
	 * field for Name
	 */

	protected java.lang.String localName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getName()
	{
		return localName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Name
	 */
	public void setName(java.lang.String param)
	{

		if (param != null)
		{
			// update the setting tracker
			localNameTracker = true;
		} else
		{
			localNameTracker = true;

		}

		this.localName = param;

	}

	/**
	 * field for Notes
	 */

	protected com.rightnow.ws.objects.NoteList localNotes;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localNotesTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.NoteList
	 */
	public com.rightnow.ws.objects.NoteList getNotes()
	{
		return localNotes;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Notes
	 */
	public void setNotes(com.rightnow.ws.objects.NoteList param)
	{

		if (param != null)
		{
			// update the setting tracker
			localNotesTracker = true;
		} else
		{
			localNotesTracker = true;

		}

		this.localNotes = param;

	}

	/**
	 * field for Organization
	 */

	protected com.rightnow.ws.base.NamedID localOrganization;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOrganizationTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedID
	 */
	public com.rightnow.ws.base.NamedID getOrganization()
	{
		return localOrganization;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Organization
	 */
	public void setOrganization(com.rightnow.ws.base.NamedID param)
	{

		if (param != null)
		{
			// update the setting tracker
			localOrganizationTracker = true;
		} else
		{
			localOrganizationTracker = true;

		}

		this.localOrganization = param;

	}

	/**
	 * field for OtherContacts
	 */

	protected com.rightnow.ws.objects.OpportunityContactList localOtherContacts;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOtherContactsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.OpportunityContactList
	 */
	public com.rightnow.ws.objects.OpportunityContactList getOtherContacts()
	{
		return localOtherContacts;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OtherContacts
	 */
	public void setOtherContacts(com.rightnow.ws.objects.OpportunityContactList param)
	{

		if (param != null)
		{
			// update the setting tracker
			localOtherContactsTracker = true;
		} else
		{
			localOtherContactsTracker = true;

		}

		this.localOtherContacts = param;

	}

	/**
	 * field for PrimaryContact
	 */

	protected com.rightnow.ws.objects.OpportunityContact localPrimaryContact;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPrimaryContactTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.OpportunityContact
	 */
	public com.rightnow.ws.objects.OpportunityContact getPrimaryContact()
	{
		return localPrimaryContact;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PrimaryContact
	 */
	public void setPrimaryContact(com.rightnow.ws.objects.OpportunityContact param)
	{

		if (param != null)
		{
			// update the setting tracker
			localPrimaryContactTracker = true;
		} else
		{
			localPrimaryContactTracker = true;

		}

		this.localPrimaryContact = param;

	}

	/**
	 * field for Quotes
	 */

	protected com.rightnow.ws.objects.QuoteList localQuotes;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localQuotesTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.QuoteList
	 */
	public com.rightnow.ws.objects.QuoteList getQuotes()
	{
		return localQuotes;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Quotes
	 */
	public void setQuotes(com.rightnow.ws.objects.QuoteList param)
	{

		if (param != null)
		{
			// update the setting tracker
			localQuotesTracker = true;
		} else
		{
			localQuotesTracker = true;

		}

		this.localQuotes = param;

	}

	/**
	 * field for RecallTime
	 */

	protected java.util.Calendar localRecallTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRecallTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getRecallTime()
	{
		return localRecallTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RecallTime
	 */
	public void setRecallTime(java.util.Calendar param)
	{

		if (param != null)
		{
			// update the setting tracker
			localRecallTimeTracker = true;
		} else
		{
			localRecallTimeTracker = true;

		}

		this.localRecallTime = param;

	}

	/**
	 * field for ReturnValue
	 */

	protected com.rightnow.ws.objects.MonetaryValue localReturnValue;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localReturnValueTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.MonetaryValue
	 */
	public com.rightnow.ws.objects.MonetaryValue getReturnValue()
	{
		return localReturnValue;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ReturnValue
	 */
	public void setReturnValue(com.rightnow.ws.objects.MonetaryValue param)
	{

		if (param != null)
		{
			// update the setting tracker
			localReturnValueTracker = true;
		} else
		{
			localReturnValueTracker = true;

		}

		this.localReturnValue = param;

	}

	/**
	 * field for SalesRepresentativeCommit
	 */

	protected boolean localSalesRepresentativeCommit;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSalesRepresentativeCommitTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getSalesRepresentativeCommit()
	{
		return localSalesRepresentativeCommit;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SalesRepresentativeCommit
	 */
	public void setSalesRepresentativeCommit(boolean param)
	{

		// setting primitive attribute tracker to true

		if (false)
		{
			localSalesRepresentativeCommitTracker = false;

		} else
		{
			localSalesRepresentativeCommitTracker = true;
		}

		this.localSalesRepresentativeCommit = param;

	}

	/**
	 * field for SalesRepresentativeValue
	 */

	protected com.rightnow.ws.objects.MonetaryValue localSalesRepresentativeValue;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSalesRepresentativeValueTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.MonetaryValue
	 */
	public com.rightnow.ws.objects.MonetaryValue getSalesRepresentativeValue()
	{
		return localSalesRepresentativeValue;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SalesRepresentativeValue
	 */
	public void setSalesRepresentativeValue(com.rightnow.ws.objects.MonetaryValue param)
	{

		if (param != null)
		{
			// update the setting tracker
			localSalesRepresentativeValueTracker = true;
		} else
		{
			localSalesRepresentativeValueTracker = true;

		}

		this.localSalesRepresentativeValue = param;

	}

	/**
	 * field for Source
	 */

	protected com.rightnow.ws.base.NamedIDHierarchy localSource;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSourceTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedIDHierarchy
	 */
	public com.rightnow.ws.base.NamedIDHierarchy getSource()
	{
		return localSource;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Source
	 */
	public void setSource(com.rightnow.ws.base.NamedIDHierarchy param)
	{

		if (param != null)
		{
			// update the setting tracker
			localSourceTracker = true;
		} else
		{
			localSourceTracker = false;

		}

		this.localSource = param;

	}

	/**
	 * field for StageWithStrategy
	 */

	protected com.rightnow.ws.objects.StageWithStrategy localStageWithStrategy;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localStageWithStrategyTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.StageWithStrategy
	 */
	public com.rightnow.ws.objects.StageWithStrategy getStageWithStrategy()
	{
		return localStageWithStrategy;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            StageWithStrategy
	 */
	public void setStageWithStrategy(com.rightnow.ws.objects.StageWithStrategy param)
	{

		if (param != null)
		{
			// update the setting tracker
			localStageWithStrategyTracker = true;
		} else
		{
			localStageWithStrategyTracker = false;

		}

		this.localStageWithStrategy = param;

	}

	/**
	 * field for StatusWithType
	 */

	protected com.rightnow.ws.objects.StatusWithType localStatusWithType;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localStatusWithTypeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.objects.StatusWithType
	 */
	public com.rightnow.ws.objects.StatusWithType getStatusWithType()
	{
		return localStatusWithType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            StatusWithType
	 */
	public void setStatusWithType(com.rightnow.ws.objects.StatusWithType param)
	{

		if (param != null)
		{
			// update the setting tracker
			localStatusWithTypeTracker = true;
		} else
		{
			localStatusWithTypeTracker = false;

		}

		this.localStatusWithType = param;

	}

	/**
	 * field for Summary
	 */

	protected java.lang.String localSummary;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSummaryTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSummary()
	{
		return localSummary;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Summary
	 */
	public void setSummary(java.lang.String param)
	{

		if (param != null)
		{
			// update the setting tracker
			localSummaryTracker = true;
		} else
		{
			localSummaryTracker = true;

		}

		this.localSummary = param;

	}

	/**
	 * field for Survey
	 */

	protected com.rightnow.ws.base.NamedID localSurvey;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSurveyTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedID
	 */
	public com.rightnow.ws.base.NamedID getSurvey()
	{
		return localSurvey;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Survey
	 */
	public void setSurvey(com.rightnow.ws.base.NamedID param)
	{

		if (param != null)
		{
			// update the setting tracker
			localSurveyTracker = true;
		} else
		{
			localSurveyTracker = true;

		}

		this.localSurvey = param;

	}

	/**
	 * field for Territory
	 */

	protected com.rightnow.ws.base.NamedIDHierarchy localTerritory;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localTerritoryTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedIDHierarchy
	 */
	public com.rightnow.ws.base.NamedIDHierarchy getTerritory()
	{
		return localTerritory;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Territory
	 */
	public void setTerritory(com.rightnow.ws.base.NamedIDHierarchy param)
	{

		if (param != null)
		{
			// update the setting tracker
			localTerritoryTracker = true;
		} else
		{
			localTerritoryTracker = true;

		}

		this.localTerritory = param;

	}

	/**
	 * field for TerritoryHierarchy
	 */

	protected com.rightnow.ws.base.NamedIDList localTerritoryHierarchy;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localTerritoryHierarchyTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedIDList
	 */
	public com.rightnow.ws.base.NamedIDList getTerritoryHierarchy()
	{
		return localTerritoryHierarchy;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            TerritoryHierarchy
	 */
	public void setTerritoryHierarchy(com.rightnow.ws.base.NamedIDList param)
	{

		if (param != null)
		{
			// update the setting tracker
			localTerritoryHierarchyTracker = true;
		} else
		{
			localTerritoryHierarchyTracker = true;

		}

		this.localTerritoryHierarchy = param;

	}

	/**
	 * field for WinLossDescription
	 */

	protected java.lang.String localWinLossDescription;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localWinLossDescriptionTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getWinLossDescription()
	{
		return localWinLossDescription;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            WinLossDescription
	 */
	public void setWinLossDescription(java.lang.String param)
	{

		if (param != null)
		{
			// update the setting tracker
			localWinLossDescriptionTracker = true;
		} else
		{
			localWinLossDescriptionTracker = true;

		}

		this.localWinLossDescription = param;

	}

	/**
	 * field for WinLossReason
	 */

	protected com.rightnow.ws.base.NamedID localWinLossReason;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localWinLossReasonTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.base.NamedID
	 */
	public com.rightnow.ws.base.NamedID getWinLossReason()
	{
		return localWinLossReason;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            WinLossReason
	 */
	public void setWinLossReason(com.rightnow.ws.base.NamedID param)
	{

		if (param != null)
		{
			// update the setting tracker
			localWinLossReasonTracker = true;
		} else
		{
			localWinLossReasonTracker = true;

		}

		this.localWinLossReason = param;

	}

	/**
	 * field for ValidNullFields
	 */

	protected com.rightnow.ws.nullfields.OpportunityNullFields localValidNullFields;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localValidNullFieldsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.rightnow.ws.nullfields.OpportunityNullFields
	 */
	public com.rightnow.ws.nullfields.OpportunityNullFields getValidNullFields()
	{
		return localValidNullFields;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ValidNullFields
	 */
	public void setValidNullFields(com.rightnow.ws.nullfields.OpportunityNullFields param)
	{

		if (param != null)
		{
			// update the setting tracker
			localValidNullFieldsTracker = true;
		} else
		{
			localValidNullFieldsTracker = true;

		}

		this.localValidNullFields = param;

	}

	/**
	 * isReaderMTOMAware
	 * 
	 * @return true if the reader supports MTOM
	 */
	public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader)
	{
		boolean isReaderMTOMAware = false;

		try
		{
			isReaderMTOMAware = java.lang.Boolean.TRUE
					.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
		} catch (java.lang.IllegalArgumentException e)
		{
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
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException
	{

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName)
		{

			public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException
			{
				Opportunity.this.serialize(parentQName, factory, xmlWriter);
			}
		};
		return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(parentQName, factory, dataSource);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
	{
		serialize(parentQName, factory, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter, boolean serializeType)
					throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
	{

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();

		if ((namespace != null) && (namespace.trim().length() > 0))
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null)
			{
				xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
			} else
			{
				if (prefix == null)
				{
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		} else
		{
			xmlWriter.writeStartElement(parentQName.getLocalPart());
		}

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:objects.ws.rightnow.com/v1_2");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0))
		{
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Opportunity",
					xmlWriter);
		} else
		{
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Opportunity", xmlWriter);
		}

		if (localIDTracker)
		{
			if (localID == null)
			{
				throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
			}
			localID.serialize(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "ID"), factory, xmlWriter);
		}
		if (localLookupNameTracker)
		{
			namespace = "urn:base.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "LookupName", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "LookupName");
				}

			} else
			{
				xmlWriter.writeStartElement("LookupName");
			}

			if (localLookupName == null)
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");

			} else
			{

				xmlWriter.writeCharacters(localLookupName);

			}

			xmlWriter.writeEndElement();
		}
		if (localCreatedTimeTracker)
		{
			namespace = "urn:base.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "CreatedTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "CreatedTime");
				}

			} else
			{
				xmlWriter.writeStartElement("CreatedTime");
			}

			if (localCreatedTime == null)
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localUpdatedTimeTracker)
		{
			namespace = "urn:base.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "UpdatedTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "UpdatedTime");
				}

			} else
			{
				xmlWriter.writeStartElement("UpdatedTime");
			}

			if (localUpdatedTime == null)
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localAccountHierarchyTracker)
		{
			if (localAccountHierarchy == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "AccountHierarchy", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "AccountHierarchy");
					}

				} else
				{
					xmlWriter.writeStartElement("AccountHierarchy");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localAccountHierarchy.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "AccountHierarchy"), factory,
						xmlWriter);
			}
		}
		if (localAssignedToAccountTracker)
		{
			if (localAssignedToAccount == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "AssignedToAccount", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "AssignedToAccount");
					}

				} else
				{
					xmlWriter.writeStartElement("AssignedToAccount");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localAssignedToAccount.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "AssignedToAccount"), factory,
						xmlWriter);
			}
		}
		if (localBannerTracker)
		{
			if (localBanner == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Banner", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Banner");
					}

				} else
				{
					xmlWriter.writeStartElement("Banner");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localBanner.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Banner"),
						factory, xmlWriter);
			}
		}
		if (localCampaignTracker)
		{
			if (localCampaign == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Campaign", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Campaign");
					}

				} else
				{
					xmlWriter.writeStartElement("Campaign");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localCampaign.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Campaign"),
						factory, xmlWriter);
			}
		}
		if (localClosedTimeTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ClosedTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "ClosedTime");
				}

			} else
			{
				xmlWriter.writeStartElement("ClosedTime");
			}

			if (localClosedTime == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localClosedValueTracker)
		{
			if (localClosedValue == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "ClosedValue", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "ClosedValue");
					}

				} else
				{
					xmlWriter.writeStartElement("ClosedValue");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localClosedValue.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ClosedValue"), factory,
						xmlWriter);
			}
		}
		if (localCostOfSaleTracker)
		{
			if (localCostOfSale == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "CostOfSale", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "CostOfSale");
					}

				} else
				{
					xmlWriter.writeStartElement("CostOfSale");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localCostOfSale.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "CostOfSale"), factory,
						xmlWriter);
			}
		}
		if (localCustomFieldsTracker)
		{
			if (localCustomFields == null)
			{
				throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
			}
			localCustomFields.serialize(
					new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "CustomFields"), factory,
					xmlWriter);
		}
		if (localFileAttachmentsTracker)
		{
			if (localFileAttachments == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "FileAttachments", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "FileAttachments");
					}

				} else
				{
					xmlWriter.writeStartElement("FileAttachments");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localFileAttachments.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachments"), factory,
						xmlWriter);
			}
		}
		if (localForecastCloseDateTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ForecastCloseDate", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "ForecastCloseDate");
				}

			} else
			{
				xmlWriter.writeStartElement("ForecastCloseDate");
			}

			if (localForecastCloseDate == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localForecastCloseDate));

			}

			xmlWriter.writeEndElement();
		}
		if (localInitialContactDateTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "InitialContactDate", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "InitialContactDate");
				}

			} else
			{
				xmlWriter.writeStartElement("InitialContactDate");
			}

			if (localInitialContactDate == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialContactDate));

			}

			xmlWriter.writeEndElement();
		}
		if (localInterfaceTracker)
		{
			if (localInterface == null)
			{
				throw new org.apache.axis2.databinding.ADBException("Interface cannot be null!!");
			}
			localInterface.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Interface"),
					factory, xmlWriter);
		}
		if (localLeadRejectDateTimeTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "LeadRejectDateTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "LeadRejectDateTime");
				}

			} else
			{
				xmlWriter.writeStartElement("LeadRejectDateTime");
			}

			if (localLeadRejectDateTime == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLeadRejectDateTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localLeadRejectDescriptionTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "LeadRejectDescription", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "LeadRejectDescription");
				}

			} else
			{
				xmlWriter.writeStartElement("LeadRejectDescription");
			}

			if (localLeadRejectDescription == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(localLeadRejectDescription);

			}

			xmlWriter.writeEndElement();
		}
		if (localLeadRejectReasonTracker)
		{
			if (localLeadRejectReason == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "LeadRejectReason", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "LeadRejectReason");
					}

				} else
				{
					xmlWriter.writeStartElement("LeadRejectReason");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localLeadRejectReason.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectReason"), factory,
						xmlWriter);
			}
		}
		if (localLostTimeTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "LostTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "LostTime");
				}

			} else
			{
				xmlWriter.writeStartElement("LostTime");
			}

			if (localLostTime == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLostTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localManagerCommitTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ManagerCommit", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "ManagerCommit");
				}

			} else
			{
				xmlWriter.writeStartElement("ManagerCommit");
			}

			if (false)
			{

				throw new org.apache.axis2.databinding.ADBException("ManagerCommit cannot be null!!");

			} else
			{
				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localManagerCommit));
			}

			xmlWriter.writeEndElement();
		}
		if (localManagerValueTracker)
		{
			if (localManagerValue == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "ManagerValue", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "ManagerValue");
					}

				} else
				{
					xmlWriter.writeStartElement("ManagerValue");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localManagerValue.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ManagerValue"), factory,
						xmlWriter);
			}
		}
		if (localNameTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "Name", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "Name");
				}

			} else
			{
				xmlWriter.writeStartElement("Name");
			}

			if (localName == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(localName);

			}

			xmlWriter.writeEndElement();
		}
		if (localNotesTracker)
		{
			if (localNotes == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Notes", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Notes");
					}

				} else
				{
					xmlWriter.writeStartElement("Notes");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localNotes.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Notes"),
						factory, xmlWriter);
			}
		}
		if (localOrganizationTracker)
		{
			if (localOrganization == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Organization", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Organization");
					}

				} else
				{
					xmlWriter.writeStartElement("Organization");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localOrganization.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Organization"), factory,
						xmlWriter);
			}
		}
		if (localOtherContactsTracker)
		{
			if (localOtherContacts == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "OtherContacts", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "OtherContacts");
					}

				} else
				{
					xmlWriter.writeStartElement("OtherContacts");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localOtherContacts.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "OtherContacts"), factory,
						xmlWriter);
			}
		}
		if (localPrimaryContactTracker)
		{
			if (localPrimaryContact == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "PrimaryContact", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "PrimaryContact");
					}

				} else
				{
					xmlWriter.writeStartElement("PrimaryContact");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localPrimaryContact.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "PrimaryContact"), factory,
						xmlWriter);
			}
		}
		if (localQuotesTracker)
		{
			if (localQuotes == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Quotes", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Quotes");
					}

				} else
				{
					xmlWriter.writeStartElement("Quotes");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localQuotes.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Quotes"),
						factory, xmlWriter);
			}
		}
		if (localRecallTimeTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "RecallTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "RecallTime");
				}

			} else
			{
				xmlWriter.writeStartElement("RecallTime");
			}

			if (localRecallTime == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecallTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localReturnValueTracker)
		{
			if (localReturnValue == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "ReturnValue", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "ReturnValue");
					}

				} else
				{
					xmlWriter.writeStartElement("ReturnValue");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localReturnValue.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ReturnValue"), factory,
						xmlWriter);
			}
		}
		if (localSalesRepresentativeCommitTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "SalesRepresentativeCommit", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "SalesRepresentativeCommit");
				}

			} else
			{
				xmlWriter.writeStartElement("SalesRepresentativeCommit");
			}

			if (false)
			{

				throw new org.apache.axis2.databinding.ADBException("SalesRepresentativeCommit cannot be null!!");

			} else
			{
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localSalesRepresentativeCommit));
			}

			xmlWriter.writeEndElement();
		}
		if (localSalesRepresentativeValueTracker)
		{
			if (localSalesRepresentativeValue == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "SalesRepresentativeValue", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "SalesRepresentativeValue");
					}

				} else
				{
					xmlWriter.writeStartElement("SalesRepresentativeValue");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localSalesRepresentativeValue.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "SalesRepresentativeValue"),
						factory, xmlWriter);
			}
		}
		if (localSourceTracker)
		{
			if (localSource == null)
			{
				throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
			}
			localSource.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Source"), factory,
					xmlWriter);
		}
		if (localStageWithStrategyTracker)
		{
			if (localStageWithStrategy == null)
			{
				throw new org.apache.axis2.databinding.ADBException("StageWithStrategy cannot be null!!");
			}
			localStageWithStrategy.serialize(
					new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "StageWithStrategy"), factory,
					xmlWriter);
		}
		if (localStatusWithTypeTracker)
		{
			if (localStatusWithType == null)
			{
				throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
			}
			localStatusWithType.serialize(
					new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "StatusWithType"), factory,
					xmlWriter);
		}
		if (localSummaryTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "Summary", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "Summary");
				}

			} else
			{
				xmlWriter.writeStartElement("Summary");
			}

			if (localSummary == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(localSummary);

			}

			xmlWriter.writeEndElement();
		}
		if (localSurveyTracker)
		{
			if (localSurvey == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Survey", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Survey");
					}

				} else
				{
					xmlWriter.writeStartElement("Survey");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localSurvey.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Survey"),
						factory, xmlWriter);
			}
		}
		if (localTerritoryTracker)
		{
			if (localTerritory == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "Territory", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "Territory");
					}

				} else
				{
					xmlWriter.writeStartElement("Territory");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localTerritory.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Territory"),
						factory, xmlWriter);
			}
		}
		if (localTerritoryHierarchyTracker)
		{
			if (localTerritoryHierarchy == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "TerritoryHierarchy", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "TerritoryHierarchy");
					}

				} else
				{
					xmlWriter.writeStartElement("TerritoryHierarchy");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localTerritoryHierarchy.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "TerritoryHierarchy"),
						factory, xmlWriter);
			}
		}
		if (localWinLossDescriptionTracker)
		{
			namespace = "urn:objects.ws.rightnow.com/v1_2";
			if (!namespace.equals(""))
			{
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null)
				{
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "WinLossDescription", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else
				{
					xmlWriter.writeStartElement(namespace, "WinLossDescription");
				}

			} else
			{
				xmlWriter.writeStartElement("WinLossDescription");
			}

			if (localWinLossDescription == null)
			{
				// write the nil attribute

				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

			} else
			{

				xmlWriter.writeCharacters(localWinLossDescription);

			}

			xmlWriter.writeEndElement();
		}
		if (localWinLossReasonTracker)
		{
			if (localWinLossReason == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "WinLossReason", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "WinLossReason");
					}

				} else
				{
					xmlWriter.writeStartElement("WinLossReason");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localWinLossReason.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "WinLossReason"), factory,
						xmlWriter);
			}
		}
		if (localValidNullFieldsTracker)
		{
			if (localValidNullFields == null)
			{

				java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_2";

				if (!namespace2.equals(""))
				{
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null)
					{
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2, "ValidNullFields", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else
					{
						xmlWriter.writeStartElement(namespace2, "ValidNullFields");
					}

				} else
				{
					xmlWriter.writeStartElement("ValidNullFields");
				}

				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
				xmlWriter.writeEndElement();
			} else
			{
				localValidNullFields.serialize(
						new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ValidNullFields"), factory,
						xmlWriter);
			}
		}
		xmlWriter.writeEndElement();

	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException
	{
		if (xmlWriter.getPrefix(namespace) == null)
		{
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);

		}

		xmlWriter.writeAttribute(namespace, attName, attValue);

	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
	{
		if (namespace.equals(""))
		{
			xmlWriter.writeAttribute(attName, attValue);
		} else
		{
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException
	{

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null)
		{
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0)
		{
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else
		{
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals(""))
		{
			xmlWriter.writeAttribute(attName, attributeValue);
		} else
		{
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException
	{
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null)
		{
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null)
			{
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0)
			{
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else
			{
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else
		{
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException
	{

		if (qnames != null)
		{
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++)
			{
				if (i > 0)
				{
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null)
				{
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0))
					{
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0)
					{
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else
					{
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else
				{
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException
	{
		java.lang.String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null)
		{
			prefix = generatePrefix(namespace);

			while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null)
			{
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
			throws org.apache.axis2.databinding.ADBException
	{

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
		attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Opportunity"));
		if (localIDTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "ID"));

			if (localID == null)
			{
				throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
			}
			elementList.add(localID);
		}
		if (localLookupNameTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "LookupName"));

			if (localLookupName != null)
			{
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLookupName));
			} else
			{
				throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
			}
		}
		if (localCreatedTimeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "CreatedTime"));

			if (localCreatedTime != null)
			{
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
			} else
			{
				throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
			}
		}
		if (localUpdatedTimeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "UpdatedTime"));

			if (localUpdatedTime != null)
			{
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
			} else
			{
				throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
			}
		}
		if (localAccountHierarchyTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "AccountHierarchy"));

			elementList.add(localAccountHierarchy == null ? null : localAccountHierarchy);
		}
		if (localAssignedToAccountTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "AssignedToAccount"));

			elementList.add(localAssignedToAccount == null ? null : localAssignedToAccount);
		}
		if (localBannerTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Banner"));

			elementList.add(localBanner == null ? null : localBanner);
		}
		if (localCampaignTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Campaign"));

			elementList.add(localCampaign == null ? null : localCampaign);
		}
		if (localClosedTimeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ClosedTime"));

			elementList.add(localClosedTime == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedTime));
		}
		if (localClosedValueTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ClosedValue"));

			elementList.add(localClosedValue == null ? null : localClosedValue);
		}
		if (localCostOfSaleTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "CostOfSale"));

			elementList.add(localCostOfSale == null ? null : localCostOfSale);
		}
		if (localCustomFieldsTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "CustomFields"));

			if (localCustomFields == null)
			{
				throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
			}
			elementList.add(localCustomFields);
		}
		if (localFileAttachmentsTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachments"));

			elementList.add(localFileAttachments == null ? null : localFileAttachments);
		}
		if (localForecastCloseDateTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ForecastCloseDate"));

			elementList.add(localForecastCloseDate == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localForecastCloseDate));
		}
		if (localInitialContactDateTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "InitialContactDate"));

			elementList.add(localInitialContactDate == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialContactDate));
		}
		if (localInterfaceTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Interface"));

			if (localInterface == null)
			{
				throw new org.apache.axis2.databinding.ADBException("Interface cannot be null!!");
			}
			elementList.add(localInterface);
		}
		if (localLeadRejectDateTimeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectDateTime"));

			elementList.add(localLeadRejectDateTime == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLeadRejectDateTime));
		}
		if (localLeadRejectDescriptionTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectDescription"));

			elementList.add(localLeadRejectDescription == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLeadRejectDescription));
		}
		if (localLeadRejectReasonTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectReason"));

			elementList.add(localLeadRejectReason == null ? null : localLeadRejectReason);
		}
		if (localLostTimeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LostTime"));

			elementList.add(localLostTime == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLostTime));
		}
		if (localManagerCommitTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ManagerCommit"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localManagerCommit));
		}
		if (localManagerValueTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ManagerValue"));

			elementList.add(localManagerValue == null ? null : localManagerValue);
		}
		if (localNameTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Name"));

			elementList.add(localName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
		}
		if (localNotesTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Notes"));

			elementList.add(localNotes == null ? null : localNotes);
		}
		if (localOrganizationTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Organization"));

			elementList.add(localOrganization == null ? null : localOrganization);
		}
		if (localOtherContactsTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "OtherContacts"));

			elementList.add(localOtherContacts == null ? null : localOtherContacts);
		}
		if (localPrimaryContactTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "PrimaryContact"));

			elementList.add(localPrimaryContact == null ? null : localPrimaryContact);
		}
		if (localQuotesTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Quotes"));

			elementList.add(localQuotes == null ? null : localQuotes);
		}
		if (localRecallTimeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "RecallTime"));

			elementList.add(localRecallTime == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecallTime));
		}
		if (localReturnValueTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ReturnValue"));

			elementList.add(localReturnValue == null ? null : localReturnValue);
		}
		if (localSalesRepresentativeCommitTracker)
		{
			elementList.add(
					new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "SalesRepresentativeCommit"));

			elementList.add(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSalesRepresentativeCommit));
		}
		if (localSalesRepresentativeValueTracker)
		{
			elementList
					.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "SalesRepresentativeValue"));

			elementList.add(localSalesRepresentativeValue == null ? null : localSalesRepresentativeValue);
		}
		if (localSourceTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Source"));

			if (localSource == null)
			{
				throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
			}
			elementList.add(localSource);
		}
		if (localStageWithStrategyTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "StageWithStrategy"));

			if (localStageWithStrategy == null)
			{
				throw new org.apache.axis2.databinding.ADBException("StageWithStrategy cannot be null!!");
			}
			elementList.add(localStageWithStrategy);
		}
		if (localStatusWithTypeTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "StatusWithType"));

			if (localStatusWithType == null)
			{
				throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
			}
			elementList.add(localStatusWithType);
		}
		if (localSummaryTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Summary"));

			elementList.add(localSummary == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummary));
		}
		if (localSurveyTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Survey"));

			elementList.add(localSurvey == null ? null : localSurvey);
		}
		if (localTerritoryTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Territory"));

			elementList.add(localTerritory == null ? null : localTerritory);
		}
		if (localTerritoryHierarchyTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "TerritoryHierarchy"));

			elementList.add(localTerritoryHierarchy == null ? null : localTerritoryHierarchy);
		}
		if (localWinLossDescriptionTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "WinLossDescription"));

			elementList.add(localWinLossDescription == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWinLossDescription));
		}
		if (localWinLossReasonTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "WinLossReason"));

			elementList.add(localWinLossReason == null ? null : localWinLossReason);
		}
		if (localValidNullFieldsTracker)
		{
			elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ValidNullFields"));

			elementList.add(localValidNullFields == null ? null : localValidNullFields);
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory
	{

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static Opportunity parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception
		{
			Opportunity object = new Opportunity();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try
			{

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null)
				{
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null)
					{
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1)
						{
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"Opportunity".equals(type))
						{
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (Opportunity) com.rightnow.ws.generic.ExtensionMapper.getTypeObject(nsUri, type,
									reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "ID")
						.equals(reader.getName()))
				{

					object.setID(com.rightnow.ws.base.ID.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "LookupName")
								.equals(reader.getName()))
				{

					java.lang.String content = reader.getElementText();

					object.setLookupName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "CreatedTime")
								.equals(reader.getName()))
				{

					java.lang.String content = reader.getElementText();

					object.setCreatedTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_2", "UpdatedTime")
								.equals(reader.getName()))
				{

					java.lang.String content = reader.getElementText();

					object.setUpdatedTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "AccountHierarchy")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setAccountHierarchy(null);
						reader.next();

						reader.next();

					} else
					{

						object.setAccountHierarchy(com.rightnow.ws.base.NamedIDList.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "AssignedToAccount")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setAssignedToAccount(null);
						reader.next();

						reader.next();

					} else
					{

						object.setAssignedToAccount(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Banner")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setBanner(null);
						reader.next();

						reader.next();

					} else
					{

						object.setBanner(com.rightnow.ws.objects.Banner.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Campaign")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setCampaign(null);
						reader.next();

						reader.next();

					} else
					{

						object.setCampaign(com.rightnow.ws.base.NamedID.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ClosedTime")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setClosedTime(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ClosedValue")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setClosedValue(null);
						reader.next();

						reader.next();

					} else
					{

						object.setClosedValue(com.rightnow.ws.objects.MonetaryValue.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "CostOfSale")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setCostOfSale(null);
						reader.next();

						reader.next();

					} else
					{

						object.setCostOfSale(com.rightnow.ws.objects.MonetaryValue.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "CustomFields")
								.equals(reader.getName()))
				{

					object.setCustomFields(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachments")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setFileAttachments(null);
						reader.next();

						reader.next();

					} else
					{

						object.setFileAttachments(
								com.rightnow.ws.objects.FileAttachmentCommonList.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ForecastCloseDate")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setForecastCloseDate(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "InitialContactDate")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setInitialContactDate(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Interface")
								.equals(reader.getName()))
				{

					object.setInterface(com.rightnow.ws.base.NamedID.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectDateTime")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setLeadRejectDateTime(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectDescription")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setLeadRejectDescription(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectReason")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setLeadRejectReason(null);
						reader.next();

						reader.next();

					} else
					{

						object.setLeadRejectReason(com.rightnow.ws.base.NamedID.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "LostTime")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setLostTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ManagerCommit")
								.equals(reader.getName()))
				{

					java.lang.String content = reader.getElementText();

					object.setManagerCommit(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ManagerValue")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setManagerValue(null);
						reader.next();

						reader.next();

					} else
					{

						object.setManagerValue(com.rightnow.ws.objects.MonetaryValue.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Name")
						.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Notes")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setNotes(null);
						reader.next();

						reader.next();

					} else
					{

						object.setNotes(com.rightnow.ws.objects.NoteList.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Organization")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setOrganization(null);
						reader.next();

						reader.next();

					} else
					{

						object.setOrganization(com.rightnow.ws.base.NamedID.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "OtherContacts")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setOtherContacts(null);
						reader.next();

						reader.next();

					} else
					{

						object.setOtherContacts(com.rightnow.ws.objects.OpportunityContactList.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "PrimaryContact")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setPrimaryContact(null);
						reader.next();

						reader.next();

					} else
					{

						object.setPrimaryContact(com.rightnow.ws.objects.OpportunityContact.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Quotes")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setQuotes(null);
						reader.next();

						reader.next();

					} else
					{

						object.setQuotes(com.rightnow.ws.objects.QuoteList.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "RecallTime")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setRecallTime(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ReturnValue")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setReturnValue(null);
						reader.next();

						reader.next();

					} else
					{

						object.setReturnValue(com.rightnow.ws.objects.MonetaryValue.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2",
						"SalesRepresentativeCommit").equals(reader.getName()))
				{

					java.lang.String content = reader.getElementText();

					object.setSalesRepresentativeCommit(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "SalesRepresentativeValue")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setSalesRepresentativeValue(null);
						reader.next();

						reader.next();

					} else
					{

						object.setSalesRepresentativeValue(com.rightnow.ws.objects.MonetaryValue.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Source")
								.equals(reader.getName()))
				{

					object.setSource(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "StageWithStrategy")
								.equals(reader.getName()))
				{

					object.setStageWithStrategy(com.rightnow.ws.objects.StageWithStrategy.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "StatusWithType")
								.equals(reader.getName()))
				{

					object.setStatusWithType(com.rightnow.ws.objects.StatusWithType.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Summary")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setSummary(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Survey")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setSurvey(null);
						reader.next();

						reader.next();

					} else
					{

						object.setSurvey(com.rightnow.ws.base.NamedID.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "Territory")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setTerritory(null);
						reader.next();

						reader.next();

					} else
					{

						object.setTerritory(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "TerritoryHierarchy")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setTerritoryHierarchy(null);
						reader.next();

						reader.next();

					} else
					{

						object.setTerritoryHierarchy(com.rightnow.ws.base.NamedIDList.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "WinLossDescription")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue))
					{

						java.lang.String content = reader.getElementText();

						object.setWinLossDescription(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else
					{

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "WinLossReason")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setWinLossReason(null);
						reader.next();

						reader.next();

					} else
					{

						object.setWinLossReason(com.rightnow.ws.base.NamedID.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_2", "ValidNullFields")
								.equals(reader.getName()))
				{

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue))
					{
						object.setValidNullFields(null);
						reader.next();

						reader.next();

					} else
					{

						object.setValidNullFields(
								com.rightnow.ws.nullfields.OpportunityNullFields.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else
				{

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getLocalName());

			} catch (javax.xml.stream.XMLStreamException e)
			{
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
