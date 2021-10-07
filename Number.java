/*You are given a single number. You need to print one of the following outputs according to the number's nature.
Print 1, if the number is positive
Print -1, if it's negative
Print 0, if it's equal to 0*/
import java.util.*;
public class Number {
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        System.out.println("1");
        else if(n==0)
        System.out.println("0");
        else
        System.out.println("-1");		
	}

}