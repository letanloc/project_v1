package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.rubydata.project.R;

/**
 * Created by lee on 24/03/2015.
 * Ghi chu duong huyet
 */
public class Control_Layout_Note_Test_Sometimes extends Fragment {

    private View layout = null;
    private Fragment fragment = null;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_note_test_sometimes, container, false);
        return layout;
    }
}
