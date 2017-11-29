import java.util.Scanner;

import static sun.tools.jar.Main.main;

public class bin {


    public  static int  binSearch(int[] a) {
        Scanner scn = new Scanner(System.in);

        Massiv r = new Massiv();
        int x = 1;
        int start = 0, end = a.length;
        int half;
        int key;
        int index = 0;
        System.out.print("Введите число для поиска:");
        key = scn.nextInt();
        int dry=0;
        for (int i = 0; i < x; i++) {
            half = (end + start) / 2;

            if (a[half]==dry) {
                System.out.println("Такого числа в массиве нет.");
                binSearch(a);
                x--;
                break;

            }
                if (a[half] == key) {
                    index = half;
                    x--;
                    System.out.println("Индекс числа:" + index);
                    break;
                }

                if (a[half] < key) {
                    start = half;
                    dry = a[half];
                    x++;
                }
                if (a[half] > key) {
                    end = half;
                    dry = a[half];
                    x++;
                }

        }

        return index;
    }
}
