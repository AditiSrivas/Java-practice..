/*You are given a single non-negative integer, N. You need to print all numbers that:
(i) occur in the range 0 to N (both inclusive)
(ii) are a part of the fibonacci sequence*/
import java.util.*;
public class Fibonacci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        while(c<n)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}