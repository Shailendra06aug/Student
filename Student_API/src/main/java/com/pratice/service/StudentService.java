package com.pratice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.entity.Students;
import com.pratice.repositry.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Students addStudent(Students student) {
		
		return repo.save(student);
	}
	
	public List<Students> addAll(List<Students> students){
		
		return repo.saveAll(students);
	}
	
	public Optional<Students> findId(int id) {
		
		return repo.findById(id);
	}
	
	
	public List<Students> findName(String name) {
		
	 return	repo.findByName(name);
	}
	
	
	public String delete(int id) {
		repo.deleteById(id);
		return "Your record has been deleted successfully !!"+id;
	}
	
	public Students update(Students students) {
		
		Students exist = repo.findById(students.getId()).orElse(null);
		
		exist.setName(students.getName());
		exist.setCity(students.getCity());
		exist.setCollege(students.getCollege());
		exist.setCollege(students.getCollege());
		
	   return repo.save(exist);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
