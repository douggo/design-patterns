package br.com.douggo.template.sales.service.templates;

import br.com.douggo.template.sales.model.Cart;

public class RegularPriceDiscount extends BestOfferTemplate {

    public RegularPriceDiscount(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        // Nothing to adjust!
    }

}
