package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceAnalysis
 */
public class CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceAnalysis   {
  private String iTSystemAssessmentInstanceAnalysisReference = null;

  private String iTSystemAssessmentInstanceAnalysisReportType = null;

  private String iTSystemAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return iTSystemAssessmentInstanceAnalysisReference
  **/

  public String getITSystemAssessmentInstanceAnalysisReference() {
    return iTSystemAssessmentInstanceAnalysisReference;
  }

  public void setITSystemAssessmentInstanceAnalysisReference(String iTSystemAssessmentInstanceAnalysisReference) {
    this.iTSystemAssessmentInstanceAnalysisReference = iTSystemAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return iTSystemAssessmentInstanceAnalysisReportType
  **/

  public String getITSystemAssessmentInstanceAnalysisReportType() {
    return iTSystemAssessmentInstanceAnalysisReportType;
  }

  public void setITSystemAssessmentInstanceAnalysisReportType(String iTSystemAssessmentInstanceAnalysisReportType) {
    this.iTSystemAssessmentInstanceAnalysisReportType = iTSystemAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return iTSystemAssessmentInstanceAnalysisParameters
  **/

  public String getITSystemAssessmentInstanceAnalysisParameters() {
    return iTSystemAssessmentInstanceAnalysisParameters;
  }

  public void setITSystemAssessmentInstanceAnalysisParameters(String iTSystemAssessmentInstanceAnalysisParameters) {
    this.iTSystemAssessmentInstanceAnalysisParameters = iTSystemAssessmentInstanceAnalysisParameters;
  }


}

