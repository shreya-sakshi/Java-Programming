public class LeftRotatingArray {
    public static void main (String args[])
    {
        int A[]={5,9,6,10,12,7,3,5,4,2};

        int temp =A[0];
        System.out.print("Before Rotating the Array :" );
        for (int x : A) 
        {
            System.out.print(x + ",");
          System.out.print(" ");            
        }
         System.err.println();
        for(int i=1; i< A.length; i++)
        {
            A[i-1] =A[i];
        }
        A[A.length-1]=temp;
         
        System.out.print("After Rotating the Array :" );
        for (int x : A) 
        {
            System.out.print(x + ",");
          System.out.print(" ");            
        }
    }
    
}
