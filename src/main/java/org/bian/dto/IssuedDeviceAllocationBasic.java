package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * This is the top level/common definition of the issued item with referneced device specific properties listed in more detail below
 */
public class IssuedDeviceAllocationBasic   {
  private String issuedDevicePasswordReference = null;

  private Object issuedDevicePasswordRecord = null;

  private String issuedDeviceQuestionReference = null;

  private Object issuedDeviceQuestionRecord = null;

  private String issuedDeviceDeviceReference = null;

  private Object issuedDeviceDeviceRecord = null;

  private String issuedDeviceReaderReference = null;

  private Object issuedDeviceReaderRecord = null;

  private String issuedDeviceChequeReference = null;

  private Object issuedDeviceChequeRecord = null;

  private String customerReference = null;


  /**
   * `status: Provisionally Registered` bian-reference: AdministeredDevice 
   * @return issuedDevicePasswordReference
  **/

  public String getIssuedDevicePasswordReference() {
    return issuedDevicePasswordReference;
  }

  public void setIssuedDevicePasswordReference(String issuedDevicePasswordReference) {
    this.issuedDevicePasswordReference = issuedDevicePasswordReference;
  }


  /**
   * `status: Provisionally Registered` general-info: \"Record of issued device details\" 
   * @return issuedDevicePasswordRecord
  **/

  public Object getIssuedDevicePasswordRecord() {
    return issuedDevicePasswordRecord;
  }

  public void setIssuedDevicePasswordRecord(Object issuedDevicePasswordRecord) {
    this.issuedDevicePasswordRecord = issuedDevicePasswordRecord;
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
   * `status: Provisionally Registered` general-info: \"Record of issued device details\" 
   * @return issuedDeviceQuestionRecord
  **/

  public Object getIssuedDeviceQuestionRecord() {
    return issuedDeviceQuestionRecord;
  }

  public void setIssuedDeviceQuestionRecord(Object issuedDeviceQuestionRecord) {
    this.issuedDeviceQuestionRecord = issuedDeviceQuestionRecord;
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


}

