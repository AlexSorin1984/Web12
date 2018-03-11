package MainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import DaoPackaging.Offer;
import DaoPackaging.OfferDao;
import ServicePack.DaoService;

@Controller
public class ControllerOne {

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	

}
