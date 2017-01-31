package com.app.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textOne = (TextView) findViewById(R.id.textView);
        Button pushMe = (Button) findViewById(R.id.button);
        final String[] RandomText = {"It is certain","It is decidedly so","Without a doubt","Yes definitely","You may rely on it","As I see it yes","Most likely","Outlook good","Yes","Signs point to yes","Reply hazy try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again","Don't count on it","My reply is no","My sources say no","Outlook not so good","Very doubtful"};

        pushMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = (int) (Math.random()*20);
                textOne.setText(RandomText[random]);
            }
        });

    }


}
