package br.com.douggo.abstractfactory.apple;

import br.com.douggo.abstractfactory.apple.factory.IPhone11Factory;
import br.com.douggo.abstractfactory.apple.factory.IPhoneFactory;
import br.com.douggo.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.douggo.abstractfactory.apple.factory.abstractFactory.BrazilRulesAbstractFactory;
import br.com.douggo.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.douggo.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		orderBrazilianIPhone();
		System.out.println();
		orderAmericanIPhone();
	}

	private static void orderBrazilianIPhone() {
		System.out.println("Ordering an iPhone11 from Brazil");
		IPhoneFactory iPhone11Factory = new IPhone11Factory(new BrazilRulesAbstractFactory());
		IPhone iPhone11 = iPhone11Factory.orderIPhone("standard");
		System.out.println(String.format("iPhone11 ordered! %s)", iPhone11));
	}

	private static void orderAmericanIPhone() {
		System.out.println("Ordering an iPhoneXS from USA");
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(new USRulesAbstractFactory());
		IPhone iPhoneXS = iPhoneXFactory.orderIPhone("highEnd");
		System.out.println(String.format("iPhoneXS Max has been ordered!"));
	}
}
