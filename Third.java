import java.util.Scanner;

public class Third {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    sc.close();

    if (number > 0) {
      System.out.println(number + " is positive.");
    } else if (number < 0) {
      System.out.println(number + " is negative.");
    } else {
      System.out.println(number + " is zero.");
    }
  }
}
