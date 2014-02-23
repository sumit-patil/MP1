package com.iit.mp1.domain;

public class Contract extends EnergyRecord {

	private  String  contract_id;
	private  String  contract_affiliate;
	private  String  FERC_tariff_reference;
	private  String  contract_service_agreement_id;
	private  String  contract_execution_date;
	private  String  contract_commencement_date;
	private  String  contract_termination_date;
	private  String  actual_termination_date;
	private  String  extension_provision_description;
	private  String  product_type_name;
	private  String  quantity;
	private  String  units_for_contract;
	private  String  rate;
	private  String  rate_minimum;
	private  String  rate_maximum;
	private  String  rate_description;
	private  String  units_for_rate;
	private  String  point_of_receipt_control_area;
	private  String  point_of_receipt_specific_location;
	private  String  point_of_delivery_specific_location;
	private  String  begin_date;
	private  String  end_date;
	private  String  time_zone;
	
	public Contract()
	{
		super();
		System.out.println("No Argument Constructor in Contract");
	}
	
	public Contract(String contract_id, String seller_company_name,
			String customer_company_name, String customer_duns_number,
			String contract_affiliate, String fERC_tariff_reference,
			String contract_service_agreement_id,
			String contract_execution_date, String contract_commencement_date,
			String contract_termination_date, String actual_termination_date,
			String extension_provision_description, String class_name,
			String term_name, String increment_name,
			String increment_peaking_name, String product_type_name,
			String product_name, String quantity, String units_for_contract,
			String rate, String rate_minimum, String rate_maximum,
			String rate_description, String units_for_rate,
			String point_of_receipt_control_area,
			String point_of_receipt_specific_location,
			String point_of_delivery_control_area,
			String point_of_delivery_specific_location,
			String begin_date,
			String end_date, String time_zone) 
	{
		super();
		//---setting fields value to zero where data is not present
		this.contract_id = check(contract_id);
		this.seller_company_name = check(seller_company_name);
		this.customer_company_name = check(customer_company_name);
		this.customer_duns_number = check(customer_duns_number);
		this.contract_affiliate = check(contract_affiliate);
		this.FERC_tariff_reference = check(fERC_tariff_reference);
		this.contract_service_agreement_id = check(contract_service_agreement_id);
		this.contract_execution_date = check(contract_execution_date);
		this.contract_commencement_date = check(contract_commencement_date);
		this.contract_termination_date = check(contract_termination_date);
		this.actual_termination_date = check(actual_termination_date);
		this.extension_provision_description = check(extension_provision_description);
		this.class_name = check(class_name);
		this.term_name = check(term_name);
		this.increment_name = check(increment_name);
		this.increment_peaking_name = check(increment_peaking_name);
		this.product_type_name = check(product_type_name);
		this.product_name = check(product_name);
		this.quantity = check(quantity);
		this.units_for_contract = check(units_for_contract);
    	this.rate = check(rate);
		this.rate_minimum = check(rate_minimum);
		this.rate_maximum = check(rate_maximum);
		this.rate_description = check(rate_description);
		this.units_for_rate = check(units_for_rate);
		this.point_of_receipt_control_area = check(point_of_receipt_control_area);
		this.point_of_receipt_specific_location = check(point_of_receipt_specific_location);
		this.point_of_delivery_control_area = check(point_of_delivery_control_area);
		this.point_of_delivery_specific_location = check(point_of_delivery_specific_location);
		this.begin_date = check(begin_date);
		this.end_date = check(end_date);
		this.time_zone = check(time_zone);
	}
	
	public String check(String value){
		if(value==null || value.isEmpty()){
			value = "0";
			return value;
		}
		return value;
	}
	
	public String getContract_id() {
		return contract_id;
	}

	public void setContract_id(String contract_id) {
		//this.contract_id = contract_id;
		if(contract_id!=null && !contract_id.isEmpty())
			this.contract_id = contract_id;
			else
			this.contract_id = "0";
	}

	public String getContract_affiliate() {
		return contract_affiliate;
	}

	public void setContract_affiliate(String contract_affiliate) {
		this.contract_affiliate = contract_affiliate;
	}

	public String getFERC_tariff_reference() {
		return FERC_tariff_reference;
	}

	public void setFERC_tariff_reference(String fERC_tariff_reference) {
		FERC_tariff_reference = fERC_tariff_reference;
	}

	public String getContract_service_agreement_id() {
		return contract_service_agreement_id;
	}

	public void setContract_service_agreement_id(
			String contract_service_agreement_id) {
		this.contract_service_agreement_id = contract_service_agreement_id;
	}

	public String getContract_execution_date() {
		return contract_execution_date;
	}

