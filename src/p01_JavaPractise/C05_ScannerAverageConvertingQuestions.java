package p01_JavaPractise;

import java.util.Scanner;

public class C05_ScannerAverageConvertingQuestions {

    public static void main(String[] args) {   // INTERVİEW SORUSU*****************

        // Soru 1) : konsola  "Hello" ,  "world  \ //"  seklinde yazdiriniz

        System.out.println("\"Hello \", \"World \\ //\"");  // Escape Sequence cift tirnak slage gibi
        // karakterleri kod olarak yazdirma yazinin icinde var tirnak slage


        // Soru 2) : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdiriniz \n  newline demek bununla

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

        // Soru 3) : "Java" ile hayat cok 'afilli' yazdiriniz
        // bu isaretlerden hangisini yazdiracaksak ters slage o isaret mantik bu

        System.out.println(" \"Java\" ile hayat cok \'afilli\'");

        // Soru 4) : "Zaruret" insani
        //            'kasif' yapar   yazdiriniz
        // sonraki "TechProEd ile java cok kolay ..." ifadesi 3 satir sonra
        // ve satir basindan 1 tab ileride yazilsin, hepsini tek komutla yazdiriniz

        System.out.println("\"Zaruret\" insani \n\'kasif\' yapar\n\n\n\tTechProEd ile java cok kolay\"");


        /* AVERAGE  KONUSU
            double num1 = 23.4;
            double num2 = 24.0;
            double num3 = 12;
            double num4 = 450.3;
            double num5 = 23000;
         */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double toplam = num1 + num2 + num3 + num4 + num5;
        double ortalama = toplam/5;

        System.out.println("ortalama = " + ortalama);  // NOttt ONEMMLLİİİİ ortalama double acilir veri kaybi olmasin diye****

        /* CONVERTİNG  KONUSU       İNTERVİEW SORUSUUUUUUUUUUUUUUUUUUU
        Galonu litreye ceviren bir java programi yaziniz   COK GUZEL STRİNG E DİKKAT ET***********************
            1 gallon = 3.785 litre
        Litre = 1/3.785 gallon
         */
        int gallon = 1000;
        double litre = gallon*3.785;
        String sonuc1 = gallon + "gallon degeri " + litre + "litreye esittir";// string atamasi ile yazdirdik olmasa da olur guzelll
        System.out.println(sonuc1);

        System.out.println(gallon+ " galon degeri " + litre + "litreye esittir.");  //boyle de olur illa string e gerek yok

        //Litreyi gallona ceviren bir java programi yaziniz
        // 1 litre = 1/3.785 gallon

        int l = 1000;
        double G = gallon*3.785;
        String sonuc2 = gallon + "litre degeri "+ G + "gallona esittir.";
        System.out.println(sonuc2);


        // SCANNER KONUSU
        //Sicakligi fahrenayt degerinden santigrat dereceye ceviren bir java programi yaziniz
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenayt degerini giriniz : ");
        double fh = scan.nextDouble();
        System.out.println("Girdiginiz fahrenayt degerinin : " + fh + " karsiligi " + (fh-32)*5/9 + " santigrat dereceye esittir."); */

        //Kullanicidan 2 tamsayi alin
        // bu tamsayilari toplayin ve sonuıcu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci tamsayi giriniz  : "); // toplam degiskeni olustur olusturmadan da olur
        int sayi1 = scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println(" Iki sayinin toplami : " + (sayi1+sayi2));


    }





}
