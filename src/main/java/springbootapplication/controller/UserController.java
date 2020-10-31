package springbootapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springbootapplication.entity.User;
import springbootapplication.repository.RoleRepository;
import springbootapplication.service.UserService;

@Controller
public class UserController {
	
	// Autowired para que utilice inyección de dependencias
	@Autowired 
	UserService userService;
	@Autowired
	RoleRepository roleRepository;
	
	///String para que redireccione a ese html especifico
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) { 
	
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles", roleRepository.findAll());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	/*
	@GetMapping("/UserForm")
    public String getUserForm() {
		return "user-form/user-view";
	} */
	
}
