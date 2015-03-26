package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import net.rubydata.project.R;

/**
 * Created by lee on 17/03/2015.
 */
public class Control_Layout_2 extends Fragment {

    private View layout = null;
    private Fragment fragment = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        layout = inflater.inflate(R.layout.layout_2, container, false);

        RecyclerView recyclerView = (RecyclerView) layout.findViewById(R.id.recyclerView);

     /*   demo_doctor itemsData[] = {

                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),
                new demo_doctor("10:00", "01/01/2012", "Good", R.drawable.ic_action_calender),

        };
        fragment = new Control_Layout_Note_Appointment();
        // 2. Set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // 3. Create an adapter
        MyAdapter mAdapter = new MyAdapter(itemsData);
        // 4. Set adapter
        recyclerView.setAdapter(mAdapter);*/
        // 5. Set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        final ImageButton btn = (ImageButton) layout.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment).commit();
            }
        });

        return layout;
    }

}
