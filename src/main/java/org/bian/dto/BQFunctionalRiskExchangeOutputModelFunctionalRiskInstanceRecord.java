package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskExchangeOutputModelFunctionalRiskInstanceRecord
 */
public class BQFunctionalRiskExchangeOutputModelFunctionalRiskInstanceRecord   {
  private String functionalRiskSystemTestType = null;

  private String functionalRiskSystemTestDescription = null;

  private String functionalRiskSystemTestWorkProduct = null;

  private String functionalRiskSystemTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of functional test being performed (e.g. functional coverage/integrity, usability, application integration) 
   * @return functionalRiskSystemTestType
  **/

  public String getFunctionalRiskSystemTestType() {
    return functionalRiskSystemTestType;
  }

  public void setFunctionalRiskSystemTestType(String functionalRiskSystemTestType) {
    this.functionalRiskSystemTestType = functionalRiskSystemTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detailed description of the test, including expected results 
   * @return functionalRiskSystemTestDescription
  **/

  public String getFunctionalRiskSystemTestDescription() {
    return functionalRiskSystemTestDescription;
  }

  public void setFunctionalRiskSystemTestDescription(String functionalRiskSystemTestDescription) {
    this.functionalRiskSystemTestDescription = functionalRiskSystemTestDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to testing materials, results, assessments and other documents 
   * @return functionalRiskSystemTestWorkProduct
  **/

  public String getFunctionalRiskSystemTestWorkProduct() {
    return functionalRiskSystemTestWorkProduct;
  }

  public void setFunctionalRiskSystemTestWorkProduct(String functionalRiskSystemTestWorkProduct) {
    this.functionalRiskSystemTestWorkProduct = functionalRiskSystemTestWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the functional risk test (including required remedial actions/fixes where appropriate) 
   * @return functionalRiskSystemTestResult
  **/

  public String getFunctionalRiskSystemTestResult() {
    return functionalRiskSystemTestResult;
  }

  public void setFunctionalRiskSystemTestResult(String functionalRiskSystemTestResult) {
    this.functionalRiskSystemTestResult = functionalRiskSystemTestResult;
  }


}

