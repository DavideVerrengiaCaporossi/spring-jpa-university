package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Degrees;
import jana60.repository.DegreesRepository;

@Controller
@RequestMapping("/degrees")
public class DegreesController {
	@Autowired 
	private DegreesRepository repo;
   
	
	// Controller che restituisce home.html, con la lista legata al database
	@GetMapping
	public String degreesList(Model model) {
		List<Degrees> DegreesList =(List<Degrees>)repo.findAll();
		model.addAttribute("Degrees" ,DegreesList);
		return "degrees";
	}
}
