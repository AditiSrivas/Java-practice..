/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.*/
import java.util.*;
import java.lang.Math;
public class Powerofn {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        double z=Math.pow(x,n);
        int z1=(int)z;
        System.out.println(z1);
    }
}