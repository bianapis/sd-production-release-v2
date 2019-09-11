package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalRiskRetrieveInputModelOperationalRiskInstanceAnalysis;
import org.bian.dto.BQOperationalRiskRetrieveInputModelOperationalRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskRetrieveInputModel
 */
public class BQOperationalRiskRetrieveInputModel   {
  private Object operationalRiskRetrieveActionTaskRecord = null;

  private String operationalRiskRetrieveActionRequest = null;

  private BQOperationalRiskRetrieveInputModelOperationalRiskInstanceReport operationalRiskInstanceReport = null;

  private BQOperationalRiskRetrieveInputModelOperationalRiskInstanceAnalysis operationalRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationalRiskRetrieveActionTaskRecord
  **/

  public Object getOperationalRiskRetrieveActionTaskRecord() {
    return operationalRiskRetrieveActionTaskRecord;
  }

  public void setOperationalRiskRetrieveActionTaskRecord(Object operationalRiskRetrieveActionTaskRecord) {
    this.operationalRiskRetrieveActionTaskRecord = operationalRiskRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return operationalRiskRetrieveActionRequest
  **/

  public String getOperationalRiskRetrieveActionRequest() {
    return operationalRiskRetrieveActionRequest;
  }

  public void setOperationalRiskRetrieveActionRequest(String operationalRiskRetrieveActionRequest) {
    this.operationalRiskRetrieveActionRequest = operationalRiskRetrieveActionRequest;
  }


  /**
   * Get operationalRiskInstanceReport
   * @return operationalRiskInstanceReport
  **/

  public BQOperationalRiskRetrieveInputModelOperationalRiskInstanceReport getOperationalRiskInstanceReport() {
    return operationalRiskInstanceReport;
  }

  public void setOperationalRiskInstanceReport(BQOperationalRiskRetrieveInputModelOperationalRiskInstanceReport operationalRiskInstanceReport) {
    this.operationalRiskInstanceReport = operationalRiskInstanceReport;
  }


  /**
   * Get operationalRiskInstanceAnalysis
   * @return operationalRiskInstanceAnalysis
  **/

  public BQOperationalRiskRetrieveInputModelOperationalRiskInstanceAnalysis getOperationalRiskInstanceAnalysis() {
    return operationalRiskInstanceAnalysis;
  }

  public void setOperationalRiskInstanceAnalysis(BQOperationalRiskRetrieveInputModelOperationalRiskInstanceAnalysis operationalRiskInstanceAnalysis) {
    this.operationalRiskInstanceAnalysis = operationalRiskInstanceAnalysis;
  }


}

