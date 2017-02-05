package com.zxcoders.imotools;

import org.junit.Test;

import java.math.BigDecimal;

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

    //TODO Fazer os testes para o resto dos escalões e para todas as combinações possiveis e imaginarias

}