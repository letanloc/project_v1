package net.rubydata.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import net.rubydata.project.fragment_drawers.Control_ActionBar;

import dao.database.user;
import objects.obj_user;

/**
 * Created by lee on 26/03/2015.
 */
public class NewActivity extends ActionBarActivity implements View.OnKeyListener, AdapterView.OnItemSelectedListener {
    private EditText edtName, edtWeight, edtHeight, edtAger, edtSuger;
    private TextView txtCalors;
    private TextView txtNameError, txtWeightError, txtHeightError, txtAgerError, txtsugerError;
    private Toolbar toolbar;
    private MenuItem menu1, menu2;
    Spinner spinner;
     user useDao; /*goi user  trong ph?n dao*/
    private boolean nextFocusDown;
    String Sname, Sheigh, Ssuger, Sage, Sweight;
    Mcalor CM;
    boolean bheight, bweight, bAger;

    public NewActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        try {
            useDao = new user(this);
        }catch (Exception e){
            Toast.makeText(getApplication(), "error" + e, Toast.LENGTH_LONG).show();

        }

        CM = new Mcalor();

        edtName = (EditText) findViewById(R.id.edtName);
        edtAger = (EditText) findViewById(R.id.edtAge);
        edtHeight = (EditText) findViewById(R.id.edtHeight);
        edtWeight = (EditText) findViewById(R.id.edtWeight);
        edtSuger = (EditText) findViewById(R.id.edtsuger);
        txtNameError = (TextView) findViewById(R.id.txtNameError);
        txtAgerError = (TextView) findViewById(R.id.txtAgeError);
        txtsugerError = (TextView) findViewById(R.id.txtSugerEroor);
        txtHeightError = (TextView) findViewById(R.id.txthwError);
        spinner = (Spinner) findViewById(R.id.planets_spinner);
        txtCalors = (TextView) findViewById(R.id.txtcalor);
        this.spinner();
        edtHeight.setOnKeyListener(this);
        edtWeight.setOnKeyListener(this);
        edtAger.setOnKeyListener(this);
        spinner.setOnItemSelectedListener(this);

    }

    public void spinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu1 = menu.findItem(R.id.action_settings);
        menu1.setVisible(false);
        menu2 = menu.findItem(R.id.action_done);
        return true;
    }

    public void DisplayUser() {


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Sname = edtName.getText() + "";
        Sheigh = edtHeight.getText() + "";
        Ssuger = edtSuger.getText() + "";
        Sage = edtAger.getText() + "";
        Sweight = edtWeight.getText() + "";
        if (id == R.id.action_settings) {

            return true;
        }
        if (id == R.id.action_done) {
            if (Sname.trim().equals("")) {
                txtNameError.setText("Your name null!");
                txtAgerError.setText("");
                txtHeightError.setText("");
                txtsugerError.setText("");
            } else if (Sage.trim().equals("")) {
                txtNameError.setText("");
                txtAgerError.setText("Your Age null!");
                txtHeightError.setText("");
                txtsugerError.setText("");
            } else if (Ssuger.trim().equals("")) {
                txtNameError.setText("");
                txtAgerError.setText("");
                txtHeightError.setText("");
                txtsugerError.setText("Your Suger null!");
            } else if (Sweight.trim().equals("")) {
                txtNameError.setText("");
                txtAgerError.setText("");
                txtHeightError.setText("Your weight null!");
                txtsugerError.setText("");
            } else if (Sheigh.trim().equals("")) {
                txtNameError.setText("");
                txtAgerError.setText("");
                txtHeightError.setText("Your Height null!");
                txtsugerError.setText("");
            } else {
//                menu1.setVisible(true);
//                menu2.setVisible(false);
                txtNameError.setText("");
                txtAgerError.setText("");
                txtHeightError.setText("");
                txtsugerError.setText("");

                try {
                        /*  lay gia tri bo vao databse*/
                        obj_user u = new obj_user();
                        u.set_NAME((edtName.getText() + ""));
                        u.set_OLD(Integer.parseInt((edtAger.getText() + "")));
                        u.set_WEIGHT(Double.parseDouble(((edtWeight.getText() + ""))));
                        u.set_HEIGHT(Double.parseDouble(edtHeight.getText() + ""));
                        u.set_GLU(Double.parseDouble((edtSuger.getText() + "")));
                        u.set_CALO(Double.parseDouble(txtCalors.getText() + ""));


                        u.set_GENDER((spinner.getSelectedItem() + ""));
                    myFunction();
                        useDao.insertUser(u);
                } catch (Exception e) {
                    Toast.makeText(getApplication(), "error1"+e,Toast.LENGTH_LONG).show();
                }


            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void myFunction() {
        Intent intent = new Intent(NewActivity.this, Control_ActionBar.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        String SAger = edtAger.getText() + "";
        String SHeight = edtHeight.getText() + "";
        String Sweight = edtWeight.getText() + "";
        String Sgene = spinner.getSelectedItem().toString();
        int i = 0;
        switch (v.getId()) {
            case R.id.edtHeight:
                if (!(edtHeight.getText() + "").trim().equals("")) {
                    if (!SAger.trim().equals("") && !Sweight.trim().equals("")) {
                        if (Sgene.trim().equals("Nam")) {
                            Sname = edtName.getText() + "";
                            Sheigh = edtHeight.getText() + "";
                            Ssuger = edtSuger.getText() + "";
                            Sage = edtAger.getText() + "";
                            Sweight = edtWeight.getText() + "";
                            double h = Double.parseDouble(Sheigh);
                            double w = Double.parseDouble(Sweight);
                            double a = Double.parseDouble(Sage);
                            txtCalors.setText(String.valueOf(CM.Minit(w, h, a)));
                        } else {
                            Sname = edtName.getText() + "";
                            Sheigh = edtHeight.getText() + "";
                            Ssuger = edtSuger.getText() + "";
                            Sage = edtAger.getText() + "";
                            double h1 = Double.parseDouble(Sheigh);
                            double w1 = Double.parseDouble(Sweight);
                            double a1 = Double.parseDouble(Sage);
                            txtCalors.setText(String.valueOf(CM.Finit(w1, h1, a1)));

                        }
                    }
                }
                break;
            case R.id.edtWeight:
                if (!(edtWeight.getText() + "").trim().equals("")) {
                    if (!(edtHeight.getText() + "").trim().equals("") && !(edtAger.getText() + "").trim().equals("")) {
                        if (Sgene.trim().equals("Nam")) {
                            Sname = edtName.getText() + "";
                            Sheigh = edtHeight.getText() + "";
                            Ssuger = edtSuger.getText() + "";
                            Sage = edtAger.getText() + "";
                            Sweight = edtWeight.getText() + "";
                            double h = Double.parseDouble(Sheigh);
                            double w = Double.parseDouble(Sweight);
                            double a = Double.parseDouble(Sage);
                            txtCalors.setText(String.valueOf(CM.Minit(w, h, a)));
                        } else {
                            Sname = edtName.getText() + "";
                            Sheigh = edtHeight.getText() + "";
                            Ssuger = edtSuger.getText() + "";
                            Sage = edtAger.getText() + "";
                            double h1 = Double.parseDouble(Sheigh);
                            double w1 = Double.parseDouble(Sweight);
                            double a1 = Double.parseDouble(Sage);
                            txtCalors.setText(String.valueOf(CM.Finit(w1, h1, a1)));
                        }
                    }
                }
                break;
            case R.id.edtAge:
                if (!(edtAger.getText() + "").trim().equals("")) {
                    if (!(edtHeight.getText() + "").trim().equals("") && !(edtWeight.getText() + "").trim().equals("")) {

                        if (Sgene.trim().equals("Nam")) {
                            Sname = edtName.getText() + "";
                            Sheigh = edtHeight.getText() + "";
                            Ssuger = edtSuger.getText() + "";
                            Sage = edtAger.getText() + "";
                            Sweight = edtWeight.getText() + "";
                            double h = Double.parseDouble(Sheigh);
                            double w = Double.parseDouble(Sweight);
                            double a = Double.parseDouble(Sage);
                            txtCalors.setText(String.valueOf(CM.Minit(w, h, a)));
                        } else {

                            Sname = edtName.getText() + "";
                            Sheigh = edtHeight.getText() + "";
                            Ssuger = edtSuger.getText() + "";
                            Sage = edtAger.getText() + "";
                            double h1 = Double.parseDouble(Sheigh);
                            double w1 = Double.parseDouble(Sweight);
                            double a1 = Double.parseDouble(Sage);
                            txtCalors.setText(String.valueOf(CM.Finit(w1, h1, a1)));
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                if (!(edtAger.getText() + "").trim().equals("") && !(edtHeight.getText() + "").trim().equals("") && !(edtWeight.getText() + "").trim().equals("")) {
                    Sname = edtName.getText() + "";
                    Sheigh = edtHeight.getText() + "";
                    Ssuger = edtSuger.getText() + "";
                    Sage = edtAger.getText() + "";
                    Sweight = edtWeight.getText() + "";
                    double h = Double.parseDouble(Sheigh);
                    double w = Double.parseDouble(Sweight);
                    double a = Double.parseDouble(Sage);
                    txtCalors.setText(String.valueOf(CM.Minit(w, h, a)));

                }

                break;
            case 1:
                try {
                    if (!(edtAger.getText() + "").trim().equals("") && !(edtHeight.getText() + "").trim().equals("") && !(edtWeight.getText() + "").trim().equals("")) {
                        Sheigh = edtHeight.getText() + "";
                        Ssuger = edtSuger.getText() + "";
                        Sage = edtAger.getText() + "";
                        Sweight = edtWeight.getText() + "";

                        double h1 = Double.parseDouble(Sheigh);
                        double w1 = Double.parseDouble(Sweight);
                        double a1 = Double.parseDouble(Sage);
                        txtCalors.setText(String.valueOf(CM.Finit(w1, h1, a1)));
                    }
                } catch (Exception e) {
                    Toast.makeText(getApplication(), "a" + e, Toast.LENGTH_SHORT).show();

                }

                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    static class Mcalor {
        public String Minit(double w, double h, double A) {
            double foot = h / 12.0;
            double clalor = 66.0 + (13.7 * w) + (5.0 * foot) - (6.8 * A);
         double amcalor = Math.round(clalor*100.0)/100.0;

            return String.valueOf(Math.round(clalor*100.0)/100.0);
        }

        public String Finit(double w, double h, double a) {
            double foot = h / 12.0;
            double clalor = 66.5 + (9.6 * w) + (1.8 * foot) - (4.7 * a);


            return String.valueOf(Math.round(clalor*100.0)/100.0);
        }
    }
}
