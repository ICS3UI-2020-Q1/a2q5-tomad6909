import java.util.Scanner;
/**
 * This program tells the user if a number is divisible by either 5 or 3
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for the user
    Scanner input = new Scanner(System.in);

    // ask the user to enter a number
    System.out.println("Please enter a number to play FizzBuzz");

    int number = input.nextInt();

    // determine whether the number is divisible by 3 or 5
    if (number % 3 == 0 && number % 5 == 0){
      System.out.println("You should say FizzBuzz");
    }else if (number % 5 == 0){
      System.out.println("You should say Buzz");
    }else if (number % 3 == 0){
      System.out.println("You should say Fizz");
    }
    else {
      System.out.println("You should say " + number);
    }
    
  }
}
