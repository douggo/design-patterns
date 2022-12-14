package br.com.douggo.factory.IPhone.HalfSimple.model;

import br.com.douggo.factory.IPhone.HalfSimple.enums.IPhoneModels;

public class IPhone11 extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}

	@Override
	public String toString() {
		return super.toString().concat(IPhoneModels.IPHONE_11.getModelName());
	}

}
