
/**
 * Write a description of class p18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p18
{
    public static void main(int n)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        float s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+(((float)(i))/((float)(Math.pow(a,i))));
        }
    }
}
