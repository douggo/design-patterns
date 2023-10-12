package br.com.douggo.bridge.converter;

import br.com.douggo.bridge.converter.converters.CSVConverter;
import br.com.douggo.bridge.converter.converters.JsonConverter;
import br.com.douggo.bridge.converter.employees.Employee;
import br.com.douggo.bridge.converter.employees.ITGuy;
import br.com.douggo.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
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


}
