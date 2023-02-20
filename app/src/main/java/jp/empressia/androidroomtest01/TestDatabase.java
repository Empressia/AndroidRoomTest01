package jp.empressia.androidroomtest01;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
	entities = {
		Test01.class
	},
	version = 1,
	exportSchema = false
)
public abstract class TestDatabase extends RoomDatabase {

	public abstract TestDao getDao();

}
