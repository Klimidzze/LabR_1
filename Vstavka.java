
public class Vstavka {
    public static int[] lesya(int[] a)
    {
        Massiv r = new Massiv();
        int counter=0;
        for(int i=1;i<r.n;i++)
        {
            for(int j=i; j>0 && a[j-1]>a[j];j--)
            {
                counter++;
                int tmp=a[j-1];
                a[j-1]=a[j];
                a[j]=tmp;
            }
        }
        return a;
    }
}