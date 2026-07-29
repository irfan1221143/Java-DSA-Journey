class learn
{
    public static void main(String a[])
    {
        int num1 = 5;
        int num2 = 7;
        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1/num2;  //Division without Decimal
        double num3 = 7;
        double num4 = 5;
        double div1 = num3/num4;  //Division with Decimal
        int rem = num1%num2;  //Remainder after division
        
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + add);
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mult);
        System.out.println("Division of " + num1 + " and " + num2 + " is " + div + " without decimal");
        System.out.println("Division of " + num1 + " and " + num2 + " is " + div1 + " with decimal");
        System.out.println("Remainder of " + num1 + " and " + num2 + " is " + rem + " after division");
    }
}
