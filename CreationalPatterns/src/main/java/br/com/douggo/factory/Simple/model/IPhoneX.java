package br.com.douggo.factory.Simple.model;

import br.com.douggo.factory.Simple.enums.IPhoneModels;

public class IPhoneX extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}

	@Override
	public String toString() {
		return super.toString().concat(IPhoneModels.IPHONE_X.getModelName());
	}
}
