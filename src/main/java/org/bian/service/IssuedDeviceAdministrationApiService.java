/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface IssuedDeviceAdministrationApiService {

	IssuedDeviceAllocationComplete provide(IssuedDeviceAllocationBasic request);
	
	IssuedDeviceAllocationRecordResponse record(String crReferenceId, IssuedDeviceAllocationBasic request);
	
	IssuedDeviceAllocationComplete retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	IssuedDeviceAllocationChequeComplete retrieveCheques(String crReferenceId, String bqReferenceId);
	
	IssuedDeviceAllocationDeviceComplete retrieveDevices(String crReferenceId, String bqReferenceId);
	
	IssuedDeviceAllocationPasswordComplete retrievePasswords(String crReferenceId, String bqReferenceId);
	
	IssuedDeviceAllocationQuestionComplete retrieveQuestions(String crReferenceId, String bqReferenceId);
	
	IssuedDeviceAllocationReaderComplete retrieveReaders(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	IssuedDeviceAllocationComplete update(String crReferenceId, IssuedDeviceAllocationBasic request);
	
}
