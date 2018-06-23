
/**
 * Write a description of class p16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p16
{
    public static void main(int n)
    {
        int a,s=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+(a+i);
        }
        System.out.println(s);
    }
}
