package br.com.microservice.repository;

import br.com.microservice.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
}
