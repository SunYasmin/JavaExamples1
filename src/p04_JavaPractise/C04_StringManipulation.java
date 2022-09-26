package p04_JavaPractise;public class C04_StringManipulation {
  public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        str1 = str1.replaceAll("\\D", ""); // RAKAM DISI HERSEYİ HİCLİK YAPTİK O YZUDEN SONRA BİR DAHA 100 E BOLDUK
        System.out.println("str1 =  " + str1);// 1399


        String str2 = "$10.55";
        str2 = str2.replaceAll("\\D", "");
        System.out.println("str2 = " + str2); // str2=1055

        System.out.println(str1 + str2); //13991055

        double sayi1 = Double.parseDouble(str1);  // ARTİK SAYİİ OLDUU str1 olan string degiskenini double sayiya donusturduk
        double sayi2 = Double.parseDouble(str2); // ARTİK    SAYİİ   OLDUU
        double toplam = (sayi1 + sayi2) / 100;
        System.out.println("$" + toplam);
    }

  
  
}
