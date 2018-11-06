/**
 * Durée représente un laps de temps
 *
 * @author LICINFO20182019
 * @version 1
 */
class Duree extends Temps {
    /**
     * initialise une durée
     * 
     * @param h un entier qui fixe la valeur heure de la durée
     * @param m un entier qui fixe la valeur minute de la durée
     */
    public Duree(int h, int m) {
        super(h, m);
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
        s += "h";
        if (minute < 10) s += "0";
        s += minute;
        return s;
    }
}
