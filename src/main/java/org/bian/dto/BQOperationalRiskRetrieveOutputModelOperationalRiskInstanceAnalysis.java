package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceAnalysis
 */
public class BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceAnalysis   {
  private Object operationalRiskInstanceAnalysisRecord = null;

  private String operationalRiskInstanceAnalysisReportType = null;

  private String operationalRiskInstanceAnalysisParameters = null;

  private Object operationalRiskInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return operationalRiskInstanceAnalysisRecord
  **/

  public Object getOperationalRiskInstanceAnalysisRecord() {
    return operationalRiskInstanceAnalysisRecord;
  }

  public void setOperationalRiskInstanceAnalysisRecord(Object operationalRiskInstanceAnalysisRecord) {
    this.operationalRiskInstanceAnalysisRecord = operationalRiskInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return operationalRiskInstanceAnalysisReportType
  **/

  public String getOperationalRiskInstanceAnalysisReportType() {
    return operationalRiskInstanceAnalysisReportType;
  }

  public void setOperationalRiskInstanceAnalysisReportType(String operationalRiskInstanceAnalysisReportType) {
    this.operationalRiskInstanceAnalysisReportType = operationalRiskInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return operationalRiskInstanceAnalysisParameters
  **/

  public String getOperationalRiskInstanceAnalysisParameters() {
    return operationalRiskInstanceAnalysisParameters;
  }

  public void setOperationalRiskInstanceAnalysisParameters(String operationalRiskInstanceAnalysisParameters) {
    this.operationalRiskInstanceAnalysisParameters = operationalRiskInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return operationalRiskInstanceAnalysisReport
  **/

  public Object getOperationalRiskInstanceAnalysisReport() {
    return operationalRiskInstanceAnalysisReport;
  }

  public void setOperationalRiskInstanceAnalysisReport(Object operationalRiskInstanceAnalysisReport) {
    this.operationalRiskInstanceAnalysisReport = operationalRiskInstanceAnalysisReport;
  }


}

