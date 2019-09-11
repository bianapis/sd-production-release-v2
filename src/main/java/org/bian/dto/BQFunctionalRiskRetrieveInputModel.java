package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceAnalysis;
import org.bian.dto.BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalRiskRetrieveInputModel
 */
public class BQFunctionalRiskRetrieveInputModel   {
  private Object functionalRiskRetrieveActionTaskRecord = null;

  private String functionalRiskRetrieveActionRequest = null;

  private BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceReport functionalRiskInstanceReport = null;

  private BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceAnalysis functionalRiskInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return functionalRiskRetrieveActionRequest
  **/

  public String getFunctionalRiskRetrieveActionRequest() {
    return functionalRiskRetrieveActionRequest;
  }

  public void setFunctionalRiskRetrieveActionRequest(String functionalRiskRetrieveActionRequest) {
    this.functionalRiskRetrieveActionRequest = functionalRiskRetrieveActionRequest;
  }


  /**
   * Get functionalRiskInstanceReport
   * @return functionalRiskInstanceReport
  **/

  public BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceReport getFunctionalRiskInstanceReport() {
    return functionalRiskInstanceReport;
  }

  public void setFunctionalRiskInstanceReport(BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceReport functionalRiskInstanceReport) {
    this.functionalRiskInstanceReport = functionalRiskInstanceReport;
  }


  /**
   * Get functionalRiskInstanceAnalysis
   * @return functionalRiskInstanceAnalysis
  **/

  public BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceAnalysis getFunctionalRiskInstanceAnalysis() {
    return functionalRiskInstanceAnalysis;
  }

  public void setFunctionalRiskInstanceAnalysis(BQFunctionalRiskRetrieveInputModelFunctionalRiskInstanceAnalysis functionalRiskInstanceAnalysis) {
    this.functionalRiskInstanceAnalysis = functionalRiskInstanceAnalysis;
  }


}

