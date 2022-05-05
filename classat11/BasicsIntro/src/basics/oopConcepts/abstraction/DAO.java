package basics.oopConcepts.abstraction;

import java.util.ArrayList;

public interface DAO<T>{
	public int connect();
	public int disconnect();
	public int save(T t);
	public T getOne(int id);
	public ArrayList<T> getAll();
	public int update(T t);
	public int delete(int id);
}
