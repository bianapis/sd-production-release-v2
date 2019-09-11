package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceAnalysis;
import org.bian.dto.CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRetrieveOutputModel
 */
public class CRITSystemAssessmentRetrieveOutputModel   {
  private String iTSystemAssessmentRetrieveActionTaskReference = null;

  private Object iTSystemAssessmentRetrieveActionTaskRecord = null;

  private String iTSystemAssessmentRetrieveActionResponse = null;

  private CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceReportRecord iTSystemAssessmentInstanceReportRecord = null;

  private CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceAnalysis iTSystemAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Assessment instance retrieve service call 
   * @return iTSystemAssessmentRetrieveActionTaskReference
  **/

  public String getITSystemAssessmentRetrieveActionTaskReference() {
    return iTSystemAssessmentRetrieveActionTaskReference;
  }

  @JsonProperty("iTSystemAssessmentRetrieveActionTaskReference")
  public void setITSystemAssessmentRetrieveActionTaskReference(String iTSystemAssessmentRetrieveActionTaskReference) {
    this.iTSystemAssessmentRetrieveActionTaskReference = iTSystemAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTSystemAssessmentRetrieveActionTaskRecord
  **/

  public Object getITSystemAssessmentRetrieveActionTaskRecord() {
    return iTSystemAssessmentRetrieveActionTaskRecord;
  }
  
  @JsonProperty("iTSystemAssessmentRetrieveActionTaskRecord")
  public void setITSystemAssessmentRetrieveActionTaskRecord(Object iTSystemAssessmentRetrieveActionTaskRecord) {
    this.iTSystemAssessmentRetrieveActionTaskRecord = iTSystemAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return iTSystemAssessmentRetrieveActionResponse
  **/

  public String getITSystemAssessmentRetrieveActionResponse() {
    return iTSystemAssessmentRetrieveActionResponse;
  }
  
  @JsonProperty("iTSystemAssessmentRetrieveActionResponse")
  public void setITSystemAssessmentRetrieveActionResponse(String iTSystemAssessmentRetrieveActionResponse) {
    this.iTSystemAssessmentRetrieveActionResponse = iTSystemAssessmentRetrieveActionResponse;
  }


  /**
   * Get iTSystemAssessmentInstanceReportRecord
   * @return iTSystemAssessmentInstanceReportRecord
  **/

  public CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceReportRecord getITSystemAssessmentInstanceReportRecord() {
    return iTSystemAssessmentInstanceReportRecord;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceReportRecord")
  public void setITSystemAssessmentInstanceReportRecord(CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceReportRecord iTSystemAssessmentInstanceReportRecord) {
    this.iTSystemAssessmentInstanceReportRecord = iTSystemAssessmentInstanceReportRecord;
  }


  /**
   * Get iTSystemAssessmentInstanceAnalysis
   * @return iTSystemAssessmentInstanceAnalysis
  **/

  public CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceAnalysis getITSystemAssessmentInstanceAnalysis() {
    return iTSystemAssessmentInstanceAnalysis;
  }
 
  @JsonProperty("iTSystemAssessmentInstanceAnalysis")
  public void setITSystemAssessmentInstanceAnalysis(CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceAnalysis iTSystemAssessmentInstanceAnalysis) {
    this.iTSystemAssessmentInstanceAnalysis = iTSystemAssessmentInstanceAnalysis;
  }


}

