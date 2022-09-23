package br.com.cod3r.factory.after.factory;

import br.com.cod3r.factory.after.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone() {
        IPhone device = this.createIPhone();
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        return device;
    }

    abstract IPhone createIPhone();
	
}
