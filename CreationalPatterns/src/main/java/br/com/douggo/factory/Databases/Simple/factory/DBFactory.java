package br.com.douggo.factory.Databases.Simple.factory;

import br.com.douggo.factory.Databases.Simple.db.DB;
import br.com.douggo.factory.Databases.Simple.enums.ISGDBNames;

public interface DBFactory {
	DB getDatabase(ISGDBNames name);
}
