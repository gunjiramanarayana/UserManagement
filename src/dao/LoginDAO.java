package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connectionManager.ConnectionManager;
import model.Login;

public class LoginDAO {

	
	
	public boolean validate(Login login) throws ClassNotFoundException, SQLException {
		String username = login.getUsername();
		String password = login.getPassword();
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("Select  USERNAME, PASSWORD from LOGIN ");
		
		while(rs.next())
		{
			if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD")))
			{
				conn.closeConnection();
				return true;
			}
		}
			conn.closeConnection();
		return false;
}
	public boolean validate1(Login login) throws ClassNotFoundException, SQLException {
		String name = login.getName();
		String designation = login.getDesignation();
		int id = login.getId();
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("Select  NAME, DESIGNATION, ID from USERDATA ");
		
		while(rs.next())
		{
			if(name.equals(rs.getString("NAME")) && designation.equals(rs.getString("DESIGNATION") ))
			{
				conn.closeConnection();
				return true;
			}
		}
			conn.closeConnection();
		return false;
}
	
	
}
