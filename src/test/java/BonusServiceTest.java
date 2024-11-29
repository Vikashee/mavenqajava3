import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.FileSystemSource;

public class BonusServiceTest {

    @Test
    public void testRegistredUnderLimit(){
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calcBonus(5000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregistredUnderLimit(){
        BonusService service = new BonusService();
        int expected = 50;
        int actual = service.calcBonus(5000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregistredUpLimit(){
        BonusService service = new BonusService();
        int expected = 50;
        int actual = service.calcBonus(5000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegistredUpLimit(){
        BonusService service = new BonusService();
        int expected = 500;
        int actual = service.calcBonus(5000000, true);
        Assertions.assertEquals(expected, actual);
    }



}
