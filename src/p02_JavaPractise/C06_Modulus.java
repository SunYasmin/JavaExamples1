package p02_JavaPractise;

import java.util.Scanner;

public class C06_Modulus {

    public static void main(String[] args) {

        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz : ");
        int num = scan.nextInt();

        int ilkIki = num/1000;
        int sonIki = num%100;

        int ilkIkiTop = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = ( sonIki/10) + ( sonIki%10);
        //soutv ekleyebilirsin

        System.out.println("Sayinin rakamlari toplami : "+ (ilkIkiTop+sonIkiTop));


    }




}
