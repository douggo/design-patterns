package br.com.douggo.factory.IPhone.HalfSimple.factory;

import br.com.douggo.factory.IPhone.HalfSimple.enums.IPhoneModels;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhone11;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhone;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(IPhoneModels deviceModel) {
        IPhone device = null;
        switch (deviceModel) {
            case IPHONE_11:
                device = new IPhone11();
            break;
            case IPHONE_11_PRO:
                device = new IPhone11Pro();
            break;
            default:
                throw new RuntimeException("Não foi possível identificar o modelo do iPhone 11!");
        }
        return device;
    }

}
