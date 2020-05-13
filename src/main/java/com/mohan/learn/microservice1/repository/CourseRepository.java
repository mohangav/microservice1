package com.mohan.learn.microservice1.repository;

import com.mohan.learn.microservice1.entity.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
