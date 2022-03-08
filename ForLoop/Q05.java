package forLoop;

import java.util.Scanner;

public class Q05 {
    public static void main(String args[]) {

    /*5----
 Ask user to enter the number of lines of a  pyramid .
 Type a program to create the pyramid.
 For example if the number of lines is 5, the pyramid will be like;
             *
            * *
           * * *
          * * * *
         * * * * *
 Kullanıcının  girdigi satır sayısı kadar * ile piramid sekli yazdıran bir program create ediniz.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        for (int satir = 1; satir < sayi; satir++){

            for (int bosluk = ((sayi-1)-satir);  bosluk >1; bosluk--){
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
