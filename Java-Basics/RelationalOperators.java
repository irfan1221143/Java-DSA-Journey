//1
class learn
{
    public static void main(String a[])
    {
        int num1 = 7;
        int num2 = 5;

        boolean greater = num1 > num2;
        boolean lesser = num1 < num2;
        boolean greater2 = num1 >= num2;
        boolean lesser2 = num1 <= num2;
        boolean equal = num1 == num2;

        System.out.println(greater);
        System.out.println(lesser);
        System.out.println(greater2);
        System.out.println(lesser2);
        System.out.println(equal);
    }
}

//2
class learn
{
    public static void main(String a[])
    {
        int num1 = 7;
        int num2 = 5;
       //boolean compare1 = num1>num2;
        if(num1>num2)
        System.out.println(num1 + " is greater");
        else if(num1<num2)
        System.out.println(num2 + " is greater");
        else
        System.out.println("Both are Equal");
    }
}
