package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRiskRetrieveInputModelProductionRiskInstanceAnalysis
 */
public class BQProductionRiskRetrieveInputModelProductionRiskInstanceAnalysis   {
  private String productionRiskInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productionRiskInstanceAnalysisReference
  **/

  public String getProductionRiskInstanceAnalysisReference() {
    return productionRiskInstanceAnalysisReference;
  }

  public void setProductionRiskInstanceAnalysisReference(String productionRiskInstanceAnalysisReference) {
    this.productionRiskInstanceAnalysisReference = productionRiskInstanceAnalysisReference;
  }


}

