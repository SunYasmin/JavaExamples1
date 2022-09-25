package p02_JavaPractise;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan = new Scanner(System.in);
        System.out.println("isminiz :");
        String isim = scan.nextLine();  // sagdaki objem bununla okuayacagim

        System.out.println("memleketiniz :");
        String memleket = scan.nextLine(); //

        System.out.println("konumunuz :");
        String konum = scan.nextLine();

        System.out.println("yasiniz :");
        int yas = scan.nextInt();

        System.out.println("boyunuz :");
        double boy = scan.nextDouble();

        System.out.println("yasadiginiz " + konum + "u seviyor musunuz? true/false" ); // konum stringi kullandim
        boolean seviyorMu = scan.hasNextBoolean();   // boolean ile hasNextBoolean......... nextBoolean da oluuuurrrrrr
        //has sirali islem de tercih ediliyorrrrrr

        System.out.println("isim : "+ isim);
        System.out.println("memleketiniz = " + memleket);
        System.out.println("konumunuz = " + konum);
        System.out.println("yasiniz = " + yas);
        System.out.println("boyunuz = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }



}
