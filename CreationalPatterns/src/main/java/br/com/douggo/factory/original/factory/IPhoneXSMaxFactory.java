package br.com.douggo.factory.original.factory;

import br.com.douggo.factory.original.model.IPhone;
import br.com.douggo.factory.original.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
