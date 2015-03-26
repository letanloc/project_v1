package net.rubydata.project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;

import net.rubydata.project.fragment_drawers.Control_ActionBar;

import java.util.ArrayList;

import dao.database.user;
import objects.obj_user;

public class LoadActivity extends ActionBarActivity {
    ArrayList<obj_user> List;
    int Time = 3000;
    user UserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        UserDao = new user(LoadActivity.this);
        List = UserDao.getUser();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (List.size() <= 0) {
                    Intent i = new Intent(LoadActivity.this, NewActivity.class);
                    startActivity(i);
                    finish();

                } else {
                    Intent i = new Intent(LoadActivity.this, Control_ActionBar.class);
                    startActivity(i);
                    finish();
                }

            }
        }, Time);
    }


}
