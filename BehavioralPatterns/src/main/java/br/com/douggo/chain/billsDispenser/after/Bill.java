package br.com.douggo.chain.billsDispenser.after;

import java.util.Objects;

public class Bill {

    private final Integer value;

    private Bill next;

    public Bill(Integer value, Bill nextBill) {
        this.value = value;
        this.next = nextBill;
    }

    public Bill (Integer value) {
        this.value = value;
    }

    public void setNext(Bill next) {
        this.next = next;
    }

    public void execute(Integer remaining) {
        if (remaining >= this.value) {
            int bills = remaining/this.value;
            remaining %= this.value;
            System.out.println(String.format("%d bill(s) of $%d, $%d remaining", bills, this.value, remaining));
        }
        if (remaining == 0) {
            return;
        }
        if (Objects.nonNull(this.next)) {
            this.next.execute(remaining);
        }
    }

}
