package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskExchangeInputModel
 */
public class BQOperationalRiskExchangeInputModel   {
  private String iTSystemAssessmentInstanceReference = null;

  private String operationalRiskInstanceReference = null;

  private Object operationalRiskExchangeActionTaskRecord = null;

  private CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest operationalRiskExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Operational Risk instance 
   * @return operationalRiskInstanceReference
  **/

  public String getOperationalRiskInstanceReference() {
    return operationalRiskInstanceReference;
  }

  public void setOperationalRiskInstanceReference(String operationalRiskInstanceReference) {
    this.operationalRiskInstanceReference = operationalRiskInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return operationalRiskExchangeActionTaskRecord
  **/

  public Object getOperationalRiskExchangeActionTaskRecord() {
    return operationalRiskExchangeActionTaskRecord;
  }

  public void setOperationalRiskExchangeActionTaskRecord(Object operationalRiskExchangeActionTaskRecord) {
    this.operationalRiskExchangeActionTaskRecord = operationalRiskExchangeActionTaskRecord;
  }


  /**
   * Get operationalRiskExchangeActionRequest
   * @return operationalRiskExchangeActionRequest
  **/

  public CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest getOperationalRiskExchangeActionRequest() {
    return operationalRiskExchangeActionRequest;
  }

  public void setOperationalRiskExchangeActionRequest(CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest operationalRiskExchangeActionRequest) {
    this.operationalRiskExchangeActionRequest = operationalRiskExchangeActionRequest;
  }


}

