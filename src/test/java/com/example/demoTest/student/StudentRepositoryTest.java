package com.example.demoTest.student;

import com.example.demoTest.Gender;
import com.example.demoTest.Student;
import com.example.demoTest.StudentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {
//
//    @Autowired
//    private StudentRepository underTest;
//
//    @AfterEach
//    void tearDown() {
//        underTest.deleteAll();
//    }
//
//    @Test
//    void itShouldCheckIfStudentEmailExists() {
//        //given
//        Student student = new Student(
//                "Jamila",
//                "jamila@gmail.com",
//                Gender.FEMALE
//        );
//        underTest.save(student);
//        //when
//        boolean expected = underTest.selectExistsEmail("jamila@gmail.com");
//        //then
//        assertThat(expected).isTrue();
//    }
//
//
//
//    @Test
//    void itShouldCheckIfStudentEmailDoesNotExists() {
//        //given
//        String email = "jamila@gmail.com";
//
//        //when
//        boolean expected = underTest.selectExistsEmail(email);
//        //then
//        assertThat(expected).isFalse();
//    }
}