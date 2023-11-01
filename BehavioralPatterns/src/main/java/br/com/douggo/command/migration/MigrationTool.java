package br.com.douggo.command.migration;

import br.com.douggo.command.migration.commands.MigrationCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MigrationTool {

    private final List<MigrationCommand> migrations;
    private int migrationIndex;

    public MigrationTool() {
        this.migrations = new ArrayList<>();
        this.migrationIndex = 0;
    }

    public void addMigration(MigrationCommand migration) {
        this.migrations.add(migration);
    }

    public void up() {
        if (this.migrations.size() > this.migrationIndex) {
            this.migrations.get(this.migrationIndex).execute();
            this.migrationIndex++;
        } else {
            System.out.println("You are up to date!");
        }
    }

    public void down() {
        if (this.migrationIndex > 0) {
            this.migrations.get(this.migrationIndex - 1).undo();
            this.migrationIndex--;
        } else {
            System.out.println("There are no migrations left to undo");
        }
    }

}
