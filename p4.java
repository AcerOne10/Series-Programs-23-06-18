
/**
 * Write a description of class p4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p4
{
    public static void main(int n)
    {
        int a=1,b=2,s=0;
        for(int i=1;i<= n;i++)
        {
            s=s+(a*b);
            a=b;
            b=b+1;
        }
        System.out.println(s);
    }
}
