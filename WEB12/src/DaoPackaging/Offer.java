package DaoPackaging;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

public class Offer {
	public int id;
	
	@Size(min=5, max=100, message="Field 'Name' must be between 5 and 100 characters")
	public String name;
	
	@NotNull(message="Field 'Email' must not be NULL")
	public String email;
	
	@Size(min=10, max=100, message="Field 'Text' must be between 10 and 100 characters")
	public String text;
	
	public Offer(int id, String name, String email, String text) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return "Offer: [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
	
	
	
	

}
