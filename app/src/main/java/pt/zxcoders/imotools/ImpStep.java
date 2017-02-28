package pt.zxcoders.imotools;

import java.math.BigDecimal;

/**
 * Created by d_pintassilgo on 29-01-2017.
 */
public class ImpStep {
    private BigDecimal stepInit;
    private BigDecimal stepEnd;
    private BigDecimal tx;
    private BigDecimal parcelaAbate;

    public ImpStep() {
    }

    public ImpStep(BigDecimal init, BigDecimal end, BigDecimal tx, BigDecimal parcelaAbater) {
        this.stepInit = init;
        this.stepEnd = end;
        this.tx = tx;
        this.parcelaAbate = parcelaAbater;
    }


    public BigDecimal getStepInit() {
        return stepInit;
    }

    public void setStepInit(BigDecimal stepInit) {
        this.stepInit = stepInit;
    }

    public BigDecimal getStepEnd() {
        return stepEnd;
    }

    public void setStepEnd(BigDecimal stepEnd) {
        this.stepEnd = stepEnd;
    }

    public BigDecimal getTx() {
        return tx;
    }

    public void setTx(BigDecimal tx) {
        this.tx = tx;
    }

    public BigDecimal getParcelaAbate() {
        return parcelaAbate;
    }

    public void setParcelaAbate(BigDecimal parcelaAbate) {
        this.parcelaAbate = parcelaAbate;
    }
}
