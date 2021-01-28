package model.entities;

import model.entities.exception.DomainException;
import model.entities.exception.EnoughException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit)
			throws DomainException, EnoughException {
		this.number = number;
		this.holder = holder;
		if (balance == null) {
			throw new DomainException("Error unxpected");

		}
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit(Double amount) throws DomainException {

		this.balance = amount;

	}

	public void withdraw(Double amount) throws DomainException, EnoughException {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		} else if (amount > balance && amount < withdrawLimit) {
			throw new EnoughException("Not enough balance");

		}

		this.balance -= amount;

	}

	public String toString() {
		return "New balance: " + balance;

	}

}
