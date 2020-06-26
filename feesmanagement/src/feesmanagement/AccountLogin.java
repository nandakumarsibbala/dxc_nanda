package feesmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountLogin 
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	public void select() 
	{
		
		String query=("select AccountentName from test.accountenttable where password=?");
		{
			Connection connection;
			try
			{
				connection = DriverManager.getConnection(url);
			
			PreparedStatement ps=connection.prepareStatement(query);
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the password ");
			String AccountentPassword=sc.next();
			ps.setString(1, AccountentPassword);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				String AccountentName=rs.getString("AccountentName");
				System.out.println("Succsfully logged in "+AccountentName);
			}
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void AddStudent() 
	{
		String query=("insert into test.StudentTable values(?,?,?,?)");
		{
			Connection connection;
			try
			{
				connection = DriverManager.getConnection(url);
			
			PreparedStatement ps=connection.prepareStatement(query);
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the StudentName ");
			String StudentName=sc.next();
			ps.setString(1, StudentName); 
			
			System.out.println("enter the Email ");
			String Email=sc.next();
			ps.setString(2, Email);
			
			System.out.println("enter the Course");
			String course=sc.next();
			ps.setString(3, course);
			
			System.out.println("enter the Fee ");
			String fee=sc.next();
			ps.setString(4, fee);
			
			System.out.println("enter the Paid");
			String paid=sc.next();
			ps.setString(5, paid);
			
			System.out.println("enter the Due ");
			String due=sc.next();
			ps.setString(6, due);
			
			System.out.println("enter the Address ");
			String address=sc.next();
			ps.setString(7, address);
			
			System.out.println("enter the city ");
			String city=sc.next();
			ps.setString(8, city);
			
			System.out.println("enter the state");
			String state=sc.next();
			ps.setString(9,state);
			
			System.out.println("enter the country ");
			String country=sc.next();
			ps.setString(10,country);
			
			System.out.println("enter the contactno ");
			String contactno=sc.next();
			ps.setString(11,contactno);
			
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