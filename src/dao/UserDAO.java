package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionManager.ConnectionManager;
import model.User;

public class UserDAO {



	public void addUser(User user) throws SQLException, ClassNotFoundException {
       	
		
		String name = user.getName();
		String designation = user.getDesignation();
		int id = user.getId();
		
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		
		String sql = "insert into USERDATA(NAME, DESIGNTION , ID)values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,designation);
		ps.setInt(3,id);
		ps.executeUpdate();
		conn.closeConnection();
	}

	public void edituser(User user) throws ClassNotFoundException, SQLException {
		
		
		String oldname = user.getOldname();
		String newname = user.getNewname();
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		String sql= "Update USERDATA set NAME=? where NAME=?";
	    PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, newname);
		ps.setString(2,oldname);
		ps.executeUpdate();
		con.close();
	}

	public void deletename(User user) throws ClassNotFoundException, SQLException {
		
		String deletename = user.getDeletename();
		
		ConnectionManager conn = new ConnectionManager();
		Connection con = conn.establishConnection();
		String sql = "delete from  USERDATA where NAME = ?";
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1,deletename);
		ps.executeUpdate();
		con.close();
		
		
		
	}

	public void display(User user) throws ClassNotFoundException, SQLException {
		
		ConnectionManager conn= new ConnectionManager();
		Connection con = conn.establishConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from USERDATA");
		
		while(rs.next()) {
			System.out.println(rs.getString("name")+ " ");
		}
	}

	

	
		
		
}
