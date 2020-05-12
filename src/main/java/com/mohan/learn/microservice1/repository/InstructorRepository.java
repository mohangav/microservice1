package com.mohan.learn.microservice1.repository;

import com.mohan.learn.microservice1.entity.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}
