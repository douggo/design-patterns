package br.com.douggo.factory.Original.factory;

import br.com.douggo.factory.Original.model.IPhone;
import br.com.douggo.factory.Original.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11();
    }

}
