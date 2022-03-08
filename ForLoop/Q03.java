package forLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String args[]) {

          /*3----
 Ask user to enter the number of lines of a inverted half pyramid by using numbers.
 Type a program to create the inverted half pyramid.
 For example if the number of lines is 5, the pyramid will be like;
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();



        for (int satir = sayi; satir >= 1;    satir--){

            for (int i = sayi; i<=1;   i++){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }




    }
}