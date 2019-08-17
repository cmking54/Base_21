package com.christopher_matthew_king.base_21;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() { // inconsistent types?
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(Main2Activity.this, CategoryActivity.class));
                }
            }
        };

        ListView sidebar = findViewById(R.id.sidebar);
        sidebar.setOnItemClickListener(itemClickListener);
    }

    public void onClick_next(View view) {
        startActivity(new Intent(this, Main3Activity.class));
        //Toast.makeText(this, "Not implemented yet", Toast.LENGTH_SHORT).show();
    }

    public void onClick_back(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
