package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRiskRetrieveOutputModelProductionRiskInstanceReport
 */
public class BQProductionRiskRetrieveOutputModelProductionRiskInstanceReport   {
  private Object productionRiskInstanceReportRecord = null;

  private String productionRiskInstanceReportType = null;

  private String productionRiskInstanceReportParameters = null;

  private Object productionRiskInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productionRiskInstanceReportRecord
  **/

  public Object getProductionRiskInstanceReportRecord() {
    return productionRiskInstanceReportRecord;
  }

  public void setProductionRiskInstanceReportRecord(Object productionRiskInstanceReportRecord) {
    this.productionRiskInstanceReportRecord = productionRiskInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productionRiskInstanceReportType
  **/

  public String getProductionRiskInstanceReportType() {
    return productionRiskInstanceReportType;
  }

  public void setProductionRiskInstanceReportType(String productionRiskInstanceReportType) {
    this.productionRiskInstanceReportType = productionRiskInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productionRiskInstanceReportParameters
  **/

  public String getProductionRiskInstanceReportParameters() {
    return productionRiskInstanceReportParameters;
  }

  public void setProductionRiskInstanceReportParameters(String productionRiskInstanceReportParameters) {
    this.productionRiskInstanceReportParameters = productionRiskInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productionRiskInstanceReport
  **/

  public Object getProductionRiskInstanceReport() {
    return productionRiskInstanceReport;
  }

  public void setProductionRiskInstanceReport(Object productionRiskInstanceReport) {
    this.productionRiskInstanceReport = productionRiskInstanceReport;
  }


}

