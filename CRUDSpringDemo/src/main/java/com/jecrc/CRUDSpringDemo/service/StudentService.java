package com.jecrc.CRUDSpringDemo.service;

import com.jecrc.CRUDSpringDemo.entity.Student;
import com.jecrc.CRUDSpringDemo.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
//        System.out.println("Inside Student Service");
//        System.out.println("Exit from Student Service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        return studentReq;
    }
    //Read All Method
    public Student getStudent(long id)
    {
//        return studentRepository.getOne(id);
        Optional<Student> studentResp = studentRepository.findById(id);
        if(studentResp.isPresent())
        {
            return studentResp.get();
        }
        return null;
    }
}
