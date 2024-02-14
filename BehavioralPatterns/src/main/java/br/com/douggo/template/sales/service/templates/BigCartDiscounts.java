package br.com.douggo.template.sales.service.templates;

import br.com.douggo.template.sales.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

    public BigCartDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return regularItemsPrice > 1000;
    }

    @Override
    protected void calibrateVariables() {
        this.priceFactor = 0.9d;
    }
}
