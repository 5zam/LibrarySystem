package com.example.LibraryManagementSystem.Library.Repositories;

import com.example.LibraryManagementSystem.Library.Entities.Issue;
import com.example.LibraryManagementSystem.Library.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {
    List<Issue> findByIssueStudent(Student student);

    List<Issue> findByIssueStudentUsn(String usn);
}
