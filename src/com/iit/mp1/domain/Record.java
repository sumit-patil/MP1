package com.iit.mp1.domain;

public interface Record {
	
	Boolean isTransactionChargeSmaller(Record otherRecord );
	Double findTransactionChargeDifference(Record otherRecord);
	Boolean isTransactionQuantityGreater(Record otherRecord);
	Double findTransactionQuantityDifference(Record otherRecord);
}
