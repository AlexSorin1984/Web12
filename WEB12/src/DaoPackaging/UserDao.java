package DaoPackaging;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDao {
	public NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setJdbc(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Transactional
	public void createAccount(User user) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		String username = user.username;
		String password = user.getPassword();
		String email = user.email;
		
		
		params.addValue("username", username);
		params.addValue("password", password);
		params.addValue("email", email);
		params.addValue("authority", "ROLE_ADMIN");
		
		jdbc.update("insert into users (username, password, email) values (:username, :password, :email)", params);
		jdbc.update("insert into authorities (username, authority) values (:username, :authority)", params);
		
	}

	public boolean exists(String username) {
		
		return jdbc.queryForObject("select count(*) from users where username=:username", new MapSqlParameterSource("username", username), Integer.class)==1;
	}

	public  List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return jdbc.query("select * from users, authorities where users.username=authorities.username", BeanPropertyRowMapper.newInstance(User.class));
	}
	
}
