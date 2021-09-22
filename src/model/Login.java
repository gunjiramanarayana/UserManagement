package model;

public class Login {

	
	private String username;
	private String password;
	private String name;
	private String designation;
	private int id;
	
	public String getUsername() {
		return username;
	}
	public  void setUsername( String username) {
		this.username=username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword( String Password) {
		this.password=Password;
	}
	
	public String getName() {
		return name;
	}
	public  void setName( String name) {
		this.name=name;
    }
	
	public String getDesignation() {
		return designation;
	}
	public  void setDesignation( String designation) {
		this.designation=designation;
    }
	
	public int getId() {
		return id;
	}
	public  void setId( int id) {
		this.id=id;
    }
}