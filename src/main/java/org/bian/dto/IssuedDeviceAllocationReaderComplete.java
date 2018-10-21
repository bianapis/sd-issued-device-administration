package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceAllocationReaderComplete
 */
public class IssuedDeviceAllocationReaderComplete   {
  private String allocationReference = null;

  private String issuedDeviceReaderReference = null;

  private String issuedDeviceType = null;

  private Object issuedDeviceReaderRecord = null;

  private String issuedDeviceSerialNumber = null;

  private String versionNumber = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String associatedPermissions = null;

  private String issueDate = null;

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
   * @return issuedDeviceReaderReference
  **/

  public String getIssuedDeviceReaderReference() {
    return issuedDeviceReaderReference;
  }

  public void setIssuedDeviceReaderReference(String issuedDeviceReaderReference) {
    this.issuedDeviceReaderReference = issuedDeviceReaderReference;
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
   * @return issuedDeviceReaderRecord
  **/

  public Object getIssuedDeviceReaderRecord() {
    return issuedDeviceReaderRecord;
  }

  public void setIssuedDeviceReaderRecord(Object issuedDeviceReaderRecord) {
    this.issuedDeviceReaderRecord = issuedDeviceReaderRecord;
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
   * `status: Provisionally Registered` bian-reference: AdministeredDevice.Version general-info: \"Reader device operating system\" 
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
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceRestriction  general-info: \"Access/usage entitlement - e.g. location\" 
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
   * general-info: \"Stored values such as mag strip/chip settings\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).AvailableOption `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).SelectedOption 
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
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).Status general-info: \"IN-USE, OBSOLETE, UNDER REPAIR, ETC.\" 
   * @return issuedDeviceStatus
  **/

  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


}

