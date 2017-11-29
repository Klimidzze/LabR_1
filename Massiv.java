import java.util.Scanner;
public class Massiv {

    static Scanner scn = new Scanner(System.in);
    static int n,w;

    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива: ");
        n=scn.nextInt();
        int [] a = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Введите ["+i+"] элемент массива:");
            a[i]=scn.nextInt();

        }
        System.out.println("Ваш массив: ");
        for (int i=0; i<n; i++)
        {
            System.out.println("["+a[i]+"]");
        }

        My_Method mm = new My_Method();
        Vstavka v = new Vstavka();

        System.out.println("Если вы хотите выполнить сортировку моим методом - нажмите 1, если хотите выполнить сортировку вставкой - нажмите 2: ");
        w=scn.nextInt();
        if(w==1)
        {
            a = mm.tatan(a);
        }
        if(w==2)
        {
            a=v.lesya(a);
        }

        if(w!=1 && w!=2)
        {
            System.out.println("Ошибка");
            main(null);
        }

        System.out.println("Отсортированный массив: ");
        for (int i=0; i<n; i++)
        {
            System.out.println("["+a[i]+"]");
        }

        bin b= new bin();
        int index = b.binSearch(a);
    }

}
