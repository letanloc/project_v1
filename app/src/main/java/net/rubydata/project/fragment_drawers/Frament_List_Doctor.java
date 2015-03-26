package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.rubydata.project.R;

/**
 * Created by lee on 22/03/2015.
 */
public class Frament_List_Doctor extends Fragment {

    View layout;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_3, container, false);
        return layout;
    }
}
