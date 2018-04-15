package com.example.android.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AndroidFacts andoridFacts=new AndroidFacts();
    private BackgroundColor mBackgroundColor=new BackgroundColor();

    //declare view variable
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variables and resource
        mFactTextView=findViewById(R.id.fun_facts);
        mShowFactButton=findViewById(R.id.show_fun_Fact);
        relativeLayout=findViewById(R.id.relative_layout);

        //listener for button
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //random getFacts
                String randomFacts=andoridFacts.getFacts();

                mFactTextView.setText(randomFacts);

                //background colors
                int color=mBackgroundColor.getColor();
                relativeLayout.setBackgroundColor(color);

                //button text color
                mShowFactButton.setTextColor(color);



            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
