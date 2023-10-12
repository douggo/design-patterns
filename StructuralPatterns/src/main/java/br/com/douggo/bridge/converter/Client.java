package br.com.douggo.bridge.converter;

import br.com.douggo.bridge.converter.converters.CSVConverter;
import br.com.douggo.bridge.converter.converters.CSVExport;
import br.com.douggo.bridge.converter.converters.JsonConverter;
import br.com.douggo.bridge.converter.converters.JsonExport;
import br.com.douggo.bridge.converter.employees.*;

public class Client {

	public static void main(String[] args) {
		//exportWithAbstraction();
		exportWithInterfacesOnly();
	}

	private static void exportWithAbstraction() {
		Employee itGuy = new ITGuy("Douglas", 26, 1500.66);
		Employee projectManager = new ProjectManager("Uncle Bob", 71, 25570.99);
		exportToCsv(itGuy);
		exportToJson(itGuy);
		exportToCsv(projectManager);
		exportToJson(projectManager);
	}

	private static void exportToCsv(Employee employee) {
		CSVConverter toCsv = new CSVConverter();
		System.out.println(toCsv.getEmployeeFormated(employee));
	}

	private static void exportToJson(Employee employee) {
		JsonConverter toJson = new JsonConverter();
		System.out.println(toJson.getEmployeeFormated(employee));
	}

	private static void exportWithInterfacesOnly() {
		IEmployee janitor = new Janitor.Builder()
				.name("Jorge")
				.age(59)
				.salary(2500.48)
				.build();
		IEmployee CEO = new CEO.Builder()
				.name("Aldo")
				.age(46)
				.salary(50978.99)
				.build();
		exportToCsvInterface(janitor);
		exportToJsonInterface(janitor);
		exportToCsvInterface(CEO);
		exportToJsonInterface(CEO);
	}

	private static void exportToCsvInterface(IEmployee employee) {
		CSVExport toCsv = new CSVExport();
		System.out.println(toCsv.export(employee));
	}

	private static void exportToJsonInterface(IEmployee employee) {
		JsonExport toJson = new JsonExport();
		System.out.println(toJson.export(employee));
	}

}
