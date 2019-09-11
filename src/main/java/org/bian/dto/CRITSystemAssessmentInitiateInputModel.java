package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentInitiateInputModel
 */
public class CRITSystemAssessmentInitiateInputModel   {
  private String productionReleaseServicingSessionReference = null;

  private Object iTSystemAssessmentInitiateActionRecord = null;

  private String iTSystemAssessmentInstanceStatus = null;

  private CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productionReleaseServicingSessionReference
  **/

  public String getProductionReleaseServicingSessionReference() {
    return productionReleaseServicingSessionReference;
  }

  public void setProductionReleaseServicingSessionReference(String productionReleaseServicingSessionReference) {
    this.productionReleaseServicingSessionReference = productionReleaseServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return iTSystemAssessmentInitiateActionRecord
  **/

  public Object getITSystemAssessmentInitiateActionRecord() {
    return iTSystemAssessmentInitiateActionRecord;
  }

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

  public void setITSystemAssessmentInstanceStatus(String iTSystemAssessmentInstanceStatus) {
    this.iTSystemAssessmentInstanceStatus = iTSystemAssessmentInstanceStatus;
  }


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }

  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


}

