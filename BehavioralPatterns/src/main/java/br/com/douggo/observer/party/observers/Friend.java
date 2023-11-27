package br.com.douggo.observer.party.observers;

public class Friend implements Observer {

    private void giveGift() {
        System.out.println("Hey man, I bought you your favorite beer! Happy birthday!");
    }

    @Override
    public void act() {
        this.giveGift();
    }
}
