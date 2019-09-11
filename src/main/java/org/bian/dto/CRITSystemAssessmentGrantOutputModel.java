package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentGrantOutputModelGrantRequestResponseRecord;
import org.bian.dto.CRITSystemAssessmentGrantOutputModelITSystemAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentGrantOutputModel
 */
public class CRITSystemAssessmentGrantOutputModel   {
  private CRITSystemAssessmentGrantOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private String iTSystemAssessmentGrantActionTaskReference = null;

  private Object iTSystemAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRITSystemAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentGrantOutputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceRecord")
  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentGrantOutputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Assessment instance grant service call 
   * @return iTSystemAssessmentGrantActionTaskReference
  **/

  public String getITSystemAssessmentGrantActionTaskReference() {
    return iTSystemAssessmentGrantActionTaskReference;
  }
  
  @JsonProperty("iTSystemAssessmentGrantActionTaskReference")
  public void setITSystemAssessmentGrantActionTaskReference(String iTSystemAssessmentGrantActionTaskReference) {
    this.iTSystemAssessmentGrantActionTaskReference = iTSystemAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return iTSystemAssessmentGrantActionTaskRecord
  **/

  public Object getITSystemAssessmentGrantActionTaskRecord() {
    return iTSystemAssessmentGrantActionTaskRecord;
  }
   
  @JsonProperty("iTSystemAssessmentGrantActionTaskRecord")
  public void setITSystemAssessmentGrantActionTaskRecord(Object iTSystemAssessmentGrantActionTaskRecord) {
    this.iTSystemAssessmentGrantActionTaskRecord = iTSystemAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRITSystemAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRITSystemAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

