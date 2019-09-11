package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentExchangeOutputModel
 */
public class CRITSystemAssessmentExchangeOutputModel   {
  private String iTSystemAssessmentExchangeActionTaskReference = null;

  private Object iTSystemAssessmentExchangeActionTaskRecord = null;

  private String iTSystemAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Assessment instance exchange service call 
   * @return iTSystemAssessmentExchangeActionTaskReference
  **/

  public String getITSystemAssessmentExchangeActionTaskReference() {
    return iTSystemAssessmentExchangeActionTaskReference;
  }
   @JsonProperty("iTSystemAssessmentExchangeActionTaskReference")
  public void setITSystemAssessmentExchangeActionTaskReference(String iTSystemAssessmentExchangeActionTaskReference) {
    this.iTSystemAssessmentExchangeActionTaskReference = iTSystemAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return iTSystemAssessmentExchangeActionTaskRecord
  **/

  public Object getITSystemAssessmentExchangeActionTaskRecord() {
    return iTSystemAssessmentExchangeActionTaskRecord;
  }
  
  @JsonProperty("iTSystemAssessmentExchangeActionTaskRecord")
  public void setITSystemAssessmentExchangeActionTaskRecord(Object iTSystemAssessmentExchangeActionTaskRecord) {
    this.iTSystemAssessmentExchangeActionTaskRecord = iTSystemAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return iTSystemAssessmentExchangeActionResponse
  **/

  public String getITSystemAssessmentExchangeActionResponse() {
    return iTSystemAssessmentExchangeActionResponse;
  }
  
  @JsonProperty("iTSystemAssessmentExchangeActionResponse")
  public void setITSystemAssessmentExchangeActionResponse(String iTSystemAssessmentExchangeActionResponse) {
    this.iTSystemAssessmentExchangeActionResponse = iTSystemAssessmentExchangeActionResponse;
  }


}

