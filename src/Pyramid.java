
/*
Your program should take the height of the pyramid as a parameter and then print it out. For example:
pyramid: 1
#

pyramid: 2
 #
###

pyramid: 4
   #
  ###
 #####
#######

 */


import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();

        // Print the pyramid
        for (int i = 0; i < height; i++) {

            for (int j = height - 1 - i; j > 0 ; j--) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int y = 0; y < i; y++) {
                System.out.print("##");
            }
            System.out.println();
        }
    }
}