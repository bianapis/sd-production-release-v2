package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskRetrieveInputModelBusinessRiskInstanceReport
 */
public class BQBusinessRiskRetrieveInputModelBusinessRiskInstanceReport   {
  private String businessRiskInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return businessRiskInstanceReportReference
  **/

  public String getBusinessRiskInstanceReportReference() {
    return businessRiskInstanceReportReference;
  }

  public void setBusinessRiskInstanceReportReference(String businessRiskInstanceReportReference) {
    this.businessRiskInstanceReportReference = businessRiskInstanceReportReference;
  }


}

