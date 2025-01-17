package calc;
import java.util.Scanner;
public class nos_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the 2nd no : ");
        double n2 = sc.nextDouble();
        System.out.println("Division = "+(n1/n2));
    }
}
