package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRiskExchangeOutputModelFunctionalRiskInstanceRecord;
import org.bian.dto.BQFunctionalRiskExchangeOutputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskExchangeOutputModel
 */
public class BQFunctionalRiskExchangeOutputModel   {
  private BQFunctionalRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private BQFunctionalRiskExchangeOutputModelFunctionalRiskInstanceRecord functionalRiskInstanceRecord = null;

  private String functionalRiskExchangeActionTaskReference = null;

  private Object functionalRiskExchangeActionTaskRecord = null;

  private String functionalRiskExchangeActionResponse = null;

  private String functionalRiskInstanceStatus = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public BQFunctionalRiskExchangeOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(BQFunctionalRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * Get functionalRiskInstanceRecord
   * @return functionalRiskInstanceRecord
  **/

  public BQFunctionalRiskExchangeOutputModelFunctionalRiskInstanceRecord getFunctionalRiskInstanceRecord() {
    return functionalRiskInstanceRecord;
  }

  public void setFunctionalRiskInstanceRecord(BQFunctionalRiskExchangeOutputModelFunctionalRiskInstanceRecord functionalRiskInstanceRecord) {
    this.functionalRiskInstanceRecord = functionalRiskInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Risk instance exchange service call 
   * @return functionalRiskExchangeActionTaskReference
  **/

  public String getFunctionalRiskExchangeActionTaskReference() {
    return functionalRiskExchangeActionTaskReference;
  }

  public void setFunctionalRiskExchangeActionTaskReference(String functionalRiskExchangeActionTaskReference) {
    this.functionalRiskExchangeActionTaskReference = functionalRiskExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return functionalRiskExchangeActionTaskRecord
  **/

  public Object getFunctionalRiskExchangeActionTaskRecord() {
    return functionalRiskExchangeActionTaskRecord;
  }

  public void setFunctionalRiskExchangeActionTaskRecord(Object functionalRiskExchangeActionTaskRecord) {
    this.functionalRiskExchangeActionTaskRecord = functionalRiskExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return functionalRiskExchangeActionResponse
  **/

  public String getFunctionalRiskExchangeActionResponse() {
    return functionalRiskExchangeActionResponse;
  }

  public void setFunctionalRiskExchangeActionResponse(String functionalRiskExchangeActionResponse) {
    this.functionalRiskExchangeActionResponse = functionalRiskExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Functional Risk instance (e.g. accepted, rejected, verified) 
   * @return functionalRiskInstanceStatus
  **/

  public String getFunctionalRiskInstanceStatus() {
    return functionalRiskInstanceStatus;
  }

  public void setFunctionalRiskInstanceStatus(String functionalRiskInstanceStatus) {
    this.functionalRiskInstanceStatus = functionalRiskInstanceStatus;
  }


}

