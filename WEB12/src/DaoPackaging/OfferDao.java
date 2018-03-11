package DaoPackaging;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OfferDao {
	public JdbcTemplate jdbc;
	public NamedParameterJdbcTemplate jdbc1;

	@Autowired
	public void setJdbc(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}
	
	@Autowired
	public void setJdbc1(DataSource dataSource) {
		this.jdbc1 = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Offer> getAllOffers(){
/*		return jdbc.query("select * from offers", new RowMapper() {

			
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));
				return offer;
			}
			
		});*/
		
		return jdbc1.query("select * from offers", BeanPropertyRowMapper.newInstance(Offer.class));
	}

	public void create(Offer offer) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", offer.getName());
		params.addValue("email", offer.getEmail());
		params.addValue("text", offer.getText());
		jdbc1.update("insert into offers(name, email, text) values (:name, :email, :text)", params);
		
	}
	
	
	
	
}
