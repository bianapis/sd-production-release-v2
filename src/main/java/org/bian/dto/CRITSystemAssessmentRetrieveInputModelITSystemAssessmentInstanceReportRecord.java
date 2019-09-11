package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceReportRecord
 */
public class CRITSystemAssessmentRetrieveInputModelITSystemAssessmentInstanceReportRecord   {
  private String iTSystemAssessmentInstanceReportReference = null;

  private String iTSystemAssessmentInstanceReportType = null;

  private String iTSystemAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return iTSystemAssessmentInstanceReportReference
  **/

  public String getITSystemAssessmentInstanceReportReference() {
    return iTSystemAssessmentInstanceReportReference;
  }

  public void setITSystemAssessmentInstanceReportReference(String iTSystemAssessmentInstanceReportReference) {
    this.iTSystemAssessmentInstanceReportReference = iTSystemAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return iTSystemAssessmentInstanceReportType
  **/

  public String getITSystemAssessmentInstanceReportType() {
    return iTSystemAssessmentInstanceReportType;
  }

  public void setITSystemAssessmentInstanceReportType(String iTSystemAssessmentInstanceReportType) {
    this.iTSystemAssessmentInstanceReportType = iTSystemAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return iTSystemAssessmentInstanceReportParameters
  **/

  public String getITSystemAssessmentInstanceReportParameters() {
    return iTSystemAssessmentInstanceReportParameters;
  }

  public void setITSystemAssessmentInstanceReportParameters(String iTSystemAssessmentInstanceReportParameters) {
    this.iTSystemAssessmentInstanceReportParameters = iTSystemAssessmentInstanceReportParameters;
  }


}

