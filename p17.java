
/**
 * Write a description of class p17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p17
{
    public static void main(int n)
    {
        float s=0;
        int a,in=2;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+(((float)(a))/((float)(in)));
            in+=3;
        }
        System.out.println(s);
    }
}
