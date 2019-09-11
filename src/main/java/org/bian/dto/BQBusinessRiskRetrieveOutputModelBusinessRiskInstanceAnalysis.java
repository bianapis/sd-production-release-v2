package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceAnalysis
 */
public class BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceAnalysis   {
  private Object businessRiskInstanceAnalysisRecord = null;

  private String businessRiskInstanceAnalysisReportType = null;

  private String businessRiskInstanceAnalysisParameters = null;

  private Object businessRiskInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return businessRiskInstanceAnalysisRecord
  **/

  public Object getBusinessRiskInstanceAnalysisRecord() {
    return businessRiskInstanceAnalysisRecord;
  }

  public void setBusinessRiskInstanceAnalysisRecord(Object businessRiskInstanceAnalysisRecord) {
    this.businessRiskInstanceAnalysisRecord = businessRiskInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return businessRiskInstanceAnalysisReportType
  **/

  public String getBusinessRiskInstanceAnalysisReportType() {
    return businessRiskInstanceAnalysisReportType;
  }

  public void setBusinessRiskInstanceAnalysisReportType(String businessRiskInstanceAnalysisReportType) {
    this.businessRiskInstanceAnalysisReportType = businessRiskInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return businessRiskInstanceAnalysisParameters
  **/

  public String getBusinessRiskInstanceAnalysisParameters() {
    return businessRiskInstanceAnalysisParameters;
  }

  public void setBusinessRiskInstanceAnalysisParameters(String businessRiskInstanceAnalysisParameters) {
    this.businessRiskInstanceAnalysisParameters = businessRiskInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return businessRiskInstanceAnalysisReport
  **/

  public Object getBusinessRiskInstanceAnalysisReport() {
    return businessRiskInstanceAnalysisReport;
  }

  public void setBusinessRiskInstanceAnalysisReport(Object businessRiskInstanceAnalysisReport) {
    this.businessRiskInstanceAnalysisReport = businessRiskInstanceAnalysisReport;
  }


}

