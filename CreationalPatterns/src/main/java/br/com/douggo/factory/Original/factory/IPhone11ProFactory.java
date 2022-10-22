package br.com.douggo.factory.Original.factory;

import br.com.douggo.factory.Original.model.IPhone;
import br.com.douggo.factory.Original.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
