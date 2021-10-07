/*You are given a single positive integer, N. You need to calculate and print the sum of all even numbers till N(inclusive)*/
import java.util.*;
public class Sumofeven {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int s=0;
    for(int i=1;i<=a;i++)
    {
        if(i%2==0)
        s=s+i;
    }
    System.out.println(s);
    }
}