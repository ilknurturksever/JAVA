package forLoop;

public class Q02 {
    public static void main(String args[]) {
      /*2----
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
     Beklenen çıltı:
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */

        for (int satir=1; satir<=10 ; satir++){

            for (int sutun=1; sutun<=satir; sutun++){
                System.out.print((sutun) + " ");
            }
            System.out.println();
        }
    }
}
