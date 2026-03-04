package main;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import dto.Student;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAOImpl();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    dao.addStudent(new Student(name, email, marks));
                    break;

                case 2:
                    List<Student> list = dao.getAllStudents();
                    for (Student s : list) {
                        System.out.println(
                                s.getId() + " | " +
                                s.getName() + " | " +
                                s.getEmail() + " | " +
                                s.getMarks()
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    dao.updateStudent(id, newMarks);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int delId = sc.nextInt();
                    dao.deleteStudent(delId);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                    sc.close();

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}