package com.homework1;

class Some{
	void someMethod(int i){
		System.out.println("int版本被调用");
	}
	void someMethod(Integer integer){
		System.out.println("integer版本被调用");
	}
}

public class Overloadboxing {
	public static void main(String[] args){
		Some s= new Some();
		s.someMethod(1);
	}
}
