import java.util.*;
class Tst{

	public static void main (String[] args){
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);

    //  prompt for the user's name
    System.out.print("Enter your name: ");

    // get their input as a String
    String username = scanner.nextLine();

    // prompt for their age
    System.out.print("Enter your age: ");

    // get the age as an int
    String age = scanner.next();

    System.out.println("NAME :: "+username+" AGE :: "+ age);

  }


}
