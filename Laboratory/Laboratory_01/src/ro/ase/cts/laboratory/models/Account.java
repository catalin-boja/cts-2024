package ro.ase.cts.laboratory.models;

import ro.ase.cts.laboratory.exceptions.InsufficientFundsException;

public abstract class Account {

	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract void transfer(
			Account destination, double amount);
}
