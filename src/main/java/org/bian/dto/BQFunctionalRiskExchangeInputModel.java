package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskExchangeInputModel
 */
public class BQFunctionalRiskExchangeInputModel   {
  private String iTSystemAssessmentInstanceReference = null;

  private String functionalRiskInstanceReference = null;

  private Object functionalRiskExchangeActionTaskRecord = null;

  private CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest functionalRiskExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent IT System Assessment instance 
   * @return iTSystemAssessmentInstanceReference
  **/

  public String getITSystemAssessmentInstanceReference() {
    return iTSystemAssessmentInstanceReference;
  }

  public void setITSystemAssessmentInstanceReference(String iTSystemAssessmentInstanceReference) {
    this.iTSystemAssessmentInstanceReference = iTSystemAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Risk instance 
   * @return functionalRiskInstanceReference
  **/

  public String getFunctionalRiskInstanceReference() {
    return functionalRiskInstanceReference;
  }

  public void setFunctionalRiskInstanceReference(String functionalRiskInstanceReference) {
    this.functionalRiskInstanceReference = functionalRiskInstanceReference;
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
   * Get functionalRiskExchangeActionRequest
   * @return functionalRiskExchangeActionRequest
  **/

  public CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest getFunctionalRiskExchangeActionRequest() {
    return functionalRiskExchangeActionRequest;
  }

  public void setFunctionalRiskExchangeActionRequest(CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest functionalRiskExchangeActionRequest) {
    this.functionalRiskExchangeActionRequest = functionalRiskExchangeActionRequest;
  }


}

