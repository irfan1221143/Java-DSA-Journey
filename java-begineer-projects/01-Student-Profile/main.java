import java.util.Scanner;

public class StudentProfile
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your College name: ");
        String college = sc.nextLine();
        System.out.print("Enter your Branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter your Roll Number: ");
        String rollnumber = sc.nextLine();
        System.out.print("Enter your Cgpa: ");
        double cgpa = sc.nextDouble();

        System.out.println("=================================");
        System.out.println("         STUDENT PROFILE");
        System.out.println("=================================");
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("College      : " + college);
        System.out.println("Branch       : " + branch);
        System.out.println("Roll Number  : " + rollnumber);
        System.out.println("CGPA         : " + cgpa);
        System.out.println("=================================");

        sc.close();
    }
}
