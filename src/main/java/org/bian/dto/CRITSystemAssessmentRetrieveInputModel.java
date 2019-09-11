package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceAnalysis;
import org.bian.dto.CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRetrieveInputModel
 */
public class CRITSystemAssessmentRetrieveInputModel   {
  private Object iTSystemAssessmentRetrieveActionTaskRecord = null;

  private String iTSystemAssessmentRetrieveActionRequest = null;

  private CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceReportRecord iTSystemAssessmentInstanceReportRecord = null;

  private CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceAnalysis iTSystemAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTSystemAssessmentRetrieveActionTaskRecord
  **/

  public Object getITSystemAssessmentRetrieveActionTaskRecord() {
    return iTSystemAssessmentRetrieveActionTaskRecord;
  }

  public void setITSystemAssessmentRetrieveActionTaskRecord(Object iTSystemAssessmentRetrieveActionTaskRecord) {
    this.iTSystemAssessmentRetrieveActionTaskRecord = iTSystemAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return iTSystemAssessmentRetrieveActionRequest
  **/

  public String getITSystemAssessmentRetrieveActionRequest() {
    return iTSystemAssessmentRetrieveActionRequest;
  }

  public void setITSystemAssessmentRetrieveActionRequest(String iTSystemAssessmentRetrieveActionRequest) {
    this.iTSystemAssessmentRetrieveActionRequest = iTSystemAssessmentRetrieveActionRequest;
  }


  /**
   * Get iTSystemAssessmentInstanceReportRecord
   * @return iTSystemAssessmentInstanceReportRecord
  **/

  public CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceReportRecord getITSystemAssessmentInstanceReportRecord() {
    return iTSystemAssessmentInstanceReportRecord;
  }

  public void setITSystemAssessmentInstanceReportRecord(CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceReportRecord iTSystemAssessmentInstanceReportRecord) {
    this.iTSystemAssessmentInstanceReportRecord = iTSystemAssessmentInstanceReportRecord;
  }


  /**
   * Get iTSystemAssessmentInstanceAnalysis
   * @return iTSystemAssessmentInstanceAnalysis
  **/

  public CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceAnalysis getITSystemAssessmentInstanceAnalysis() {
    return iTSystemAssessmentInstanceAnalysis;
  }

  public void setITSystemAssessmentInstanceAnalysis(CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceAnalysis iTSystemAssessmentInstanceAnalysis) {
    this.iTSystemAssessmentInstanceAnalysis = iTSystemAssessmentInstanceAnalysis;
  }


}

