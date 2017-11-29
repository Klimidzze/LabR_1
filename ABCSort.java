import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class ABCSort {

    public static void ABCSort() {
        int counter, num;
        String Cats[];

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива строк: ");
        num = input.nextInt();
        Cats = new String[num];

        System.out.println("Введите " + num + " строк");

        String in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (counter = 0; counter < num; counter++) {
            try {
                in = reader.readLine();
            } catch (Exception E) {
                in = "";
                System.out.println(E.toString());
            }
            Cats[counter] = in;
        }

        System.out.println("Массив строк: ");
        for (counter = 0; counter < num; counter++) {
            System.out.print("[" + Cats[counter] + "]" + " ");
        }
        System.out.println("");
        System.out.println("Отсортированный массив строк: ");
        for (counter = 0; counter < num; counter++) {
            for (int j = 0; j < num - 1; j++) {
                if (Cats[j].compareTo(Cats[j+1]) > 0) {
                    String lapki = Cats[j];
                    Cats[j] = Cats[j+1];
                    Cats[j+1] = lapki;
                }
            }
        }
        System.out.println(Arrays.toString(Cats));

    }

    public static void main(String[] args) {
        ABCSort();
    }
}