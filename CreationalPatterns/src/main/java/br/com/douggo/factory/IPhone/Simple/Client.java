package br.com.douggo.factory.IPhone.Simple;

import br.com.douggo.factory.IPhone.Simple.enums.IPhoneModels;
import br.com.douggo.factory.IPhone.Simple.factory.IPhoneFactory;
import br.com.douggo.factory.IPhone.Simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        orderIPhone(IPhoneModels.IPHONE_X);
        orderIPhone(IPhoneModels.IPHONE_XS_MAX);
        orderIPhone(IPhoneModels.IPHONE_11);
        orderIPhone(IPhoneModels.IPHONE_11_PRO);
    }

    private static void orderIPhone(IPhoneModels deviceModel) {
        System.out.println("### Ordering an iPhone " + deviceModel.getModelName());
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        IPhone device = iPhoneFactory.orderIphone(deviceModel);
        System.out.println(device + " has been ordered");
        System.out.println();
    }

}
