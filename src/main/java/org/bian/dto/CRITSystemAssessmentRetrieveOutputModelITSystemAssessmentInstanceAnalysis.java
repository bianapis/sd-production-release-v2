package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceAnalysis
 */
public class CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceAnalysis   {
  private String iTSystemAssessmentInstanceAnalysisData = null;

  private String iTSystemAssessmentInstanceAnalysisReportType = null;

  private Object iTSystemAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return iTSystemAssessmentInstanceAnalysisData
  **/

  public String getITSystemAssessmentInstanceAnalysisData() {
    return iTSystemAssessmentInstanceAnalysisData;
  } 
 
  @JsonProperty("iTSystemAssessmentInstanceAnalysisData")
  public void setITSystemAssessmentInstanceAnalysisData(String iTSystemAssessmentInstanceAnalysisData) {
    this.iTSystemAssessmentInstanceAnalysisData = iTSystemAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return iTSystemAssessmentInstanceAnalysisReportType
  **/

  public String getITSystemAssessmentInstanceAnalysisReportType() {
    return iTSystemAssessmentInstanceAnalysisReportType;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceAnalysisReportType")
  public void setITSystemAssessmentInstanceAnalysisReportType(String iTSystemAssessmentInstanceAnalysisReportType) {
    this.iTSystemAssessmentInstanceAnalysisReportType = iTSystemAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return iTSystemAssessmentInstanceAnalysisReport
  **/

  public Object getITSystemAssessmentInstanceAnalysisReport() {
    return iTSystemAssessmentInstanceAnalysisReport;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceAnalysisReport")
  public void setITSystemAssessmentInstanceAnalysisReport(Object iTSystemAssessmentInstanceAnalysisReport) {
    this.iTSystemAssessmentInstanceAnalysisReport = iTSystemAssessmentInstanceAnalysisReport;
  }


}

