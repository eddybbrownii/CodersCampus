/**
 * 
 */
package CodersCampus;

import java.util.Scanner;

/**
 * 
 */
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your username?");
		String username = scanner.nextLine();// TODO Auto-generated method stub

		System.out.println("What is your password?");
		String password = scanner.nextLine();
		System.out.println("You typed in: " + username);
		System.out.println("You typed in: " + password);
		
		if (username.equals("Eddy") 
				&& password.equals("wood")) {
			System.out.println("You have been validated.");
			} else {
				System.out.println("Hello " + username);
			}
			
		scanner.close();
	}

}
