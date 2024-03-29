package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.CUST_INGR_ID;
import static com.brijframework.production.contants.Constants.CUST_PREP_ID;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PREPARATION_RECIPE;
import static com.brijframework.production.contants.Constants.QNT;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PREPARATION_RECIPE, uniqueConstraints = { @UniqueConstraint(columnNames = { 
		CUST_PROD_APP_ID, CUST_INGR_ID, CUST_PREP_ID  }) })
public  class EOCustPreparationRecipe extends EOCustObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = QNT)
	private float qnt; 
	
	@OneToOne
	@JoinColumn(name=CUST_INGR_ID, nullable=false)
	private EOCustIngredient custIngredient;
	
	@ManyToOne
	@JoinColumn(name=CUST_PREP_ID, nullable=false)
	private EOCustPreparation custPreparation;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	public float getQnt() {
		return qnt;
	}

	public void setQnt(float qnt) {
		this.qnt = qnt;
	}

	public EOCustIngredient getCustIngredient() {
		return custIngredient;
	}

	public void setCustIngredient(EOCustIngredient custIngredient) {
		this.custIngredient = custIngredient;
	}

	public EOCustPreparation getCustPreparation() {
		return custPreparation;
	}

	public void setCustPreparation(EOCustPreparation custPreparation) {
		this.custPreparation = custPreparation;
	}

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}
	
}
