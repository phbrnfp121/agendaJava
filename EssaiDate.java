
/**
 * EssaiDate permet d'essayer la classe Date
 *
 * @author LICINFO20182019
 * @version 1
 */
abstract class EssaiDate {
    static void essayer() {
        Date d;
        d = new Date(30, 10, 2018);
        System.out.println(d);
        d.passerAuLendemain();
        System.out.println(d);
        d.passerAuLendemain();
        System.out.println(d);
    }
}
