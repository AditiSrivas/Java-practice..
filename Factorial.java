/*You are given a single non-negative integer, N. You need to calculate and print N factorial (N!)*/
import java.util.*;
public class Factorial {
	public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
            System.out.println("The factorial of the number:"+ f);
        }

}
}