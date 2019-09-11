/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductionReleaseApiService {

	SDProductionReleaseActivateOutputModel activate(SDProductionReleaseActivateInputModel request);
	
	SDProductionReleaseConfigureOutputModel configure(String sdReferenceId, SDProductionReleaseConfigureInputModel request);
	
	BQBusinessRiskExchangeOutputModel exchangeBusinessrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessRiskExchangeInputModel request);
	
	BQFunctionalRiskExchangeOutputModel exchangeFunctionalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRiskExchangeInputModel request);
	
	BQOperationalRiskExchangeOutputModel exchangeOperationalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalRiskExchangeInputModel request);
	
	BQProductionRiskExchangeOutputModel exchangeProductionrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRiskExchangeInputModel request);
	
	CRITSystemAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRITSystemAssessmentExchangeInputModel request);
	
	SDProductionReleaseFeedbackOutputModel feedback(String sdReferenceId, SDProductionReleaseFeedbackInputModel request);
	
	CRITSystemAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRITSystemAssessmentGrantInputModel request);
	
	CRITSystemAssessmentInitiateOutputModel initiate(String sdReferenceId, CRITSystemAssessmentInitiateInputModel request);
	
	CRITSystemAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRITSystemAssessmentRequestInputModel request);
	
	BQBusinessRiskRetrieveOutputModel retrieveBusinessrisk(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFunctionalRiskRetrieveOutputModel retrieveFunctionalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOperationalRiskRetrieveOutputModel retrieveOperationalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRiskRetrieveOutputModel retrieveProductionrisk(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRITSystemAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductionReleaseRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRITSystemAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRITSystemAssessmentUpdateInputModel request);
	
}
