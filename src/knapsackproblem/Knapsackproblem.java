
package knapsackproblem;
import java.util.*;

public class Knapsackproblem {


    public static void knapsack(int m , int prof[] , int wt[])
    {
        
        int n = prof.length;
        float x[] = new float[n];
        int p = 0 , w = 0;
        System.out.println("maximum capacity of the bag = "+m);
    
   int i;
         for (i = 1;i<n;i++)
         {
                        x[i] = (float) 0.0;
                        int U =m;

            for (i = 1;i< n;i++)
            {
                        if( wt[i] > U)
                                    break;
                        x[i] = 1.0f;

                        U = U-wt[i];
                        
                        p += prof[i];
                        w += wt[i];
            }

            if(i <= n )
            {

                        x[i] = U/wt[i];

            }
         }
         System.out.println("max profit = "+p);
         System.out.println("weight = "+w);
         System.out.print("knapsack bag = ");
         for(i=0;i<n;i++)
         {
             System.out.print( " "+"{"+x[i]+"}");
         }
        
        
    }
    public static void main(String[] args) {
       
        // TODO code application logic here
        System.out.println("Knapsack problem using greedy algorithm");
        System.out.println("Enter the capacity of bag ");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        System.out.println("Enter no.of items present ");
        int n = sc.nextInt();
         int p[] = new int[n];
          int w[] = new int[n];
        for(int i = 0;i<n;i++)
        {
             System.out.println("Enter the profit value ");
             int val = sc.nextInt();
            p[i] = val;
        }
          for(int i = 0;i<n;i++)
        {
             System.out.println("Enter the weight for profit value ");
             int val = sc.nextInt();
            w[i] = val;
        }
          for(int i = 0;i<n;i++)
          {
          System.out.print("profit \t\t: "+p[i]);
          System.out.println("weight \t\t: "+w[i]);
          }
          
        
        knapsack(capacity , p,w);
        
    }
    
}
