import java.util.Scanner;

public class Scanner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int num = sc.nextInt();

        System.out.println(num + " is Entered");
    }
}
