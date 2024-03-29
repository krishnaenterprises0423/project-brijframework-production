package com.brijframework.production.controller.inv;

import static com.brijframework.production.contants.Constants.CUST_APP_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustStorage;
import com.brijframework.production.service.cust.inv.CustStorageService;

@RestController
@RequestMapping("api/cust/storage")
public class CustStorageController {

	@Autowired
	CustStorageService custStorageService;
	
	@PostMapping
	public UICustStorage addStorage(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustStorage countFreq) {
		return custStorageService.saveStorage(custAppId,countFreq);
	}
	
	@GetMapping
	public List<UICustStorage> getStorageList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custStorageService.getStorageList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public UICustStorage getStorageList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return custStorageService.getStorage(custAppId, typeId);
	}
}
