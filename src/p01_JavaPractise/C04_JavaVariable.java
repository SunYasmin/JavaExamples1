package p01_JavaPractise;

public class C04_JavaVariable {

    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.


        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        byte bytaMax = Byte.MAX_VALUE;
        byte bytaMin = Byte.MIN_VALUE;

        System.out.println("bytaMax = " + bytaMax);
        System.out.println("bytaMin = " + bytaMin);

        short sortMax = Short.MAX_VALUE;
        short sortMin = Short.MIN_VALUE;

        System.out.println("sortMax = " + sortMax);
        System.out.println("sortMin = " + sortMin);

        long logMax = Long.MAX_VALUE;
        long logMin = Long.MIN_VALUE;

        System.out.println("logMax = " + logMax);
        System.out.println("logMin = " + logMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin);

        float flotMax = Float.MAX_VALUE;
        float flotMin = Float.MIN_VALUE;

        System.out.println("flotMax = " + flotMax);
        System.out.println("flotMin = " + flotMin);

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat = 999.99f;  // f buyuk de kucuk de olur
        double kilometre = 34.56;
        char seviye = 'A';
        boolean dogruMu = true;

        System.out.println("laptop = " + laptopFiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("seviye = " + seviye);
        System.out.println("dogruMu = " + dogruMu);





    }



}
