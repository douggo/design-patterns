package br.com.douggo.factory.Databases.Simple.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
