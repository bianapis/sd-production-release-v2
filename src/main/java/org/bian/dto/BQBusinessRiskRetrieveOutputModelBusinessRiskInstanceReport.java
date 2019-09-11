package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceReport
 */
public class BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceReport   {
  private Object businessRiskInstanceReportRecord = null;

  private String businessRiskInstanceReportType = null;

  private String businessRiskInstanceReportParameters = null;

  private Object businessRiskInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return businessRiskInstanceReportRecord
  **/

  public Object getBusinessRiskInstanceReportRecord() {
    return businessRiskInstanceReportRecord;
  }

  public void setBusinessRiskInstanceReportRecord(Object businessRiskInstanceReportRecord) {
    this.businessRiskInstanceReportRecord = businessRiskInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return businessRiskInstanceReportType
  **/

  public String getBusinessRiskInstanceReportType() {
    return businessRiskInstanceReportType;
  }

  public void setBusinessRiskInstanceReportType(String businessRiskInstanceReportType) {
    this.businessRiskInstanceReportType = businessRiskInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return businessRiskInstanceReportParameters
  **/

  public String getBusinessRiskInstanceReportParameters() {
    return businessRiskInstanceReportParameters;
  }

  public void setBusinessRiskInstanceReportParameters(String businessRiskInstanceReportParameters) {
    this.businessRiskInstanceReportParameters = businessRiskInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return businessRiskInstanceReport
  **/

  public Object getBusinessRiskInstanceReport() {
    return businessRiskInstanceReport;
  }

  public void setBusinessRiskInstanceReport(Object businessRiskInstanceReport) {
    this.businessRiskInstanceReport = businessRiskInstanceReport;
  }


}

