package br.com.douggo.facade.isolated;

import br.com.douggo.facade.isolated.facades.CallCenterIsolatedFacade;

public class Client {

	private final static Long userId = 123456L;

	public static void main(String[] args) {
		CallCenterIsolatedFacade facade = new CallCenterIsolatedFacade();
		facade.getSummary(userId);
		facade.getPaymentInfoByCard(userId);
		facade.orderNewCard(userId);
	}
}
