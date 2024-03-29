package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UICustomer;
import com.brijframework.production.dto.UICustomerDetail;

public interface CustomerService {

	UICustomer saveCustomer(Long id, UICustomer uiCustomer);

	UICustomer getCustomer(Long id);

	boolean deleteCustomer(Long id);

	List<UICustomer> getCustomerList(Long vendorId);

	UICustomerDetail getCustomerDetail(Long id);

	List<UICustomer> getCustomerList();
}
