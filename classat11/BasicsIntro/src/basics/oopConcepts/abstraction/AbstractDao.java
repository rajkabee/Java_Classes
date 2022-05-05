package basics.oopConcepts.abstraction;

import java.util.ArrayList;

public abstract class AbstractDao<T> implements DAO<T>{

	@Override
	public int connect() {
		System.out.println("Connected to the database!");
		return 0;
	}

	@Override
	public int disconnect() {
		System.out.println("Disconnected from the database!");
		return 0;
	}


}
