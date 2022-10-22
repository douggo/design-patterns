package br.com.douggo.factory.Original;

import br.com.douggo.factory.Original.factory.*;
import br.com.douggo.factory.Original.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		orderIPhoneX();
		orderIPhone11Pro();
		orderIPhoneXSMax();
		orderIPhone11();
	}

	private static void orderIPhoneX() {
		System.out.println("### Ordering an iPhone X");
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhone iPhoneX = iPhoneXFactory.orderIphone();
		System.out.println(iPhoneX + " has been ordered");
	}

	private static void orderIPhone11Pro() {
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();
		IPhone iPhone11Pro = iPhone11ProFactory.orderIphone();
		System.out.println(iPhone11Pro + " has been ordered");
	}

	private static void orderIPhoneXSMax() {
		System.out.println("\n\n### Ordering an iPhone XS Max");
		IPhoneFactory iPhoneXSMaxFactory = new IPhoneXSMaxFactory();
		IPhone iPhoneXSMax = iPhoneXSMaxFactory.orderIphone();
		System.out.println(iPhoneXSMax + " has been ordered");
	}

	private static void orderIPhone11() {
		System.out.println("\n\n### Ordering an iPhone 11");
		IPhoneFactory iPhone11Factory = new IPhone11Factory();
		IPhone iPhone11 = iPhone11Factory.orderIphone();
		System.out.println(iPhone11 + " has been ordered");
	}

}
