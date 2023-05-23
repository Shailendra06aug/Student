package com.pratice.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.entity.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students, Integer> {

	public List<Students> findByName(String name);
}
