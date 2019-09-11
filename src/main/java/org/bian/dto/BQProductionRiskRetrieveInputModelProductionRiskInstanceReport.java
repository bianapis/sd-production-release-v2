package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRiskRetrieveInputModelProductionRiskInstanceReport
 */
public class BQProductionRiskRetrieveInputModelProductionRiskInstanceReport   {
  private String productionRiskInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productionRiskInstanceReportReference
  **/

  public String getProductionRiskInstanceReportReference() {
    return productionRiskInstanceReportReference;
  }

  public void setProductionRiskInstanceReportReference(String productionRiskInstanceReportReference) {
    this.productionRiskInstanceReportReference = productionRiskInstanceReportReference;
  }


}

