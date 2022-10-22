package br.com.douggo.factory.original.factory;

import br.com.douggo.factory.original.model.IPhone;
import br.com.douggo.factory.original.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
