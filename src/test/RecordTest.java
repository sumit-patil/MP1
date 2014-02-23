package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.iit.mp1.data.DataProvider;
import com.iit.mp1.domain.Record;
import com.iit.mp1.domain.Transaction;

public class RecordTest {

	List<Transaction> transaction = DataProvider.getAllTransactions();
	Record record1 = transaction.get(0);
	Record record4 = transaction.get(1);
	
	@Test
	public void testIsTransactionChargeSmaller() {
			assertTrue(record1.isTransactionChargeSmaller(record4));	
	}
	
	
	@Test
	public void testFindTransactionChargeDifference(){
			assertEquals(new Double(342786.0), record1.findTransactionChargeDifference(record4));
	}

	@Test
	public void testIsTransactionQuantityGreater(){
			assertTrue(record1.isTransactionQuantityGreater(record4));
	}
	
	
	@Test
	public void testFindTransactionQantityDifference(){
			assertEquals(new Double(5774.0), record1.findTransactionQuantityDifference(record4));
	}
}
