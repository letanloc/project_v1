package net.rubydata.project.fragment_drawers;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import net.rubydata.project.R;

/**
 * Created by lee on 17/03/2015.
 * Dieu khien menu chinh
 */
public class Control_ActionBar extends ActionBarActivity implements NavigationDrawerCallbacks, View.OnClickListener {

    CharSequence mTitle;
    private Toolbar mToolbar;
    private NavigationDrawerFragment mNavigationDrawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.system_top_drawer);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Control_Layout_1();
                mTitle = "Kế hoạch ăn uống";
                try {
                    getSupportActionBar().setTitle(mTitle);
                } catch (Exception e) {

                }
                break;
            case 1:
                fragment = new Control_Layout_2();
                mTitle = "Lịch khám bác sĩ";
                getSupportActionBar().setTitle(mTitle);
                break;
            case 2:
                fragment = new Control_Layout_3();
                mTitle = "Lịch sử đường huyết";
                getSupportActionBar().setTitle(mTitle);
                break;
            case 3:
                fragment = new Control_Layout_4();
                mTitle = "Thống kê";
                getSupportActionBar().setTitle(mTitle);
                break;
            case 4:
                fragment = new Control_Layout_5();
                mTitle = "Về chúng tôi";
                getSupportActionBar().setTitle(mTitle);
                break;
            default:
                break;
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, fragment).commit();
        }
    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
