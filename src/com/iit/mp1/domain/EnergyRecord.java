package com.iit.mp1.domain;

abstract public class EnergyRecord {

	protected  String  seller_company_name;
	protected  String  customer_company_name;
	protected  String  customer_duns_number;
	protected  String  increment_name;
	protected  String  increment_peaking_name;
	protected  String  class_name;
	protected  String  term_name;
	protected  String  product_name;
	protected  String  point_of_delivery_control_area;
		
	public EnergyRecord() {
		super();
	}


	public EnergyRecord(String seller_company_name,
			String customer_company_name, String customer_duns_number,
			String increment_name, String increment_peaking_name,
			String class_name, String term_name, String product_name,
			String point_of_delivery_control_area) {
		super();
		this.seller_company_name = check(seller_company_name);
		this.customer_company_name = check(customer_company_name);
		this.customer_duns_number = check(customer_duns_number);
		this.increment_name = check(increment_name);
		this.increment_peaking_name = check(increment_peaking_name);
		this.class_name = check(class_name);
		this.term_name = check(term_name);
		this.product_name = check(product_name);
		this.point_of_delivery_control_area = check(point_of_delivery_control_area);
	}
	
	public String check(String value){
		if(value==null || value.isEmpty()){
			value = "0";
			return value;
		}
		return value;
	}

	public String getSeller_company_name() {
		return seller_company_name;
	}

	public void setSeller_company_name(String seller_company_name) {
		this.seller_company_name = seller_company_name;
	}

	public String getCustomer_company_name() {
		return customer_company_name;
	}

	public void setCustomer_company_name(String customer_company_name) {
		this.customer_company_name = customer_company_name;
	}

	public String getCustomer_duns_number() {
		return customer_duns_number;
	}

	public void setCustomer_duns_number(String customer_duns_number) {
		this.customer_duns_number = customer_duns_number;
	}

	public String getIncrement_name() {
		return increment_name;
	}

	public void setIncrement_name(String increment_name) {
		this.increment_name = increment_name;
	}

	public String getIncrement_peaking_name() {
		return increment_peaking_name;
	}

	public void setIncrement_peaking_name(String increment_peaking_name) {
		this.increment_peaking_name = increment_peaking_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getTerm_name() {
		return term_name;
	}

	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getPoint_of_delivery_control_area() {
		return point_of_delivery_control_area;
	}

	public void setPoint_of_delivery_control_area(
			String point_of_delivery_control_area) {
		this.point_of_delivery_control_area = point_of_delivery_control_area;
	}

	@Override
	public String toString() {
		return "EnergyRecord [seller_company_name=" + seller_company_name
				+ ", customer_company_name=" + customer_company_name
				+ ", customer_duns_number=" + customer_duns_number
				+ ", increment_name=" + increment_name
				+ ", increment_peaking_name=" + increment_peaking_name
				+ ", class_name=" + class_name + ", term_name=" + term_name
				+ ", product_name=" + product_name
				+ ", point_of_delivery_control_area="
				+ point_of_delivery_control_area + "]";
	}
	
	
}
