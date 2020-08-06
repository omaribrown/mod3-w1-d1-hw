import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number in inches to be converted...");
        int inches = scan.nextInt();
        double inchesToMeters = inches * 0.0254;
        System.out.println("Output: " + inchesToMeters + " Meters!");

    }
}
