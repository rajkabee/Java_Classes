package com.example.gui.model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DataAccessObject<T> {
	public void connect() throws SQLException;

	public void disconnect() throws SQLException;

	public int save(T t) throws SQLException;

	public T getOne(int id) throws SQLException;

	public ArrayList<T> getAll() throws SQLException;

	public int update(T t) throws SQLException;

	public int delete(int id) throws SQLException;
}
