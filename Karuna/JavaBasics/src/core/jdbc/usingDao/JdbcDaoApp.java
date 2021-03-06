package core.jdbc.usingDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcDaoApp {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		StudentDao sDao = new StudentDao();
		String ch;
		do {
			do {
				System.out.println("Enter your choice: ");
				System.out.println("a. Add a new Student");
				System.out.println("b. View a student's details");
				System.out.println("c. View all student's list");
				System.out.println("d. Update a student's details");
				System.out.println("e. Delete a student's details");
				ch = sc.next();
			} while (!(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("b") || ch.equalsIgnoreCase("c")
					|| ch.equalsIgnoreCase("d") || ch.equalsIgnoreCase("e")));

			if (ch.equalsIgnoreCase("a")) {
				// insert
				Student st = new Student();
				System.out.println("Enter the student's details: \n First Name:");
				st.setfName(sc.next());
				System.out.println("Last Name: ");
				st.setlName(sc.next());
				System.out.println("Email: ");
				st.setEmail(sc.next());
				int i = sDao.save(st);
				if (i == 1) {
					System.out.println("Successs!");
				}

			} else if (ch.equalsIgnoreCase("b")) {
				// view a student's details
				System.out.println("Enter the student's id: ");
				int id = sc.nextInt();
				Student st = sDao.getOne(id);
				System.out.println(st);
			} else if (ch.equalsIgnoreCase("c")) {
				ArrayList<Student> stList = sDao.getAll();
				for (Student s : stList) {
					System.out.println(s);
				}
			}

			do {
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.next();
			} while (!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")));

		} while (ch.equalsIgnoreCase("y"));

	}
}
