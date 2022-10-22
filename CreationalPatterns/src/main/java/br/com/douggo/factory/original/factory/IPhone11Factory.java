package br.com.douggo.factory.original.factory;

import br.com.douggo.factory.original.model.IPhone;
import br.com.douggo.factory.original.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11();
    }

}
