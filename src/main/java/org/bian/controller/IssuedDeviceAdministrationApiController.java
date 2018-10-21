/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class IssuedDeviceAdministrationApiController {

	@Autowired
	IssuedDeviceAdministrationApiService service;
	
	@Allocate.Provide
	public BianResponse<IssuedDeviceAllocationComplete> provide(@RequestBody BianRequest<IssuedDeviceAllocationBasic> bianRequest) {
		return BianResponse.forSuccess(service.provide(bianRequest.getData()));
	}
	
	@Allocate.Record
	public BianResponse<IssuedDeviceAllocationRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<IssuedDeviceAllocationBasic> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Retrieve
	public BianResponse<IssuedDeviceAllocationComplete> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("cheques")
	@Allocate.Retrieve
	public BianResponse<IssuedDeviceAllocationChequeComplete> retrieveCheques(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCheques(crReferenceId, bqReferenceId));
	}
	
	@BQ("devices")
	@Allocate.Retrieve
	public BianResponse<IssuedDeviceAllocationDeviceComplete> retrieveDevices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevices(crReferenceId, bqReferenceId));
	}
	
	@BQ("passwords")
	@Allocate.Retrieve
	public BianResponse<IssuedDeviceAllocationPasswordComplete> retrievePasswords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePasswords(crReferenceId, bqReferenceId));
	}
	
	@BQ("questions")
	@Allocate.Retrieve
	public BianResponse<IssuedDeviceAllocationQuestionComplete> retrieveQuestions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQuestions(crReferenceId, bqReferenceId));
	}
	
	@BQ("readers")
	@Allocate.Retrieve
	public BianResponse<IssuedDeviceAllocationReaderComplete> retrieveReaders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReaders(crReferenceId, bqReferenceId));
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Allocate.Update
	public BianResponse<IssuedDeviceAllocationComplete> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<IssuedDeviceAllocationBasic> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
