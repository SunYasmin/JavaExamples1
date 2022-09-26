package p05_JavaPractise;public class C03_StringManipulation {
  
  public static void main(String[] args) {

        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str = "  Java ogrenmek123 Cok guzel@ ";

        str =str.trim();   //trimle bosluktan kurtuldum "Java ogrenmek123 Cok guzel" oldu

        str = str.replaceAll("\\d", ""); //Java ogrenmek Cok guzel@
        str = str.replaceAll("@",""); //Java ogrenmek Cok guzel
        str = str.replaceAll("C", "c"); //Java ogrenmek c
        str = str+"."; //Java ogrenmek cok guzel.

        System.out.println(str); //Java ogrenmek cok guzel.



    }
  
  
}
