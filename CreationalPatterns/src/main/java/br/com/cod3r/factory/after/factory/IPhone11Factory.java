package br.com.cod3r.factory.after.factory;

import br.com.cod3r.factory.after.model.IPhone;
import br.com.cod3r.factory.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhone11();
    }

}
