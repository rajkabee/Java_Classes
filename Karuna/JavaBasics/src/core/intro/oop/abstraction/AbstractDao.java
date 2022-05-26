package core.intro.oop.abstraction;

public abstract class AbstractDao implements DataAccessObject {

	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}

}
