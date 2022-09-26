package p03_JavaPractise;public class C04_KanBagisi {
  
  public static void main(String[] args) {

        /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("Lutfen agirliginizi kg olarak giriniz : ");
        int agirlik = scan.nextInt();

        if (yas>0 && yas<18){   // (yas>0 && yas<18) olurrrrr
            System.out.println("Yasi 18'den kucuk olanlar kan bagisi yapamaz");
        } else if (yas >= 18) { //nested if else if e yeni if actik
            if (agirlik>0 && agirlik<50){
                System.out.println("Agirliginiz 50'den kücük oldugu icin kan bagisi yapamazsiniz");
            } else if (agirlik >= 50) {
                System.out.println("Kan bagisi yapabilirsiniz");
            }else {System.out.println("Yanlis deger girdiniz");//buna gerek kalmadi

            }


        }

  
}
