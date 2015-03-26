package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.rubydata.project.R;

/**
 * Created by lee on 23/03/2015.
 */
public class Control_Layout_5 extends Fragment {

    private View layout = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_5, container, false);
        Toolbar mToolbar = (Toolbar) layout.findViewById(R.id.app_bar);
        return layout;
    }

}
