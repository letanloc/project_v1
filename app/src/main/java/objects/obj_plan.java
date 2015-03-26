package objects;

import java.io.Serializable;

/**
 * Created by MANDN on 26/03/2015.
 */
public class obj_plan implements Serializable {
    protected int _ID_PLAN;
    protected String _DATE_SET;
    protected int _ID_USER;

    public int get_ID_PLAN() {
        return _ID_PLAN;
    }

    public void set_ID_PLAN(int _ID_PLAN) {
        this._ID_PLAN = _ID_PLAN;
    }

    public String get_DATE_SET() {
        return _DATE_SET;
    }

    public void set_DATE_SET(String _DATE_SET) {
        this._DATE_SET = _DATE_SET;
    }

    public int get_ID_USER() {
        return _ID_USER;
    }

    public void set_ID_USER(int _ID_USER) {
        this._ID_USER = _ID_USER;
    }

    public obj_plan(int _ID_PLAN, String _DATE_SET, int _ID_USER) {
        this._ID_PLAN = _ID_PLAN;
        this._DATE_SET = _DATE_SET;
        this._ID_USER = _ID_USER;
    }

    public obj_plan() {

    }

    @Override
    public String toString() {
        return "obj_plan{" +
                "_ID_PLAN=" + _ID_PLAN +
                ", _DATE_SET='" + _DATE_SET + '\'' +
                ", _ID_USER=" + _ID_USER +
                '}';
    }
}
