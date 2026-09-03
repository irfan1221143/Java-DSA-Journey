class Student
{
    private String name;
    private int age;

    public String getname()
    {
        return name;
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public int getage()
    {
        return age;
    }

    public void setage(int age) {
        if (age > 0) 
        {
            this.age = age;
        }
    }
}

public class learn
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.setname("Alice");
        s.setage(20);

        System.out.println("Name: " + s.getname());
        System.out.println("Age: " + s.getage());
    }
}
