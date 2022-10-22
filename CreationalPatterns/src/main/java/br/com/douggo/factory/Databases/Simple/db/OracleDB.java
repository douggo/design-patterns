package br.com.douggo.factory.Databases.Simple.db;

public class OracleDB implements DB {

	public void query(String sql) {
		System.out.println("Querying (| " + sql + " |) in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Update querry (| " + sql + " |) in Oracle database");
	}
}
