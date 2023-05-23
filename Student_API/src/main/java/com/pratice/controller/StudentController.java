package com.pratice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.entity.Students;
import com.pratice.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Students addOneStudent(@RequestBody Students students) {
		
	  return service.addStudent(students);
	}
	
	@PostMapping("/addAll")
	public List<Students> addAllStudnets(@RequestBody List<Students> stutList){
		
		return service.addAll(stutList);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Students> findById(@PathVariable("id") int id) {
		
		return service.findId(id);
	}
	
	@GetMapping("student/{name}")
	public List<Students> findBYName(@PathVariable("name") String name){
		
		return service.findName(name);
	}
	
	public String deleteStudent(@PathVariable("id") int id) {
		
		return service.delete(id);
	}
	
	@PutMapping("update/{id}")
	public Students updateStudents(@RequestBody Students students) {
		
		return service.update(students);
	}
	
    
	
}




