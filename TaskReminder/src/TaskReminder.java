import login.LoginCredentials;
import java.util.*;
public class TaskReminder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the username");
		String user = sc.next();
		System.out.println("Enter your password");
		String pass = sc.next();
		sc.close();
		LoginCredentials login1 =  new LoginCredentials(user,pass);
		if(login1.dbCheck() == 1)
		{
			System.out.println("Executed Sucessfully");
		}
		else
		{
			System.out.println("Not executed");
		}

	}

}
