package NHW;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter resualt");
        int q = scan.nextInt();
        int m = scan.nextInt();
        int f = scan.nextInt();



        if (q > m && q > f ) {
            System.out.println(q);
        }else if (m > q && m > f){
            System.out.println(m);
        }else if (f > q && f > m){
            System.out.println(f);
        }else{
            System.out.println("All Equals");
        }
    }
}