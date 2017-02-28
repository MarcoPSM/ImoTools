package pt.zxcoders.imotools;

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
                reply.add(new ImpStep(new BigDecimal(0), new BigDecimal(115509), new BigDecimal(0), new BigDecimal(0)));
                reply.add(new ImpStep(new BigDecimal(115509), new BigDecimal(158004), new BigDecimal(2), new BigDecimal(2310.18)));
                reply.add(new ImpStep(new BigDecimal(158004), new BigDecimal(215435), new BigDecimal(5), new BigDecimal(7050.29)));
                reply.add(new ImpStep(new BigDecimal(215435), new BigDecimal(359016), new BigDecimal(7), new BigDecimal(11358.99)));
                reply.add(new ImpStep(new BigDecimal(359016), new BigDecimal(717904), new BigDecimal(8), new BigDecimal(14949.15)));
                reply.add(new ImpStep(new BigDecimal(717904), null, new BigDecimal(6), new BigDecimal(0)));
                break;


            case "S":
                //secundaria
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
