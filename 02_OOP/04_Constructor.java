class Student
{
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Constructor
{
    public static void main(String args[])
    {
        Student st1 = new Student("Irfan", 20, 92.5);
        Student st2 = new Student("Rahul", 21, 85.5);

        st1.display();
        st2.display();
    }
}
