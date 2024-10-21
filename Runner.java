import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {

    // Tell the user to enter a question
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Magic 8 Ball!");
    System.out.print("Enter a yes-no question and I will answer it: ");
    String question = scan.nextLine();

    // Write a little program here to randomly choose
    // one of six responses to the user's yes-no question!
    int randomNumber = (int) (Math.random() * 5) + 1;

    if (randomNumber == 0) {
      System.out.println("huh. Maybe");
    } else if (randomNumber == 1) {
      System.out.println("Absolutely not.");
    } else if (randomNumber == 2) {
      System.out.println("I don't know.");
    } else if (randomNumber == 3) {
      System.out.println("Bother me later.");
    } else if (randomNumber == 4) {
      System.out.println("It's possible..");
    } else if (randomNumber == 5) {
      System.out.println("Interesting. I think so.");
    }
  }
}