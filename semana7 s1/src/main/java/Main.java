import dao.StudentDao;
import models.Student;

public class Main {

    public static void main(String[] args) {
        StudentDao daoStudent = new StudentDao();
        Student student = new Student();
        student.setName( "Andrea Cuadra");
        student.setId(12345L);
        student.setMajor("Ingieneria en sistemas");
        daoStudent.save(student);
    }
}
