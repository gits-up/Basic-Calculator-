import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char options;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            System.out.println("Enter an operator (+, -, *, /,%) or press (#) to exit calculator:");
            options = sc.next().charAt(0);
            switch (options) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                case '%':
                    ans = num1 % num2;
                    break;
                case '#':
                    System.exit(0);
                default:
                    System.out.println("Enter correct options");
                    return;
            }
            System.out.print("Result: ");
            System.out.println(num1 + " " + options + " " + num2 + " = " + ans);
        }
    }

}
