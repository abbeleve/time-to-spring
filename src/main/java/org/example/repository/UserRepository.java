package org.example.repository;

import org.example.group.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);
}
