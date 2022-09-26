package p03_JavaPractise;public class C06_SwitchCase {
  public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String gun = "Sali";
        //keyword olarak koyduk

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("java dersi");
                break;
            case "Carsamba":
            case "cumartesi":
                System.out.println("Sql dersi");
                break;
            case "Persembe":
            case "cuma":
                System.out.println("Selenyum dersi");
                break;

            default:
                System.out.println("izin gunu");
        }

    }
  
  
}
