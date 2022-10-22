package br.com.douggo.factory.Databases.Original.db;

public class PostgresDB implements DB {

	public void query(String sql) {
		System.out.println("Querying (| " + sql + " |) in Postgres database");
	}
	
	public void update(String sql) {
		System.out.println("Update querry (| " + sql + " |) in Postgres database");
	}
}
