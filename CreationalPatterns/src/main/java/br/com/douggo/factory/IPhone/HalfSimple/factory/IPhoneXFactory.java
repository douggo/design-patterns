package br.com.douggo.factory.IPhone.HalfSimple.factory;

import br.com.douggo.factory.IPhone.HalfSimple.enums.IPhoneModels;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhone;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhoneX;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(IPhoneModels deviceModel) {
        IPhone device = null;
        switch (deviceModel) {
            case IPHONE_X:
                device = new IPhoneX();
            break;
            case IPHONE_XS_MAX:
                device = new IPhoneXSMax();
            break;
            default:
                throw new RuntimeException("Não foi possível identificar o modelo do iPhone X!");
        }
        return device;
    }
}
