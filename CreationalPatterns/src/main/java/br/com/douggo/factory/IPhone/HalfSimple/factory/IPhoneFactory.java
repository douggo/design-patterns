package br.com.douggo.factory.IPhone.HalfSimple.factory;

import br.com.douggo.factory.IPhone.HalfSimple.enums.IPhoneModels;
import br.com.douggo.factory.IPhone.HalfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(IPhoneModels deviceName) {
        IPhone device = this.createIPhone(deviceName);
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        return device;
    }

    protected abstract IPhone createIPhone(IPhoneModels deviceName);
	
}
