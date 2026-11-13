package com.jecrc.CRUDSpringDemo.service;

import com.jecrc.CRUDSpringDemo.entity.Student;
import com.jecrc.CRUDSpringDemo.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
//@Component
public class StudentService {

    //1.Listen to an endpoint
    //2.Business Logic
    //3.Finally Interact with database
    //4.Response to Client
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq)
    {

        Student studentResp = studentRepository.save(studentReq);
        return studentReq;
    }

    public Student getStudent(long id)
    {
//        return studentRepository.getOne(id);
        Optional<Student> studentResp = studentRepository.findById(id);
        if(studentResp.isPresent()) {
            return studentResp.get();
        }
        return null;
    }
    //GetAll
    public List<Student> getAllStudent()
    {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    //Update Student
    public Student updateStudent(Long id, Student studentReq) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isEmpty()) {
            return null;
        }
        Student studentTosave = existingStudent.get();

        studentTosave.setName(studentReq.getName());
        studentTosave.setEmail(studentReq.getEmail());
        studentTosave.setAge(studentReq.getAge());
        studentTosave.setRollNo(studentReq.getRollNo());
        studentTosave.setSubject(studentReq.getSubject());

        return studentRepository.save(studentTosave);
    }
    public Boolean deleteStudent(long id)
    {
        Boolean isStudent = studentRepository.existsById(id);

        if(!isStudent) return false;
        studentRepository.deleteById(id);
        return true;
    }
}
