package br.com.douggo.facade.after;

import br.com.douggo.facade.after.facades.CallCenterFacade;
import br.com.douggo.facade.after.model.Card;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		facade.getSummary(card);
		facade.getPaymentInfoByCard(card);
		facade.orderNewCard(card);
	}
}
