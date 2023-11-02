package br.com.douggo.chain.billsDispenser.after;

public class Dispenser {

    private final Bill chain;

    public Dispenser() {
        this(new Bill(100, new Bill(50, new Bill(25, new Bill(10, new Bill(5, new Bill(1)))))));
    }

    public Dispenser(Bill... bills) {
        for(int index = 0; index < bills.length -1; index++) {
            Bill currentBill = bills[index];
            currentBill.setNext(bills[index + 1]);
        }
        chain = bills[0];
    }

    public void withdraw(int amount) {
        this.chain.execute(amount);
    }

}