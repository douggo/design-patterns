package br.com.douggo.factory.IPhone.Original.factory;

import br.com.douggo.factory.IPhone.Original.model.IPhone;
import br.com.douggo.factory.IPhone.Original.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneX();
    }

}
