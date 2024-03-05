package ro.ase.cts.laboratory.models;

import ro.ase.cts.laboratory.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
	
	private static double MAX_CREDIT = 5000;

	public CurrentAccount(String iban) {
		super(iban);
		this.balance = MAX_CREDIT;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance < amount) {
			throw new InsufficientFundsException();
		}
		this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, double amount) {
		// TODO Auto-generated method stub
		
	}
	
	public static double getCreditLimit() {
		return CurrentAccount.MAX_CREDIT;
	}

}
