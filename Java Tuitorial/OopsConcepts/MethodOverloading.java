public class MethodOverloading 
{
    static int max(int x , int y)
    {
        return x>y?x:y;
    }

    static float max(float x, float y)
    {
        if(x>y)
          return x;
        else
           return y;
    }

    static int max(int x, int y , int z)
    {
        if(x>y && x>z)
          return x;
        else if(y>z && y>x)
           return y;
        else
           return z;

        // return (x>y&&x>z)? x:(y>z?y:z);
    }
    public static void main(String[] args) 
    {
        // System.out.println(max(10.5f,5.4f));
        // System.out.println(max(5,4));
        System.out.println(max(15,10,25));
        
    }
    
}
