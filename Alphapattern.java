/*Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC*/
import java.util.*;
public class Alphapattern {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=64;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                
                System.out.print((char) (a + i));
            }
            System.out.println();
        }
	}
}