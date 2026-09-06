class Student
{
    private String Name;
    private int Age;

    public String getName()
    {
        return name;
    }
    
    public void setName(String Name)
    {
        this.Name = Name;
    }
    
    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age) {
        if (Age > 0) 
        {
            this.Age = Age;
        }
    }
}

public class Encapsulation
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.setName("Alice");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
