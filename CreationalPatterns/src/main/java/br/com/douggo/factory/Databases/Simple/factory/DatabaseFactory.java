package br.com.douggo.factory.Databases.Simple.factory;

import br.com.douggo.factory.Databases.Simple.db.DB;
import br.com.douggo.factory.Databases.Simple.enums.ISGDBNames;

public class DatabaseFactory implements DBFactory {

    @Override
    public DB getDatabase(ISGDBNames name) {
        return name.getDatabase();
    }
}
