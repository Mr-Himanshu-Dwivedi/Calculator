package calc;
import java.sql.SQLOutput;
import java.util.Scanner;
public class nos_subs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd no : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 3rd no : ");
        int n3 = sc.nextInt();
        System.out.println("Substraction = "+(n1-n2-n3));
    }
}
