package com.IveliseSola.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IveliseSola.demo.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
		
}
