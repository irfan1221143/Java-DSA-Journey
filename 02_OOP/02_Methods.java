import java.util.Scanner;

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

public class learn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        Calculator calc = new Calculator();
        int r1 = calc.add(a,b);
        System.out.println("Sum of numbers is " + r1);

        int r2 = calc2.sub(a,b);
        System.out.println("Subtraction of numbers is " + r2);

        sc.close();
    }
}
