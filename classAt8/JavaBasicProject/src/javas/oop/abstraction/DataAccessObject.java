package javas.oop.abstraction;

public abstract class DataAccessObject<T> implements DaoInterface<T>{
	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
	
}
