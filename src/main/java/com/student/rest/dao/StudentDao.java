package com.student.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.rest.model.student;

public interface StudentDao extends JpaRepository<student, Long>{

}
