package jp.empressia.androidroomtest01;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test01 {

	@PrimaryKey
	public int ID;

	@ColumnInfo(name=ColumnInfo.INHERIT_FIELD_NAME)
	public TEST TEST;

	public static enum TEST {
		TEST01,
		TEST02,
		;
	}

}
