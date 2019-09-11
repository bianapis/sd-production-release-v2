/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductionReleaseApiServiceImpl implements ProductionReleaseApiService {

	public SDProductionReleaseActivateOutputModel activate(SDProductionReleaseActivateInputModel request){
		return JsonReader.read("activate-SDProductionReleaseActivateOutputModel.json",new TypeReference<SDProductionReleaseActivateOutputModel>(){});
	}
	
	public SDProductionReleaseConfigureOutputModel configure(String sdReferenceId, SDProductionReleaseConfigureInputModel request){
		return JsonReader.read("configure-SDProductionReleaseConfigureOutputModel.json",new TypeReference<SDProductionReleaseConfigureOutputModel>(){});
	}
	
	public BQBusinessRiskExchangeOutputModel exchangeBusinessrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessRiskExchangeInputModel request){
		return JsonReader.read("exchange-BQBusinessRiskExchangeOutputModel.json",new TypeReference<BQBusinessRiskExchangeOutputModel>(){});
	}
	
	public BQFunctionalRiskExchangeOutputModel exchangeFunctionalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRiskExchangeInputModel request){
		return JsonReader.read("exchange-BQFunctionalRiskExchangeOutputModel.json",new TypeReference<BQFunctionalRiskExchangeOutputModel>(){});
	}
	
	public BQOperationalRiskExchangeOutputModel exchangeOperationalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalRiskExchangeInputModel request){
		return JsonReader.read("exchange-BQOperationalRiskExchangeOutputModel.json",new TypeReference<BQOperationalRiskExchangeOutputModel>(){});
	}
	
	public BQProductionRiskExchangeOutputModel exchangeProductionrisk(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRiskExchangeInputModel request){
		return JsonReader.read("exchange-BQProductionRiskExchangeOutputModel.json",new TypeReference<BQProductionRiskExchangeOutputModel>(){});
	}
	
	public CRITSystemAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRITSystemAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRITSystemAssessmentExchangeOutputModel.json",new TypeReference<CRITSystemAssessmentExchangeOutputModel>(){});
	}
	
	public SDProductionReleaseFeedbackOutputModel feedback(String sdReferenceId, SDProductionReleaseFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductionReleaseFeedbackOutputModel.json",new TypeReference<SDProductionReleaseFeedbackOutputModel>(){});
	}
	
	public CRITSystemAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRITSystemAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRITSystemAssessmentGrantOutputModel.json",new TypeReference<CRITSystemAssessmentGrantOutputModel>(){});
	}
	
	public CRITSystemAssessmentInitiateOutputModel initiate(String sdReferenceId, CRITSystemAssessmentInitiateInputModel request){
		return JsonReader.read("initiate-CRITSystemAssessmentInitiateOutputModel.json",new TypeReference<CRITSystemAssessmentInitiateOutputModel>(){});
	}
	
	public CRITSystemAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRITSystemAssessmentRequestInputModel request){
		return JsonReader.read("request-CRITSystemAssessmentRequestOutputModel.json",new TypeReference<CRITSystemAssessmentRequestOutputModel>(){});
	}
	
	public BQBusinessRiskRetrieveOutputModel retrieveBusinessrisk(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBusinessRiskRetrieveOutputModel.json",new TypeReference<BQBusinessRiskRetrieveOutputModel>(){});
	}
	
	public BQFunctionalRiskRetrieveOutputModel retrieveFunctionalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalRiskRetrieveOutputModel.json",new TypeReference<BQFunctionalRiskRetrieveOutputModel>(){});
	}
	
	public BQOperationalRiskRetrieveOutputModel retrieveOperationalrisk(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOperationalRiskRetrieveOutputModel.json",new TypeReference<BQOperationalRiskRetrieveOutputModel>(){});
	}
	
	public BQProductionRiskRetrieveOutputModel retrieveProductionrisk(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRiskRetrieveOutputModel.json",new TypeReference<BQProductionRiskRetrieveOutputModel>(){});
	}
	
	public CRITSystemAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRITSystemAssessmentRetrieveOutputModel.json",new TypeReference<CRITSystemAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductionReleaseRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductionReleaseRetrieveOutputModel.json",new TypeReference<SDProductionReleaseRetrieveOutputModel>(){});
	}
	
	public CRITSystemAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRITSystemAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRITSystemAssessmentUpdateOutputModel.json",new TypeReference<CRITSystemAssessmentUpdateOutputModel>(){});
	}
	
}
