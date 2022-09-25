package p02_JavaPractise;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

/*    Q12
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager       mousea basili tut ctrl yap yoruma al
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz :");
        String jobTitle = scan.nextLine().toLowerCase(); //direk kucuk harf ya data o yuzden lowercase

        if (jobTitle.equals("qa")){
            System.out.println("Quality Analiyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");
        } else if (jobTitle.equals("pm")){
            System.out.println("Project Manager");
        }  else System.out.println("Yanlis formatta JobTitle bilgisi girdiniz");// else yapabilirsin baska bisey girerse lutfen is unvani giriniz diyebilsin
        // switch case ile if else nin farki*********************daha cok secenekli sorularda
        // tercih edilir

        switch (jobTitle){
            case "qa" :
                System.out.println("Quality Analiyst");
                break;                          // stop yapsin diye donguyu kir sona git kodu birak
            case "dev" :
                System.out.println("Developer");
                break;
            case "ba" :
                System.out.println("Business Analyst");
                break;
            case "pm" :
                System.out.println("Peoject Manager");
                break;
            default:
                System.out.println("Yanlis formatta JobTitle bilgisi girdiniz");
                break;
        }

    }



}
