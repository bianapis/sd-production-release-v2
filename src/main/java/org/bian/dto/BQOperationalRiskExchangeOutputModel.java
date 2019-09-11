package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalRiskExchangeOutputModelITSystemAssessmentInstanceRecord;
import org.bian.dto.BQOperationalRiskExchangeOutputModelOperationalRiskInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskExchangeOutputModel
 */
public class BQOperationalRiskExchangeOutputModel   {
  private BQOperationalRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private BQOperationalRiskExchangeOutputModelOperationalRiskInstanceRecord operationalRiskInstanceRecord = null;

  private String operationalRiskExchangeActionTaskReference = null;

  private Object operationalRiskExchangeActionTaskRecord = null;

  private String operationalRiskExchangeActionResponse = null;

  private String operationalRiskInstanceStatus = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public BQOperationalRiskExchangeOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
 
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(BQOperationalRiskExchangeOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * Get operationalRiskInstanceRecord
   * @return operationalRiskInstanceRecord
  **/

  public BQOperationalRiskExchangeOutputModelOperationalRiskInstanceRecord getOperationalRiskInstanceRecord() {
    return operationalRiskInstanceRecord;
  }

  public void setOperationalRiskInstanceRecord(BQOperationalRiskExchangeOutputModelOperationalRiskInstanceRecord operationalRiskInstanceRecord) {
    this.operationalRiskInstanceRecord = operationalRiskInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operational Risk instance exchange service call 
   * @return operationalRiskExchangeActionTaskReference
  **/

  public String getOperationalRiskExchangeActionTaskReference() {
    return operationalRiskExchangeActionTaskReference;
  }

  public void setOperationalRiskExchangeActionTaskReference(String operationalRiskExchangeActionTaskReference) {
    this.operationalRiskExchangeActionTaskReference = operationalRiskExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return operationalRiskExchangeActionResponse
  **/

  public String getOperationalRiskExchangeActionResponse() {
    return operationalRiskExchangeActionResponse;
  }

  public void setOperationalRiskExchangeActionResponse(String operationalRiskExchangeActionResponse) {
    this.operationalRiskExchangeActionResponse = operationalRiskExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Operational Risk instance (e.g. accepted, rejected, verified) 
   * @return operationalRiskInstanceStatus
  **/

  public String getOperationalRiskInstanceStatus() {
    return operationalRiskInstanceStatus;
  }

  public void setOperationalRiskInstanceStatus(String operationalRiskInstanceStatus) {
    this.operationalRiskInstanceStatus = operationalRiskInstanceStatus;
  }


}

