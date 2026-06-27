package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repository;
    
    // CREATE - Add a new student
    public Student createStudent(Student student) {
        return repository.save(student);
    }
    
    // READ - Get all students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
    
    // READ - Get student by ID
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }
    
    // UPDATE - Update student
    public Student updateStudent(Long id, Student student) {
        Optional<Student> existing = repository.findById(id);
        if (existing.isPresent()) {
            Student s = existing.get();
            s.setName(student.getName());
            s.setEmail(student.getEmail());
            s.setAge(student.getAge());
            return repository.save(s);
        }
        return null;
    }
    
    // DELETE - Delete student
    public boolean deleteStudent(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}