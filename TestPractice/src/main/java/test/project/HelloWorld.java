package test.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorld {

    //API 1
    @GetMapping("/")
    public String print()
    {
        return "Hello from JECRC UNIV.";
    }

    //API 2
    public Map<String,Object> getStudents()
    {
        return Map.of(
                "studentId", 101,
                "studentName", "Rahul",
                "department", "AI & DS",
                "college", "JECRC University",
                "year", 2026,
                "status", "Active"
        );
    }
}
