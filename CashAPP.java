package com.homework1;

public class CashAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cashcard[] cards= {
				new Cashcard("A001",500,0),
				new Cashcard("A002",300,0),
				new Cashcard("A003",1000,1),
				new Cashcard("A004",2000,2),
				new Cashcard("A005",3000,3)
		};
		for (Cashcard card : cards){
			System.out.printf("(%s,%d,%d)%n",card.number,card.balance,card.bonus);
			
		}
		
		
	}

}
