package com.spring.demo.demo.controller;

import com.spring.demo.demo.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "John Doe", 20),
            new Student(2, "Peter Doe", 19),
            new Student(3, "Zack Doe", 20)
    ));

    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(1, "John Doe", 20);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudents() {


        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("student/{id}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId) {
        return new ResponseEntity<>(students.get(studentId - 1), HttpStatus.OK);
    }

    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam("id") int studentId) {
        return new ResponseEntity<>(students.get(studentId - 1), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        students.add(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
        Student _student = students.get(studentId - 1);
        _student.setAge(student.getAge());
        _student.setId(student.getId());
        _student.setName(student.getName());

        return new ResponseEntity<>(_student, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
        students.remove(studentId - 1);
        return new ResponseEntity<>("Deleted !!!!", HttpStatus.NO_CONTENT);
    }

}
