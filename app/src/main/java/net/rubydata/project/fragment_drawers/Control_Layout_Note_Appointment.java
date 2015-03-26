package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.rubydata.project.R;

/**
 * Created by lee on 24/03/2015.
 */
public class Control_Layout_Note_Appointment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private View layout = null;
    private Fragment fragment = null;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_note_appointment, container, false);
        return layout;
    }

}
