package com.brijframework.production.rest.cust;

import java.io.Serializable;

public class CustProductWholeSaleRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String idenNo;
	// for purchase items
	private Double purchasePrice;
	private Long purchaseUnitId;
	private Long custProductId;
	// for sale items
	private Double wholeQnt;
	private Double wholePrice;
	private Long wholeUnitId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}
	

	public Long getCustProductId() {
		return custProductId;
	}

	public void setCustProductId(Long custProductId) {
		this.custProductId = custProductId;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Long getPurchaseUnitId() {
		return purchaseUnitId;
	}

	public void setPurchaseUnitId(Long purchaseUnitId) {
		this.purchaseUnitId = purchaseUnitId;
	}

	public Double getWholeQnt() {
		return wholeQnt;
	}

	public void setWholeQnt(Double wholeQnt) {
		this.wholeQnt = wholeQnt;
	}

	public Double getWholePrice() {
		return wholePrice;
	}

	public void setWholePrice(Double wholePrice) {
		this.wholePrice = wholePrice;
	}

	public Long getWholeUnitId() {
		return wholeUnitId;
	}

	public void setWholeUnitId(Long wholeUnitId) {
		this.wholeUnitId = wholeUnitId;
	}
	
}
