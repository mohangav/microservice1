package com.mohan.learn.microservice1.repository;

import com.mohan.learn.microservice1.entity.InstructorDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "instructordetails")
public interface InstructorDetailsRepository extends CrudRepository<InstructorDetails, Long> {
}
