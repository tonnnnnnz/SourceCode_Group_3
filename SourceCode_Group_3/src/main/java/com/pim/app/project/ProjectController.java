package com.pim.app.project;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pim.domain.entity.Employee;
import com.pim.domain.entity.Project;
//import com.pim.domain.entity.Project;
import com.pim.domain.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	private int ID;
	@Autowired
	ProjectService projectService;
	
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String show(Model model) {
		model.addAttribute("projectForm", new ProjectForm());
		return "project/login";
	}
	
	@RequestMapping(value = "create", params = "form", method = RequestMethod.GET)
	public String createForm(Model model, Model model2) {
		model.addAttribute("projectForm", new ProjectForm());
		model2.addAttribute("user",projectService.findEmployeeById(this.ID));
		return "project/create";
	}
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String createMain(Model model,Model model2) {
		List<Project> projectList = projectService.findAllProject();
		model.addAttribute("projectList", projectList);
		model2.addAttribute("user",projectService.findEmployeeById(this.ID));
		return "project/main";
	}
	

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(@RequestParam("title") String title, 
			@RequestParam("fname") String fname, 
			@RequestParam("lname") String lname, 
			@RequestParam("date") String date, 
			@RequestParam("stime") String stime, 
			@RequestParam("etime") String etime, 
			@RequestParam("meeting") String meeting, 
			@RequestParam("detail") String detail ) {
		projectService.save(title, fname, lname, date, stime, etime, meeting, detail);
		return "redirect:/project/go_Main";
	}
	
	@RequestMapping(value = "gomain", method = RequestMethod.GET)
	public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
		List<Employee> office = projectService.findAllEmployee();
		
		int check = 0;
		int ID = 0;
		for(int i = 0;i<office.size();i++) {
			
			if(office.get(i).getUsername().equals(name) && office.get(i).getPassword().equals(password)  ) {
				
				check = 1;
				ID = office.get(i).getId();
				break;
			}	
		}
		this.ID=ID;
		if(check==1) {
			return "redirect:/project/go_Main";
		}else {
			return "project/login";
		}
		

	}
	
	@RequestMapping(value = "go_Main", method = RequestMethod.GET)
    public String go_Main(Model model, Model model2) {
		model.addAttribute("user",projectService.findEmployeeById(this.ID));
		model2.addAttribute("data",projectService.findAllProject());
		
        return "project/main";
    }
	
 
	
	


}
