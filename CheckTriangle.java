/*You are given the lengths of 3 sides of a valid triangle. You need to print any one of the following outputs depending on the triangle's nature.
Print 1, if the triangle is equilateral
Print 0, if it's isosceles
Print -1, if it's scalene*/
import java.util.*;
public class CheckTriangle {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if((a==b)||(b==c)||(c==a))
    System.out.println(0);
    else if((a!=b)||(b!=c)||(c!=a))
    System.out.println(-1);
    else
    System.out.println(1);
    }
}