package br.com.cod3r.factory.after.factory;

import br.com.cod3r.factory.after.model.IPhone;
import br.com.cod3r.factory.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    IPhone createIPhone() {
        return new IPhoneX();
    }

}
