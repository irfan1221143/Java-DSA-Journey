import java.util.Scanner;

public class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num[][] = new int[3][4];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("Enter the value: ");
                num[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
