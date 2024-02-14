package br.com.douggo.template.sales.service.templates;

import br.com.douggo.template.sales.model.Cart;

import java.util.Calendar;

public class BlackFridatDiscounts extends BestOfferTemplate {

    public BlackFridatDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) == Calendar.NOVEMBER;
    }

    @Override
    protected void calibrateVariables() {
        this.priceFactor = 0.75d;
    }
}
