package br.com.douggo.factory.Original.factory;

import br.com.douggo.factory.Original.model.IPhone;
import br.com.douggo.factory.Original.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
