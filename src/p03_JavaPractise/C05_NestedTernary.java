package p03_JavaPractise;public class C05_NestedTernary {
  
  public static void main(String[] args) {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        //sacnner yok burda

        char finalNotu = 'B';

        String result = finalNotu=='A' ? "Gayet Basarili" : finalNotu=='B' ? "Basarili" : finalNotu=='C' ? "Ha Gayret" : "Digerleri..";
        // if            body si            if               body si         if              body          else
        System.out.println("result : " + result);  // ust string result direk sout un icine yazilabilirrrr


    }
  
}
