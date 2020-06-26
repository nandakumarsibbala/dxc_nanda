package feesmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminLogin
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";

	public void insert() 
	{
		String query=("insert into test.AdminTable values(?,?)");
		
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(query);
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the admin name");
			String AdminName=sc.next();
			ps.setString(1, AdminName);
			System.out.println("enter the admin");
			String AdminPassword=sc.next();
			ps.setString(2,  AdminPassword);
			ps.executeUpdate();
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	public void select()
	{
	String query=("select AdminName from test.AdminTable where AdminPassword=?");
	{
		Connection connection;
		try
		{
			connection = DriverManager.getConnection(url);
		
		PreparedStatement ps=connection.prepareStatement(query);
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the adminpassword ");
		String AdminPassword=sc.next();
		ps.setString(1, AdminPassword);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			String AdminName=rs.getString("AdminName");
			System.out.println("Succsfully logged in "+AdminName);
		}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
}
	public void AddAccountent()
	{
		String query=("insert into test.AccountentTable values(?,?,?,?)");
		{
			Connection connection;
			try
			{
				connection = DriverManager.getConnection(url);
			
			PreparedStatement ps=connection.prepareStatement(query);
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the AccountentName ");
			String AccountentName=sc.next();
			ps.setString(1, AccountentName);
			System.out.println("enter the Accountent phoneNumber ");
			String AccountentPhonenumber=sc.next();
			ps.setString(2, AccountentPhonenumber);
			System.out.println("enter the Accountent emailid ");
			String Accountentemailid=sc.next();
			ps.setString(3, Accountentemailid);
			System.out.println("enter the Accountent password ");
			String AccountentPassword=sc.next();
			ps.setString(4, AccountentPassword);
			ps.executeUpdate();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}