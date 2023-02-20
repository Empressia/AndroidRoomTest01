package jp.empressia.androidroomtest01;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test01 {

	@PrimaryKey
	public int ID;

	public TEST TEST;

	public static enum TEST {
		TEST01,
		TEST02,
		;
	}

}
