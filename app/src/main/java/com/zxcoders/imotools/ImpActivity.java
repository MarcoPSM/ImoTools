package com.zxcoders.imotools;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImpActivity extends AppCompatActivity {

    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp);
    }

    private void buttonEvent() {
        buttonCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //TODO FAZER AQUI A MAGIA!!! :D




                final AlertDialog alertDialog = new AlertDialog.Builder(ImpActivity.this).create();
                alertDialog.setTitle("Resultados");
                alertDialog.setMessage("Valor a pedi");
                alertDialog.setIcon(R.mipmap.ic_launcher);
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();


            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
        buttonEvent();
    }
}
