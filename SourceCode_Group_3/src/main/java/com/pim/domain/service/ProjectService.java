package com.pim.domain.service;

//import java.util.Calendar;
//import java.util.Date;
import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pim.app.project.EmployeeForm;
import com.pim.app.project.ProjectForm;
import com.pim.domain.entity.Employee;
import com.pim.domain.entity.Project;
import com.pim.domain.repository.EmployeeRepository;
//import com.pim.domain.entity.Task;
import com.pim.domain.repository.ProjectRepository;

@Service
@Transactional
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;


	public List<Project> findAllProject() {
		return projectRepository.findAll();
	}

	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public void save(String title, String fname, String lname, String date, String stime, String etime, String meeting, String detail) {
		Project project = new Project();
		project.setTitle(title);
		project.setFname(fname);
		project.setLname(lname);
		project.setDate(date);
		project.setStime(stime);
		project.setEtime(etime);
		project.setMeeting(meeting);
		project.setDetail(detail);
		projectRepository.save(project);
	}
	
	public ProjectForm findProjectById(int id) {
        Project project = projectRepository.getOne(id);
        return new ProjectForm(project.getId(), project.getTitle(),
        		project.getFname(),
        		project.getLname(),
        		project.getDate(),
        		project.getStime(),
        		project.getEtime(),
        		project.getMeeting(),
        		project.getDetail());
    }
	public EmployeeForm findEmployeeById(int id) {
		Employee employee = employeeRepository.getOne(id);
		return new EmployeeForm(employee.getId(), employee.getUsername(), employee.getPassword());
	}





}
