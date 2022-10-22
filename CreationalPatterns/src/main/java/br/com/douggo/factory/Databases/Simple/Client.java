package br.com.douggo.factory.Databases.Simple;

import br.com.douggo.factory.Databases.Simple.db.DB;
import br.com.douggo.factory.Databases.Simple.enums.Databases;
import br.com.douggo.factory.Databases.Simple.factory.DatabaseFactory;

public class Client {

	private static String query = "SELECT * FROM users";

	private static String update = "UPDATE users SET nome = 'Douglas' WHERE id = 2";

	public static void main(String[] args) {
		executeStatement(Databases.POSTGRE);
		executeStatement(Databases.ORACLE);
	}

	public static void executeStatement(Databases db) {
		DatabaseFactory dbFactory = new DatabaseFactory();
		DB database = dbFactory.getDatabase(db);
		database.query(query);
		database.update(update);
	}
}
