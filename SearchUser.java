package collections12;

public class SearchUser implements Comparable<SearchUser>{
	private String name;
	private String email;
	private String username;
	private String password;
	public SearchUser() {
		// TODO Auto-generated constructor stub
	}
	public SearchUser(String name, String email, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
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
	@Override
	public int compareTo(SearchUser o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %s", this.getName(), this.getEmail(), this.getUsername(),
				this.getPassword());
	}
	
}
