/**
 * Purpose:  a Java Program to Authenticate a user login for Username and Password.

If username and password is correct then display "Welcome Username!" message.

Else display "Wrong Username or Password!" message.
 */
import java.util.Scanner;
public class Username {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String Username = "Ntad";
		String Password = "locker";
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter Username ");
		String CorrectUsername = scan.nextLine();
		System.out.println("Enter Password ");
		String CorrectPassword = scan.nextLine();
		if(Username.equals(CorrectUsername) && Password.equals(CorrectPassword)){
			System.out.printf("Welcome " + Username);
		} else {
			System.out.println( "Wrong Username and Password" );
		}	
	}
}

