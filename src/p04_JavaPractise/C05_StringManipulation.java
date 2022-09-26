package p04_JavaPractise;public class C05_StringManipulation {
  
  /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumle olusturmak icin birinci kelimeyi giriniz");
        String str1 = scan.next().toLowerCase(); // ama normalde kucuk buyuk girebilir o yuzden dikkat
        System.out.println("Lutfen cumle olusturmak icin ikiinci kelimeyi giriniz");
        String str2 = scan.next().toLowerCase();// yazsanda olur bu ornek icin yazmasan da
        System.out.println("Lutfen cumle olusturmak icin ucuncu kelimeyi giriniz");
        String str3 = scan.next().toLowerCase();
        System.out.println("Lutfen cumle olusturmak icin dorduncu kelimeyi giriniz");
        String str4 = scan.next().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1)+
                " "+ str2 + " " +str3 + " " + str4 +".");


    }

  
}
