package br.com.douggo.bridge.converter.converters;

import br.com.douggo.bridge.converter.employees.IEmployee;

public class JsonExport implements IExport {

    @Override
    public String export(IEmployee employee) {
        return "{\n" +
                "\t\"name\": \"" + employee.getName() + "\",\n" +
                "\t\"age\": \"" + employee.getAge() + "\",\n" +
                "\t\"salary\": \"" + employee.getSalary() + "\",\n" +
        "}";
    }
}
