package br.com.douggo.factory.IPhone.HalfSimple.model;

import br.com.douggo.factory.IPhone.HalfSimple.enums.IPhoneModels;

public class IPhone11Pro extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}

	@Override
	public String toString() {
		return super.toString().concat(IPhoneModels.IPHONE_11_PRO.getModelName());
	}

}
