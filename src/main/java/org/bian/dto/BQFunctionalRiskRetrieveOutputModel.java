package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceAnalysis;
import org.bian.dto.BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskRetrieveOutputModel
 */
public class BQFunctionalRiskRetrieveOutputModel   {
  private String functionalRiskRetrieveActionTaskReference = null;

  private Object functionalRiskRetrieveActionTaskRecord = null;

  private String functionalRiskRetrieveActionResponse = null;

  private BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceReport functionalRiskInstanceReport = null;

  private BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceAnalysis functionalRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Risk instance retrieve service call 
   * @return functionalRiskRetrieveActionTaskReference
  **/

  public String getFunctionalRiskRetrieveActionTaskReference() {
    return functionalRiskRetrieveActionTaskReference;
  }

  public void setFunctionalRiskRetrieveActionTaskReference(String functionalRiskRetrieveActionTaskReference) {
    this.functionalRiskRetrieveActionTaskReference = functionalRiskRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalRiskRetrieveActionTaskRecord
  **/

  public Object getFunctionalRiskRetrieveActionTaskRecord() {
    return functionalRiskRetrieveActionTaskRecord;
  }

  public void setFunctionalRiskRetrieveActionTaskRecord(Object functionalRiskRetrieveActionTaskRecord) {
    this.functionalRiskRetrieveActionTaskRecord = functionalRiskRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return functionalRiskRetrieveActionResponse
  **/

  public String getFunctionalRiskRetrieveActionResponse() {
    return functionalRiskRetrieveActionResponse;
  }

  public void setFunctionalRiskRetrieveActionResponse(String functionalRiskRetrieveActionResponse) {
    this.functionalRiskRetrieveActionResponse = functionalRiskRetrieveActionResponse;
  }


  /**
   * Get functionalRiskInstanceReport
   * @return functionalRiskInstanceReport
  **/

  public BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceReport getFunctionalRiskInstanceReport() {
    return functionalRiskInstanceReport;
  }

  public void setFunctionalRiskInstanceReport(BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceReport functionalRiskInstanceReport) {
    this.functionalRiskInstanceReport = functionalRiskInstanceReport;
  }


  /**
   * Get functionalRiskInstanceAnalysis
   * @return functionalRiskInstanceAnalysis
  **/

  public BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceAnalysis getFunctionalRiskInstanceAnalysis() {
    return functionalRiskInstanceAnalysis;
  }

  public void setFunctionalRiskInstanceAnalysis(BQFunctionalRiskRetrieveOutputModelFunctionalRiskInstanceAnalysis functionalRiskInstanceAnalysis) {
    this.functionalRiskInstanceAnalysis = functionalRiskInstanceAnalysis;
  }


}

