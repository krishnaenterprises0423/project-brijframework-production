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

import com.brijframework.production.dto.cust.UICustLocation;
import com.brijframework.production.service.cust.inv.CustLocationService;

@RestController
@RequestMapping("/api/cust/location")
public class CustLocationController {

	@Autowired
	CustLocationService custLocationService;
	
	@PostMapping
	public UICustLocation addLocation(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustLocation uiCustLocation) {
		return custLocationService.saveLocation(custAppId,uiCustLocation);
	}
	
	@GetMapping
	public List<UICustLocation> getLocationList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custLocationService.getLocationList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public UICustLocation getLocationList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return custLocationService.getLocation(custAppId, typeId);
	}
}
