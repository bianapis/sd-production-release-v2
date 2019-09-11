package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentGrantInputModel
 */
public class CRITSystemAssessmentGrantInputModel   {
  private String productionReleaseServicingSessionReference = null;

  private String iTSystemAssessmentInstanceReference = null;

  private Object iTSystemAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRITSystemAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return iTSystemAssessmentGrantActionTaskRecord
  **/

  public Object getITSystemAssessmentGrantActionTaskRecord() {
    return iTSystemAssessmentGrantActionTaskRecord;
  }

  public void setITSystemAssessmentGrantActionTaskRecord(Object iTSystemAssessmentGrantActionTaskRecord) {
    this.iTSystemAssessmentGrantActionTaskRecord = iTSystemAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRITSystemAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRITSystemAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

