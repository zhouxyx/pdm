package com.xxx.pdm.inexp.vo;


public class InExpVo {

	private double income ;
	private double expense ;
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}
	public InExpVo() {
		super();
	}
	public InExpVo(double income, double expense) {
		super();
		this.income = income;
		this.expense = expense;
	}
	
	
}
