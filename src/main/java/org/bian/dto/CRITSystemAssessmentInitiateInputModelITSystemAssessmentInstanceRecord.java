package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecord
 */
public class CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecord   {
  private String productionReleaseName = null;

  private String employeeBusinessUnitReference = null;

  private String productionReleaseType = null;

  private String productionReleaseDescription = null;

  private String productionReleaseTestProfile = null;

  private String productionReleaseTestSchedule = null;

  private CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reference to and descriptive name of the production release system 
   * @return productionReleaseName
  **/

  public String getProductionReleaseName() {
    return productionReleaseName;
  }

  public void setProductionReleaseName(String productionReleaseName) {
    this.productionReleaseName = productionReleaseName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business units responsible for the testing and deployment 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of production release (e.g. production service update, new production system) 
   * @return productionReleaseType
  **/

  public String getProductionReleaseType() {
    return productionReleaseType;
  }

  public void setProductionReleaseType(String productionReleaseType) {
    this.productionReleaseType = productionReleaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the scope, goal and make-up of the production release 
   * @return productionReleaseDescription
  **/

  public String getProductionReleaseDescription() {
    return productionReleaseDescription;
  }

  public void setProductionReleaseDescription(String productionReleaseDescription) {
    this.productionReleaseDescription = productionReleaseDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the types of production release tests to be and actually applied 
   * @return productionReleaseTestProfile
  **/

  public String getProductionReleaseTestProfile() {
    return productionReleaseTestProfile;
  }

  public void setProductionReleaseTestProfile(String productionReleaseTestProfile) {
    this.productionReleaseTestProfile = productionReleaseTestProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for performing the range of release tests (planned and actual) 
   * @return productionReleaseTestSchedule
  **/

  public String getProductionReleaseTestSchedule() {
    return productionReleaseTestSchedule;
  }

  public void setProductionReleaseTestSchedule(String productionReleaseTestSchedule) {
    this.productionReleaseTestSchedule = productionReleaseTestSchedule;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRITSystemAssessmentInitiateInputModelITSystemAssessmentInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

