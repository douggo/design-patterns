package br.com.douggo.abstractfactory.app.factory;

import br.com.douggo.abstractfactory.app.services.CarEJBService;
import br.com.douggo.abstractfactory.app.services.CarService;
import br.com.douggo.abstractfactory.app.services.UserEJBService;
import br.com.douggo.abstractfactory.app.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
