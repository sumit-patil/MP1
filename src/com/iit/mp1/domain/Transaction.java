package com.iit.mp1.domain;

public class Transaction  extends EnergyRecord implements Record{

	private  String transaction_unique_identifier;
	private  String tariff_reference;
	private  String contract_service_agreement;
	private  String trans_id;
	private  String transaction_begin_date;
	private  String transaction_end_date;
	private  String time_zone;
	private  String specific_location;
	private  String transaction_quantity;
	private  String price;
	private  String units;
	private  String total_transmission_charge;
	private  String transaction_charge;

	public Transaction()
	{
		super();
		System.out.println("No Argument Constructor in Transaction");
	}
	
	public Transaction(String transaction_unique_identifier,
			String seller_company_name, String customer_company_name,
			String customer_duns_number, String tariff_reference,
			String contract_service_agreement, String trans_id,
			String transaction_begin_date, String transaction_end_date,
			String time_zone, String point_of_delivery_control_area,
			String specific_location, String class_name, String term_name,
			String increment_name, String increment_peaking_name,
			String product_name, String transaction_quantity, String price,
			String units, String total_transmission_charge, String transaction_charge) 
	{
		super();

		this.transaction_unique_identifier = check(transaction_unique_identifier);
		this.seller_company_name = check(seller_company_name);
		this.customer_company_name = check(customer_company_name);
		this.customer_duns_number = check(customer_duns_number);
		this.tariff_reference = check(tariff_reference);
		this.contract_service_agreement = check(contract_service_agreement);
		this.trans_id = check(trans_id);
		this.transaction_begin_date = check(transaction_begin_date);
		this.transaction_end_date = check(transaction_end_date);
		this.time_zone = check(time_zone);
		this.point_of_delivery_control_area = check(point_of_delivery_control_area);
		this.specific_location = check(specific_location);
		this.class_name = check(class_name);
		this.term_name = check(term_name);
		this.increment_name = check(increment_name);
		this.increment_peaking_name = check(increment_peaking_name);
		this.product_name = check(product_name);
		this.transaction_quantity = check(transaction_quantity);
		this.price = check(price);
		this.units = check(units);
		this.total_transmission_charge = check(total_transmission_charge);
		this.transaction_charge = check(transaction_charge);
	}

	public String check(String value){
		if(value==null || value.isEmpty()){
			value = "0";
			return value;
		}
		return value;
	}
	
	public String getTransaction_unique_identifier() {
		return transaction_unique_identifier;
	}

	public void setTransaction_unique_identifier(
			String transaction_unique_identifier) {
		this.transaction_unique_identifier = transaction_unique_identifier;
	}

	public String getTariff_reference() {
		return tariff_reference;
	}

	public void setTariff_reference(String tariff_reference) {
		this.tariff_reference = tariff_reference;
	}

	public String getContract_service_agreement() {
		return contract_service_agreement;
	}

	public void setContract_service_agreement(String contract_service_agreement) {
		this.contract_service_agreement = contract_service_agreement;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}

	public String getTransaction_begin_date() {
		return transaction_begin_date;
	}

	public void setTransaction_begin_date(String transaction_begin_date) {
		this.transaction_begin_date = transaction_begin_date;
	}

	public String getTransaction_end_date() {
		return transaction_end_date;
	}

	public void setTransaction_end_date(String transaction_end_date) {
		this.transaction_end_date = transaction_end_date;
	}

