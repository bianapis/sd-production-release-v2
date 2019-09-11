package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceAnalysis;
import org.bian.dto.BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskRetrieveOutputModel
 */
public class BQOperationalRiskRetrieveOutputModel   {
  private String operationalRiskRetrieveActionTaskReference = null;

  private Object operationalRiskRetrieveActionTaskRecord = null;

  private String operationalRiskRetrieveActionResponse = null;

  private BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceReport operationalRiskInstanceReport = null;

  private BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceAnalysis operationalRiskInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operational Risk instance retrieve service call 
   * @return operationalRiskRetrieveActionTaskReference
  **/

  public String getOperationalRiskRetrieveActionTaskReference() {
    return operationalRiskRetrieveActionTaskReference;
  }

  public void setOperationalRiskRetrieveActionTaskReference(String operationalRiskRetrieveActionTaskReference) {
    this.operationalRiskRetrieveActionTaskReference = operationalRiskRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return operationalRiskRetrieveActionResponse
  **/

  public String getOperationalRiskRetrieveActionResponse() {
    return operationalRiskRetrieveActionResponse;
  }

  public void setOperationalRiskRetrieveActionResponse(String operationalRiskRetrieveActionResponse) {
    this.operationalRiskRetrieveActionResponse = operationalRiskRetrieveActionResponse;
  }


  /**
   * Get operationalRiskInstanceReport
   * @return operationalRiskInstanceReport
  **/

  public BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceReport getOperationalRiskInstanceReport() {
    return operationalRiskInstanceReport;
  }

  public void setOperationalRiskInstanceReport(BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceReport operationalRiskInstanceReport) {
    this.operationalRiskInstanceReport = operationalRiskInstanceReport;
  }


  /**
   * Get operationalRiskInstanceAnalysis
   * @return operationalRiskInstanceAnalysis
  **/

  public BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceAnalysis getOperationalRiskInstanceAnalysis() {
    return operationalRiskInstanceAnalysis;
  }

  public void setOperationalRiskInstanceAnalysis(BQOperationalRiskRetrieveOutputModelOperationalRiskInstanceAnalysis operationalRiskInstanceAnalysis) {
    this.operationalRiskInstanceAnalysis = operationalRiskInstanceAnalysis;
  }


}

