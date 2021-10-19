/*Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE*/
import java.util.*;
public class Alphabets {
	public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
 int i,j; 
     for(i=n;i>=1;i--)
     {
         for(j=i;j<=n;j++)
         { 
             System.out.print((char)(j+64));
         } 
         System.out.println("");
     }
 }
}