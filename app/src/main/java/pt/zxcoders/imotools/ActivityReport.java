package pt.zxcoders.imotools;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.zxcoders.imotools.R;


public class ActivityReport extends AppCompatActivity {
    Button sendMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_activity_report);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sendMail = (Button) findViewById(R.id.sendMail);
        buttonEvent();
    }

    private void buttonEvent() {
        sendMail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String[] TO = {"trigger@applet.ifttt.com"};
                String[] CC = {"david.pintassilgo@gmail.com", "sr.marcomartins@gmail.com"};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "#imotools Your subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(ActivityReport.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
