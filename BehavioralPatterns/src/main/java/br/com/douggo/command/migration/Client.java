package br.com.douggo.command.migration;

import br.com.douggo.command.migration.commands.CreateProductTableCommand;
import br.com.douggo.command.migration.commands.CreateUserTableCommand;
import br.com.douggo.command.migration.commands.CreateUserTableRoleColumnCommand;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		Map<String, List<String>> database = new LinkedHashMap<>();

		MigrationTool tool = new MigrationTool();
		tool.addMigration(new CreateProductTableCommand(database));
		tool.addMigration(new CreateUserTableCommand(database));
		tool.addMigration(new CreateUserTableRoleColumnCommand(database));

		System.out.println("Database before running migrations: " + database);
		System.out.println("Running migrations...");
		tool.up();
		System.out.println(database);
		tool.up();
		System.out.println(database);
		tool.up();
		System.out.println(database);
		tool.up();

		System.out.println();

		System.out.println("Current state of database: " + database);
		System.out.println("Undoing all migrations");
		tool.down();
		System.out.println(database);
		tool.down();
		System.out.println(database);
		tool.down();
		System.out.println(database);
		tool.down();
	}
}
