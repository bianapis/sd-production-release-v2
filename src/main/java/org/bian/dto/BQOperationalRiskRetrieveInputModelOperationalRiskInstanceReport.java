package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalRiskRetrieveInputModelOperationalRiskInstanceReport
 */
public class BQOperationalRiskRetrieveInputModelOperationalRiskInstanceReport   {
  private String operationalRiskInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return operationalRiskInstanceReportReference
  **/

  public String getOperationalRiskInstanceReportReference() {
    return operationalRiskInstanceReportReference;
  }

  public void setOperationalRiskInstanceReportReference(String operationalRiskInstanceReportReference) {
    this.operationalRiskInstanceReportReference = operationalRiskInstanceReportReference;
  }


}

