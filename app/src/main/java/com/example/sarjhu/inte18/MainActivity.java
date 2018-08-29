package com.example.sarjhu.inte18;

import android.app.Dialog;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView tx1, tx2, tx4, tx5;
    Dialog dialog;
    Button reminder;
    ImageButton imagebutton1, imagebutton2, imagebutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = (TextView) findViewById(R.id.textView);
        tx2 = (TextView) findViewById(R.id.desc);
        imagebutton1 = (ImageButton) findViewById(R.id.c1);
        imagebutton2 = (ImageButton) findViewById(R.id.c2);
        imagebutton3 = (ImageButton) findViewById(R.id.c3);

        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.show();


                TextView tv_message = (TextView) dialog.findViewById(R.id.textViewMessage);

                tv_message.setText("Choose Option");

                Button bt1 = (Button) dialog.findViewById(R.id.call);
                Button bt2 = (Button) dialog.findViewById(R.id.insta);
                Button bt3 =(Button)dialog.findViewById(R.id.text);

                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        });
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.show();


                TextView tv_message = (TextView) dialog.findViewById(R.id.textViewMessage);

                tv_message.setText("Choose Option");

                Button bt1 = (Button) dialog.findViewById(R.id.call);
                Button bt2 = (Button) dialog.findViewById(R.id.insta);
                Button bt3 =(Button)dialog.findViewById(R.id.text);

                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        });
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.show();


                TextView tv_message = (TextView) dialog.findViewById(R.id.textViewMessage);

                tv_message.setText("Choose Option");

                Button bt1 = (Button) dialog.findViewById(R.id.call);
                Button bt2 = (Button) dialog.findViewById(R.id.insta);
                Button bt3 =(Button)dialog.findViewById(R.id.text);

                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        });

        // tx3=(TextView)findViewById(R.id.contact);
        // tx4=(TextView)findViewById(R.id.needmorehelp);
        // tx5=(TextView)findViewById(R.id.developers);
        reminder = (Button)

                findViewById(R.id.reminder);
        reminder.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                cal.set(Calendar.DAY_OF_MONTH, 28);
                cal.set(Calendar.MONTH, 8);
                intent.putExtra("beginTime", cal.getTimeInMillis());
                intent.putExtra("allDay", true);
                // intent.putExtra("rrule", "FREQ=ONE-TIME EVENT");
                // intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
                intent.putExtra("title", "Interrupt Symposium");
                startActivity(intent);
            }
        });


    }
}