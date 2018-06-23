
/**
 * Write a description of class p8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p8
{
    public static void main(int n)
    {
        int a=1,b=1;//,increment=3;
        float s=0;
        for(int i = 1;i<=n;i++)
        {
            s=s+((float)(((float)(a))/((float)(b))));
            a+=2;
            b+=i;
            i+=2;
        }
        System.out.println(s);
    }
}
