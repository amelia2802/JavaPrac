/** Below is the code snippet:
    package challenge8;
    import java.util.Scanner;
    public class Ques06 {
    public static void main(String[] args) {
    String [] indianCricketers = {
    "Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag",
    "Rahane", "Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit",
    "Dinesh", "Harbhajan", "Ishant" };
    }
    }
    String array indianCricketers stores the names of some to the indian cricketers.
    To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
    Complete this code to search for particular name. This search should be case-insensitive.
    If you search for Sourav/sourav/SOURAV, then you should get following output:
    SOURAV found at index: 2 and program should terminate.
    NOTE: Name should be in upper case in the message, even though your search string is in any case.
    If name is not found in the list, the display following:
    AKASH not found in the list. Would you like to search another name? (1 to continue):
    If user’s input is 1, then re-run the logic, otherwise terminate the program.
    On execution you should get following output:
    Result of three separate executions:
    Enter the indian cricketer's name you want to search for: virat
    VIRAT found at index: 9
    Enter the indian cricketer's name you want to search for: kambli
    KAMBLI not found in the list. Would you like to search another name? (1 to continue): 1
    Enter the indian cricketer's name you want to search for: Akash
    AKASH not found in the list. Would you like to search another name? (1 to continue): 1
    Enter the indian cricketer's name you want to search for: SOURAV
    SOURAV found at index: 2
    Enter the indian cricketer's name you want to search for: Robin
    ROBIN not found in the list. Would you like to search another name? (1 to continue): 0

    @author Amelia
 * 
 */
package practice;
import java.util.Scanner;

public class cricketerName {
    public static void main(String[] args) {
        String [] indianCricketers = {
            "Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag",
            "Rahane", "Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit",
            "Dinesh", "Harbhajan", "Ishant" };
        

        //Create Scanner object linked to keyboard.
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		do_loop:
		do {
			System.out.print("Enter the indian cricketer's name you want to search for: ");
			String name = scanner.nextLine();
			//Regular for loop is used in this case as index number of found String is also needed
			for(int i = 0; i < indianCricketers.length; i++) {
				//Use String class's equalsIgnoreCase(String) method to match strings in case-insensitive manner.
				if(name.equalsIgnoreCase(indianCricketers[i])) {
					System.out.println(name.toUpperCase() + " found at index: " + i); //In this message search string should be in upper case.
					//If name is found, then exit the do-while loop.
					break do_loop; //If I break without label, then it will come out of for loop only.
				}
			}

			System.out.print(name.toUpperCase() + " not found in the list. Would you like to search another name? (1 to continue): ");
			answer = scanner.nextLine();
			
		} while(answer.equals("1"));
		
		scanner.close(); //Close the scanner
    }
}
