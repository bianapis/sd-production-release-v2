package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentUpdateInputModel
 */
public class CRITSystemAssessmentUpdateInputModel   {
  private String productionReleaseServicingSessionReference = null;

  private String iTSystemAssessmentInstanceReference = null;

  private CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private Object iTSystemAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT System Assessment instance 
   * @return iTSystemAssessmentInstanceReference
  **/

  public String getITSystemAssessmentInstanceReference() {
    return iTSystemAssessmentInstanceReference;
  }

  public void setITSystemAssessmentInstanceReference(String iTSystemAssessmentInstanceReference) {
    this.iTSystemAssessmentInstanceReference = iTSystemAssessmentInstanceReference;
  }


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }

  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return iTSystemAssessmentUpdateActionTaskRecord
  **/

  public Object getITSystemAssessmentUpdateActionTaskRecord() {
    return iTSystemAssessmentUpdateActionTaskRecord;
  }

  public void setITSystemAssessmentUpdateActionTaskRecord(Object iTSystemAssessmentUpdateActionTaskRecord) {
    this.iTSystemAssessmentUpdateActionTaskRecord = iTSystemAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

