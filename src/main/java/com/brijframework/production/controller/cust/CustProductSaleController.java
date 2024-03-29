package com.brijframework.production.controller.cust;

import static com.brijframework.production.contants.Constants.CUST_APP_ID;
import static com.brijframework.production.contants.Constants.TYPE_ID;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.rest.cust.CustProductSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleResponse;
import com.brijframework.production.service.cust.CustProductSaleService;

@RestController
@RequestMapping("/api/cust/product/sale")
public class CustProductSaleController {

	@Autowired
	private CustProductSaleService custProductSaleService;
	
	@PostMapping
	public CustProductSaleResponse addProductSale(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody CustProductSaleRequest custProductSaleRequest) {
		return custProductSaleService.saveProductSale(custAppId,custProductSaleRequest);
	}
	
	@PutMapping
	public CustProductSaleResponse updateProductSale(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody CustProductSaleRequest custProductSaleRequest) {
		return custProductSaleService.updateProductSale(custAppId,custProductSaleRequest);
	}
	
	@GetMapping
	public List<CustProductSaleResponse> getProductList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custProductSaleService.getProductSaleList(custAppId);
	}
	
	@GetMapping("/type/{typeId}")
	public CustProductSaleResponse getProductList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable(TYPE_ID) String typeId) {
		return custProductSaleService.getProductSale(custAppId, typeId);
	}
	
	@GetMapping("/filter")
	public List<CustProductSaleResponse> filterProductList(@RequestHeader(CUST_APP_ID) long custAppId,@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fromDate, @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime toDate) {
		return custProductSaleService.filterProductSaleList(custAppId, fromDate, toDate);
	}
}
