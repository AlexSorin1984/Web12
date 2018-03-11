package ServicePack;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import DaoPackaging.User;
import DaoPackaging.UserDao;

@Service
public class LoginService {
	
	@Autowired
	public UserDao userDao;
	
	public void create(User user) {
		userDao.createAccount(user);
	}

	public boolean exists(String username) {
		
		
		return userDao.exists(username);
	}
	
	@Secured("ROLE_ADMIN")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}
	
}
