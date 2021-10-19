/*Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.*/
import java.util.*;
public class Allprime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<=a;i++)
        {
            b=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    b=b+1;
                }
            }
            if(b==1)
                System.out.println(i);
        }	
	}
}
