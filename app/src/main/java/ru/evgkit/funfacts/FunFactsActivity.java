package ru.evgkit.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare view variables and assign them from layout
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactBtn = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factLabel.setText(new FactBook().getFact());
           }
        };
        showFactBtn.setOnClickListener(listener);
    }
}
