package collections11;

public class UserDetails implements Comparable<UserDetails>
{
	String name;
	String mobileNumber;
	String UserName;
	String password;
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String name, String mobileNumber, String userName, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		UserName = userName;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int compareTo(UserDetails o) {
		// TODO Auto-generated method stub
		return this.getMobileNumber().compareTo(o.getMobileNumber());
	}
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
