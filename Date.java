/**
 * Date décrit un jour de l'année.
 *
 * @author LICINFO20182019
 * @version 2
 */
public class Date {
    private int jour;
    private int mois;
    private int annee;
    /**
     * initialise une date
     * 
     * @param j un entier qui fixe la valeur du jour dans le mois
     * @param m un entier qui fixe la valeur du mois dans l'année
     * @param a un entier qui fixe la valeur de l'année
     */
    public Date(int j, int m, int a) {
        jour = j;
        mois = m;
        annee = a;
    }
    /**
     * construit un texte notant la date
     * 
     * @return une chaîne de caractères au format jj/mm/aaaa
     */
    public String toString() {
        String s = "";
        s = s + jour;
        s += '/';
        if (mois < 10) s += '0';
        s += mois;
        s += '/';
        s += annee;
        return s;
    }
    /**
     * change la date en son lendemain
     */
    public void passerAuLendemain() {
        if (jour < nombreDeJoursDuMois(mois, annee)) {
            jour ++;
        } else {
            jour = 1;
            if (mois < 12) {
                mois ++;
            } else {
                mois = 1;
                annee ++;
            }
        }
    }
    /**
     * change la date en sa veille
     */
    public void passerALaVeille() {
        if (jour > 1) {
            jour --;
        } else {  
            if (mois >1) {
                mois --;
            } else {
                mois = 12;
                annee --;
            }
            jour = nombreDeJoursDuMois(mois, annee);
        }
    }
    /**
     * détermine le nombre de jours d'un mois de l'année
     * 
     * @param m un entier indiquant le mois auquel on s'intéresse
     * @param a un entier indiquant l'année à laquelle on s'intéresse
     * 
     * @return un entier indiquant la longueur du mois m de l'année a
     */
    public static int nombreDeJoursDuMois(int m, int a) {
        switch(m) {
            case 1  :
            case 3  :
            case 5  :
            case 7  :
            case 8  :
            case 10 :
            case 12 :
                return 31;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                return 30;
            case 2 :
              //if (bissextile(a) return 29; else return 28;
                return (bissextile(a)) ? 29 : 28;
            default :
                return 0;
        }
    }
    /**
     * indique si une année est bissextile
     * (c'est-à-dire si elle compte 366 jours au lieu de 365)
     * 
     * @param a un entier qui précise l'année à laquelle on s'intéresse
     * 
     * @return un booléen vrai quand l'année a est bissextile, faux dans le cas contraire
     */
    public static boolean bissextile(int a) {
        if (a % 400 == 0) return true;
        if (a % 4 == 0 && a % 100 != 0) return true;
        return false;
    }
}