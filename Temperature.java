import java.util.*;
public class Temperature {
	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        int z=0;
        for(int i=s;i<=e;i=i+w)
        {
            System.out.print(i+" ");
            z=(i-32)*5/9;
            System.out.println(z);
        }
	}

}
