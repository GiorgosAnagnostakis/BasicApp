package com.example.demoTest.student;

import com.example.demoTest.Student;
import com.example.demoTest.StudentRepository;
import com.example.demoTest.StudentService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.verify;


class StudentServiceTest {

//    @Mock
//    private StudentRepository studentRepository;
//
//    private AutoCloseable autoCloseable;
//
//    @InjectMocks
//    private StudentService underTest;
//
//    @BeforeEach
//    void setUp() {
//        autoCloseable = MockitoAnnotations.openMocks(this);
//    }
//
//    @AfterEach
//    void tearDown() throws Exception {
//        autoCloseable.close();
//    }
//
//    @Test
//    void canGetAllStudents() {
//        underTest.getAllStudents();
//                //then
//        verify(studentRepository).findAll();
//    }
//
//    @Test
//    @Disabled
//    void addStudent() {
//
//    }
//
//    @Test
//    @Disabled
//    void deleteStudent() {
//    }
}