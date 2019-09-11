package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceReport
 */
public class BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceReport   {
  private String functionalRiskInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return functionalRiskInstanceReportReference
  **/

  public String getFunctionalRiskInstanceReportReference() {
    return functionalRiskInstanceReportReference;
  }

  public void setFunctionalRiskInstanceReportReference(String functionalRiskInstanceReportReference) {
    this.functionalRiskInstanceReportReference = functionalRiskInstanceReportReference;
  }


}

