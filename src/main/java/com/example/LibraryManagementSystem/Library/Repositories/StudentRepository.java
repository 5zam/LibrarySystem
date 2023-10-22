package com.example.LibraryManagementSystem.Library.Repositories;

import com.example.LibraryManagementSystem.Library.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUsn(String usn);
}
