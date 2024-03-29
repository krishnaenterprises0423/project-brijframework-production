package com.brijframework.production.rest.cust;

import java.io.Serializable;

import com.brijframework.production.dto.cust.UICustMediaDetail;

public class CustCountFreqResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public String desc;
	public String typeId;
	public UICustMediaDetail globalMediaDetail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public UICustMediaDetail getCustMediaDetail() {
		return globalMediaDetail;
	}

	public void setCustMediaDetail(UICustMediaDetail globalMediaDetail) {
		this.globalMediaDetail = globalMediaDetail;
	}
}
