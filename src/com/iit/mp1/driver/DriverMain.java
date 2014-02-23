package com.iit.mp1.driver;

import java.util.List;

import com.iit.mp1.data.DataPrinter;
import com.iit.mp1.data.DataProvider;
import com.iit.mp1.data.SortedPriceList;
import com.iit.mp1.domain.Contract;
import com.iit.mp1.domain.Record;
import com.iit.mp1.domain.Transaction;

public class DriverMain {

	public static void main(String[] args) {
		
		//create an instance of each energy record class for each row in the two files
		//collect all contract objects into an array or Collection of Records
		//collect all transaction objects into an array or Collection of Records
		List<Contract> contracts = DataProvider.getAllContracts(); 
		List<Transaction> transactions = DataProvider.getAllTransactions();
			
		System.out.println("====================================================================================================");
		//display all contract data using the toString() method in a loop
		System.out.println("Display AllContracts toString:");
		for (Contract contract : contracts) {
			System.out.println(contract.toString());
		}

		System.out.println("====================================================================================================");
		//displaying contracts and transaction data in tabular format
		System.out.println("Displaying contracts and transaction data in tabular format:");
		DataPrinter.displayContractsInTabularFormat(contracts);
		DataPrinter.displayTransactionsInTabularFormat(transactions);
		
		Record record4= transactions.get(4);
		Record record1= transactions.get(1);
		
		System.out.println("\n====================================================================================================");
		//---->display the comparisons of the transaction_charge of any two Records
		Boolean booleanResultForChargeDifference = record4.isTransactionChargeSmaller(record1);
		Double chargeValueDifference = record4.findTransactionChargeDifference(record1);
		System.out.println("Transaction charge of record4 is smaller than of record1: "+booleanResultForChargeDifference);
		System.out.println("Difference between the charge values is "+chargeValueDifference);
		
		System.out.println("====================================================================================================");
		//----->display the comparisons of the transaction_quantity of any two Records
		Boolean booleanResultForQuantityDifference = record4.isTransactionQuantityGreater(record1);
		Double quantityValueDifferene = record4.findTransactionQuantityDifference(record1);
		System.out.println("Transaction quantity of record4 is greater than of record1: "+booleanResultForQuantityDifference);
		System.out.println("Differnce between the quantity value is "+quantityValueDifferene);
		
		System.out.println("====================================================================================================");
		//------> Sorting all Records by price
		SortedPriceList sortedpricelistObj = new SortedPriceList(transactions);
		sortedpricelistObj.getTransactionRecordSortedByPrice();
		//for (Transaction transaction : sortedpricelistObj.getTransactionRecordSortedByPrice()) {
			System.out.println("Displaying all records sorted by Price ");
			DataPrinter.displayTransactionsInTabularFormat(sortedpricelistObj.getTransactionRecordSortedByPrice());
		//}

	}

}
