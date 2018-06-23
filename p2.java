
/**
 * Write a description of class p2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p2
{
    public static void main(int n)
    {
        int sum=0,a=0,b=1,c=0;
        for(int i = 1;i<=n;i++)
        {
            c = a + b;
            a = b;
            b = c;
            sum+=c;
        }
        System.out.println(sum);
    }
}
