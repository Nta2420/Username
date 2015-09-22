import java.util.Scanner;
/**
 * Authenticate login
  * @author Natnael
   *
    */
    public class Username {
    	/**
		 * 
		 	 * @param args default parameter for main
			 	 */
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
																																
