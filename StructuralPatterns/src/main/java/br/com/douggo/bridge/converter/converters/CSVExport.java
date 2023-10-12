package br.com.douggo.bridge.converter.converters;

import br.com.douggo.bridge.converter.employees.IEmployee;

public class CSVExport implements IExport {

    @Override
    public String export(IEmployee employee) {
        return String.format(
                "%s;%d;%.2f",
                employee.getName(),
                employee.getAge(),
                employee.getSalary()
        );
    }

}
