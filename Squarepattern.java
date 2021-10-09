/*Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444*/
import java.util.*;
public class Squarepattern {
	public static void main(String[] args) {	
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(a);
            }
            System.out.println();
        }	
	}
}
