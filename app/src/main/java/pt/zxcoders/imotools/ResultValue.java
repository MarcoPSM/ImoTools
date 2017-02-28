package pt.zxcoders.imotools;

import java.math.BigDecimal;

/**
 * Created by d_pintassilgo on 29-01-2017.
 */
public class ResultValue {
    private BigDecimal selo;
    private BigDecimal imp;

    public ResultValue() {
    }

    public BigDecimal getSelo() {
        return selo;
    }

    public void setSelo(BigDecimal selo) {
        this.selo = selo;
    }

    public BigDecimal getImp() {
        return imp;
    }

    public void setImp(BigDecimal imp) {
        this.imp = imp;
    }
}
