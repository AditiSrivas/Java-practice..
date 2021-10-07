/*Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.*/
import java.util.*;
public class Sumofevenodd {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int o=0,e=0;
        while(b!=0)
        {
            int r=b%10;
            if(r%2!=0)
                o=o+r;
            else
                e=e+r;
            b=b/10;
        }
        System.out.println(e+" "+o);
	}
}
