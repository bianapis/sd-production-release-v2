package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceReportRecord
 */
public class CRITSystemAssessmentRetrieveOutputModelITSystemAssessmentInstanceReportRecord   {
  private String iTSystemAssessmentInstanceReportData = null;

  private String iTSystemAssessmentInstanceReportType = null;

  private Object iTSystemAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return iTSystemAssessmentInstanceReportData
  **/

  public String getITSystemAssessmentInstanceReportData() {
    return iTSystemAssessmentInstanceReportData;
  }
   
  @JsonProperty("iTSystemAssessmentInstanceReportData")
  public void setITSystemAssessmentInstanceReportData(String iTSystemAssessmentInstanceReportData) {
    this.iTSystemAssessmentInstanceReportData = iTSystemAssessmentInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return iTSystemAssessmentInstanceReportType
  **/

  public String getITSystemAssessmentInstanceReportType() {
    return iTSystemAssessmentInstanceReportType;
  }
  
  @JsonProperty("iTSystemAssessmentInstanceReportType")
  public void setITSystemAssessmentInstanceReportType(String iTSystemAssessmentInstanceReportType) {
    this.iTSystemAssessmentInstanceReportType = iTSystemAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return iTSystemAssessmentInstanceReport
  **/

  public Object getITSystemAssessmentInstanceReport() {
    return iTSystemAssessmentInstanceReport;
  }
 
  @JsonProperty("iTSystemAssessmentInstanceReport")
  public void setITSystemAssessmentInstanceReport(Object iTSystemAssessmentInstanceReport) {
    this.iTSystemAssessmentInstanceReport = iTSystemAssessmentInstanceReport;
  }


}

