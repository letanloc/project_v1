package net.rubydata.project.fragment_drawers;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import net.rubydata.project.R;

/**
 * Created by lee on 23/03/2015.
 * Ke hoach an uong
 */
public class Control_Layout_Meal_Plans extends Fragment {

    private View layout = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_meal_plans, container, false);
        Toolbar mToolbar = (Toolbar) layout.findViewById(R.id.app_bar);
        // Plus button on the right bottom coner
        ImageButton btn = (ImageButton) layout.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Layout 1", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btnWater = (ImageButton) layout.findViewById(R.id.btnWater);
        btnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_meal);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.show();
            }
        });
        return layout;

    }

}
