public class Woerterbucheintragtester {
    // Attribute
    
    // Konstruktoren
    public Woerterbucheintragtester() {
    }

    // Methoden
    public void test() {
        Woerterbucheintrag w1 = new Woerterbucheintrag("dog", "Hund, nachtrotten, verfolgen");
        Woerterbucheintrag w2 = new Woerterbucheintrag("cat", "Katze, Schimpfwort (unter Frauen)");
        Woerterbucheintrag w3 = new Woerterbucheintrag("mouse", "Maus, Maus (Eingabegeraet)");
        Woerterbucheintrag w4 = new Woerterbucheintrag("dog", "Doppelter Eintrag");
        
        System.out.println("**************");

        System.out.println("Test informationAusgeben():");
        w1.informationAusgeben();
        
        System.out.println("Test schluesselIstGleich(String):");
        System.out.println("true: "+ w1.schluesselIstGleich("dog"));
        
        System.out.println("Test schluesselIstGroesserAls(String):");
        System.out.println("true: "+ w1.schluesselIstGroesserAls("cat"));

        System.out.println("Test istGroesserAls(Datenelement):");
        System.out.println("true: "+ w1.istGroesserAls(w2));
        System.out.println("Test istKleinerAls(Datenelement):");
        System.out.println("true: "+ w1.istKleinerAls(w3));
        System.out.println("Test istGleich(datenelement):");
        System.out.println("true: "+ w1.istGleich(w4));

        
        
        System.out.println("**************");
        
    }

    }
