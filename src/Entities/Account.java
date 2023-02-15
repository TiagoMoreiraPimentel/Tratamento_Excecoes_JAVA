package Entities;

import Exceptions.BusinessException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	/* 
	 * função que realiza o saque, dentro desta função colocamos 
	 * o metodo criado 'validateException' retornando a quantidade inserida para comparação
	 */
	public void withDraw(Double amount) {
		validateException(amount);
		this.balance -= amount;
	}
	
	// metodo de exceções criado para testar as condições.
	public void validateException(double amount) {
		if(amount > getWithDrawLimit()) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
		else if(amount > getBalance()) {
			throw new BusinessException("Withdraw error: Not enough balance");
		}
	}
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
}
