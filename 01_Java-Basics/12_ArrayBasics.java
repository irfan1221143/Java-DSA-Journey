public class ArrayBasics
{
    public static void main(String args[])
    {
        int[] num = {1, 2, 3, 4, 5};

        // Array indexing starts from 0
        System.out.println(num[0]);
        System.out.println(num[2]);
        System.out.println(num[4]);

        // Printing all values
        for (int i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }

        // Changing a value
        num[0] = 2;
        System.out.println(num[0]);
    }
}
