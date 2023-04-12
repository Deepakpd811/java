import java.util.Scanner;

public class arrayday1 {

    static void print(int[][] arr) {

        System.out.println("printing a array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }

    static void transpose(int[][] arr){
        System.out.println("transpose of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");

            }
            System.out.println();
        }
    }

    static void sprialPrint(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3]; // creating 2d array of size 3X3

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt(); /// taking user input in 2d array
            }
        }

        System.out.println("matrix are");

        print(arr);
        transpose(arr);
        sprialPrint(arr);


    }
}
