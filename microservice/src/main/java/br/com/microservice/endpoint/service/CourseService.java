package br.com.microservice.endpoint.service;

import br.com.microservice.model.Course;
import br.com.microservice.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable){
        return courseRepository.findAll(pageable);
    }
}
