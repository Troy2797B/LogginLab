import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i < finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }

   /* @Test
    public boolean thresholdReachedTest(){
        //given when then
        boolean expected = true;
        LogginLab logginLab = new LogginLab();
        logginLab.thresholdReached();
        boolean actual = logginLab.thresholdReached();
        assertTrue(actual);
        return expected;
    }*/
    //boolean = must test for both conditions. So maybe two tests?
    @org.junit.Test
    public void thresholdReachedTest() {
        Integer finalLimit = 5;

        LogginLab logg = new LogginLab();
        logg.setThreshold(finalLimit);

        for (int i = 1; i == finalLimit; i++) {
            if (logg.thresholdExceeds(i)) {
                logger.log(Level.INFO, "facts");
                assertTrue(logg.thresholdReached(i));
            } else {
                logger.log(Level.INFO, "that's a big L");
                assertFalse(logg.thresholdReached(i));
            }
        }
    }

        /*boolean expected = true;
        LogginLab lab = new LogginLab();
        lab.setThreshold(5);
        boolean actual = lab.thresholdReached(10);
        assertTrue(expected);*/
}
