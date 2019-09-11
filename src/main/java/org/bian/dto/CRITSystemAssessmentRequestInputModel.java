package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentRequestInputModelITSystemAssessmentInstanceRecord;
import org.bian.dto.CRITSystemAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentRequestInputModel
 */
public class CRITSystemAssessmentRequestInputModel   {
  private String productionReleaseServicingSessionReference = null;

  private String iTSystemAssessmentInstanceReference = null;

  private CRITSystemAssessmentRequestInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord = null;

  private Object iTSystemAssessmentRequestActionTaskRecord = null;

  private CRITSystemAssessmentRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productionReleaseServicingSessionReference
  **/

  public String getProductionReleaseServicingSessionReference() {
    return productionReleaseServicingSessionReference;
  }

  public void setProductionReleaseServicingSessionReference(String productionReleaseServicingSessionReference) {
    this.productionReleaseServicingSessionReference = productionReleaseServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT System Assessment instance 
   * @return iTSystemAssessmentInstanceReference
  **/

  public String getITSystemAssessmentInstanceReference() {
    return iTSystemAssessmentInstanceReference;
  }

  public void setITSystemAssessmentInstanceReference(String iTSystemAssessmentInstanceReference) {
    this.iTSystemAssessmentInstanceReference = iTSystemAssessmentInstanceReference;
  }


  /**
   * Get iTSystemAssessmentInstanceRecord
   * @return iTSystemAssessmentInstanceRecord
  **/

  public CRITSystemAssessmentRequestInputModelITSystemAssessmentInstanceRecord getITSystemAssessmentInstanceRecord() {
    return iTSystemAssessmentInstanceRecord;
  }

  public void setITSystemAssessmentInstanceRecord(CRITSystemAssessmentRequestInputModelITSystemAssessmentInstanceRecord iTSystemAssessmentInstanceRecord) {
    this.iTSystemAssessmentInstanceRecord = iTSystemAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return iTSystemAssessmentRequestActionTaskRecord
  **/

  public Object getITSystemAssessmentRequestActionTaskRecord() {
    return iTSystemAssessmentRequestActionTaskRecord;
  }

  public void setITSystemAssessmentRequestActionTaskRecord(Object iTSystemAssessmentRequestActionTaskRecord) {
    this.iTSystemAssessmentRequestActionTaskRecord = iTSystemAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRITSystemAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRITSystemAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

