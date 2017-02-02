package com.zxcoders.imotools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        setContentView(R.layout.activity_main_menu);


    }

    /** Called when the user clicks the button Value Of Sale*/
    public void openActivityValueOfSale(View view) {
        Intent intent = new Intent(this, ValueOfSaleActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the button IMP */
    public void openActivityImt(View view) {
        Intent intent = new Intent(this, ImpActivity.class);
        startActivity(intent);
    }
}
