public class learn
{
    public static void main(String args[])
    {
        String s1 = "Irfan";                //String Creation using String Pool
        String s2 = new String("Rohit");    //String Creation using String object
        System.out.println(s1);
        System.out.println(s2);

        String a = "hello";
        String b = "hello";
        System.out.println(a == b);      //Compares string reference
        System.out.println(a.equals(b)); //Compares string content
        
        //String Builder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.insert(5, " World");
        sb.delete(5, 11);
        sb.deleteCharAt(1);
        sb.reverse();
        sb.replace(6, 11, "Java");
        System.out.println(sb);
        
        String result = sb.toString();
    }
}
