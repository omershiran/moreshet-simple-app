package co.il.motto.moreshetApp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnMailingList, btnContactUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();
        setText();
        setListenet();
    }

    private void setListenet() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link1));
                startActivity(browserIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link2));
                startActivity(browserIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link3));
                startActivity(browserIntent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link4));
                startActivity(browserIntent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link5));
                startActivity(browserIntent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link6));
                startActivity(browserIntent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link7));
                startActivity(browserIntent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(definition.link8));
                startActivity(browserIntent);
            }
        });

        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });


    }

    private void setButtons() {
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btnMailingList=(Button)findViewById(R.id.btnMailingList);
        btnContactUs=(Button)findViewById(R.id.btnContactUs);
    }

    private void setText() {
        btn1.setText(definition.name1);
        btn2.setText(definition.name2);
        btn3.setText(definition.name3);
        btn4.setText(definition.name4);
        btn5.setText(definition.name5);
        btn6.setText(definition.name6);
        btn7.setText(definition.name7);
        btn8.setText(definition.name8);
    }
//    protected void sendEmail() {
//        Log.i("Send email", "");
//
////        String[] TO = {"moreshetgalil@gmail.com"};
//        String[] TO = {"omershiran@gmail.com"};
//        Intent emailIntent = new Intent(Intent.ACTION_SEND);
//        emailIntent.setData(Uri.parse("mailto:"));
//        emailIntent.setType("text/plain");
//
//
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
//        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
//
//        try {
//            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
//            finish();
//            Log.i("Finished sending email.", "");
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(MainActivity.this,
//                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
//        }
//    }
   void sendEmail(){
       Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
//       intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
//       intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
       intent.setData(Uri.parse("mailto:moreshetgalil@gmail.com")); // or just "mailto:" for blank
       intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
       startActivity(intent);
   }
}
