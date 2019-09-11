package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQProductionRiskExchangeInputModel
 */
public class BQProductionRiskExchangeInputModel   {
  private String iTSystemAssessmentInstanceReference = null;

  private String productionRiskInstanceReference = null;

  private Object productionRiskExchangeActionTaskRecord = null;

  private CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest productionRiskExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Risk instance 
   * @return productionRiskInstanceReference
  **/

  public String getProductionRiskInstanceReference() {
    return productionRiskInstanceReference;
  }

  public void setProductionRiskInstanceReference(String productionRiskInstanceReference) {
    this.productionRiskInstanceReference = productionRiskInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productionRiskExchangeActionTaskRecord
  **/

  public Object getProductionRiskExchangeActionTaskRecord() {
    return productionRiskExchangeActionTaskRecord;
  }

  public void setProductionRiskExchangeActionTaskRecord(Object productionRiskExchangeActionTaskRecord) {
    this.productionRiskExchangeActionTaskRecord = productionRiskExchangeActionTaskRecord;
  }


  /**
   * Get productionRiskExchangeActionRequest
   * @return productionRiskExchangeActionRequest
  **/

  public CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest getProductionRiskExchangeActionRequest() {
    return productionRiskExchangeActionRequest;
  }

  public void setProductionRiskExchangeActionRequest(CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest productionRiskExchangeActionRequest) {
    this.productionRiskExchangeActionRequest = productionRiskExchangeActionRequest;
  }


}

