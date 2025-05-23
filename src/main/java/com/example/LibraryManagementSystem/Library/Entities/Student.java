package com.example.LibraryManagementSystem.Library.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    private String usn;

    private String studentName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(usn, student.usn) && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usn, studentName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "usn='" + usn + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
