package com.jecrc.CRUDSpringDemo.controller;


import com.jecrc.CRUDSpringDemo.entity.Student;
import com.jecrc.CRUDSpringDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping("/create")
//    public String createStudent(@RequestBody Student student)
//    public Student createStudent(@RequestBody Student student)
    public ResponseEntity<Student> createStudent(@RequestBody Student student)
    {
//        System.out.println(student.getId());
//        System.out.println(student.getEmail());
//        System.out.println("Inside Student Controller");
//        System.out.println("Exit from Student Controller");
        Student createStudent =  studentService.createStudent(student);
//        return "Student Created";
//        return createStudent;
//        return ResponseEntity.ok(createStudent);
//        return ResponseEntity.status(201).body(createStudent);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createStudent);
    }

//    @GetMapping("get/1") //Initiate Read All
    @GetMapping("get/(id)")
    public ResponseEntity<Student> getStudent(@PathVariable long id)
    {
        Student studetReq = studentService.getStudent(id);

        if(studentResp == null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(studentResp);
    }
}
