package MainController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DaoPackaging.Offer;
import DaoPackaging.OfferDao;
import ServicePack.DaoService;

@Controller
public class ControllerTwo {
	@Autowired
	public DaoService daoService;

	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offerlist = daoService.getOffers();
		model.addAttribute("list", offerlist);
		return "offers";
	}
	
	@RequestMapping("/createOffer")
	public String createOffer(Model model) {
		model.addAttribute("offer", new Offer());
		return "createOffer";
	}
	
	@RequestMapping(value="/offercreated", method=RequestMethod.POST)
	public String offerCreated(Model model, @Valid Offer offer, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("Form does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createOffer";
		}
		
		daoService.create(offer);

		return "offercreated";
	}
	
}
