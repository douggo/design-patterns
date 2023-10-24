package br.com.douggo.proxy.bank.services;

public class ATM implements BankOperations {

    private final BankOperations bank;

    public ATM(BankOperations bank) {
        this.bank = bank;
    }

    @Override
    public void deposit(Long account, Long amount) {
        System.out.println("Calling bank through proxy...");
        this.bank.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String passwd, Long amount) {
        if (amount > 300) {
            System.out.println("You only can make withdrawals of 300. If you need more, then please go to one of our banks!");
            return;
        }
        System.out.println("Calling bank through proxy...");
        this.bank.withdraw(account, passwd, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("You can't change your password through an ATM. You'll need to go to one of our banks!");
    }
}
