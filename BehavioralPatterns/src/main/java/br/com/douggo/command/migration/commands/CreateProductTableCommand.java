package br.com.douggo.command.migration.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateProductTableCommand extends MigrationCommand {

    private final static String TABLE = "product";

    public CreateProductTableCommand(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        this.database.put(TABLE, createProductColumns());
    }

    @Override
    public void undo() {
        this.database.remove(TABLE);
    }

    private List<String> createProductColumns() {
        List<String> productColumns = new ArrayList<>();
        productColumns.add("id");
        productColumns.add("name");
        productColumns.add("description");
        productColumns.add("price");
        return productColumns;
    }
}
