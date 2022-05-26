package NHW;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("what is your current speed");
                int speed = scanner.nextInt();
                System.out.println("do you have your license with you? ");
                boolean isDriverLicenseAvailable = scanner.nextBoolean();
                int notHavingDL = 200;
                int fineBetween55to74 = 100;
                int fineBetween74to84 = 150;
                int fineBetween85to94 = 320;
                int fineOver95 = 500;



                if (speed>55 && speed<74) {
                    if (!isDriverLicenseAvailable) {
                        System.out.println(fineBetween55to74 + notHavingDL);
                    }else{
                        System.out.println(fineBetween55to74);
                    }

                } else if (speed>74 && speed<84) {
                    if (!isDriverLicenseAvailable) {
                        System.out.println(fineBetween74to84 + notHavingDL);
                    }else{
                        System.out.println(fineBetween74to84);
                    }

                } else if (speed>85 && speed<94) {
                    if (!isDriverLicenseAvailable) {
                        System.out.println(fineBetween85to94 + notHavingDL);
                    }else{
                        System.out.println(fineBetween85to94);
                    }

                } else{
                    if (!isDriverLicenseAvailable) {
                        System.out.println(fineOver95 + notHavingDL);
                    }else{
                        System.out.println(fineOver95);
                    }
                }



            }
}
