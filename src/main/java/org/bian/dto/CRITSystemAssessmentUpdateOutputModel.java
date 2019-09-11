package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentUpdateOutputModel
 */
public class CRITSystemAssessmentUpdateOutputModel   {
  private CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private String iTSystemAssessmentUpdateActionTaskReference = null;

  private Object iTSystemAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentUpdateInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return iTSystemAssessmentUpdateActionTaskReference
  **/

  public String getITSystemAssessmentUpdateActionTaskReference() {
    return iTSystemAssessmentUpdateActionTaskReference;
  }
    
  @JsonProperty("iTSystemAssessmentUpdateActionTaskReference")
  public void setITSystemAssessmentUpdateActionTaskReference(String iTSystemAssessmentUpdateActionTaskReference) {
    this.iTSystemAssessmentUpdateActionTaskReference = iTSystemAssessmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return iTSystemAssessmentUpdateActionTaskRecord
  **/

  public Object getITSystemAssessmentUpdateActionTaskRecord() {
    return iTSystemAssessmentUpdateActionTaskRecord;
  }
   
  @JsonProperty("iTSystemAssessmentUpdateActionTaskRecord")
  public void setITSystemAssessmentUpdateActionTaskRecord(Object iTSystemAssessmentUpdateActionTaskRecord) {
    this.iTSystemAssessmentUpdateActionTaskRecord = iTSystemAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

