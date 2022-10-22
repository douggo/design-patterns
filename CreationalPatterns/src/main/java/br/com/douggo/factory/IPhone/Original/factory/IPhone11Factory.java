package br.com.douggo.factory.IPhone.Original.factory;

import br.com.douggo.factory.IPhone.Original.model.IPhone11;
import br.com.douggo.factory.IPhone.Original.model.IPhone;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11();
    }

}
