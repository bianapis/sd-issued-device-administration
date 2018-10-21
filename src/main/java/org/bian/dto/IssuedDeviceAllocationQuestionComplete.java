package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceAllocationQuestionComplete
 */
public class IssuedDeviceAllocationQuestionComplete   {
  private String allocationReference = null;

  private String issuedDeviceQuestionReference = null;

  private String issuedDeviceType = null;

  private Object issuedDeviceQuestionRecord = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String associatedPermissions = null;

  private String issueDate = null;

  private String validFromToDate = null;

  private String formatRules = null;

  private String recentValues = null;

  private String requestText = null;

  private String responseText = null;

  private String usageLog = null;

  private String issuedDeviceStatus = null;


  /**
   * `status: Provisionally Registered` 
   * @return allocationReference
  **/

  public String getAllocationReference() {
    return allocationReference;
  }

  public void setAllocationReference(String allocationReference) {
    this.allocationReference = allocationReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice 
   * @return issuedDeviceQuestionReference
  **/

  public String getIssuedDeviceQuestionReference() {
    return issuedDeviceQuestionReference;
  }

  public void setIssuedDeviceQuestionReference(String issuedDeviceQuestionReference) {
    this.issuedDeviceQuestionReference = issuedDeviceQuestionReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).Type 
   * @return issuedDeviceType
  **/

  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }


  /**
   * `status: Provisionally Registered` general-info: \"record of device attributes\" 
   * @return issuedDeviceQuestionRecord
  **/

  public Object getIssuedDeviceQuestionRecord() {
    return issuedDeviceQuestionRecord;
  }

  public void setIssuedDeviceQuestionRecord(Object issuedDeviceQuestionRecord) {
    this.issuedDeviceQuestionRecord = issuedDeviceQuestionRecord;
  }


  /**
   * general-info: \"Assigned to\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.User(as Customer)  `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).PreviousAllocation.User(as Customer) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * general-info: \"Linked products and services\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.ProductUsingResource `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).PreviousAllocation.ProductUsingResource 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * general-info: \"Access/usage entitlement - e.g. as seen in PSD2 - linked to product instance\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceRestriction.AllowedRoleType `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceRestriction.ProhibitedRoleType `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceRestriction.AllowedRoleInstance `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceRestriction.ProhibitedRoleInstance 
   * @return associatedPermissions
  **/

  public String getAssociatedPermissions() {
    return associatedPermissions;
  }

  public void setAssociatedPermissions(String associatedPermissions) {
    this.associatedPermissions = associatedPermissions;
  }


  /**
   * Get issueDate
   * @return issueDate
  **/

  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ValidPeriod 
   * @return validFromToDate
  **/

  public String getValidFromToDate() {
    return validFromToDate;
  }

  public void setValidFromToDate(String validFromToDate) {
    this.validFromToDate = validFromToDate;
  }


  /**
   * `status: Provisionally Registered` general-info: \"Minimum requirements\" 
   * @return formatRules
  **/

  public String getFormatRules() {
    return formatRules;
  }

  public void setFormatRules(String formatRules) {
    this.formatRules = formatRules;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.User(as Customer).Player(as Person).PersonProfile.StoredAuthenticationData 
   * @return recentValues
  **/

  public String getRecentValues() {
    return recentValues;
  }

  public void setRecentValues(String recentValues) {
    this.recentValues = recentValues;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.User(as Customer).Player(as Person).PersonProfile.StoredAuthenticationData general-info: \"For secret questions/access prompts\" 
   * @return requestText
  **/

  public String getRequestText() {
    return requestText;
  }

  public void setRequestText(String requestText) {
    this.requestText = requestText;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.User.Player(as Person).PersonProfile.StoredAuthenticationData general-info: \"Stored value checked against provided answer - encrypted\" 
   * @return responseText
  **/

  public String getResponseText() {
    return responseText;
  }

  public void setResponseText(String responseText) {
    this.responseText = responseText;
  }


  /**
   * general-info: \"Timing and frequency of access/use - includes errors\" `status: Provisionally Registered` bian-reference: AdministeredDevice.NormalEvent `status: Provisionally Registered` bian-reference: AdministeredDevice.FailureEvent 
   * @return usageLog
  **/

  public String getUsageLog() {
    return usageLog;
  }

  public void setUsageLog(String usageLog) {
    this.usageLog = usageLog;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).Status general-info: \"ACTIVE, WATCH, SUSPENDED, TERMINATED, etc.\" 
   * @return issuedDeviceStatus
  **/

  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


}

