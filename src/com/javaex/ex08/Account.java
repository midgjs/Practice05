package com.javaex.ex08;

public class Account {
	
	//필드
    private String accountNo;
    private int balance;
    
    //생성자
	public Account() {
		super();
	}
	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
    public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
	//필요한 메소드 작성
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void showBalance() {
		System.out.println(this.balance);
	}
}
