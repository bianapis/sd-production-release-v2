package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentExchangeInputModel
 */
public class CRITSystemAssessmentExchangeInputModel   {
  private String productionReleaseServicingSessionReference = null;

  private String iTSystemAssessmentInstanceReference = null;

  private Object iTSystemAssessmentExchangeActionTaskRecord = null;

  private CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest iTSystemAssessmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return iTSystemAssessmentExchangeActionTaskRecord
  **/

  public Object getITSystemAssessmentExchangeActionTaskRecord() {
    return iTSystemAssessmentExchangeActionTaskRecord;
  }

  public void setITSystemAssessmentExchangeActionTaskRecord(Object iTSystemAssessmentExchangeActionTaskRecord) {
    this.iTSystemAssessmentExchangeActionTaskRecord = iTSystemAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get iTSystemAssessmentExchangeActionRequest
   * @return iTSystemAssessmentExchangeActionRequest
  **/

  public CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest getITSystemAssessmentExchangeActionRequest() {
    return iTSystemAssessmentExchangeActionRequest;
  }

  public void setITSystemAssessmentExchangeActionRequest(CRITSystemAssessmentExchangeInputModelITSystemAssessmentExchangeActionRequest iTSystemAssessmentExchangeActionRequest) {
    this.iTSystemAssessmentExchangeActionRequest = iTSystemAssessmentExchangeActionRequest;
  }


}

