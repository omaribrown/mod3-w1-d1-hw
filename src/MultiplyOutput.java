import java.util.Scanner;

public class MultiplyOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("What's the first Number?");
         int firstNum = scan.nextInt();

         System.out.println("What's the second number?");
         int secondNum = scan.nextInt();

         int productNum = firstNum * secondNum;

        System.out.println("The product of those two numbers is " + productNum);

    }
}
