package br.com.douggo.bridge.converter.converters;

import br.com.douggo.bridge.converter.employees.Employee;

public class CSVConverter {

	public String getEmployeeFormated(Employee emp) {
		return String.format("%s;%d;%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
