package com.christopher_matthew_king.base_21;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity implements TitleListFragment.TitleListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //Hard-coded
        //DetailFragment frag = (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setId(1);
    }

    @Override
    public void itemClicked(long id) { // added code to handle tablet vs ordinary phone display
        if (findViewById(R.id.fragment_placeholder) != null) {
            DetailFragment detailFragment = new DetailFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            detailFragment.setId(id);
            transaction.replace(R.id.fragment_placeholder, detailFragment);
            transaction.addToBackStack(null); // use String to label action
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailFragment.SAVED_ID, (int)id);
            startActivity(intent);
        }
    }
}
