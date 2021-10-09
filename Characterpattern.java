/*Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG*/
import java.util.*;
public class Solution {
	public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=64,z=0;
        for(int i=1;i<=n;i++)
        {
            z=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char) (a +z));
                z=z+1;
            }
            System.out.println();
        }	
	}
}
