import java.util.Scanner;

public class Fourth {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter an integer: ");
      int number = input.nextInt();
      sum += number;
    }
    System.out.println("The sum of the integers is: " + sum);
    input.close();
  }
}
