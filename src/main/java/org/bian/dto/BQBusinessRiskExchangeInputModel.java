package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskExchangeInputModel
 */
public class BQBusinessRiskExchangeInputModel   {
  private String iTSystemAssessmentInstanceReference = null;

  private String businessRiskInstanceReference = null;

  private Object businessRiskExchangeActionTaskRecord = null;

  private CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest businessRiskExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Business Risk instance 
   * @return businessRiskInstanceReference
  **/

  public String getBusinessRiskInstanceReference() {
    return businessRiskInstanceReference;
  }

  public void setBusinessRiskInstanceReference(String businessRiskInstanceReference) {
    this.businessRiskInstanceReference = businessRiskInstanceReference;
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
   * Get businessRiskExchangeActionRequest
   * @return businessRiskExchangeActionRequest
  **/

  public CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest getBusinessRiskExchangeActionRequest() {
    return businessRiskExchangeActionRequest;
  }

  public void setBusinessRiskExchangeActionRequest(CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest businessRiskExchangeActionRequest) {
    this.businessRiskExchangeActionRequest = businessRiskExchangeActionRequest;
  }


}

