package com.christopher_matthew_king.base_21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    Basic User Interaction and View-Controller Interaction
     */
    public void onClick_button(View view) {
        Spinner choices = findViewById(R.id.choices);
        TextView text_display = findViewById(R.id.text_display);
        String text_output = "Base Text";
        //String.valueOf(choices.getSelectedItem());
        switch (String.valueOf(choices.getSelectedItem())) {
            case ("Choice 1"):
                text_output = "Result 1\nResult 2";
                break;
            default:
                text_output = "Result 3\nResult 4";
        }
        text_display.setText(text_output);
    }
    /*
    Recieving text from edit field and appending to textfield
     */
    public void onClick_editButton(View view) {
        EditText text_box = findViewById(R.id.edit_text);
        TextView text_display = findViewById(R.id.text_display);
        text_display.setText(text_display.getText() + "\n" + text_box.getText());
    }
}
