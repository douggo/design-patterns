package br.com.douggo.command.migration.commands;

import java.util.List;
import java.util.Map;

public class CreateUserTableRoleColumnCommand extends MigrationCommand {

    private final static String TABLE = "user";
    private final static String COLUMN = "role";

    public CreateUserTableRoleColumnCommand(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        this.addColumnIntoUserTable();
    }

    @Override
    public void undo() {
        this.removeColumn();
    }

    private void addColumnIntoUserTable() {
        List<String> userTable = this.database.get(TABLE);
        userTable.add(COLUMN);
    }

    private void removeColumn() {
        List<String> userTable = this.database.get(TABLE);
        userTable.remove(COLUMN);
    }

}
