import java.util.*;

public class RightRotatingArray 
{
    public static void main (String args[])
    {
        int A[]={5,9,6,10,12,7,3,5,4,2};

        int temp = A[A.length -1];
        
        System.out.print("Before Rotating the array to the right :");
        for (int x : A)
        {
            System.out.print(x + ",");
          System.out.print(" ");
        }
        
        System.out.println();
        for(int i = (A.length-1); i>0 ; i--)
        {
            A[i]=A[i-1];
        }

        A[0]=temp;
        
        System.out.print("After Rotating the array to the right :");
        for (int x : A)
        {
            System.out.print(x + ",");
          System.out.print(" ");
        }

    }
    
}
