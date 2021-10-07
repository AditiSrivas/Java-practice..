/*You are given a single non-negative integer, N. You need to find out whether N is a part of the fibonacci sequence.
Print "Yes" if it is and "No" if it's not.*/
import java.util.*;
public class fibonacciM
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        int r=0;
        while(c<n)
        {
            c=a+b;
            if(c==n)
            r=1;
            a=b;
            b=c;
        }
        if(r==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}