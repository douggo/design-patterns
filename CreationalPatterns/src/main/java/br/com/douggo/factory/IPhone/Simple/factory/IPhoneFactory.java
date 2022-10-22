package br.com.douggo.factory.IPhone.Simple.factory;

import br.com.douggo.factory.IPhone.Simple.enums.IPhoneModels;
import br.com.douggo.factory.IPhone.Simple.model.*;
import br.com.douggo.factory.Simple.model.*;

public class IPhoneFactory {

    public IPhone orderIphone(IPhoneModels deviceName) {
        IPhone device = this.createIPhone(deviceName);
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        return device;
    }

    private IPhone createIPhone(IPhoneModels deviceName) {
        IPhone device = null;
        switch (deviceName) {
            case IPHONE_X:
                device = new IPhoneX();
            break;
            case IPHONE_XS_MAX:
                device = new IPhoneXSMax();
            break;
            case IPHONE_11:
                device = new IPhone11();
            break;
            case IPHONE_11_PRO:
                device = new IPhone11Pro();
            break;
            default:
                throw new RuntimeException("Não foi possível identificar o modelo do iPhone!");
        }
        return device;
    }

}
