package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceAnalysis;
import org.bian.dto.BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBusinessRiskRetrieveOutputModel
 */
public class BQBusinessRiskRetrieveOutputModel   {
  private String businessRiskRetrieveActionTaskReference = null;

  private Object businessRiskRetrieveActionTaskRecord = null;

  private String businessRiskRetrieveActionResponse = null;

  private BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceReport businessRiskInstanceReport = null;

  private BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceAnalysis businessRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Risk instance retrieve service call 
   * @return businessRiskRetrieveActionTaskReference
  **/

  public String getBusinessRiskRetrieveActionTaskReference() {
    return businessRiskRetrieveActionTaskReference;
  }

  public void setBusinessRiskRetrieveActionTaskReference(String businessRiskRetrieveActionTaskReference) {
    this.businessRiskRetrieveActionTaskReference = businessRiskRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return businessRiskRetrieveActionResponse
  **/

  public String getBusinessRiskRetrieveActionResponse() {
    return businessRiskRetrieveActionResponse;
  }

  public void setBusinessRiskRetrieveActionResponse(String businessRiskRetrieveActionResponse) {
    this.businessRiskRetrieveActionResponse = businessRiskRetrieveActionResponse;
  }


  /**
   * Get businessRiskInstanceReport
   * @return businessRiskInstanceReport
  **/

  public BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceReport getBusinessRiskInstanceReport() {
    return businessRiskInstanceReport;
  }

  public void setBusinessRiskInstanceReport(BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceReport businessRiskInstanceReport) {
    this.businessRiskInstanceReport = businessRiskInstanceReport;
  }


  /**
   * Get businessRiskInstanceAnalysis
   * @return businessRiskInstanceAnalysis
  **/

  public BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceAnalysis getBusinessRiskInstanceAnalysis() {
    return businessRiskInstanceAnalysis;
  }

  public void setBusinessRiskInstanceAnalysis(BQBusinessRiskRetrieveOutputModelBusinessRiskInstanceAnalysis businessRiskInstanceAnalysis) {
    this.businessRiskInstanceAnalysis = businessRiskInstanceAnalysis;
  }


}

