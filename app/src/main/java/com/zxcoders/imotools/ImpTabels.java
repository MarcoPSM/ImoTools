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
                reply.add(new ImpStep(new BigDecimal(0), new BigDecimal(92407), new BigDecimal(1), new BigDecimal(0)));
                reply.add(new ImpStep(new BigDecimal(92407), new BigDecimal(126403), new BigDecimal(2), new BigDecimal(924.07)));
                reply.add(new ImpStep(new BigDecimal(126403), new BigDecimal(172348), new BigDecimal(5), new BigDecimal(4716.16)));
                reply.add(new ImpStep(new BigDecimal(172348), new BigDecimal(287213), new BigDecimal(7), new BigDecimal(8163.12)));
                reply.add(new ImpStep(new BigDecimal(287213), new BigDecimal(550836), new BigDecimal(8), new BigDecimal(11035.25)));
                reply.add(new ImpStep(new BigDecimal(550836), null, new BigDecimal(6), new BigDecimal(0)));
                break;

            case "R":
                //rustico
                reply.add(new ImpStep(new BigDecimal(0), null, new BigDecimal(5), new BigDecimal(0)));
                break;

            case "O":
                //Outros predios urbanos
                reply.add(new ImpStep(new BigDecimal(0), null, new BigDecimal(6.5), new BigDecimal(0)));
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

/*                Regioes autonomas

                Habitação própria e permandente:
                até 115.509,00 €	0%	0,00 €
                mais de 115.509,00 € até 158.004,00 €	2%	2.310,18 €
                mais de 158.004,00 € até 215.435,00 €	5%	7.050,29 €
                mais de 215.435,00 € até 359.016,00 €	7%	11.358,99 €
                mais de 359.016,00 € até 717.904,00 €	8%	14.949,15 €
                mais de 717.904,00 €	6%	0,00 € */

            reply.add(new ImpStep(new BigDecimal(0), new BigDecimal(115509), new BigDecimal(0), new BigDecimal(0)));
            reply.add(new ImpStep(new BigDecimal(115509), new BigDecimal(158004), new BigDecimal(2), new BigDecimal(2310.18)));
            reply.add(new ImpStep(new BigDecimal(158004), new BigDecimal(215435), new BigDecimal(5), new BigDecimal(7050.29)));
            reply.add(new ImpStep(new BigDecimal(215435), new BigDecimal(359016), new BigDecimal(7), new BigDecimal(11358.99)));
            reply.add(new ImpStep(new BigDecimal(359016), new BigDecimal(717904), new BigDecimal(8), new BigDecimal(14949.15)));
            reply.add(new ImpStep(new BigDecimal(717904), null, new BigDecimal(6), new BigDecimal(0)));
            break;


            case "S":
                //secundaria

                /*
                habitação secundaria ou arrendamento
                até 115.509,00 €	1%	0,00 €
                mais de 115.509,00 € até 158.004,00 €	2%	1.155,09 €
                mais de 158.004,00 € até 215.435,00 €	5%	5.895,20 €
                mais de 215.435,00 € até 359.016,00 €	7%	10.203,90 €
                mais de 359.016,00 € até 688.545,00 €	8%	13.794,06 €
                mais de 688.545,00 €	6%	0,00 €
                 */
                reply.add(new ImpStep(new BigDecimal(0), new BigDecimal(115509), new BigDecimal(1), new BigDecimal(0)));
                reply.add(new ImpStep(new BigDecimal(115509), new BigDecimal(158004), new BigDecimal(2), new BigDecimal(1155.09)));
                reply.add(new ImpStep(new BigDecimal(158004), new BigDecimal(215435), new BigDecimal(5), new BigDecimal(5895.20)));
                reply.add(new ImpStep(new BigDecimal(215435), new BigDecimal(359016), new BigDecimal(7), new BigDecimal(10203.90)));
                reply.add(new ImpStep(new BigDecimal(359016), new BigDecimal(688545), new BigDecimal(8), new BigDecimal(13794.06)));
                reply.add(new ImpStep(new BigDecimal(688545), null, new BigDecimal(6), new BigDecimal(0)));
                break;

            case "R":
                //rustico
                reply.add(new ImpStep(new BigDecimal(0), null, new BigDecimal(5), new BigDecimal(0)));
                break;

            case "O":
                //Outros predios urbanos
                reply.add(new ImpStep(new BigDecimal(0), null, new BigDecimal(6.5), new BigDecimal(0)));
                break;

            default:
                break;
        }



        return reply;
    }
}
