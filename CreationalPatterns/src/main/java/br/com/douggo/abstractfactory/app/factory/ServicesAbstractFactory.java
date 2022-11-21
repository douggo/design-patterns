package br.com.douggo.abstractfactory.app.factory;

import br.com.douggo.abstractfactory.app.services.CarService;
import br.com.douggo.abstractfactory.app.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();
    CarService getCarService();

}