	public void setContract_execution_date(String contract_execution_date) {
		this.contract_execution_date = contract_execution_date;
	}

	public String getContract_commencement_date() {
		return contract_commencement_date;
	}

	public void setContract_commencement_date(String contract_commencement_date) {
		this.contract_commencement_date = contract_commencement_date;
	}

	public String getContract_termination_date() {
		return contract_termination_date;
	}

	public void setContract_termination_date(String contract_termination_date) {
		this.contract_termination_date = contract_termination_date;
	}

	public String getActual_termination_date() {
		return actual_termination_date;
	}

	public void setActual_termination_date(String actual_termination_date) {
		this.actual_termination_date = actual_termination_date;
	}

	public String getExtension_provision_description() {
		return extension_provision_description;
	}

	public void setExtension_provision_description(
			String extension_provision_description) {
		this.extension_provision_description = extension_provision_description;
	}

	public String getProduct_type_name() {
		return product_type_name;
	}

	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnits_for_contract() {
		return units_for_contract;
	}

	public void setUnits_for_contract(String units_for_contract) {
		this.units_for_contract = units_for_contract;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRate_minimum() {
		return rate_minimum;
	}

	public void setRate_minimum(String rate_minimum) {
		this.rate_minimum = rate_minimum;
	}

	public String getRate_maximum() {
		return rate_maximum;
	}

	public void setRate_maximum(String rate_maximum) {
		this.rate_maximum = rate_maximum;
	}

	public String getRate_description() {
		return rate_description;
	}

	public void setRate_description(String rate_description) {
		this.rate_description = rate_description;
	}

	public String getUnits_for_rate() {
		return units_for_rate;
	}

	public void setUnits_for_rate(String units_for_rate) {
		this.units_for_rate = units_for_rate;
	}

	public String getPoint_of_receipt_control_area() {
		return point_of_receipt_control_area;
	}

	public void setPoint_of_receipt_control_area(
			String point_of_receipt_control_area) {
		this.point_of_receipt_control_area = point_of_receipt_control_area;
	}

	public String getPoint_of_receipt_specific_location() {
		return point_of_receipt_specific_location;
	}

	public void setPoint_of_receipt_specific_location(
			String point_of_receipt_specific_location) {
		this.point_of_receipt_specific_location = point_of_receipt_specific_location;
	}

	public String getPoint_of_delivery_control_area() {
		return point_of_delivery_control_area;
	}

	public void setPoint_of_delivery_control_area(
			String point_of_delivery_control_area) {
		this.point_of_delivery_control_area = point_of_delivery_control_area;
	}

	public String getPoint_of_delivery_specific_location() {
		return point_of_delivery_specific_location;
	}

	public void setPoint_of_delivery_specific_location(
			String point_of_delivery_specific_location) {
		this.point_of_delivery_specific_location = point_of_delivery_specific_location;
	}

	public String getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(String begin_date) {
		this.begin_date = begin_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getTime_zone() {
		return time_zone;
	}

	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}


	@Override
	public String toString() {
		return "\nContract [contract_id=" + contract_id
				+ ", seller_company_name=" + seller_company_name
				+ ", customer_company_name=" + customer_company_name
				+ ", customer_duns_number=" + customer_duns_number
				+ ", contract_affiliate=" + contract_affiliate
				+ ", FERC_tariff_reference=" + FERC_tariff_reference
				+ ", contract_service_agreement_id="
				+ contract_service_agreement_id + ", contract_execution_date="
				+ contract_execution_date + ", contract_commencement_date="
				+ contract_commencement_date + ", contract_termination_date="
				+ contract_termination_date + ", actual_termination_date="
				+ actual_termination_date
				+ ", extension_provision_description="
				+ extension_provision_description + ", class_name="
				+ class_name + ", term_name=" + term_name + ", increment_name="
				+ increment_name + ", increment_peaking_name="
				+ increment_peaking_name + ", product_type_name="
				+ product_type_name + ", product_name=" + product_name
				+ ", quantity=" + quantity + ", units_for_contract="
				+ units_for_contract + ", rate=" + rate + ", rate_minimum="
				+ rate_minimum + ", rate_maximum=" + rate_maximum
				+ ", rate_description=" + rate_description
				+ ", units_for_rate=" + units_for_rate
				+ ", point_of_receipt_control_area="
				+ point_of_receipt_control_area
				+ ", point_of_receipt_specific_location="
				+ point_of_receipt_specific_location
				+ ", point_of_delivery_control_area="
				+ point_of_delivery_control_area
				+ ", point_of_delivery_specific_location="
				+ point_of_delivery_specific_location + ", begin_date="
				+ begin_date + ", end_date=" + end_date + ", time_zone="
				+ time_zone + "]";
	}
	
	
}
