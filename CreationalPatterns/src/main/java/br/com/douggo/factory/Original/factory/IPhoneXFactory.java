package br.com.douggo.factory.Original.factory;

import br.com.douggo.factory.Original.model.IPhone;
import br.com.douggo.factory.Original.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneX();
    }

}
