package com.christopher_matthew_king.base_21;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public final static String SAVED_ID = "titleId";
    private long id;
    public void setId(long id) {
        this.id = id;
    }


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.id = savedInstanceState.getLong(SAVED_ID);
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            FakeDB data = FakeDB.rows[(int)this.id];

            ((TextView)view.findViewById(R.id.title)).setText(data.getName());
            ((TextView)view.findViewById(R.id.description)).setText(data.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong(SAVED_ID, this.id);
    }
}
