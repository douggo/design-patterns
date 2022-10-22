package br.com.douggo.factory.Databases.Simple.enums;

import br.com.douggo.factory.Databases.Simple.db.DB;
import br.com.douggo.factory.Databases.Simple.db.OracleDB;
import br.com.douggo.factory.Databases.Simple.db.PostgresDB;

public enum Databases implements ISGDBNames {

    ORACLE {
        @Override
        public DB getDatabase() {
            return new OracleDB();
        }
    },

    POSTGRE {
        @Override
        public DB getDatabase() {
            return new PostgresDB();
        }
    }
}
