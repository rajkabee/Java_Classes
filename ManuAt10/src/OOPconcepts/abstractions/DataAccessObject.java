package OOPconcepts.abstractions;

import java.util.ArrayList;

public abstract class DataAccessObject<T> {
	//connect
	public void connect() {
		System.out.println("Connected to the database...");
	}
	//disconnect
	public void disconnect() {
		System.out.println("Disconnected from the database...");
	}
	//insert
	public abstract int insert(T t);
	//read
	public abstract T getOne(int id);
	public abstract ArrayList<T> getAll();
	//update
	public abstract int update(T t);
	//delete
	public abstract int delete(int t);
	
}
