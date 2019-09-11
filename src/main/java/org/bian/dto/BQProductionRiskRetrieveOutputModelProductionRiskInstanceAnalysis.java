package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRiskRetrieveOutputModelProductionRiskInstanceAnalysis
 */
public class BQProductionRiskRetrieveOutputModelProductionRiskInstanceAnalysis   {
  private Object productionRiskInstanceAnalysisRecord = null;

  private String productionRiskInstanceAnalysisReportType = null;

  private String productionRiskInstanceAnalysisParameters = null;

  private Object productionRiskInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productionRiskInstanceAnalysisRecord
  **/

  public Object getProductionRiskInstanceAnalysisRecord() {
    return productionRiskInstanceAnalysisRecord;
  }

  public void setProductionRiskInstanceAnalysisRecord(Object productionRiskInstanceAnalysisRecord) {
    this.productionRiskInstanceAnalysisRecord = productionRiskInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productionRiskInstanceAnalysisReportType
  **/

  public String getProductionRiskInstanceAnalysisReportType() {
    return productionRiskInstanceAnalysisReportType;
  }

  public void setProductionRiskInstanceAnalysisReportType(String productionRiskInstanceAnalysisReportType) {
    this.productionRiskInstanceAnalysisReportType = productionRiskInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productionRiskInstanceAnalysisParameters
  **/

  public String getProductionRiskInstanceAnalysisParameters() {
    return productionRiskInstanceAnalysisParameters;
  }

  public void setProductionRiskInstanceAnalysisParameters(String productionRiskInstanceAnalysisParameters) {
    this.productionRiskInstanceAnalysisParameters = productionRiskInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productionRiskInstanceAnalysisReport
  **/

  public Object getProductionRiskInstanceAnalysisReport() {
    return productionRiskInstanceAnalysisReport;
  }

  public void setProductionRiskInstanceAnalysisReport(Object productionRiskInstanceAnalysisReport) {
    this.productionRiskInstanceAnalysisReport = productionRiskInstanceAnalysisReport;
  }


}

