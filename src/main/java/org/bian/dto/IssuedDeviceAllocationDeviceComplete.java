package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceAllocationDeviceComplete
 */
public class IssuedDeviceAllocationDeviceComplete   {
  private String allocationReference = null;

  private String issuedDeviceDeviceReference = null;

  private String issuedDeviceType = null;

  private Object issuedDeviceDeviceRecord = null;

  private String issuedDeviceSerialNumber = null;

  private String versionNumber = null;

  private String customerReference = null;

  private String customerCustomizationReference = null;

  private String productInstanceReference = null;

  private String associatedPermissions = null;

  private String issueDate = null;

  private String deliveryMethod = null;

  private String issueLocation = null;

  private String validFromToDate = null;

  private Object issuedDeviceConfiguration = null;

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
   * @return issuedDeviceDeviceReference
  **/

  public String getIssuedDeviceDeviceReference() {
    return issuedDeviceDeviceReference;
  }

  public void setIssuedDeviceDeviceReference(String issuedDeviceDeviceReference) {
    this.issuedDeviceDeviceReference = issuedDeviceDeviceReference;
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
   * `status: Provisionally Registered` general-info: \"Record of issued device details\" 
   * @return issuedDeviceDeviceRecord
  **/

  public Object getIssuedDeviceDeviceRecord() {
    return issuedDeviceDeviceRecord;
  }

  public void setIssuedDeviceDeviceRecord(Object issuedDeviceDeviceRecord) {
    this.issuedDeviceDeviceRecord = issuedDeviceDeviceRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceIdentification.Identification `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceIdentification.IdentificationType 
   * @return issuedDeviceSerialNumber
  **/

  public String getIssuedDeviceSerialNumber() {
    return issuedDeviceSerialNumber;
  }

  public void setIssuedDeviceSerialNumber(String issuedDeviceSerialNumber) {
    this.issuedDeviceSerialNumber = issuedDeviceSerialNumber;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice.Version general-info: \"Operating system for smart devices\" 
   * @return versionNumber
  **/

  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
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
   * general-info: \"For device personalization\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).AvailableOption `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.SelectedOption `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).PreviousAllocation.SelectedOption 
   * @return customerCustomizationReference
  **/

  public String getCustomerCustomizationReference() {
    return customerCustomizationReference;
  }

  public void setCustomerCustomizationReference(String customerCustomizationReference) {
    this.customerCustomizationReference = customerCustomizationReference;
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
   * `status: Provisionally Registered` bian-reference: AdministeredDevice.ResourceRestriction general-info: \"Access/usage entitlement - e.g. as seen in PSD2 - linked to product instance\" 
   * @return associatedPermissions
  **/

  public String getAssociatedPermissions() {
    return associatedPermissions;
  }

  public void setAssociatedPermissions(String associatedPermissions) {
    this.associatedPermissions = associatedPermissions;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.AllocationPeriod.FromDateTime general-info: \"When was the Device issued\" 
   * @return issueDate
  **/

  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  /**
   * `status: Provisionally Registered` general-info: \"e.g. mail, courrier,collect at branch, kiosk\" 
   * @return deliveryMethod
  **/

  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  /**
   * `status: Registered` general-info: \"Delivery address\" bian-reference: AdministeredDevice(as Resource).CurrentAllocation.User(as Party).Location iso-link-1: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909) `status: Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.User(as System).Location iso-link-2: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_ExpjIMTGEeChad0JzLk7QA_159768178/elements/_ExpjI8TGEeChad0JzLk7QA_-1786346298) 
   * @return issueLocation
  **/

  public String getIssueLocation() {
    return issueLocation;
  }

  public void setIssueLocation(String issueLocation) {
    this.issueLocation = issueLocation;
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
   * general-info: \"Stored values such as mag strip/chip settings\" `status: Provisionally Registered` bian-reference: AdministeredDevice.StoredData.BinaryData `status: Provisionally Registered` bian-reference: AdministeredDevice.StoredData.TexualData `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).SelectedOption 
   * @return issuedDeviceConfiguration
  **/

  public Object getIssuedDeviceConfiguration() {
    return issuedDeviceConfiguration;
  }

  public void setIssuedDeviceConfiguration(Object issuedDeviceConfiguration) {
    this.issuedDeviceConfiguration = issuedDeviceConfiguration;
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

