package dao;

import interfaces.IStudent;
import jakarta.persistence.EntityManager;
import models.Student;
import java.util.List;

public class StudentDao implements IStudent {

    @Override
    public void save(Student student) {
        EntityManager ef=EntityManagerAdmin.getInstance();
        ef.getTransaction().begin();
        ef.persist(student);
        ef.getTransaction().commit();

    }

    @Override
    public Student getStudent(Long id) {
        EntityManager ef=EntityManagerAdmin.getInstance();
        Student student=ef.find(Student.class,  id);
        return ef.find(Student.class, id);
    }

    @Override
    public void update(Student student) {
        EntityManager ef=EntityManagerAdmin.getInstance();
        ef.getTransaction().begin();
        ef.persist(student);
        ef.merge(student);
        ef.getTransaction().commit();

    }

    @Override
    public void delete(Student student) {
        EntityManager ef=EntityManagerAdmin.getInstance();
        ef.getTransaction().begin();
        ef.remove(student);
        ef.getTransaction().commit();


    }

    @Override
    public List<Student> getStudents() {
        return List.of();
    }
}
