/*You are given a single positive integer, N. You need to print all prime numbers that occur in the range 1 to N (both inclusive).*/
import java.util.*;
public class prime {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<=a;i++)
        {
            b=0;
            for(int j=2;j<=i/2;++j)
            {
                if(i%j==0)
                {
                    b=1;
                    break;
                }
            }
            if(b==0)
            System.out.println(i);
        }}}