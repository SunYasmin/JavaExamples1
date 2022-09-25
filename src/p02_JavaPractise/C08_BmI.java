package p02_JavaPractise;

import java.util.Scanner;

public class C08_BmI {

    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scanner = new Scanner(System.in);  //scanner scanner da olurrrrrrr
        System.out.println("Lutfen kg olarak agirliginizi giriniz : " );
        double agirlik = scanner.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz : ");
        double boy = scanner.nextDouble();
        boy = boy/100;  //     boy/=100 de olur bol esitle*************

        double vke = agirlik/(boy*boy);

        System.out.println("vke = " + vke);

    }
}

