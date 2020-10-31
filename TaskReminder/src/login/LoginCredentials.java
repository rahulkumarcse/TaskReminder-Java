package login;
import java.sql.*;
public class LoginCredentials {
	 String username;
	 String password;
	public LoginCredentials(String username, String password) {
		 this.username= username;
		this.password = password;	
	
	}
	 public int dbCheck(){
	
	
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul",username,password);
		Statement stmt = connect.createStatement();
		ResultSet query = stmt.executeQuery("select * from rahul");
		while(query.next()) {
			System.out.println(query.getString("name"));
		}
		System.out.print(query);
		connect.close();
		return 1;
	}catch(Exception e)
	{
		System.out.println(e);
		return 0;
	}

}
}
