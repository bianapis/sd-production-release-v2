package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskExchangeOutputModelOperationalRiskInstanceRecord
 */
public class BQOperationalRiskExchangeOutputModelOperationalRiskInstanceRecord   {
  private String operationalRiskSystemTestType = null;

  private String operationalRiskSystemTestDescription = null;

  private String operationalRiskSystemTestWorkProduct = null;

  private String operationalRiskSystemTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of operational risk test being performed (e.g. operator error recovery, major IT component failure recovery/continuity) 
   * @return operationalRiskSystemTestType
  **/

  public String getOperationalRiskSystemTestType() {
    return operationalRiskSystemTestType;
  }

  public void setOperationalRiskSystemTestType(String operationalRiskSystemTestType) {
    this.operationalRiskSystemTestType = operationalRiskSystemTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detailed description of the test, including expected results 
   * @return operationalRiskSystemTestDescription
  **/

  public String getOperationalRiskSystemTestDescription() {
    return operationalRiskSystemTestDescription;
  }

  public void setOperationalRiskSystemTestDescription(String operationalRiskSystemTestDescription) {
    this.operationalRiskSystemTestDescription = operationalRiskSystemTestDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to testing materials, results, assessments and other documents 
   * @return operationalRiskSystemTestWorkProduct
  **/

  public String getOperationalRiskSystemTestWorkProduct() {
    return operationalRiskSystemTestWorkProduct;
  }

  public void setOperationalRiskSystemTestWorkProduct(String operationalRiskSystemTestWorkProduct) {
    this.operationalRiskSystemTestWorkProduct = operationalRiskSystemTestWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the operational risk test (including required remedial actions/fixes where appropriate) 
   * @return operationalRiskSystemTestResult
  **/

  public String getOperationalRiskSystemTestResult() {
    return operationalRiskSystemTestResult;
  }

  public void setOperationalRiskSystemTestResult(String operationalRiskSystemTestResult) {
    this.operationalRiskSystemTestResult = operationalRiskSystemTestResult;
  }


}

