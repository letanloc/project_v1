package net.rubydata.project.fragment_drawers;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import net.rubydata.project.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lee on 17/03/2015.
 */
public class Control_Layout_1 extends Fragment {

    private View layout = null;
    Expandable_List_Adapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.layout_1, container, false);
        Toolbar mToolbar = (Toolbar) layout.findViewById(R.id.app_bar);

        // Plus button on the right bottom coner
        ImageButton btn = (ImageButton) layout.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_meal);
                dialog.show();
            }
        });

        // Get the listview
        expListView = (ExpandableListView) layout.findViewById(R.id.lvExp);

        // Preparing list data
        prepareListData();

        listAdapter = new Expandable_List_Adapter(getActivity(), listDataHeader, listDataChild);

        // Setting list adapter
        expListView.setAdapter(listAdapter);

        // Expand first listview automatically
        expListView.expandGroup(0);

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_meal);
                dialog.setTitle("Chọn Thức Ăn");
                dialog.show();
                return false;
            }
        });

        return layout;
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("SÁNG");
        listDataHeader.add("TRƯA");
        listDataHeader.add("TỐI");

        // Adding child data
        List<String> morning = new ArrayList<String>();
        morning.add("Nước");
        morning.add("Ngũ Cốc");
        morning.add("Thịt");
        morning.add("Rau Quả");

        List<String> noon = new ArrayList<String>();
        noon.add("Nước");
        noon.add("Ngũ Cốc");
        noon.add("Thịt");
        noon.add("Rau Quả");

        List<String> evening = new ArrayList<String>();
        evening.add("Nước");
        evening.add("Ngũ Cốc");
        evening.add("Thịt");
        evening.add("Rau Quả");

        listDataChild.put(listDataHeader.get(0), morning); // Header, Child data
        listDataChild.put(listDataHeader.get(1), noon);
        listDataChild.put(listDataHeader.get(2), evening);
    }

}
