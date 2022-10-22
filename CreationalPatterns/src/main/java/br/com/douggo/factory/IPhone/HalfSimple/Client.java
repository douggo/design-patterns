package br.com.douggo.factory.IPhone.HalfSimple;

import br.com.douggo.factory.IPhone.HalfSimple.enums.IPhoneModels;
import br.com.douggo.factory.IPhone.HalfSimple.factory.IPhone11Factory;
import br.com.douggo.factory.IPhone.HalfSimple.factory.IPhoneFactory;
import br.com.douggo.factory.IPhone.HalfSimple.factory.IPhoneXFactory;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        orderIPhoneX(IPhoneModels.IPHONE_X);
        orderIPhoneX(IPhoneModels.IPHONE_XS_MAX);
        orderIPhone11(IPhoneModels.IPHONE_11);
        orderIPhone11(IPhoneModels.IPHONE_11_PRO);
    }

    private static void orderIPhoneX(IPhoneModels deviceModel) {
        System.out.println("### Ordering an iPhone " + deviceModel.getModelName());
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhone device = iPhoneXFactory.orderIphone(deviceModel);
        System.out.println(device + " has been ordered");
        System.out.println();
    }

    private static void orderIPhone11(IPhoneModels deviceModel) {
        System.out.println("### Ordering an iPhone " + deviceModel.getModelName());
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhone device = iPhone11Factory.orderIphone(deviceModel);
        System.out.println(device + " has been ordered");
        System.out.println();
    }

}
