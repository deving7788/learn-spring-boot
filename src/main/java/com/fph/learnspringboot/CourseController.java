package com.fph.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping("/courses")
	public List<Course> returnAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn Java", "fph"),
				new Course(2, "Learn C", "fph"),
				new Course(3, "Learn Phython", "fph")
				);
	}
}


