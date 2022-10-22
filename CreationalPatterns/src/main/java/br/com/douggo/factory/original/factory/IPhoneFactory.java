package br.com.douggo.factory.original.factory;

import br.com.douggo.factory.original.model.IPhone;

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
