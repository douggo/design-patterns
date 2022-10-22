package br.com.douggo.factory.IPhone.Original.factory;

import br.com.douggo.factory.IPhone.Original.model.IPhone11Pro;
import br.com.douggo.factory.IPhone.Original.model.IPhone;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
