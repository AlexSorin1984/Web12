package MainController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import DaoPackaging.User;
import ServicePack.LoginService;

@Controller
public class LoginController {
	@Autowired
	public LoginService loginService;

	@RequestMapping("/mylogin")
	public String showLogin() {
		return "mylogin";
	}
	
	@RequestMapping("/loggedout")
	public String showLoggedout() {
		return "loggedout";
	}
	
	@RequestMapping("/newaccount")
	public String showNewAccount(Model model) {
		
		model.addAttribute("user", new User());
		return "newaccount";
	}
	
	@RequestMapping("/createaccount")
	public String createAccount(@Valid User user, BindingResult result) {
		
		if(result.hasErrors()){
			return "newaccount";
		}
		
		if (loginService.exists(user.username)){
			System.out.println("This username already exists !");
			result.rejectValue("username", "DuplicateKey.user.username", "This username already exists !");
			return "newaccount";
		}
		
		loginService.create(user);
		return "accountcreated";

	}
	
	@RequestMapping("/admin")
	public String showAdmin(Model model) {
		List<User> users = loginService.getAllUsers();
		
		model.addAttribute("users", users);
		return "admin";
	}
	
}
