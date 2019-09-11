package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBusinessRiskRetrieveInputModelBusinessRiskInstanceAnalysis;
import org.bian.dto.BQBusinessRiskRetrieveInputModelBusinessRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskRetrieveInputModel
 */
public class BQBusinessRiskRetrieveInputModel   {
  private Object businessRiskRetrieveActionTaskRecord = null;

  private String businessRiskRetrieveActionRequest = null;

  private BQBusinessRiskRetrieveInputModelBusinessRiskInstanceReport businessRiskInstanceReport = null;

  private BQBusinessRiskRetrieveInputModelBusinessRiskInstanceAnalysis businessRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return businessRiskRetrieveActionTaskRecord
  **/

  public Object getBusinessRiskRetrieveActionTaskRecord() {
    return businessRiskRetrieveActionTaskRecord;
  }

  public void setBusinessRiskRetrieveActionTaskRecord(Object businessRiskRetrieveActionTaskRecord) {
    this.businessRiskRetrieveActionTaskRecord = businessRiskRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return businessRiskRetrieveActionRequest
  **/

  public String getBusinessRiskRetrieveActionRequest() {
    return businessRiskRetrieveActionRequest;
  }

  public void setBusinessRiskRetrieveActionRequest(String businessRiskRetrieveActionRequest) {
    this.businessRiskRetrieveActionRequest = businessRiskRetrieveActionRequest;
  }


  /**
   * Get businessRiskInstanceReport
   * @return businessRiskInstanceReport
  **/

  public BQBusinessRiskRetrieveInputModelBusinessRiskInstanceReport getBusinessRiskInstanceReport() {
    return businessRiskInstanceReport;
  }

  public void setBusinessRiskInstanceReport(BQBusinessRiskRetrieveInputModelBusinessRiskInstanceReport businessRiskInstanceReport) {
    this.businessRiskInstanceReport = businessRiskInstanceReport;
  }


  /**
   * Get businessRiskInstanceAnalysis
   * @return businessRiskInstanceAnalysis
  **/

  public BQBusinessRiskRetrieveInputModelBusinessRiskInstanceAnalysis getBusinessRiskInstanceAnalysis() {
    return businessRiskInstanceAnalysis;
  }

  public void setBusinessRiskInstanceAnalysis(BQBusinessRiskRetrieveInputModelBusinessRiskInstanceAnalysis businessRiskInstanceAnalysis) {
    this.businessRiskInstanceAnalysis = businessRiskInstanceAnalysis;
  }


}

