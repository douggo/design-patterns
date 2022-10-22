package br.com.douggo.factory.original.factory;

import br.com.douggo.factory.original.model.IPhone;
import br.com.douggo.factory.original.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneX();
    }

}
