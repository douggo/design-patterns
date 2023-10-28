package br.com.douggo.chain.billsDispenser.after;

public class Client {

	public static void main(String[] args) {
		Dispenser dispenser = new Dispenser();
		System.out.println("Withdrawing $230...");
		dispenser.withdraw(230);
	}
}
