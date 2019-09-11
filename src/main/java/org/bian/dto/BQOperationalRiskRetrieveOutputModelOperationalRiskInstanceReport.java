package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceReport
 */
public class BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceReport   {
  private Object operationalRiskInstanceReportRecord = null;

  private String operationalRiskInstanceReportType = null;

  private String operationalRiskInstanceReportParameters = null;

  private Object operationalRiskInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return operationalRiskInstanceReportRecord
  **/

  public Object getOperationalRiskInstanceReportRecord() {
    return operationalRiskInstanceReportRecord;
  }

  public void setOperationalRiskInstanceReportRecord(Object operationalRiskInstanceReportRecord) {
    this.operationalRiskInstanceReportRecord = operationalRiskInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return operationalRiskInstanceReportType
  **/

  public String getOperationalRiskInstanceReportType() {
    return operationalRiskInstanceReportType;
  }

  public void setOperationalRiskInstanceReportType(String operationalRiskInstanceReportType) {
    this.operationalRiskInstanceReportType = operationalRiskInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return operationalRiskInstanceReportParameters
  **/

  public String getOperationalRiskInstanceReportParameters() {
    return operationalRiskInstanceReportParameters;
  }

  public void setOperationalRiskInstanceReportParameters(String operationalRiskInstanceReportParameters) {
    this.operationalRiskInstanceReportParameters = operationalRiskInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return operationalRiskInstanceReport
  **/

  public Object getOperationalRiskInstanceReport() {
    return operationalRiskInstanceReport;
  }

  public void setOperationalRiskInstanceReport(Object operationalRiskInstanceReport) {
    this.operationalRiskInstanceReport = operationalRiskInstanceReport;
  }


}

