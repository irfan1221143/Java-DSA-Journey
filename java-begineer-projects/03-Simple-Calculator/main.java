import java.util.Scanner;

class projects
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter Operation: ");
        int i = sc.nextInt();

        switch(i)
        {
            case 1:
                System.out.println("Addition = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication = " + (num1*num2));
                break;
            case 4:
                System.out.println("Division = " + (num1/num2));
                break;
        }
    }
}
