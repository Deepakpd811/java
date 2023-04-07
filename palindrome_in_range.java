import java.util.Scanner;

public class palindrome_in_range {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object


        System.out.print("start : ");
        int start = input.nextInt(); // Read user input  scanf("start : %d",&start);
        System.out.print("end : ");
       int end = input.nextInt(); // Read user input

        int temp = 0;
        for (int i = start; i < end; i++) {

            temp = i;
            int rev = 0;

            while (temp != 0) {
                int rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp / 10;
            }

            if (rev == i) {

                System.out.println("rev " + rev);
            }

        }

        input.close();

    }
}
