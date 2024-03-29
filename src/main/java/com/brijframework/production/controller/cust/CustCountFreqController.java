package com.brijframework.production.controller.cust;

import static com.brijframework.production.contants.Constants.CUST_APP_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.rest.cust.CustCountFreqRequest;
import com.brijframework.production.rest.cust.CustCountFreqResponse;
import com.brijframework.production.service.cust.CustCountFreqService;

@RestController
@RequestMapping("/api/cust/countfreq")
public class CustCountFreqController {

	@Autowired
	CustCountFreqService custCountFreqService;
	
	@PostMapping
	public CustCountFreqResponse addCountFreq(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody CustCountFreqRequest custCountFreqRequest) {
		return custCountFreqService.saveCountFreq(custAppId,custCountFreqRequest);
	}
	
	@PutMapping
	public CustCountFreqResponse updateCountFreq(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody CustCountFreqRequest custCountFreqRequest) {
		return custCountFreqService.saveCountFreq(custAppId,custCountFreqRequest);
	}
	
	@GetMapping
	public List<CustCountFreqResponse> getCountFreqList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custCountFreqService.getCountFreqList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public List<CustCountFreqResponse> getCountFreqList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return custCountFreqService.getCountFreq(custAppId,typeId);
	}
}
