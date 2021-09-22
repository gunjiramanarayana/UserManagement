package model;

public class User {

	
	
	private String name;
	private String designation;
	private int id;
	private String oldname;
	private String newname;
	private String deletename;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation= designation;
	}

	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	public void setOldname(String oldname) {
		this.oldname= oldname;	
	}
	public String getOldname() {
		return oldname;	
	}
	public void setNewname(String newname) {
	    this.newname =newname;
		
	}
	public String getNewname() {
	    return newname;
		
	}
	public void setDeletename(String deletename) {
		
		this.deletename = deletename;	
	}
   public String getDeletename() {
		
		return deletename;	
	}



}
