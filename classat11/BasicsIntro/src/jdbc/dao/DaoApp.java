package jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaoApp {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String ch;
		int i;
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		StudentDao sDao = new StudentDao(url, user, pass);
		do {
			do {
				System.out.println("Enter your choice: \n"
									+ "a. add a new student\n"
									+ "b. view a student's details\n"
									+ "c. view all students details\n"
									+ "d. update a student's detail\n"
									+ "e. delete a student's details\n"
									+ "\t:-");
				ch = sc.next();
			}while(!(ch.equalsIgnoreCase("a")
					||ch.equalsIgnoreCase("b")
					||ch.equalsIgnoreCase("c")
					||ch.equalsIgnoreCase("d")
					||ch.equalsIgnoreCase("e")
					));
			if(ch.equalsIgnoreCase("a")) {
				Student st = new Student();
				System.out.println("Enter the new student's Details: \n First Name: ");
				st.setfName(sc.next());
				System.out.println("Last Name: ");
				st.setlName(sc.next());
				System.out.println("Email: ");
				st.setEmail(sc.next());
				i = sDao.save(st);
				if(i==1) {
					System.out.println("Student saved to the database!");
				}
			}
			else if(ch.equalsIgnoreCase("b")) {
				System.out.println("Enter the id of the student: ");
				Student st = sDao.getOne(sc.nextInt());
				System.out.println(st);
			}
			else if(ch.equalsIgnoreCase("c")) {
				System.out.println("Details of all the students: ");
				ArrayList<Student> stList = sDao.getAll();
				for(Student s:stList) {
					System.out.println(s);
				}
			}
			else if(ch.equalsIgnoreCase("d")) {
				Student st = new Student();
				System.out.println("Enter the id of the student to be updated: ");
				st.setId(sc.nextInt());
				System.out.println("Enter the new details: ");
				System.out.println("First Name: ");
				st.setfName(sc.next());
				System.out.println("Last Name: ");
				st.setlName(sc.next());
				System.out.println("Email: ");
				st.setEmail(sc.next());
				i = sDao.update(st);
				if(i==1) {
					System.out.println("Student updated in the database!");
				}
			}
			else if(ch.equalsIgnoreCase("e")) {
				System.out.println("Enter the id of the student to be deleted: ");
				int id = sc.nextInt();
				Student st = sDao.getOne(id);
				System.out.println(st);
				do {
					System.out.println("Confirm Delete(y/n):");
					ch = sc.next();
				}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
				if(ch.equalsIgnoreCase("y")){
					i = sDao.delete(id);
					if(i==1) {
						System.out.println("Student deleted form the database.");
					}
				}
				
			}
			
			
			
			
			
			do {
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.next();
			}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
		}while(ch.equalsIgnoreCase("y"));
	}
}
