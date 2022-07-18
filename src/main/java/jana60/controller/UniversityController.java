package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.University;
import jana60.repository.UniversityRepository;

@Controller
@RequestMapping("/")
public class UniversityController {
	//non ho capito a che serve
		@Autowired 
		private UniversityRepository repo;

		
		// Controller che restituisce home.html, con la lista legata al database
		@GetMapping
		public String home(Model model) {
			List<University> DepartmentsList =(List<University>)repo.findAll();
			model.addAttribute("DepartmentsList" ,DepartmentsList);
			return "home";
		}
		
		
		
	}
