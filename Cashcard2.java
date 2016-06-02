package com.homework1;

public class Cashcard2 {
	private String number;
	private int balance;
	private int bonus;
	Cashcard2(String number ,int balance, int bonus){
		this.number=number;
		this.balance=balance;
		this.bonus=bonus;
	}
	
	void store(int money){
		if (money>0){
			this.balance+=money;
			if(money>=1000){
				this.bonus++;
			}
		}
		else{
				System.out.println("储值不能为负数！");
		}
	}
	
	void charge(int money){
		if (money>0){
			if(money<=this.balance){
				this.balance-=money;
			}
			else{
				System.out.println("钱不够啦");
			}
		}
		else{
			System.out.println("扣负数？这不是叫我储值吗");
		}
	}
	
	int exchange(int bonus){
		if(bonus>0){
			this.bonus-=bonus;
		}
		return this.bonus;
	}
	
	
	
}
