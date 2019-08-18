package com.christopher_matthew_king.base_21;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TitleListFragment extends ListFragment {
    
    static interface TitleListListener {
        void itemClicked(long id);
    }
    private TitleListListener listener;

    public TitleListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] titles = new String[FakeDB.rows.length];
        int i = 0;
        for (FakeDB row : FakeDB.rows) {
            titles[i++] = row.getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                titles);
        setListAdapter(adapter);
        // Inflate the layout for this fragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (TitleListListener)context;
    }
    public void onListItemClick(ListView listView, View view, int position, long id) {
        if (this.listener != null) {
            this.listener.itemClicked(id);
        }
    }
    /*@Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String[] titles = new String[FakeDB.rows.length];
        int i = 0;
        for (FakeDB row : FakeDB.rows) {
            titles[i++] = row.getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                view.getContext(),
                android.R.layout.simple_list_item_1,
                titles);
        setListAdapter(adapter);
    }*/
}
