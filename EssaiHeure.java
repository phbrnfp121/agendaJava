/**
 * EssaiHeure permet d'essayer la classe Heure
 *
 * @author LICINFO20182019
 * @version 4
 */
abstract class EssaiHeure {
    static void essayer() {
        Heure h;
        h = new Heure(9, 57);
        System.out.println(h.toString());
//        h.minute = h.minute + 10;
//        System.out.println(h.enTexte());
        h.plus1minute();
        System.out.println(h);
        h.plus1minute();
        System.out.println(h);
        h.plus1minute();
        System.out.println(h);        
    }
}
