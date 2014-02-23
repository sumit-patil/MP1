package com.iit.mp1.data;


import java.util.List;

import com.iit.mp1.domain.Contract;
import com.iit.mp1.domain.Transaction;

public class DataPrinter {

	public static void displayContractsInTabularFormat(List<Contract> contracts) {
		
		System.out.println("inside displayContractsInTabularFormat===>");

		for (Contract contractObj : contracts) {
			
		System.out.printf("%5s %30s %35s %35s %35s %60s %60s %60s %60s %60s %60s %60s %60s %60s %60s %60s %60s %65s %65s %65s %65s %65s %65s %65s %65s %65s %65s %65s %65s 65s %65s %65s\n\n",
				contractObj.getContract_id(),contractObj.getSeller_company_name(),contractObj.getCustomer_company_name(),
				contractObj.getCustomer_duns_number(),contractObj.getContract_affiliate(),contractObj.getFERC_tariff_reference(), 
				contractObj.getContract_service_agreement_id(),contractObj.getContract_execution_date(),
				contractObj.getContract_commencement_date(),contractObj.getContract_termination_date(),
				contractObj.getActual_termination_date(),contractObj.getExtension_provision_description(), 
				contractObj.getClass_name(),contractObj.getTerm_name(),contractObj.getIncrement_name(),contractObj.getIncrement_peaking_name(), 
				contractObj.getProduct_type_name(),contractObj.getProduct_name(), contractObj.getQuantity(),contractObj.getUnits_for_contract(), 
				contractObj.getRate(),contractObj.getRate_minimum(), contractObj.getRate_maximum(),contractObj.getRate_description(), 
				contractObj.getUnits_for_rate(),contractObj.getPoint_of_receipt_control_area(),contractObj.getPoint_of_receipt_specific_location(),
				contractObj.getPoint_of_delivery_control_area(),contractObj.getPoint_of_delivery_specific_location(),contractObj.getBegin_date(),
				contractObj.getEnd_date(),contractObj.getTime_zone());
		}
		System.out.println();

}

	
	public static void displayTransactionsInTabularFormat(List<Transaction> transaction) {
		
		System.out.println("inside displayTransactionsInTabularFormat===>");

		for (Transaction transactionObj : transaction) {
			
		System.out.printf("%5s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s %35s\n", 
				transactionObj.getTransaction_unique_identifier(),transactionObj.getSeller_company_name(),transactionObj.getCustomer_company_name(),
				transactionObj.getCustomer_duns_number(),transactionObj.getTariff_reference(),transactionObj.getContract_service_agreement(),transactionObj.getTrans_id(),
				transactionObj.getTransaction_begin_date(),transactionObj.getTransaction_end_date(),transactionObj.getTime_zone(),
				transactionObj.getPoint_of_delivery_control_area(),transactionObj.getSpecific_location(),transactionObj.getClass_name(),
				transactionObj.getTerm_name(),transactionObj.getIncrement_name(),transactionObj.getIncrement_peaking_name(),transactionObj.getProduct_name(),
				transactionObj.getTransaction_quantity(),transactionObj.getPrice(),transactionObj.getUnits(),transactionObj.getTotal_transmission_charge(),
				transactionObj.getTransaction_charge());
		}
	}
}
