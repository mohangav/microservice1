package com.mohan.learn.microservice1.repository;

import com.mohan.learn.microservice1.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<Student, Long> {

}
