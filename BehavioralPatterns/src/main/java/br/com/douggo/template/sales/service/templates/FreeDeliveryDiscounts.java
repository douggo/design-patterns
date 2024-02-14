package br.com.douggo.template.sales.service.templates;

import br.com.douggo.template.sales.model.Cart;

public class FreeDeliveryDiscounts extends BestOfferTemplate {

    public FreeDeliveryDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return regularItemsPrice > 500;
    }

    @Override
    protected void calibrateVariables() {
        deliveryFactor = 0d;
    }

}
