/*Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321*/
import java.util.*;
public class Reversenum {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }	
	}
}
