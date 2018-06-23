
/**
 * Write a description of class p11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p11
{
    public static void main(int n)
    {
        double s=0;
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int f=0;
        for(int i=1;i<=n;i++)
        {
            f=1;
            for(int j=1;j<=i;j++)
            {
                f*=j;
            }
            s=s+(((double)(a))/((double)(f)));
        }
        System.out.println(s);
    }
}
