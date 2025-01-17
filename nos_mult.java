package calc;
import java.util.Scanner;
public class nos_mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd no : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 3rd no : ");
        int n3 = sc.nextInt();
        System.out.println("Multiplication = "+(n1*n2*n3));
    }
}
