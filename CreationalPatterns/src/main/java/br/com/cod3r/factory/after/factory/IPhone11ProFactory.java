package br.com.cod3r.factory.after.factory;

import br.com.cod3r.factory.after.model.IPhone;
import br.com.cod3r.factory.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
