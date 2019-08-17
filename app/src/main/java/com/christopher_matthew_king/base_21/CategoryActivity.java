package com.christopher_matthew_king.base_21;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_category);
        ListView options = getListView();
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new Integer[]{1, 2, 3, 4, 5}
        );
        options.setAdapter(adapter);
    }
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Intent intent = new Intent(CategoryActivity.this, ChoiceActivity.class);
        intent.putExtra(ChoiceActivity.EXTRA_CHOICE, (int)id); // cast long down to int
        startActivity(intent);
    }
}
