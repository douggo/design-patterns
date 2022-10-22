package br.com.douggo.factory.Databases.Original.factory;

import br.com.douggo.factory.Databases.Original.db.DB;
import br.com.douggo.factory.Databases.Original.db.PostgresDB;

public class PostgresDBFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }

}
