import static org.junit.Assert.*;
import org.junit.Test;

public class TestHeure {
    @Test
    public void test01constructeur() {
        Heure h = new Heure(10, 41);
        assertEquals("10:41", h.toString());
    }
    @Test
    public void test02plus1minute() {
        Heure h;
        h = new Heure(10, 41);
        h.plus1minute();
        assertEquals("10:42", h.toString());
        h = new Heure(10, 59);
        h.plus1minute();
        assertEquals("11:00", h.toString());
        h = new Heure(23, 59);
        h.plus1minute();
        assertEquals("00:00", h.toString());
    }
    @Test
    public void test03plus1heure() {
        Heure h;
        h = new Heure(10, 41);
        h.plus1heure();
        assertEquals("11:41", h.toString());
        h = new Heure(23, 30);
        h.plus1heure();
        assertEquals("00:30", h.toString());        
    }
}
