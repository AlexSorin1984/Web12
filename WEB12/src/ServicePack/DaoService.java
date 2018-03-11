package ServicePack;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import DaoPackaging.Offer;
import DaoPackaging.OfferDao;

@Service
public class DaoService {
	@Autowired
	public OfferDao offerDao;

	public List<Offer> getOffers(){
		return offerDao.getAllOffers();
	}
	
	
	public void create(Offer offer) {
		offerDao.create(offer);
		
	}
	
}
