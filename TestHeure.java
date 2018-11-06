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
}
