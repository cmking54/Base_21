package com.christopher_matthew_king.base_21;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ChoiceActivity extends AppCompatActivity {
    public static final String EXTRA_CHOICE = "ANYTHING";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        //int id = (int)getIntent().getExtras().get(EXTRA_CHOICE);
        // above gets id out of extras, is obj & needs cast
        // use id to locate data {array, class, database table)
        TextView title = findViewById(R.id.title);
        title.setText(R.string.title_sample); // use data received or android res

        ((TextView)findViewById(R.id.description)).setText(R.string.description_sample); // use data received or android res
    }
    public void onClick_congrats(View view) {
        Toast.makeText(this, "Congrats! Now Go Back, Bottom Left!", Toast.LENGTH_SHORT).show();
    }
}
