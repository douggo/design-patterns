package br.com.douggo.singleton.monostate;

import br.com.douggo.singleton.monostate.conn.Connection;
import br.com.douggo.singleton.monostate.conn.ConnectionPool;

public class Client {

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}

	public static void doQuery1() {
		Connection connection = getConnection();
		if(connection != null) {
			connection.query("SELECT * FROM A1");
			//leaveConnection(connection); -> Para disparar a mensagem de conexões não disponíveis
		}
	}
	
	public static void doQuery2() {
		Connection connection = getConnection();
		if(connection != null) {
			connection.query("SELECT * FROM A2");
			//leaveConnection(connection); -> Para disparar a mensagem de conexões não disponíveis
		}
	}
	
	public static void doQuery3() {
		Connection connection = getConnection();
		if(connection != null) {
			connection.query("SELECT * FROM A3");
			leaveConnection(connection);
		}
	}

	private static Connection getConnection() {
		ConnectionPool pool = new ConnectionPool();
		return pool.getConnection();
	}

	private static void leaveConnection(Connection connection) {
		ConnectionPool pool = new ConnectionPool();
		pool.leaveConnection(connection);
	}


}
