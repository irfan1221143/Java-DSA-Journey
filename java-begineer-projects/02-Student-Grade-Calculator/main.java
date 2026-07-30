import java.util.Scanner;

class projects
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks in Physics: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks in English: ");
        int marks4 = sc.nextInt();
        System.out.print("Enter marks in Computer: ");
        int marks5 = sc.nextInt();

        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (total / 5.0);

        System.out.println("=================================");
        System.out.println("       STUDENT REPORT CARD");
        System.out.println("=================================");
        System.out.println("  Name         : " + name);

        System.out.println("  Physics      : " + marks1);
        System.out.println("  Chemistry    : " + marks2);
        System.out.println("  Maths        : " + marks3);
        System.out.println("  English      : " + marks4);
        System.out.println("  Computer     : " + marks5);

        System.out.println("-------------------------------");
        System.out.println("  Total        : " + total);
        System.out.println("  Percentage   : " + percentage + "%");
        System.out.println("==============================");
        sc.close();
    }
}
