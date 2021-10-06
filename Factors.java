/*Write a program to print all the factors of a number other than 1 and the number itself.*/
import java.util.*;
public class Factors {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int a=n;
        for(int i=2;i<a;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}