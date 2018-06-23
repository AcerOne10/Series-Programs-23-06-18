
/**
 * Write a description of class p15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p15
{
    public static void main(int n)
    {
        int a;
        float t=0,s=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            t=(((float)(a+i))/((float)(a+(i+2))));
            s+=t;
        }
    }
}
