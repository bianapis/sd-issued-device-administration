package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceAllocationChequeComplete
 */
public class IssuedDeviceAllocationChequeComplete   {
  private String allocationReference = null;

  private String issuedDeviceChequeReference = null;

  private String issuedDeviceType = null;

  private Object issuedDeviceChequeRecord = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String issuedDeviceTemplateOrValues = null;

  private String issueDate = null;

  private String issueLocation = null;

  private String validFromToDate = null;

  private String sequenceNumber = null;

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
   * @return issuedDeviceChequeReference
  **/

  public String getIssuedDeviceChequeReference() {
    return issuedDeviceChequeReference;
  }

  public void setIssuedDeviceChequeReference(String issuedDeviceChequeReference) {
    this.issuedDeviceChequeReference = issuedDeviceChequeReference;
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
   * @return issuedDeviceChequeRecord
  **/

  public Object getIssuedDeviceChequeRecord() {
    return issuedDeviceChequeRecord;
  }

  public void setIssuedDeviceChequeRecord(Object issuedDeviceChequeRecord) {
    this.issuedDeviceChequeRecord = issuedDeviceChequeRecord;
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
   * general-info: \"Linked account\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).CurrentAllocation.ProductUsingResource `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).PreviousAllocation.ProductUsingResource 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return issuedDeviceTemplateOrValues
  **/

  public String getIssuedDeviceTemplateOrValues() {
    return issuedDeviceTemplateOrValues;
  }

  public void setIssuedDeviceTemplateOrValues(String issuedDeviceTemplateOrValues) {
    this.issuedDeviceTemplateOrValues = issuedDeviceTemplateOrValues;
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
   * general-info: \"Cheque number range issued\" `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).ResourceIdentification.Identification `status: Provisionally Registered` bian-reference: AdministeredDevice(asResource).ResourceIdentification.IdentificationType 
   * @return sequenceNumber
  **/

  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice(as Resource).Status general-info: \"OPEN, CASHED, CANCELLED, ETC\" 
   * @return issuedDeviceStatus
  **/

  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


}

