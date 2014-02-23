package com.iit.mp1.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.iit.mp1.domain.Contract;
import com.iit.mp1.domain.Transaction;

public class DataProvider 
{

	public static List<Contract> getAllContracts() 
	{
		List<Contract> contractsList = new ArrayList<Contract>();
		//String csvFile = "C:/Users/samsung/Desktop/contracts.csv";
		String csvFile = "contracts.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	
		try
		{
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) 
			{
				String[] contractsData = line.split(cvsSplitBy);
				contractsList.add(new Contract(contractsData[0], contractsData[1],
						contractsData[2], contractsData[3],
						contractsData[4], contractsData[5],
						contractsData[6],
						contractsData[7], contractsData[8],
						contractsData[9], contractsData[10],
						contractsData[11], contractsData[12],
						contractsData[13], contractsData[14],
						contractsData[15], contractsData[16],
						contractsData[17], contractsData[18], contractsData[19],
						contractsData[20], contractsData[21], contractsData[22],
						contractsData[23], contractsData[24],
						contractsData[25],
						contractsData[26],
						contractsData[27],
						contractsData[28], contractsData[29],
						contractsData[30], contractsData[31]));
				
			}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			   
				//System.out.println("getAllContracts, Done!!");
				return contractsList;
	}

	public static List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub

		List<Transaction> transactionsList = new ArrayList<Transaction>();
		
		//String csvFile = "C:/Users/samsung/Desktop/transaction.csv";
		String csvFile = "transactions.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	
		try
		{
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null)
				{
					String[] transactionData = line.split(cvsSplitBy);
					transactionsList.add(new Transaction(transactionData[0], transactionData[1],
							transactionData[2], transactionData[3],
							transactionData[4], transactionData[5],
							transactionData[6],
							transactionData[7], transactionData[8],
							transactionData[9], transactionData[10],
							transactionData[11], transactionData[12],
							transactionData[13], transactionData[14],
							transactionData[15], transactionData[16],
							transactionData[17], transactionData[18], transactionData[19],
							transactionData[20], transactionData[21]));
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		 
			//System.out.println("getAllTransactions, Done!!");
			return transactionsList;


	}

}
