import java.util.Scanner;

public class LinearSearch {

    public static void main(String args[]) {
        int counter, num, item, Cats[];

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = input.nextInt();
        Cats = new int[num];

        System.out.println("Введите " + num + " чисел");

        for (counter = 0; counter < num; counter++) {
            Cats[counter] = input.nextInt();
        }

        System.out.println("Введите число, которое надо найти: ");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++) {
            if (Cats[counter] == item) {
                System.out.println(item + " является " + (counter+1) + " по счету в массиве");
                break;
            }
        }
        if (counter == num) {
            System.out.println("Число " + item + " не найдено в массиве");
        }

    }
}

