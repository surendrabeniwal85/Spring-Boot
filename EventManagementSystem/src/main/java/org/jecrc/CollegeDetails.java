package org.jecrc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CollegeDetails {

    @Value("${college.name}")
    private String name;

    @Value("${college.location}")
    private String location;

    @Value("${college.department}")
    private String department;

    @Value("${college.academic-year}")
    private String academicYear;

    @Value("${college.coordinator}")
    private String coordinator;

    public String getName() {
        return name;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void display() {
        System.out.println("College: " + name);
        System.out.println("Location: " + location);
        System.out.println("Department: " + department);
        System.out.println("Academic Year: " + academicYear);
        System.out.println("Coordinator: " + coordinator);
    }
}
