package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRiskExchangeOutputModelProductionRiskInstanceRecord
 */
public class BQProductionRiskExchangeOutputModelProductionRiskInstanceRecord   {
  private String productionRiskSystemTestType = null;

  private String productionRiskSystemTestDescription = null;

  private String productionRiskSystemTestWorkProduct = null;

  private String productionRiskSystemTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of production test being performed (e.g. division of responsibilities, access control, audit trail, back-up and recovery) 
   * @return productionRiskSystemTestType
  **/

  public String getProductionRiskSystemTestType() {
    return productionRiskSystemTestType;
  }

  public void setProductionRiskSystemTestType(String productionRiskSystemTestType) {
    this.productionRiskSystemTestType = productionRiskSystemTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detailed description of the test, including expected results 
   * @return productionRiskSystemTestDescription
  **/

  public String getProductionRiskSystemTestDescription() {
    return productionRiskSystemTestDescription;
  }

  public void setProductionRiskSystemTestDescription(String productionRiskSystemTestDescription) {
    this.productionRiskSystemTestDescription = productionRiskSystemTestDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to testing materials, results, assessments and other documents 
   * @return productionRiskSystemTestWorkProduct
  **/

  public String getProductionRiskSystemTestWorkProduct() {
    return productionRiskSystemTestWorkProduct;
  }

  public void setProductionRiskSystemTestWorkProduct(String productionRiskSystemTestWorkProduct) {
    this.productionRiskSystemTestWorkProduct = productionRiskSystemTestWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the production risk test (including required remedial actions/fixes where appropriate) 
   * @return productionRiskSystemTestResult
  **/

  public String getProductionRiskSystemTestResult() {
    return productionRiskSystemTestResult;
  }

  public void setProductionRiskSystemTestResult(String productionRiskSystemTestResult) {
    this.productionRiskSystemTestResult = productionRiskSystemTestResult;
  }


}

