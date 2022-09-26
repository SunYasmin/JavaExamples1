package p05_JavaPractise;public class C02_StringManipulation {
  
  public static void main(String[] args) {

        /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz : ");
        String sifre = scan.nextLine();
        int kontrol = 0;  // kontrol degiskeni cokkk onemlii her kontrolu gectiginde 1 arttirdim
        // kontrol++ mantigi buuuuuuuuuu***************

        // mantik farkli olabilir burda kontrol ediyoruz asagida
        //ilk harf kontrolu
        if(sifre.charAt(0)>='A'  &&  sifre.charAt(0)<='Z') {
            kontrol++;
        }else {
            System.out.println("Ilk harf buyuk harf olmali");
        }  // ilk kontorl buraya kadar  kontrol bitti***

        // sonharf kontrolu
        if ((sifre.charAt(sifre.length() - 1) >= 'a') && (sifre.charAt(sifre.length() - 1) <= 'z')){
            kontrol++;
        } else {
            System.out.println("Son harf kucuk harf olmali");
        }

        // bosluk kontrolu
        if(sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        } else {
            kontrol++;
        }

        //sifre uzunluk kontrolu
        if(sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        //4 kontrolu de sagliyor mu
        if (kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Lutfen tekrar sifre olusturunuz");
        }

    }


  
  
}
