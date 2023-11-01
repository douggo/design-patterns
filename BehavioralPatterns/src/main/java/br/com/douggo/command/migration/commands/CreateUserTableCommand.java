package br.com.douggo.command.migration.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CreateUserTableCommand extends MigrationCommand {

    private final static String TABLE = "user";

    public CreateUserTableCommand(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        this.database.put(TABLE, createUserColumns());
    }

    @Override
    public void undo() {
        this.database.remove(TABLE);
    }

    private List<String> createUserColumns() {
        return new ArrayList<>(Arrays.asList("id", "name", "birth", "gender"));
    }
}
