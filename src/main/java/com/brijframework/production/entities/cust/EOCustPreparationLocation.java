package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.CUST_LOCATION_ID;
import static com.brijframework.production.contants.Constants.CUST_PREP_ID;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PREPARATION_LOCATION;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PREPARATION_LOCATION, uniqueConstraints = { @UniqueConstraint(columnNames = { 
		CUST_PROD_APP_ID, CUST_PREP_ID, CUST_LOCATION_ID  }) })
public class EOCustPreparationLocation extends EOCustObject{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name=CUST_PREP_ID)
	private EOCustPreparation custPreparation;
	
	@ManyToOne
	@JoinColumn(name=CUST_LOCATION_ID)
	private EOCustLocation custLocation;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	public EOCustPreparation getCustPreparation() {
		return custPreparation;
	}

	public void setCustPreparation(EOCustPreparation custPreparation) {
		this.custPreparation = custPreparation;
	}

	public EOCustLocation getCustLocation() {
		return custLocation;
	}

	public void setCustLocation(EOCustLocation custLocation) {
		this.custLocation = custLocation;
	}

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}

}

