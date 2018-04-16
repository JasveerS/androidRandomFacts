package com.example.android.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //tag for debugging app
    public static final String tag = MainActivity.class.getSimpleName();
    //instance for android fun fact
    private AndroidFacts andoridFacts = new AndroidFacts();
    //instance for background color
    private BackgroundColor mBackgroundColor = new BackgroundColor();

    //declare view variable
    private TextView mFactTextView;
    //button to show fun facts
    private Button mShowFactButton;
    //change layout colors
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variables and resource
        mFactTextView = findViewById(R.id.fun_facts);
        mShowFactButton = findViewById(R.id.show_fun_Fact);
        relativeLayout = findViewById(R.id.relative_layout);

        //listener for button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //random getFacts
                String randomFacts = andoridFacts.getFacts();

                mFactTextView.setText(randomFacts);

                //background colors
                int color = mBackgroundColor.getColor();
                //set background color for every new fun fact
                relativeLayout.setBackgroundColor(color);

                //button text color
                mShowFactButton.setTextColor(color);


            }
        };
        mShowFactButton.setOnClickListener(listener);

    }
}
