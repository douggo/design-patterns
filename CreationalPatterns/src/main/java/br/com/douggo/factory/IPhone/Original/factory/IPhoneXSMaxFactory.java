package br.com.douggo.factory.IPhone.Original.factory;

import br.com.douggo.factory.IPhone.Original.model.IPhoneXSMax;
import br.com.douggo.factory.IPhone.Original.model.IPhone;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
