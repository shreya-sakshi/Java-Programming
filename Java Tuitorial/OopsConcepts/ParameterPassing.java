// public class ParameterPassing
// {
//     static int add(int x,int y)
//     {
//         int z;
//         z=x+y;
//         return z;
//     }
//     public static void main(String[] args) 
//     {
//         int a =10, b=15 , c;
//         c=add(a,b);

//         System.out.println("Sum of a and b is :" + c);

//     }
    
// }

//int float double are primitive data types
//string , arrays are object
//string is immutable it's values can't be changed
public class ParameterPassing
{
    static void welcome(String n)
    {
        System.out.println("Welcome Mr/Miss :" + n);
    }
    public static void main(String[] args) 
    {
        String name ="Victor"; 
        welcome(name);

    }
    
}

