import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

//1. Задать целочисленный массив, состоящий из элементов 0 и 1.

            System.out.println("\n1 - задание");
            int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr1[i] == 1 ? 0 : 1;
                System.out.print(arr1[i] + " ");
            }
        System.out.println();
//2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
            System.out.println("\n2 - задание");
            int[] arr2 = new int[8];
            for (int i = 1, j = 0; i < arr2.length; i++) {
                arr2[i] = j += 3;
            }
            for (int x : arr2) {
                System.out.print(x + " ");
            }
        System.out.println();

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;
            System.out.println("\n3 - задание");
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) arr3[i] *= 2;
                System.out.print(arr3[i] + " ");
            }
        System.out.println();

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
            System.out.println("\n4 - задание");
            int[][] arr4 = new int[5][5];
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                    if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                    System.out.print(arr4[i][j] + " ");
                }
                System.out.println();
            }

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
            System.out.println("\n5 - задание");
            int[] arr5 = {1, 2, 3, 7, 99, 14, 0, 7, 5, 8, 9, 33};
            int min = arr5[0], max = arr5[0];
            for (int i = 0; i < arr5.length; i++) {
                if (arr5[i] > max) {
                    max = arr5[i];

                }
                if (arr5[i] < min) {
                    min = arr5[i];

                }
            }
            System.out.println("Максимальный элемент = " + max);
            System.out.println("Минимальный элемент = " + min);
        System.out.println();
        }
            

    }

