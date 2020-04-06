package UserInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import dev.calapatia.daos.BankAccountDAO;
import dev.calapatia.daos.BankAccountDAOmaria;
import dev.calapatia.entities.User;
import dev.calapatia.utils.ConnectionUtil;


public class Main {
	static User user = new User();
	static Scanner myObj = new Scanner(System.in);  
	public static void main(String[] args) {
		System.out.println("Welcome to the Project 0 Bank ");
		System.out.println("Press 1 to log in or press 2 to create an account");
		int choice = myObj.nextInt();
		switch (choice) {
		  case 1:
			  Scanner myObj = new Scanner(System.in);
			 System.out.println("Enter username");
		    String username = myObj.nextLine();
		    
		    System.out.println("Enter password");
		    String password = myObj.nextLine();
		   
		    
			  try(Connection conn = ConnectionUtil.createConnection()){
					String sql = "SELECT * FROM Project0.BANKUSER WHERE USERNAME = '"+ username + "' and Password= '"+password+"';";
					PreparedStatement ps = conn.prepareStatement(sql);
					
				//	ps.setString(3, password);

					ResultSet rs = ps.executeQuery();
					if(rs.next()) {
						System.out.println("Welcome: "+ username);
						System.out.println("Press 1 to view balance, press 2 to make a withdrawal, press 3 to make a deposit");
						Scanner myObj2 = new Scanner(System.in);
						int transactionchoice = myObj2.nextInt();
						switch (transactionchoice) {
						  case 1:
							  try(Connection transaction = ConnectionUtil.createConnection()){
									String sql2 = " SELECT BALANCE\r\n" + 
											"  FROM BANKACCOUNT JOIN BANKUSER\r\n" + 
											"    ON BANKACCOUNT.USER_ID = BANKUSER.USER_ID\r\n" + 
											"   WHERE USERNAME  = '"+username+"'";
									PreparedStatement ps2 = conn.prepareStatement(sql2);
									
									String sql3 = " SELECT BANK_ACCOUNT_ID \r\n" + 
											"  FROM BANKACCOUNT JOIN BANKUSER\r\n" + 
											"    ON BANKACCOUNT.USER_ID = BANKUSER.USER_ID\r\n" + 
											"   WHERE USERNAME  = '"+username+"'";
									PreparedStatement ps3 = conn.prepareStatement(sql3);
								//	ps.setString(3, password);

									ResultSet rs1 = ps2.executeQuery();
									ResultSet rs2 = ps3.executeQuery();
									String counter;
									while(rs2.next()) {
										System.out.println( rs2.getString(1));
										counter=rs2.getString(1);
									
									while(rs1.next()) {
										System.out.println("Account: "+ counter+" has a balance of:  "+ rs1.getString(1));
										
									}
						    break;
							  }
							  }
						  case 2:
						    System.out.println("Tuesday");
						    break;
						  case 3:
						    System.out.println("Wednesday");
						    break;
						  case 4:
						    System.out.println("Thursday");
						    break;
						  case 5:
						    System.out.println("Friday");
						    break;
						  case 6:
						    System.out.println("Saturday");
						    break;
						  case 7:
						    System.out.println("Sunday");
						    break;
						}
						
					}else {
						System.out.println("Cannot find user");
					}
					}
			    
			
			    catch (Exception exc) {
					exc.printStackTrace();
				}
				
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		
		}
		
	    

}
	private static void Authenticate(String userName, String passWord) {

		
	}

}	
