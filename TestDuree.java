import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDuree {
    @Test
    public void test01constructeur() {
        Duree d = new Duree(48, 30);
        assertEquals("48h30", d.toString());
    }
    @Test
    public void test02plus1minute() {
        Duree d;
        d = new Duree(10, 41);
        d.plus1minute();
        assertEquals("10h42", d.toString());
        d = new Duree(10, 59);
        d.plus1minute();
        assertEquals("11h00", d.toString());
        d = new Duree(23, 59);
        d.plus1minute();
        assertEquals("24h00", d.toString());
    }
    @Test
    public void test03plus1heure() {
        Duree d;
        d = new Duree(10, 41);
        d.plus1heure();
        assertEquals("11h41", d.toString());
        d = new Duree(23, 30);
        d.plus1heure();
        assertEquals("24h30", d.toString());
    }
    @Test
    public void test04moins1heureConditionNormale() throws ExceptionOperationImpossible {
        Duree d;
        d = new Duree(10, 41);
        d.moins1heure();
        assertEquals("9h41", d.toString());
    }
    @Test(expected=ExceptionOperationImpossible.class)
    public void test05moins1heureConditionAnormale() throws ExceptionOperationImpossible {
        Duree d;
        d = new Duree(0, 30);
        d.moins1heure();
    }
    @Test
    public void test06moins1minuteConditionNormale() throws ExceptionOperationImpossible {
        Duree d;
        d = new Duree(10, 41);
        d.moins1minute();
        assertEquals("10h40", d.toString());
        d = new Duree(10, 0);
        d.moins1minute();
        assertEquals("9h59", d.toString());
        d = new Duree(0, 1);
        d.moins1minute();
        assertEquals("0h00", d.toString());
    }
    @Test(expected=ExceptionOperationImpossible.class)
    public void test07moins1minuteConditionAnormale() throws ExceptionOperationImpossible {
        Duree d;
        d = new Duree(0, 0);
        d.moins1minute();
    }
}
