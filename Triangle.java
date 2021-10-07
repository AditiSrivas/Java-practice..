/*You are given 3 numbers. Each number represents the length of a line. You need to figure out whether these lines can form a valid triangle.
If a valid triangle can be formed, print "Yes", otherwise print "No".*/
import java.util.*;
public class Triangle {
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       	int b=sc.nextInt();
       	int c=sc.nextInt();
       	if((a+b>c)&&(b+c>a)&&(c+a>b))
       	System.out.println("Valid triangle");
       	else
       	System.out.println("Not a valid triangle");
	}

}