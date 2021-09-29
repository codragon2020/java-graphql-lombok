package com.example.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	StudentService studentService

	public String firstQuery () {
		return "First Query";
	}

	public String secondQuery () {
		return "Second Query";
	}

	public String fullName (SampleRequest sampleRequest) {
		return sampleRequest.getFirstName() + " " + sampleRequest.getLastName()
	}

	public StudentResponse student (long id) {
		return new StudentResponse(studentService.getStudentById(id))
	}
}
