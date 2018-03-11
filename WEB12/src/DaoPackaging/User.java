package DaoPackaging;

import javax.validation.constraints.Size;

public class User {
	
	@Size(min=5, max=100, message="Field 'username' must be between 5 and 100 characters")
	public String username;
	@Size(min=5, max=100, message="Field 'password' must be between 5 and 100 characters")
	public String password;
	@Size(min=5, max=100, message="Field 'Email' must be between 5 and 100 characters")
	public String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	private boolean enabled = false;
	private String authority;
	
	
	public User() {
	}
	
	public User(String username, String password, String email, boolean enabled, String authority) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.authority = authority;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	
}