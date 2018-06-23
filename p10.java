
/**
 * Write a description of class p10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p10
{
    public static void main(int n)
    {
        int a;
        float s=0.0f;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            s=s+(((float)(Math.pow(a,i)))/((float)(i)));
        }
        System.out.println(s);
    }
}
