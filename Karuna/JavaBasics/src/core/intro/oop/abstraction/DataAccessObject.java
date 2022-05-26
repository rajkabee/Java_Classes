package core.intro.oop.abstraction;

public interface DataAccessObject {
	public void connect();

	public void disconnect();

	public void insert();

	public void read();

	public void update();

	public void delete();
}
