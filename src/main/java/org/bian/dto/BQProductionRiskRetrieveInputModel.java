package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRiskRetrieveInputModelProductionRiskInstanceAnalysis;
import org.bian.dto.BQProductionRiskRetrieveInputModelProductionRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionRiskRetrieveInputModel
 */
public class BQProductionRiskRetrieveInputModel   {
  private Object productionRiskRetrieveActionTaskRecord = null;

  private String productionRiskRetrieveActionRequest = null;

  private BQProductionRiskRetrieveInputModelProductionRiskInstanceReport productionRiskInstanceReport = null;

  private BQProductionRiskRetrieveInputModelProductionRiskInstanceAnalysis productionRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionRiskRetrieveActionTaskRecord
  **/

  public Object getProductionRiskRetrieveActionTaskRecord() {
    return productionRiskRetrieveActionTaskRecord;
  }

  public void setProductionRiskRetrieveActionTaskRecord(Object productionRiskRetrieveActionTaskRecord) {
    this.productionRiskRetrieveActionTaskRecord = productionRiskRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productionRiskRetrieveActionRequest
  **/

  public String getProductionRiskRetrieveActionRequest() {
    return productionRiskRetrieveActionRequest;
  }

  public void setProductionRiskRetrieveActionRequest(String productionRiskRetrieveActionRequest) {
    this.productionRiskRetrieveActionRequest = productionRiskRetrieveActionRequest;
  }


  /**
   * Get productionRiskInstanceReport
   * @return productionRiskInstanceReport
  **/

  public BQProductionRiskRetrieveInputModelProductionRiskInstanceReport getProductionRiskInstanceReport() {
    return productionRiskInstanceReport;
  }

  public void setProductionRiskInstanceReport(BQProductionRiskRetrieveInputModelProductionRiskInstanceReport productionRiskInstanceReport) {
    this.productionRiskInstanceReport = productionRiskInstanceReport;
  }


  /**
   * Get productionRiskInstanceAnalysis
   * @return productionRiskInstanceAnalysis
  **/

  public BQProductionRiskRetrieveInputModelProductionRiskInstanceAnalysis getProductionRiskInstanceAnalysis() {
    return productionRiskInstanceAnalysis;
  }

  public void setProductionRiskInstanceAnalysis(BQProductionRiskRetrieveInputModelProductionRiskInstanceAnalysis productionRiskInstanceAnalysis) {
    this.productionRiskInstanceAnalysis = productionRiskInstanceAnalysis;
  }


}

