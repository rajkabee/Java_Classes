package coreJava.jdbc.dao;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJdbcDaoTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String user = "root";
		String pass = "root";		
		StudentDao sDao = new StudentDao(url, user, pass);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: \n"
				+ "a. Add a Student\n"
				+ "b. View a Student\n"
				+ "c. View All Students \n"
				+ "d. Update a student's details \n"
				+ "e. Delete a Student's Details\n-"
							);
		char choice = sc.next().charAt(0);
		if(choice=='a') {
			Student st = new Student();
			System.out.println("Enter the student's details: \n First Name: ");
			st.fName = sc.next();
			System.out.println("Last Name: ");
			st.lName = sc.next();
			System.out.println("Email: ");
			st.email = sc.next();
			int i = sDao.insert(st);
			if(i==1) {
				System.out.println("Succeed");
			}
		}
		else if(choice=='b') {
			System.out.println("Enter the id of the student: ");
			int id = sc.nextInt();
			Student st = sDao.getOne(id);
			System.out.println(st);
		}
		else if(choice=='c') {
			ArrayList<Student> stList = sDao.getAll();
			for(Student s:stList) {
				System.out.println(s);
			}
		}
		else if(choice=='d') {
			System.out.println("Enter the id of the student to be upodated: ");
			int id = sc.nextInt();
			Student st = sDao.getOne(id);
			System.out.println(st);
			System.out.println("Enter the student's updated details: \n First Name: ");
			st.fName = sc.next();
			System.out.println("Last Name: ");
			st.lName = sc.next();
			System.out.println("Email: ");
			st.email = sc.next();
			int i = sDao.update(st);
			if(i==1) {
				System.out.println("Success");
			}else {
				System.out.println("failed");
			}
		}
		else if(choice=='e') {
			System.out.println("Enter the id of the student to be deleted: ");
			int id = sc.nextInt();
			Student st = sDao.getOne(id);
			System.out.println(st);
			do {
				System.out.println("Confirm Delete(y/n):");
				choice = sc.next().charAt(0);
			}while(!(choice=='y'||choice=='n'));
			if(choice=='y') {
				int i = sDao.delete(id);
				if(i==1) {
					System.out.println("Success");
				}
			}
		}
	}
}
