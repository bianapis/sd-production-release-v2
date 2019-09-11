package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRiskExchangeOutputModelITSystemAssessmentInstanceRecord;
import org.bian.dto.BQProductionRiskExchangeOutputModelProductionRiskInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionRiskExchangeOutputModel
 */
public class BQProductionRiskExchangeOutputModel   {
  private BQProductionRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private BQProductionRiskExchangeOutputModelProductionRiskInstanceRecord productionRiskInstanceRecord = null;

  private String productionRiskExchangeActionTaskReference = null;

  private Object productionRiskExchangeActionTaskRecord = null;

  private String productionRiskExchangeActionResponse = null;

  private String productionRiskInstanceStatus = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public BQProductionRiskExchangeOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(BQProductionRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * Get productionRiskInstanceRecord
   * @return productionRiskInstanceRecord
  **/

  public BQProductionRiskExchangeOutputModelProductionRiskInstanceRecord getProductionRiskInstanceRecord() {
    return productionRiskInstanceRecord;
  }

  public void setProductionRiskInstanceRecord(BQProductionRiskExchangeOutputModelProductionRiskInstanceRecord productionRiskInstanceRecord) {
    this.productionRiskInstanceRecord = productionRiskInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Risk instance exchange service call 
   * @return productionRiskExchangeActionTaskReference
  **/

  public String getProductionRiskExchangeActionTaskReference() {
    return productionRiskExchangeActionTaskReference;
  }

  public void setProductionRiskExchangeActionTaskReference(String productionRiskExchangeActionTaskReference) {
    this.productionRiskExchangeActionTaskReference = productionRiskExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productionRiskExchangeActionResponse
  **/

  public String getProductionRiskExchangeActionResponse() {
    return productionRiskExchangeActionResponse;
  }

  public void setProductionRiskExchangeActionResponse(String productionRiskExchangeActionResponse) {
    this.productionRiskExchangeActionResponse = productionRiskExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Production Risk instance (e.g. accepted, rejected, verified) 
   * @return productionRiskInstanceStatus
  **/

  public String getProductionRiskInstanceStatus() {
    return productionRiskInstanceStatus;
  }

  public void setProductionRiskInstanceStatus(String productionRiskInstanceStatus) {
    this.productionRiskInstanceStatus = productionRiskInstanceStatus;
  }


}

