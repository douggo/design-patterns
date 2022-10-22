package br.com.douggo.factory.Databases.Original.factory;

import br.com.douggo.factory.Databases.Original.db.DB;
import br.com.douggo.factory.Databases.Original.db.OracleDB;

public class OracleDBFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }

}
