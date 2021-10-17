/*Provided N you have to find out the Nth Fibonacci Number.*/
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,a=1,b=1;
            if(n==1)
            {
                System.out.println(a);
            }
            else if(n==2)
            {
                System.out.println(b);
            }
            else
            {
                for(int i=2;i<n;i++)
                {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
        }
	}
}
