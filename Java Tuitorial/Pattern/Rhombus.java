import java.util.*;

public class Rhombus
{
    public static void main(String[] args) {
        int n=5;

        // for(int i=n; i>=1;i--)
        // {
        //     for(int j=i;j<n+i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i; j++)
            {
                System.out.print(" ");
            }
            
            //star
            for(int j=1;j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
