package br.com.douggo.abstractfactory.apple.model.iphone;

import br.com.douggo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {
	CountryRulesAbstractFactory rules;
	
	public IPhone(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public abstract void getHardware();
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
		System.out.println(this.rules.getCertificates().applyCertification());
	}

	public void pack() {
		System.out.println("Packing the device");
		System.out.println(this.rules.getPacking().pack());
	}
}
