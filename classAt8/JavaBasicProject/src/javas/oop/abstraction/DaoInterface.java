package javas.oop.abstraction;

public interface DaoInterface<T>{
	public void connect();
	public void disconnect();
	public int save(T t);
	public T getOne(int id);
}
