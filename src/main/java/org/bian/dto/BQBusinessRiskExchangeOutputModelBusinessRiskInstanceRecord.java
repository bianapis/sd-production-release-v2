package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskExchangeOutputModelBusinessRiskInstanceRecord
 */
public class BQBusinessRiskExchangeOutputModelBusinessRiskInstanceRecord   {
  private String businessRiskSystemTestType = null;

  private String businessRiskSystemTestDescription = null;

  private String businessRiskTestWorkProduct = null;

  private String businessRiskTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of business risk test being performed (e.g. compliance, pricing, exposure) 
   * @return businessRiskSystemTestType
  **/

  public String getBusinessRiskSystemTestType() {
    return businessRiskSystemTestType;
  }

  public void setBusinessRiskSystemTestType(String businessRiskSystemTestType) {
    this.businessRiskSystemTestType = businessRiskSystemTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detailed description of the test, including expected results 
   * @return businessRiskSystemTestDescription
  **/

  public String getBusinessRiskSystemTestDescription() {
    return businessRiskSystemTestDescription;
  }

  public void setBusinessRiskSystemTestDescription(String businessRiskSystemTestDescription) {
    this.businessRiskSystemTestDescription = businessRiskSystemTestDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to testing materials, results, assessments and other documents 
   * @return businessRiskTestWorkProduct
  **/

  public String getBusinessRiskTestWorkProduct() {
    return businessRiskTestWorkProduct;
  }

  public void setBusinessRiskTestWorkProduct(String businessRiskTestWorkProduct) {
    this.businessRiskTestWorkProduct = businessRiskTestWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the business risk test (including required remedial actions/fixes where appropriate) 
   * @return businessRiskTestResult
  **/

  public String getBusinessRiskTestResult() {
    return businessRiskTestResult;
  }

  public void setBusinessRiskTestResult(String businessRiskTestResult) {
    this.businessRiskTestResult = businessRiskTestResult;
  }


}

