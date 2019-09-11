package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBusinessRiskExchangeOutputModelBusinessRiskInstanceRecord;
import org.bian.dto.BQBusinessRiskExchangeOutputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskExchangeOutputModel
 */
public class BQBusinessRiskExchangeOutputModel   {
  private BQBusinessRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private BQBusinessRiskExchangeOutputModelBusinessRiskInstanceRecord businessRiskInstanceRecord = null;

  private String businessRiskExchangeActionTaskReference = null;

  private Object businessRiskExchangeActionTaskRecord = null;

  private String businessRiskExchangeActionResponse = null;

  private String businessRiskInstanceStatus = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public BQBusinessRiskExchangeOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(BQBusinessRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * Get businessRiskInstanceRecord
   * @return businessRiskInstanceRecord
  **/

  public BQBusinessRiskExchangeOutputModelBusinessRiskInstanceRecord getBusinessRiskInstanceRecord() {
    return businessRiskInstanceRecord;
  }

  public void setBusinessRiskInstanceRecord(BQBusinessRiskExchangeOutputModelBusinessRiskInstanceRecord businessRiskInstanceRecord) {
    this.businessRiskInstanceRecord = businessRiskInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Risk instance exchange service call 
   * @return businessRiskExchangeActionTaskReference
  **/

  public String getBusinessRiskExchangeActionTaskReference() {
    return businessRiskExchangeActionTaskReference;
  }

  public void setBusinessRiskExchangeActionTaskReference(String businessRiskExchangeActionTaskReference) {
    this.businessRiskExchangeActionTaskReference = businessRiskExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return businessRiskExchangeActionTaskRecord
  **/

  public Object getBusinessRiskExchangeActionTaskRecord() {
    return businessRiskExchangeActionTaskRecord;
  }

  public void setBusinessRiskExchangeActionTaskRecord(Object businessRiskExchangeActionTaskRecord) {
    this.businessRiskExchangeActionTaskRecord = businessRiskExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return businessRiskExchangeActionResponse
  **/

  public String getBusinessRiskExchangeActionResponse() {
    return businessRiskExchangeActionResponse;
  }

  public void setBusinessRiskExchangeActionResponse(String businessRiskExchangeActionResponse) {
    this.businessRiskExchangeActionResponse = businessRiskExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Business Risk instance (e.g. accepted, rejected, verified) 
   * @return businessRiskInstanceStatus
  **/

  public String getBusinessRiskInstanceStatus() {
    return businessRiskInstanceStatus;
  }

  public void setBusinessRiskInstanceStatus(String businessRiskInstanceStatus) {
    this.businessRiskInstanceStatus = businessRiskInstanceStatus;
  }


}

