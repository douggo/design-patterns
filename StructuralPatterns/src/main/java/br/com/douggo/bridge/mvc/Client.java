package br.com.douggo.bridge.mvc;

import br.com.douggo.bridge.mvc.dao.*;
import br.com.douggo.bridge.mvc.model.User;
import br.com.douggo.bridge.mvc.services.UserEJB;
import br.com.douggo.bridge.mvc.services.UserRest;
import br.com.douggo.bridge.mvc.services.UserService;
import br.com.douggo.bridge.mvc.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserDao userMongoDao = new UserMongoDao();
		UserDao userMysqlDao = new UserMysqlDao();
		UserDao userOracleDao = new UserOracleDao();
		UserDao userPostgresDao = new UserPostgresDao();

		/* UserEJB */
		saveUserThroughEJB(userMongoDao, user);
		saveUserThroughEJB(userMysqlDao, user);
		saveUserThroughEJB(userOracleDao, user);
		saveUserThroughEJB(userPostgresDao, user);

		/* UserSOAP */
		saveUserThroughSOAP(userMongoDao, user);
		saveUserThroughSOAP(userMysqlDao, user);
		saveUserThroughSOAP(userOracleDao, user);
		saveUserThroughSOAP(userPostgresDao, user);

		/* UserREST */
		saveUserThroughREST(userMongoDao, user);
		saveUserThroughREST(userMysqlDao, user);
		saveUserThroughREST(userOracleDao, user);
		saveUserThroughREST(userPostgresDao, user);

	}

	private static void saveUserThroughEJB(UserDao userDao, User user) {
		UserService userEJB = new UserEJB(userDao);
		userEJB.save(user);
		System.out.println();
	}

	private static void saveUserThroughSOAP(UserDao userDao, User user) {
		UserService userSOAP = new UserSoap(userDao);
		userSOAP.save(user);
		System.out.println();
	}

	private static void saveUserThroughREST(UserDao userDao, User user) {
		UserService userREST = new UserRest(userDao);
		userREST.save(user);
		System.out.println();
	}

}
