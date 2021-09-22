package controller;

import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.LoginDAO;
import dao.UserDAO;
import model.Login;
import model.User;

public class Main {



	public static void main(String[] args) throws Throwable, IOException  {
	

		
		Scanner sc =new Scanner (System.in);
		   
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int x;
		
	    Login login = new Login();
	    User user = new User();
	    LoginDAO logindao = new LoginDAO();	
	    UserDAO userdao = new UserDAO();
	
		do
		{
			
			System.out.println("1. Admin");
			System.out.println("2. Agent");
			System.out.println("3. Exit");
			
			x= Integer.parseInt(br.readLine());
	   switch(x)
	   {
	   case 1:
		   System.out.println("Enter the  details");
		   
		   System.out.println("Enter the username:");
		   String username = br.readLine();
		   
		   System.out.println("Enter the password:");
		   String password = br.readLine();
		 
		   login.setUsername(username);
		   login.setPassword(password);
		   
		   if(logindao.validate(login)==true)
		   {
			   System.out.println(" LOGIN SUCCESSFUL");
			   
			   
			   int y;
			do
			  {
				System.out.println("1. Adduser");
				System.out.println("2. Edituser");  
				System.out.println("3. DeleteUser");
				System.out.println("4.View all users ");
				System.out.println("--------------------");
				
		       y=Integer.parseInt(br.readLine());
		       
		       
		       switch(y)  
		       {
		       case 1:
		    	   
		    	   System.out.println(" WELCOME TO THE ADD USER:");
		    	   System.out.println("Enter NAME");
   	               String name = br.readLine();
   	               System.out.println("Enter DESIGNATION");
	    	       String designation = br.readLine();    
		           System.out.println("Enter ID");
		    	   int id = Integer.parseInt(br.readLine());
		    	    
		    	   user.setName(name);
		    	   user.setDesignation(designation);
		    	   user.setId(id);
		    	   
		    	   userdao.addUser(user);
		    	   System.out.println("User adding successfully");
		    	   break;
		       case 2:
		    	   System.out.println(" WELCOME TO THE EDIT USER:");
		    	   System.out.println("Enter OLD  NAME");
		    	   String oldname = br.readLine();
		    	   System.out.println("Enter NEW  NAME");
		    	   String newname = br.readLine();
		    	   user.setOldname(oldname);
		    	   user.setNewname(newname); 
		    	   userdao.edituser(user);
		    	   System.out.println("User Edit details successfully");
		    	   break;
		       case 3:
		    	   System.out.println(" WELCOME TO THE DELETE USER:");
		    	   System.out.println("Enter DELETE USERNAME");
		    	   String deletename = br.readLine();
		    	   
		    	   user.setDeletename(deletename); 
		    	   userdao.deletename(user);
		    	   System.out.println("Username  deleted details successfully");
		    	   break;
		       case 4:
		    	   System.out.println(" WELCOME TO VIEW ALL THE USERS:");
		   
		    	   userdao.display(user);
		    	   System.out.println("Username ALL details successfully Viewed");
		    	   break;   
		    	   
		       }
		       
			  }while(y!=5);
			   
		     }
		   else
		   {
			   System.out.println("LOGIN UNSUCCESSFUL");
		   }
		   break;
	
	   case 2:		   
		   
		       int z;
		       
		       do
				  {
					System.out.println("1. signUp");
					System.out.println("2. Login"); 
		            z=Integer.parseInt(br.readLine());
		            switch(z)
		            {
		    
	                case 1: System.out.println("1.Sign Up:");
	                        System.out.println("************");
	                     break;
	   
	               case 2: System.out.println("2.Login");
	               
	                       System.out.println("Enter the  details");
	    		   
	    		           System.out.println("Enter the username:");
	    		           String name = br.readLine();
	    		   
	    		           System.out.println("Enter the password:");
	    		           String designation = br.readLine();
	    		           
	    		           System.out.println("Enter the ID number");
	    		           int id = Integer.parseInt(br.readLine());
	    		           
	    		 
	    		          login.setName(name);
	    		          login.setDesignation(designation);
	    		          login.setId(id);
	    		   
	    		          if(logindao.validate1(login)==true)
	    		          {
	    			          System.out.println(" LOGIN SUCCESSFUL");
	    		          }
	    		          else
	    		          {
	    		        	  System.out.println(" LOGIN SUCCESSFUL");
	    		          }
	                      break;
		              }
		          } while(z!=3);	
		        break; 
	   }
		     
	   }while(x!=3); 
	
  }
}
