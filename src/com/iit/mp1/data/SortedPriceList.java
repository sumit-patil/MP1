package com.iit.mp1.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.iit.mp1.domain.Transaction;

public class SortedPriceList {

	List<Transaction> transactionSortedByPrice;

	public SortedPriceList(List<Transaction> transactionlist) {
		transactionSortedByPrice = new ArrayList<Transaction>(transactionlist);
		Collections.sort(transactionSortedByPrice,
				new Comparator<Transaction>() {	
					public int compare(Transaction record1, Transaction record2) 
					{
					// return	Integer.parseInt(record1.getPrice())- Integer.parseInt(record2.getPrice());
					 return	(int)Float.parseFloat(record1.getPrice())- (int)Float.parseFloat(record2.getPrice());
					}
				}
				);
	}
	
	public List<Transaction> getTransactionRecordSortedByPrice() {
		return transactionSortedByPrice;
	}
	
}
