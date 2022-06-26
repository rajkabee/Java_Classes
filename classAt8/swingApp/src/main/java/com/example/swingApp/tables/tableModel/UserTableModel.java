package com.example.swingApp.tables.tableModel;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.example.swingApp.User;

public class UserTableModel extends DefaultTableModel {
	ArrayList<User> data;
	String cols[] = { "ID", "First Name", "Last Name", "Email", "Gender", "Age", "Username", "Password" };

	public UserTableModel(ArrayList<User> data) {
		this.data = data;
	}

	@Override
	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public int getRowCount() {
		if (data == null) {
			return 0;
		} else {
			return data.size();
		}
	}

	@Override
	public Object getValueAt(int row, int col) {
		Object temp = null;
		if (col == 0) {
			temp = data.get(row).getuId();
		} else if (col == 1) {
			temp = data.get(row).getfName();
		} else if (col == 2) {
			temp = data.get(row).getlName();
		} else if (col == 3) {
			temp = data.get(row).getEmail();
		} else if (col == 4) {
			temp = data.get(row).getGender();
		} else if (col == 5) {
			temp = data.get(row).getAge();
		} else if (col == 6) {
			temp = data.get(row).getUsername();
		} else if (col == 7) {
			temp = data.get(row).getPassword();
		}
		return temp;
	}

	public String getColumnName(int col) {
		return cols[col];
	}

	public Class getColumnClass(int col) {
		if (col == 0 || col == 5) {
			return Integer.class;
		} else {
			return String.class;
		}
	}

}
