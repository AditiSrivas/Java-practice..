/*You are given a single positive integer, N. You need to print all even integers that occur between 1 and N (both inclusive).*/
import java.util.*;
public class Eveninteger {
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("The even integers are:");
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            System.out.print(i+" ");            
        }
}
}