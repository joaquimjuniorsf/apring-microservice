package br.com.microservice.endpoint.controller;

import br.com.microservice.endpoint.service.CourseService;
import br.com.microservice.model.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/course")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {

    private final CourseService courseService;

    @GetMapping(value = "/list")
    public ResponseEntity<Iterable<Course>> list(Pageable pageable){
        return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
    }
}
