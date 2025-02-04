import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Subtract {
    public static int minus(int a, int b) {
       return a - b;
    }
    public static void main(String[] args) {
        int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        a = input.nextInt();

        System.out.println("What is your second number?");
        b = input.nextInt();

        result = minus(a, b);
        System.out.println("I subtracted your numbers: " + result);
    }
}