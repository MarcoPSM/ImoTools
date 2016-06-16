package com.zxcoders.imotools;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText txtValorPretendido;
    EditText txtComissao;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void buttonEvent() {
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Integer finalValue = Integer.valueOf(txtValorPretendido.getText().toString());
                double percentage = Double.valueOf(txtComissao.getText().toString());

                int init = (int) (finalValue * (1 + (percentage / 100)));
                double end = init + 5 * (init - finalValue);

                for (int x = init; x <= end; x++) {
                    Double comissao = x * (percentage / 100);
                    double ivaComissao = comissao * 0.23;

                    double tempToTest = x - comissao - ivaComissao;
                    if (tempToTest >= finalValue) {

                        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                        // Setting Dialog Title
                        alertDialog.setTitle("Resultados");

                        // Setting Dialog Message
                        alertDialog.setMessage("Valor a pedir: \n" + x + "\n\nValor da comissão sem IVA\n" + comissao + "\n\nValor da comissão com IVA\n" + (comissao + ivaComissao) + "\n\nValor final:\n" + (x - (comissao + ivaComissao)));

                        // Setting Icon to Dialog
                        alertDialog.setIcon(R.mipmap.ic_launcher);

                        // Setting OK Button
                        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog closed
                                alertDialog.dismiss();
                            }
                        });

                        // Showing Alert Message
                        alertDialog.show();

                        break;
                    }
                }

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        txtValorPretendido = (EditText) findViewById(R.id.txtValorPretendido);
        txtComissao = (EditText) findViewById(R.id.comissao);
        button = (Button) findViewById(R.id.button);
/*
        DecimalFormat format = new DecimalFormat("## @string/percentageSymbol");
        String formattedText = format.format("@string/IVA");
        txtComissao.setText(formattedText);
*/
        txtComissao.setText(R.string.commission);
        buttonEvent();
    }
}
