/**
 * Durée représente un laps de temps
 *
 * @author LICINFO20182019
 * @version 1
 */
class Duree {
    private int heure, minute;
    /**
     * initialise une durée
     * 
     * @param h un entier qui fixe la valeur heure de la durée
     * @param m un entier qui fixe la valeur minute de la durée
     */
    public Duree(int h, int m) {
        heure = h;
        minute = m;
    }
    /**
     * ajoute une minute à la durée considérée
     */
    public void plus1minute() {
        minute ++;
        if (minute == 60) {
            minute = 0;
            plus1heure();
        }
    }
    /**
     * ajoute une heure à la durée considérée
     */
    public void plus1heure() {
        heure ++;
    }
    /**
     * construit un texte notant la durée considérée
     * 
     * @return une chaine de caractères au format 9h99
     */
    public String toString() {
        String s = "";
        s += heure;
        s += ":";
        if (minute < 10) s += "0";
        s += minute;
        return s;
    }
}
