package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentRequestOutputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRequestOutputModel
 */
public class CRITSystemAssessmentRequestOutputModel   {
  private CRITSystemAssessmentRequestOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private String iTSystemAssessmentRequestActionTaskReference = null;

  private Object iTSystemAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentRequestOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentRequestOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Assessment instance request service call 
   * @return iTSystemAssessmentRequestActionTaskReference
  **/

  public String getITSystemAssessmentRequestActionTaskReference() {
    return iTSystemAssessmentRequestActionTaskReference;
  }
  @JsonProperty("iTSystemAssessmentRequestActionTaskReference")
  public void setITSystemAssessmentRequestActionTaskReference(String iTSystemAssessmentRequestActionTaskReference) {
    this.iTSystemAssessmentRequestActionTaskReference = iTSystemAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return iTSystemAssessmentRequestActionTaskRecord
  **/

  public Object getITSystemAssessmentRequestActionTaskRecord() {
    return iTSystemAssessmentRequestActionTaskRecord;
  }
  
  @JsonProperty("iTSystemAssessmentRequestActionTaskRecord")
  public void setITSystemAssessmentRequestActionTaskRecord(Object iTSystemAssessmentRequestActionTaskRecord) {
    this.iTSystemAssessmentRequestActionTaskRecord = iTSystemAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

