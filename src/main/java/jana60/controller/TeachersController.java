package jana60.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Teachers;

import jana60.repository.TeachersRepository;



	@Controller
	@RequestMapping("/")
	public class TeachersController {
		
			@Autowired 
			private TeachersRepository repo;

			
			// Controller che restituisce home.html, con la lista legata al database
			@GetMapping("/teachers")
			public String insegnanti (Model model) {
				List<Teachers> TeachersList =(List<Teachers>)repo.findAll();
				model.addAttribute("Teacherslist" ,TeachersList);
				return "teachers";
			}
			
			@GetMapping ("/teachers/{id}")
			public String corsi (@PathVariable(name = "id")Integer id, Model model ) {
				Optional<Teachers> Teacher = repo.findById (id);
				if (Teacher.isPresent()) {
					model.addAttribute("teachers", Teacher.get());
				}
				return "teachersDetails";
			
		}
	}
