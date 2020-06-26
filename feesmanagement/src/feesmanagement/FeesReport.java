package feesmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FeesReport
{
	InputStreamReader ip=null;
	BufferedReader buff=null;
	AccountLogin account=null;
	AdminLogin   admin=null;
	String choiceoption;
public static void main(String[] args) throws IOException
{
	FeesReport f1=new FeesReport(); 
	f1.ip=new InputStreamReader(System.in);
	f1.buff=new BufferedReader(f1.ip);
	System.out.println("welcome to fees reports\n");
	System.out.println("enter your choice");
	System.out.println("1.Admin Login \n 2.Account Login");
	String mchoice=f1.buff.readLine();
	if(mchoice.equalsIgnoreCase("1"))
	{
		AdminLogin admin=new AdminLogin();
		admin.insert();
		admin.select();
		admin.AddAccountent();
	}
	else if(mchoice.equalsIgnoreCase("2"))
		{
		AccountLogin accountlogin=new AccountLogin();
		accountlogin.select();
		accountlogin.AddStudent();
		}
	}
	
}