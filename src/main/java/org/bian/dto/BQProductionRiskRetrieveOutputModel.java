package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRiskRetrieveOutputModelProductionRiskInstanceAnalysis;
import org.bian.dto.BQProductionRiskRetrieveOutputModelProductionRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionRiskRetrieveOutputModel
 */
public class BQProductionRiskRetrieveOutputModel   {
  private String productionRiskRetrieveActionTaskReference = null;

  private Object productionRiskRetrieveActionTaskRecord = null;

  private String productionRiskRetrieveActionResponse = null;

  private BQProductionRiskRetrieveOutputModelProductionRiskInstanceReport productionRiskInstanceReport = null;

  private BQProductionRiskRetrieveOutputModelProductionRiskInstanceAnalysis productionRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Risk instance retrieve service call 
   * @return productionRiskRetrieveActionTaskReference
  **/

  public String getProductionRiskRetrieveActionTaskReference() {
    return productionRiskRetrieveActionTaskReference;
  }

  public void setProductionRiskRetrieveActionTaskReference(String productionRiskRetrieveActionTaskReference) {
    this.productionRiskRetrieveActionTaskReference = productionRiskRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productionRiskRetrieveActionResponse
  **/

  public String getProductionRiskRetrieveActionResponse() {
    return productionRiskRetrieveActionResponse;
  }

  public void setProductionRiskRetrieveActionResponse(String productionRiskRetrieveActionResponse) {
    this.productionRiskRetrieveActionResponse = productionRiskRetrieveActionResponse;
  }


  /**
   * Get productionRiskInstanceReport
   * @return productionRiskInstanceReport
  **/

  public BQProductionRiskRetrieveOutputModelProductionRiskInstanceReport getProductionRiskInstanceReport() {
    return productionRiskInstanceReport;
  }

  public void setProductionRiskInstanceReport(BQProductionRiskRetrieveOutputModelProductionRiskInstanceReport productionRiskInstanceReport) {
    this.productionRiskInstanceReport = productionRiskInstanceReport;
  }


  /**
   * Get productionRiskInstanceAnalysis
   * @return productionRiskInstanceAnalysis
  **/

  public BQProductionRiskRetrieveOutputModelProductionRiskInstanceAnalysis getProductionRiskInstanceAnalysis() {
    return productionRiskInstanceAnalysis;
  }

  public void setProductionRiskInstanceAnalysis(BQProductionRiskRetrieveOutputModelProductionRiskInstanceAnalysis productionRiskInstanceAnalysis) {
    this.productionRiskInstanceAnalysis = productionRiskInstanceAnalysis;
  }


}

