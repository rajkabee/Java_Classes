package JDBCConnection.useDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import JDBCConnection.PerparedStatement.Student;

public class StudentManagementApp {
	public static void main(String[] args) throws SQLException {
		String ch;
		Scanner sc = new Scanner(System.in);
		StudentDao sDao = new StudentDao();
		int i;
		
		do {
			do {
				System.out.println("Enter your choice: \n"
						+ "a. Add new Student\n"
						+ "b. View a student\n"
						+ "c. View all students\n"
						+ "d. Update a student\n"
						+ "e. delete a student");
				ch = sc.next();
			}while(!(ch.equalsIgnoreCase("a")||
					ch.equalsIgnoreCase("b")||
					ch.equalsIgnoreCase("c")||
					ch.equalsIgnoreCase("d")||
					ch.equalsIgnoreCase("e")));
			if(ch.equalsIgnoreCase("a")) {
				System.out.println("Enter the student's details:");
				Student st = new Student();
				System.out.println("First Name: ");
				st.setfName(sc.next());
				System.out.println("Last Name: ");
				st.setlName(sc.next());
				System.out.println("Email: ");
				st.setEmail(sc.next());
				i = sDao.save(st);
				if(i==1) {
					System.out.println("Student added successfully!");
				}
			}
			else if(ch.equalsIgnoreCase("b")) {
				System.out.println("Enter the student's id ");
				i = sc.nextInt();
				Student st = sDao.getOne(i);
				System.out.println(st);
			}
			else if(ch.equalsIgnoreCase("c")) {
				ArrayList<Student> stList = sDao.getAll();
				for(Student s :stList) {
					System.out.println(s);
				}
			}
			else if(ch.equalsIgnoreCase("d")) {
				System.out.println("Enter the student's id to be updated: ");
				Student st = new Student();
				st.setId(sc.nextInt());
				System.out.println("New First Name: ");
				st.setfName(sc.next());
				System.out.println("New Last Name: ");
				st.setlName(sc.next());
				System.out.println("New Email: ");
				st.setEmail(sc.next());
				i = sDao.update(st);
				if(i==1) {
					System.out.println("Student updated successfully!");
				}
			}
			else if(ch.equalsIgnoreCase("e")) {
				System.out.println("Enter the id of the student to be deleted: ");
				i = sc.nextInt();
				Student st = sDao.getOne(i);
				System.out.println(st);
				do {
					System.out.println("Confirm Delete<y/n>?");
					ch = sc.next();
				}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
				if(ch.equalsIgnoreCase("y")) {
					i = sDao.delete(i);
					if(i==1) {
						System.out.println("Student deleted!");
					}
				}
				
				i = sDao.delete(i);
				
				
			}
			
			
			do {
				System.out.println("Do you want to continue(y/n)?");
				ch = sc.next();
			}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
			
		}while(ch.equalsIgnoreCase("y"));
	}
}
