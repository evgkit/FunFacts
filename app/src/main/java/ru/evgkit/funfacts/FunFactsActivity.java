package ru.evgkit.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare view variables and assign them from layout
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactBtn = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactBtn.setTextColor(color);

                factLabel.setText(mFactBook.getFact());
           }
        };

        showFactBtn.setOnClickListener(listener);

        // Toast.makeText(this, "WOW! LOL!", Toast.LENGTH_LONG).show();

        Log.d(TAG, "Hello from logging in onCreate() method!");
    }
}
