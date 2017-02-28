package pt.zxcoders.imotools;

import org.junit.Test;

import java.math.BigDecimal;

import pt.zxcoders.imotools.ImpActivity;
import pt.zxcoders.imotools.ResultValue;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ImpCalculos {

    /**
     * @author d_pintassilgo
     * This tests Run some simulations in Portugal Continental & Habitação Própria Permanente
     * @throws Exception
     */
    @Test
    public void PortugalContinentalHabitaçãoPropriaStep1() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(30000), "P", "C");
        assertEquals(new BigDecimal(0.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(240.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(240.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }
    @Test
    public void PortugalContinentalHabitaçãoPropriaStep2() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(97000), "P", "C");
        assertEquals(new BigDecimal(91.86).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(776.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(867.86).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void PortugalContinentalHabitaçãoPropriaStep3() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(145000), "P", "C");
        assertEquals(new BigDecimal(1609.77).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(1160.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(2769.77).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void PortugalContinentalHabitaçãoPropriaStep4() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(516589), "P", "C");
        assertEquals(new BigDecimal(29367.80).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(4132.71).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(33500.51).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void PortugalContinentalHabitaçãoPropriaStep5() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(574322), "P", "C");
        assertEquals(new BigDecimal(33986.44).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(4594.58).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(38581.02).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void PortugalContinentalHabitaçãoPropriaStep6() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(574324), "P", "C");
        assertEquals(new BigDecimal(34459.44).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(4594.59).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(39054.03).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void PortugalContinentalHabitaçãoPropriaInerStep() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(574323), "P", "C");
        assertEquals(new BigDecimal(33986.52).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(4594.58).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(38581.10).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void IlhasHabitaçãoPropria() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(250000), "P", "I");
        assertEquals(new BigDecimal(6141.01).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(2000.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(8141.01).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }

    @Test
    public void IlhasHabitaçãoRustico() throws Exception {
        ImpActivity ia = new ImpActivity();
        ResultValue reply = ia.getResultValues(new BigDecimal(150000), "R", "I");
        assertEquals(new BigDecimal(7500.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getImp());
        assertEquals(new BigDecimal(1200.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo());
        assertEquals(new BigDecimal(8700.00).setScale(2, BigDecimal.ROUND_HALF_UP), reply.getSelo().add(reply.getImp()));
    }
}