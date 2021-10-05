import java.util.*;
public class Charactercase {
    
    public static void main(String[] args) {
        // Write your code here
Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if(s>='a' && s<='z')
            System.out.println(0);
        else if(s>='A' && s<='Z')
            System.out.println(1);
        else
            System.out.println(-1);
    }
}