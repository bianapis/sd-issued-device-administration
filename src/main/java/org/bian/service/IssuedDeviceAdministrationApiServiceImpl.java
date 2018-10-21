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
public class IssuedDeviceAdministrationApiServiceImpl implements IssuedDeviceAdministrationApiService {

	public IssuedDeviceAllocationComplete provide(IssuedDeviceAllocationBasic request){
		return JsonReader.read("provide-IssuedDeviceAllocationComplete.json",new TypeReference<IssuedDeviceAllocationComplete>(){});
	}
	
	public IssuedDeviceAllocationRecordResponse record(String crReferenceId, IssuedDeviceAllocationBasic request){
		return JsonReader.read("record-IssuedDeviceAllocationRecordResponse.json",new TypeReference<IssuedDeviceAllocationRecordResponse>(){});
	}
	
	public IssuedDeviceAllocationComplete retrieve(String crReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceAllocationComplete.json",new TypeReference<IssuedDeviceAllocationComplete>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public IssuedDeviceAllocationChequeComplete retrieveCheques(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceAllocationChequeComplete.json",new TypeReference<IssuedDeviceAllocationChequeComplete>(){});
	}
	
	public IssuedDeviceAllocationDeviceComplete retrieveDevices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceAllocationDeviceComplete.json",new TypeReference<IssuedDeviceAllocationDeviceComplete>(){});
	}
	
	public IssuedDeviceAllocationPasswordComplete retrievePasswords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceAllocationPasswordComplete.json",new TypeReference<IssuedDeviceAllocationPasswordComplete>(){});
	}
	
	public IssuedDeviceAllocationQuestionComplete retrieveQuestions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceAllocationQuestionComplete.json",new TypeReference<IssuedDeviceAllocationQuestionComplete>(){});
	}
	
	public IssuedDeviceAllocationReaderComplete retrieveReaders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceAllocationReaderComplete.json",new TypeReference<IssuedDeviceAllocationReaderComplete>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public IssuedDeviceAllocationComplete update(String crReferenceId, IssuedDeviceAllocationBasic request){
		return JsonReader.read("update-IssuedDeviceAllocationComplete.json",new TypeReference<IssuedDeviceAllocationComplete>(){});
	}
	
}
