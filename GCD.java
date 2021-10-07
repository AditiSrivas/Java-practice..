/*You are given two numbers. You need to calculate and print their greatest common divisor (GCD).*/
import java.util.*;
public class GCD   
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int gcd = 1;   
for(int i = 1; i <= x && i <= y; i++)  
{   
if(x%i==0 && y%i==0)   
gcd = i;  
}  
System.out.printf("GCD of"+ x +" and "+ y +"is:"+ gcd);  
}  
}  