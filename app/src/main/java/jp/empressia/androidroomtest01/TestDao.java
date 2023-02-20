package jp.empressia.androidroomtest01;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public abstract class TestDao {

	@Insert(onConflict= OnConflictStrategy.IGNORE)
	protected abstract long insert(Test01 t);
	@Update
	protected abstract int update(Test01 t);
	@Delete
	protected abstract void delete(Test01 t);

	@Query("SELECT * FROM Test01")
	public abstract List<Test01> test01();

}
