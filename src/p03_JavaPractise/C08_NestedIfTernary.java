package p03_JavaPractise;public class C08_NestedIfTernary {
  
  public static void main(String[] args) {

  /*
   0 ~ 9 arasındaki sayilari kelimelere cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
        int sayi = 1;
        String sonuc = "";   //eger string in ne oldugunu bilmiyorsam hiclige esitlerim declare ederim ATAMA YAPTİMMMM
        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 9) {sonuc = "dokuz";}
            else if (sayi == 8) {sonuc = "sekiz";}
            else if (sayi == 7) {sonuc = "yedi";}
            else if (sayi == 6) {sonuc = "alti";}
            else if (sayi == 5) {sonuc = "bes";}
            else if (sayi == 4) {sonuc = "dort";}
            else if (sayi == 3) {sonuc = "uc";}
            else if (sayi == 2) {sonuc = "iki";}
            else if (sayi == 1) {sonuc = "bir";}
            else sonuc = "";
        } else sonuc = "Gecersiz";

        System.out.println("sonuc = " + sonuc);

        int num = 4;
        String result = num==9 ? "dokuz" : num==8 ? "sekiz" : num==7 ? "yedi" : num==6 ? "alti" :
                num==5 ? "bes" : num==4 ? "dort" : num==3 ? "uc" : num==2 ? "iki" :
                        num==1 ? "bir" : num==0 ?"sifir":"gecersiz";
        System.out.println("result = " + result);

    }
  
  
}
