package com.pim.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pim.domain.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}

