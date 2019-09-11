package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceAnalysis
 */
public class BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceAnalysis   {
  private Object functionalRiskInstanceAnalysisRecord = null;

  private String functionalRiskInstanceAnalysisReportType = null;

  private String functionalRiskInstanceAnalysisParameters = null;

  private Object functionalRiskInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return functionalRiskInstanceAnalysisRecord
  **/

  public Object getFunctionalRiskInstanceAnalysisRecord() {
    return functionalRiskInstanceAnalysisRecord;
  }

  public void setFunctionalRiskInstanceAnalysisRecord(Object functionalRiskInstanceAnalysisRecord) {
    this.functionalRiskInstanceAnalysisRecord = functionalRiskInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return functionalRiskInstanceAnalysisReportType
  **/

  public String getFunctionalRiskInstanceAnalysisReportType() {
    return functionalRiskInstanceAnalysisReportType;
  }

  public void setFunctionalRiskInstanceAnalysisReportType(String functionalRiskInstanceAnalysisReportType) {
    this.functionalRiskInstanceAnalysisReportType = functionalRiskInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return functionalRiskInstanceAnalysisParameters
  **/

  public String getFunctionalRiskInstanceAnalysisParameters() {
    return functionalRiskInstanceAnalysisParameters;
  }

  public void setFunctionalRiskInstanceAnalysisParameters(String functionalRiskInstanceAnalysisParameters) {
    this.functionalRiskInstanceAnalysisParameters = functionalRiskInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return functionalRiskInstanceAnalysisReport
  **/

  public Object getFunctionalRiskInstanceAnalysisReport() {
    return functionalRiskInstanceAnalysisReport;
  }

  public void setFunctionalRiskInstanceAnalysisReport(Object functionalRiskInstanceAnalysisReport) {
    this.functionalRiskInstanceAnalysisReport = functionalRiskInstanceAnalysisReport;
  }


}

