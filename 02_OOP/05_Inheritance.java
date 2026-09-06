//Single Level Inheritance

class Calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
}

class AdvanceCalculator extends Calculator
{
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
}

public class Inheritance
{
    public static void main(String args[])
    {
        AdvanceCalculator obj = new AdvanceCalculator();
        int i = obj.add(9,4);
        int j = obj.sub(7,2);
        int k = obj.mul(4,5);
        int l = obj.div(20,4);

        System.out.println(i + " " + j + " " + k + " " + l);
    }
}

//Multi Level Inheritance
class Calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
}

class AdvanceCalculator extends Calculator
{
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
}

class VeryAdvanceCalculator extends AdvanceCalculator
{
    public double power(int a, int b)
    {
        return Math.pow(a, b);
    }
}

public class Inheritance
{
    public static void main(String args[])
    {
        VeryAdvanceCalculator obj = new VeryAdvanceCalculator();
        int i = obj.add(9,4);
        int j = obj.sub(7,2);
        int k = obj.mul(4,5);
        int l = obj.div(20,4);
        double m = obj.power(2,3);

        System.out.println(i + " " + j + " " + k + " " + l + " " + m);
    }
}
