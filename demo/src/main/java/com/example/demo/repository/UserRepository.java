package com.example.demo.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Salary;

@Repository
public interface UserRepository extends JpaRepository<Salary, Long> {
}
