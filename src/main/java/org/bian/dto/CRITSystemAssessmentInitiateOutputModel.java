package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentInitiateOutputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentInitiateOutputModel
 */
public class CRITSystemAssessmentInitiateOutputModel   {
  private String iTSystemAssessmentInstanceReference = null;

  private String iTSystemAssessmentInitiateActionReference = null;

  private Object iTSystemAssessmentInitiateActionRecord = null;

  private String iTSystemAssessmentInstanceStatus = null;

  private CRITSystemAssessmentInitiateOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT System Assessment instance 
   * @return iTSystemAssessmentInstanceReference
  **/

  public String getITSystemAssessmentInstanceReference() {
    return iTSystemAssessmentInstanceReference;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceReference")
  public void setITSystemAssessmentInstanceReference(String iTSystemAssessmentInstanceReference) {
    this.iTSystemAssessmentInstanceReference = iTSystemAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return iTSystemAssessmentInitiateActionReference
  **/

  public String getITSystemAssessmentInitiateActionReference() {
    return iTSystemAssessmentInitiateActionReference;
  }
   
  @JsonProperty("iTSystemAssessmentInitiateActionReference")
  public void setITSystemAssessmentInitiateActionReference(String iTSystemAssessmentInitiateActionReference) {
    this.iTSystemAssessmentInitiateActionReference = iTSystemAssessmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return iTSystemAssessmentInitiateActionRecord
  **/

  public Object getITSystemAssessmentInitiateActionRecord() {
    return iTSystemAssessmentInitiateActionRecord;
  }
   
  @JsonProperty("iTSystemAssessmentInitiateActionRecord")
  public void setITSystemAssessmentInitiateActionRecord(Object iTSystemAssessmentInitiateActionRecord) {
    this.iTSystemAssessmentInitiateActionRecord = iTSystemAssessmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the IT System Assessment instance (e.g. initialised, pending, active) 
   * @return iTSystemAssessmentInstanceStatus
  **/

  public String getITSystemAssessmentInstanceStatus() {
    return iTSystemAssessmentInstanceStatus;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceStatus")
  public void setITSystemAssessmentInstanceStatus(String iTSystemAssessmentInstanceStatus) {
    this.iTSystemAssessmentInstanceStatus = iTSystemAssessmentInstanceStatus;
  }


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentInitiateOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentInitiateOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


}

