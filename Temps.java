/**
 * Temps décrit le temps en heures et minutes
 *
 * @author LICINFO20182019
 * @version 1
 */
abstract public class Temps implements Comparable<Temps> {
    protected int heure, minute;
    /**
     * initialise le temps
     * 
     * @param h un entier qui fixe la valeur heure du temps
     * @param m un entier qui fixe la valeur minute du temps
     */
    public Temps(int h, int m) {
        heure = h;
        minute = m;
    }
    /**
     * ajoute une minute au temps considéré
     */
    public void plus1minute() {
        minute ++;
        if (minute == 60) {
            minute = 0;
            plus1heure();
        }
    }
    /**
     * ajoute une heure au temps considéré
     */
    abstract public void plus1heure();
    /**
     * construit un texte notant le temps considéré
     * 
     * @return une chaine de caractères
     */
    abstract public String toString();
    /**
     * compare un temps à un autre
     * 
     * @param autre un temps
     * @return un entier nul si les temps sont égaux,
     * négatif si le temps considéré est plus petit que autre,
     * positif si le temps considéré est plus grand que autre
     */
    public int compareA(Temps autre) {
        if (heure == autre.heure)
            return minute - autre.minute;
        else
            return heure - autre.heure;
    }
}
