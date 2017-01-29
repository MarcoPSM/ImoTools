package com.zxcoders.imotools;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by d_pintassilgo on 29-01-2017.
 * VALUES OF 2017
 * Source: http://apemip.info/info/imt.cfm
 */
public class ImpTabels {
    public static List<ImpStep> getContinenteTable(String tipoImovel) {
        List<ImpStep> reply = new ArrayList<>();

        switch (tipoImovel){
            case "P":
                //propria
                reply.add(new ImpStep(new BigDecimal(0), new BigDecimal(92407), new BigDecimal(0), new BigDecimal(0)));
                reply.add(new ImpStep(new BigDecimal(92407), new BigDecimal(126403), new BigDecimal(2), new BigDecimal(1848.14)));
                reply.add(new ImpStep(new BigDecimal(126403), new BigDecimal(172348), new BigDecimal(5), new BigDecimal(5640.23)));
                reply.add(new ImpStep(new BigDecimal(172348), new BigDecimal(287213), new BigDecimal(7), new BigDecimal(9087.19)));
                reply.add(new ImpStep(new BigDecimal(287213), new BigDecimal(574323), new BigDecimal(8), new BigDecimal(11959.32)));
                reply.add(new ImpStep(new BigDecimal(574323), null, new BigDecimal(6), new BigDecimal(0)));
                break;

            case "S":
                //secundaria
                break;

            case "R":
                //rustico
                break;

            default:
                break;
        }
        return reply;
    }

    public static List<ImpStep> getIlhasTable(String tipoImovel) {
        List<ImpStep> reply = new ArrayList<>();

        switch (tipoImovel){
            case "P":
                //propria
                break;

            case "S":
                //secundaria
                break;

            case "R":
                //rustico
                break;

            default:
                break;
        }



        return reply;
    }
}
