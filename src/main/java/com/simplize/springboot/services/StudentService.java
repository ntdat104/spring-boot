package com.simplize.springboot.services;

import com.simplize.springboot.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();

        for (int i = 0; i < 5; i++) {
            Student student = new Student(1L, "Tien Dat" + i, "ntd.k108cva@gmail.com", LocalDate.of(2000, Month.APRIL, 10), 20 + i);
            students.add(student);
        }

        return students;
    }
}
