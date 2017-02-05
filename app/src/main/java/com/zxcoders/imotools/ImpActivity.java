package com.zxcoders.imotools;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ImpActivity extends AppCompatActivity {

    Button buttonCalcular;
    EditText textViewValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp);
    }

    private void buttonEvent() {
        buttonCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                BigDecimal imtValue = new BigDecimal(0);
                BigDecimal seloValue = new BigDecimal(0);
                String tipoImovel = "";

                String valueStr = textViewValue.getText().toString();

                try {
                    BigDecimal imovelValue = new BigDecimal(valueStr);
                    RadioButton rbContinente = (RadioButton) findViewById(R.id.radioButtonContinente);

                    RadioButton rbHabitacaoPropria = (RadioButton) findViewById(R.id.radioButtonHabitacaoPropria);
                    RadioButton rbHabitacaoSecundaria = (RadioButton) findViewById(R.id.radioButtonHabitacaoSecundaria);
                    RadioButton rbRustico = (RadioButton) findViewById(R.id.radioButtonPrediosRusticos);
                    RadioButton rbUrbanos = (RadioButton) findViewById(R.id.radioButtonPrediosUrbanos);

                    if (rbHabitacaoPropria.isChecked()) {
                        tipoImovel = "P";
                    }
                    if (rbHabitacaoSecundaria.isChecked()) {
                        tipoImovel = "S";
                    }
                    if (rbRustico.isChecked()) {
                        tipoImovel = "R";
                    }
                    if (rbUrbanos.isChecked()) {
                        tipoImovel = "O";
                    }

                    ResultValue rv = new ResultValue();

                    if (rbContinente.isChecked()) {
                        rv = getResultValues(imovelValue, tipoImovel, "C");
                    } else { //There are always one selected
                        rv = getResultValues(imovelValue, tipoImovel, "I");
                    }

                    imtValue = rv.getImp();
                    seloValue = rv.getSelo();

                    final AlertDialog alertDialog = new AlertDialog.Builder(ImpActivity.this).create();
                    alertDialog.setTitle("Resultados:");
                    imtValue = imtValue.setScale(2, RoundingMode.CEILING);
                    seloValue = seloValue.setScale(2, RoundingMode.CEILING);
                    alertDialog.setMessage("IMT a pagar: " + imtValue.toString() +
                            "€\nImposto de Selo: " + seloValue.toString() +
                            "€\nTotal: " + imtValue.add(seloValue).toString() + "€");
                    alertDialog.setIcon(R.mipmap.ic_launcher);
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertDialog.dismiss();
                        }
                    });
                    alertDialog.show();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    public ResultValue getResultValues(BigDecimal value, String tipoImovel, String location) {
        ResultValue reply = new ResultValue();

        List<ImpStep> table = new ArrayList<>();
        if(location == "C"){
            //Se for continente usar a tablea do continente
             table = ImpTabels.getContinenteTable(tipoImovel);
        }
        if(location == "I"){
            //Se for ilhas, i.e. Regioes autonomas
            table = ImpTabels.getIlhasTable(tipoImovel);
        }

        for (ImpStep step: table) {


            BigDecimal txMulti = step.getTx().divide(new BigDecimal(100));


            if(step.getStepEnd() == null){
                //LAST step is the correct!!!
                reply.setImp((value.multiply(txMulti)).subtract(step.getParcelaAbate()).setScale(2,RoundingMode.HALF_UP));
                break;
            }else{
                if(step.getStepInit().compareTo(value) < 0 && step.getStepEnd().compareTo(value) >= 0){
                    //Correct step finded!!!
                    reply.setImp((value.multiply(txMulti)).subtract(step.getParcelaAbate()).setScale(2,RoundingMode.HALF_UP));
                    break;
                }
            }

        }
        reply.setSelo(value.multiply(new BigDecimal(0.008)).setScale(2, RoundingMode.HALF_UP));

        return reply;
    }

    @Override
    protected void onResume() {
        super.onResume();
        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
        textViewValue = (EditText) findViewById(R.id.editTextValue);

        buttonEvent();
    }
}
