package br.com.douggo.template.sales.service;

import br.com.douggo.template.sales.model.Cart;
import br.com.douggo.template.sales.service.templates.*;

import java.util.ArrayList;
import java.util.List;

public class BestOfferService {
	private List<BestOfferTemplate> templates;

	private void loadTemplates(Cart cart) {
		templates = new ArrayList<BestOfferTemplate>();
		this.templates.add(new BigCartDiscounts(cart));
		this.templates.add(new BlackFridatDiscounts(cart));
		this.templates.add(new CategoryDiscounts(cart));
		this.templates.add(new FreeDeliveryDiscounts(cart));
		this.templates.add(new RegularPriceDiscount(cart));
		this.templates.add(new SpecialClientDiscount(cart));
	}

	public void calculateBestOffer(Cart cart) {
		this.loadTemplates(cart);
		double bestOffer = Double.MAX_VALUE;
		for(BestOfferTemplate template: templates) {
			if(template.isAppliable()) {
				Double currentPrice = template.calculateOffer(cart);
				System.out.println(String.format("%s: %.2f", template.getClass().getSimpleName(), currentPrice));
				bestOffer = (bestOffer > currentPrice)? currentPrice: bestOffer;
			}
		}
		System.out.println(String.format("Final Price: %.2f", bestOffer));
	}
}