	public String getTime_zone() {
		return time_zone;
	}

	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}

	public String getSpecific_location() {
		return specific_location;
	}

	public void setSpecific_location(String specific_location) {
		this.specific_location = specific_location;
	}

	public String getTransaction_quantity() {
		return transaction_quantity;
	}

	public void setTransaction_quantity(String transaction_quantity) {
		this.transaction_quantity = transaction_quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getTotal_transmission_charge() {
		return total_transmission_charge;
	}

	public void setTotal_transmission_charge(String total_transmission_charge) {
		this.total_transmission_charge = total_transmission_charge;
	}

	public String getTransaction_charge() {
		return transaction_charge;
	}

	public void setTransaction_charge(String transaction_charge) {
		this.transaction_charge = transaction_charge;
	}


	@Override
	public Boolean isTransactionChargeSmaller(Record otherRecord) {
		// TODO Auto-generated method stub
		Transaction transObj = (Transaction) otherRecord;
		
		String thisValueStr = this.getTransaction_charge();
		String otherRecordValueStr = transObj.getTransaction_charge();
		
		System.out.println("Record 4 charge value:"+thisValueStr);
		System.out.println("Record 1 charge value:"+otherRecordValueStr);
		
		double thisValueInt = Float.parseFloat(this.getTransaction_charge());
		double otherRecordValueInt = Float.parseFloat(transObj.getTransaction_charge());
		
		if (thisValueInt > otherRecordValueInt)
            return false;
        else 
        	return true;
	}

	@Override
	public Double findTransactionChargeDifference(Record otherRecord) {
		// TODO Auto-generated method stub
		//return null;
		Transaction transObj =(Transaction)otherRecord;
		
		double thisVal = Float.parseFloat(this.getTransaction_charge());
		double otherRecordVal = Float.parseFloat(transObj.getTransaction_charge());
		
		double result = Math.abs(thisVal-otherRecordVal);
		
		return result;
	}

	@Override
	public Boolean isTransactionQuantityGreater(Record otherRecord) {
		// TODO Auto-generated method stub
		//return null;
		
		Transaction transObj = (Transaction) otherRecord;
		
		String thisValueStr = this.getTransaction_quantity();
		String otherRecordValueStr = transObj.getTransaction_quantity();
		
		System.out.println("Record4 quantity value:"+thisValueStr);
		System.out.println("Record1 quantity value:"+otherRecordValueStr);
		
		double thisValueInt = Float.parseFloat(thisValueStr);
		double otherRecordValueInt = Float.parseFloat(otherRecordValueStr);

		if (thisValueInt < otherRecordValueInt)
            return false;
        else 
        	return true;
	}

	@Override
	public Double findTransactionQuantityDifference(Record otherRecord) {
		// TODO Auto-generated method stub
		Transaction transObj =(Transaction)otherRecord;
		
		double thisVal = Float.parseFloat(this.getTransaction_quantity());
		double otherRecordVal = Float.parseFloat(transObj.getTransaction_quantity());
		
		double result = Math.abs(thisVal-otherRecordVal);
		
		return result;
	}
   
	
	/*public Double getTransactionChargeValue(Record otherRecord)
	{
		Transaction transObj = (Transaction)otherRecord;
		 double retVal = Float.parseFloat(transObj.getTransaction_charge());
		 return retVal;
	}
	
	public Double getTransactionQuantityValue(Record otherRecord)
	{
		Transaction transObj = (Transaction)otherRecord;
		double retVal = Float.parseFloat(transObj.getTransaction_quantity());
		return retVal;
	}
	*/
	
	@Override
	public String toString() {
		return "\nTransaction [transaction_unique_identifier="
				+ transaction_unique_identifier + ", seller_company_name="
				+ seller_company_name + ", customer_company_name="
				+ customer_company_name + ", customer_duns_number="
				+ customer_duns_number + ", tariff_reference="
				+ tariff_reference + ", contract_service_agreement="
				+ contract_service_agreement + ", trans_id=" + trans_id
				+ ", transaction_begin_date=" + transaction_begin_date
				+ ", transaction_end_date=" + transaction_end_date
				+ ", time_zone=" + time_zone
				+ ", point_of_delivery_control_area="
				+ point_of_delivery_control_area + ", specific_location="
				+ specific_location + ", class_name=" + class_name
				+ ", term_name=" + term_name + ", increment_name="
				+ increment_name + ", increment_peaking_name="
				+ increment_peaking_name + ", product_name=" + product_name
				+ ", transaction_quantity=" + transaction_quantity + ", price="
				+ price + ", units=" + units + ", total_transmission_charge="
				+ total_transmission_charge + ", transaction_charge="
				+ transaction_charge + "]";
	}
	
}
