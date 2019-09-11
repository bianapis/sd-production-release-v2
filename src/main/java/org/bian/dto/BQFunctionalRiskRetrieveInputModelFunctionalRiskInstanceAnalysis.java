package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceAnalysis
 */
public class BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceAnalysis   {
  private String functionalRiskInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return functionalRiskInstanceAnalysisReference
  **/

  public String getFunctionalRiskInstanceAnalysisReference() {
    return functionalRiskInstanceAnalysisReference;
  }

  public void setFunctionalRiskInstanceAnalysisReference(String functionalRiskInstanceAnalysisReference) {
    this.functionalRiskInstanceAnalysisReference = functionalRiskInstanceAnalysisReference;
  }


}

