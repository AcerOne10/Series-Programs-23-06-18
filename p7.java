
/**
 * Write a description of class p7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p7
{
    public static void main(int n)
    {
        int a=1,b=2;
        float s=0;
        for(int i = 1;i<=n;i++)
        {
            s=s+((float)((float)(a)/(float)(b)));
            a=b;
            b=b+1;
        }
        System.out.println(s);
    }
}
