package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskRetrieveInputModelBusinessRiskInstanceAnalysis
 */
public class BQBusinessRiskRetrieveInputModelBusinessRiskInstanceAnalysis   {
  private String businessRiskInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return businessRiskInstanceAnalysisReference
  **/

  public String getBusinessRiskInstanceAnalysisReference() {
    return businessRiskInstanceAnalysisReference;
  }

  public void setBusinessRiskInstanceAnalysisReference(String businessRiskInstanceAnalysisReference) {
    this.businessRiskInstanceAnalysisReference = businessRiskInstanceAnalysisReference;
  }


}

