package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceReport
 */
public class BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceReport   {
  private Object functionalRiskInstanceReportRecord = null;

  private String functionalRiskInstanceReportType = null;

  private String functionalRiskInstanceReportParameters = null;

  private Object functionalRiskInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return functionalRiskInstanceReportRecord
  **/

  public Object getFunctionalRiskInstanceReportRecord() {
    return functionalRiskInstanceReportRecord;
  }

  public void setFunctionalRiskInstanceReportRecord(Object functionalRiskInstanceReportRecord) {
    this.functionalRiskInstanceReportRecord = functionalRiskInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return functionalRiskInstanceReportType
  **/

  public String getFunctionalRiskInstanceReportType() {
    return functionalRiskInstanceReportType;
  }

  public void setFunctionalRiskInstanceReportType(String functionalRiskInstanceReportType) {
    this.functionalRiskInstanceReportType = functionalRiskInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return functionalRiskInstanceReportParameters
  **/

  public String getFunctionalRiskInstanceReportParameters() {
    return functionalRiskInstanceReportParameters;
  }

  public void setFunctionalRiskInstanceReportParameters(String functionalRiskInstanceReportParameters) {
    this.functionalRiskInstanceReportParameters = functionalRiskInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return functionalRiskInstanceReport
  **/

  public Object getFunctionalRiskInstanceReport() {
    return functionalRiskInstanceReport;
  }

  public void setFunctionalRiskInstanceReport(Object functionalRiskInstanceReport) {
    this.functionalRiskInstanceReport = functionalRiskInstanceReport;
  }


}

