import java.util.Scanner;

class Student
{
    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}


class StudentManagementSystem
{
    Student students[] = new Student[100];
    Scanner sc = new Scanner(System.in);
    void add()
    {
        
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Name: ");
        String name = sc.next();
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student st = new Student(id, name, age, marks);
        
        for(int a=0; a<students.length; a++)
        {
            if(students[a] == null)
            {
                students[a] = st;
                break;
            }
        }
    }

    void display()
    {
        boolean found = false;
        for(int i=0; i<students.length; i++)
        {
            if(students[i] != null)
            {
                System.out.println("==== Students Details ====");
                students[i].display();
                System.out.println("---------------------------");
                found = true;
            }
        }
        
        if(found == false)
        {
            System.out.println("No Students found.");
        }
    }
    
    void search(int searchId)
    {
        boolean found = false;

        for(int i = 0; i < students.length; i++)
        {
            if(students[i] != null && students[i].id == searchId)
            {
                students[i].display();
                found = true;
                break;
            }
        }
        
        if(found == false)
        {
            System.out.println("ID not found.");
        }
    }
    
    void update(int id)
    {
        boolean found = false;
        for(int i=0; i<students.length; i++)
        {
            if(students[i] != null)
            {
                if(students[i].id == id)
                {
                    System.out.println("===== Student Details =====");
                    students[i].display();
                    System.out.println("-------------------------");

                    System.out.print("Enter new Name: ");
                    String newName = sc.next();
                    System.out.print("Enter new Age: ");
                    int newAge = sc.nextInt();
                    System.out.print("Enter new Marks: ");
                    double newMarks = sc.nextDouble();

                    students[i].name = newName;
                    students[i].age = newAge;
                    students[i].marks = newMarks;

                    System.out.println(id + " updated Successfully");
                    found = true;
                    break;
                }
            }
        }
        
        if(found == false)
        {
            System.out.println("ID not found.");
        }
    }
    
    void delete(int id)
    {
        boolean found = false;
        for(int i=0; i<students.length; i++)
        {
            if(students[i] != null)
            {
                if(students[i].id == id)
                {
                    System.out.println("===== Student Details =====");
                    students[i].display();
                    System.out.println("-------------------------");

                    System.out.print("Are you sure to delete?(1 = Yes, 0 = No): ");
                    int o = sc.nextInt();

                    if(o==1)
                    {
                        students[i] = null;
                        System.out.println(id + " Deleted Successfully");
                    }
                    else if(o==0)
                    {
                        System.out.println("Deletion Cancelled");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                    found = true;
                    break;
                }
            }
        }
        if(found == false)
        {
            System.out.println("ID not found.");
        }
    }
}

public class Projects
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem obj = new StudentManagementSystem();
        while(true)
        {
            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            if(n==1)
            {
                obj.add();
            }
            
            else if(n==2)
            {
                obj.display();
            }
            
            else if(n==3)
            {
                System.out.print("Enter id to search: ");
                int id = sc.nextInt();
                
                obj.search(id);
            }
            
            else if(n==4)
            {
                System.out.print("Enter id to update: ");
                int id = sc.nextInt();
                
                obj.update(id);
            }
            
            else if(n==5)
            {
                System.out.print("Enter id to delete: ");
                int id = sc.nextInt();
                
                obj.delete(id);
            }

            else if(n==6)
            {
                break;
            }
            
            else
            {
                System.out.println("Invalid Choice");
            }
        }
    }
}
