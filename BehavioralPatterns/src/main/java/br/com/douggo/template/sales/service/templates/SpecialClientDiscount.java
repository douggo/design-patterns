package br.com.douggo.template.sales.service.templates;

import br.com.douggo.template.sales.model.Cart;

public class SpecialClientDiscount extends BestOfferTemplate {

    public SpecialClientDiscount(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return cart.getBuyer().isSpecialClient();
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.85d;
        deliveryFactor = 0.5d;
    }

}
