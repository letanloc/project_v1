package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.rubydata.project.R;

/**
 * Created by User on 21/03/2015.
 */
public class Control_Layout_4 extends Fragment {

    private View layout = null;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_4, container, false);
        return layout;
    }

}
