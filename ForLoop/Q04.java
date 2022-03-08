package forLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String args[]) {

     /*4----
  Ask user to enter the number of lines of a inverted half pyramid .
  Type a program to create the inverted half pyramid.
  For example if the number of lines is 5, the pyramid will be like;
  * * * * *
  * * * *
  * * *
  * *
  *
  Kullanıcının  girdigi satır sayısı kadar * ile ters yarım piramid sekli yazdıran bir program create ediniz.
  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        for (int satir = 0;  satir >sayi ; satir--){
            for (int sutun = 0; sutun>= satir; sutun--){
                System.out.println(sutun + "*");
            }
            System.out.println();
        }
    }
}
