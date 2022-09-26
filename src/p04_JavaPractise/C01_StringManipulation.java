package p04_JavaPractise;public class C01_StringManipulation {
  /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim = scan.nextLine();


        if (isim.length()>=3){

            System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)
                    +isim.substring(isim.length()-2));

        }else System.out.println(isim);



    }

  
  
}
