package br.com.douggo.abstractfactory.app;

import br.com.douggo.abstractfactory.app.factory.EJBAbstractFactory;
import br.com.douggo.abstractfactory.app.factory.RestAbstractFactory;
import br.com.douggo.abstractfactory.app.factory.ServicesAbstractFactory;
import br.com.douggo.abstractfactory.app.services.CarService;
import br.com.douggo.abstractfactory.app.services.UserService;

public class Client {

	private static ServicesAbstractFactory ejbFactory = new EJBAbstractFactory();
	private static ServicesAbstractFactory restFactory = new RestAbstractFactory();

	public static void main(String[] args) {
		save();
		System.out.println();
		System.out.println("==========");
		System.out.println();
		deleteOrUpdate();
	}

	public static void save() {
		Boolean toManipulate = false;
		processUserFromEJB(toManipulate);
		System.out.println();
		processUserFromRest(toManipulate);
		System.out.println();
		processCarFromEJB(toManipulate);
		System.out.println();
		processCarFromRest(toManipulate);
	}

	public static void deleteOrUpdate() {
		Boolean toManipulate = true;
		processUserFromEJB(toManipulate);
		System.out.println();
		processUserFromRest(toManipulate);
		System.out.println();
		processCarFromEJB(toManipulate);
		System.out.println();
		processCarFromRest(toManipulate);
	}

	private static void processUserFromEJB(Boolean toDelete) {
		UserService user = ejbFactory.getUserService();
		if(toDelete) {
			user.delete(1);
		} else {
			user.save("Douglas");
		}
	}

	private static void processUserFromRest(Boolean toDelete) {
		UserService user = restFactory.getUserService();
		if(toDelete) {
			user.delete(1);
		} else {
			user.save("Doug");
		}
	}

	private static void processCarFromEJB(Boolean toUpdate) {
		CarService car = ejbFactory.getCarService();
		if(toUpdate) {
			car.update("Sonata");
		} else {
			car.save("HB20");
		}
	}

	private static void processCarFromRest(Boolean toUpdate) {
		CarService car = restFactory.getCarService();
		if(toUpdate) {
			car.update("Sonata");
		} else {
			car.save("HB20");
		}
	}

}
