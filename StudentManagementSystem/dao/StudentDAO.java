package dao;

import dto.Student;
import java.util.List;

public interface StudentDAO {

    void addStudent(Student student);

    List<Student> getAllStudents();

    void updateStudent(int id, double marks);

    void deleteStudent(int id);
}