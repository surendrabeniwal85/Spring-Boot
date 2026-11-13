package com.jecrc.CRUDSpringDemo.repository;

import com.jecrc.CRUDSpringDemo.entity.Student;
import com.jecrc.CRUDSpringDemo.service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


}
