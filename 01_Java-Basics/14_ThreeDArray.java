import java.util.Scanner;

public class ThreeDArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[][][] num = new int[3][4][2];

        // Taking input
        for (int i = 0; i < num.length; i++)
        {
            for (int j = 0; j < num[i].length; j++)
            {
                for (int k = 0; k < num[i][j].length; k++)
                {
                    System.out.print("Enter Value: ");
                    num[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing values
        for (int i = 0; i < num.length; i++)
        {
            for (int j = 0; j < num[i].length; j++)
            {
                for (int k = 0; k < num[i][j].length; k++)
                {
                    System.out.print(num[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}
