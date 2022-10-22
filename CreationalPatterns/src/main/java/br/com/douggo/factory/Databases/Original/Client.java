package br.com.douggo.factory.Databases.Original;

import br.com.douggo.factory.Databases.Original.db.DB;
import br.com.douggo.factory.Databases.Original.factory.OracleDBFactory;
import br.com.douggo.factory.Databases.Original.factory.PostgresDBFactory;

public class Client {

	private static String query = "SELECT * FROM users";

	private static String update = "UPDATE users SET nome = 'Douglas' WHERE id = 2";

	public static void main(String[] args) {
		executeOnOracle();
		System.out.println();
		System.out.println();
		executeOnPostgres();
	}

	private static void executeOnOracle() {
		OracleDBFactory factory = new OracleDBFactory();
		DB db = factory.getDatabase();
		db.query(query);
		db.update(update);
	}

	private static void executeOnPostgres() {
		PostgresDBFactory factory = new PostgresDBFactory();
		DB db = factory.getDatabase();
		db.query(query);
		db.update(update);
	}
}
