package objects;

import java.io.Serializable;

/**
 * Created by User on 21/03/2015.
 */
public class obj_user implements Serializable {

    protected int _ID_USER;
    protected String _NAME;
    protected int _OLD;
    protected double _WEIGHT;
    protected double _HEIGHT;
    protected double _GLU;
    protected double _CALO;
    protected String _GENDER;
    protected String _CREATE_AT;
    protected String _UPDATE_AT;
    protected boolean _DELETE;
    public obj_user(){

    }
    public obj_user(int _ID_USER, String _NAME, int _OLD, double _WEIGHT, double _HEIGHT, double _GLU, double _CALO, String _GENDER, String _CREATE_AT, String _UPDATE_AT, boolean _DELETE) {
        this._ID_USER = _ID_USER;
        this._NAME = _NAME;
        this._OLD = _OLD;
        this._WEIGHT = _WEIGHT;
        this._HEIGHT = _HEIGHT;
        this._GLU = _GLU;
        this._CALO = _CALO;
        this._GENDER = _GENDER;
        this._CREATE_AT = _CREATE_AT;
        this._UPDATE_AT = _UPDATE_AT;
        this._DELETE = _DELETE;
    }

    public int get_ID_USER() {
        return _ID_USER;
    }

    public void set_ID_USER(int _ID_USER) {
        this._ID_USER = _ID_USER;
    }

    public String get_NAME() {
        return _NAME;
    }

    public void set_NAME(String _NAME) {
        this._NAME = _NAME;
    }

    public int get_OLD() {
        return _OLD;
    }

    public void set_OLD(int _OLD) {
        this._OLD = _OLD;
    }

    public double get_WEIGHT() {
        return _WEIGHT;
    }

    public void set_WEIGHT(double _WEIGHT) {
        this._WEIGHT = _WEIGHT;
    }

    public double get_HEIGHT() {
        return _HEIGHT;
    }

    public void set_HEIGHT(double _HEIGHT) {
        this._HEIGHT = _HEIGHT;
    }

    public double get_GLU() {
        return _GLU;
    }

    public void set_GLU(double _GLU) {
        this._GLU = _GLU;
    }

    public double get_CALO() {
        return _CALO;
    }

    public void set_CALO(double _CALO) {
        this._CALO = _CALO;
    }

    public String get_GENDER() {
        return _GENDER;
    }

    public void set_GENDER(String _GENDER) {
        this._GENDER = _GENDER;
    }

    public String get_CREATE_AT() {
        return _CREATE_AT;
    }

    public void set_CREATE_AT(String _CREATE_AT) {
        this._CREATE_AT = _CREATE_AT;
    }

    public String get_UPDATE_AT() {
        return _UPDATE_AT;
    }

    public void set_UPDATE_AT(String _UPDATE_AT) {
        this._UPDATE_AT = _UPDATE_AT;
    }

    public boolean is_DELETE() {
        return _DELETE;
    }

    public void set_DELETE(boolean _DELETE) {
        this._DELETE = _DELETE;
    }

    @Override
    public String toString() {
        return "obj_user{" +
                "_ID_USER=" + _ID_USER +
                ", _NAME='" + _NAME + '\'' +
                ", _OLD=" + _OLD +
                ", _WEIGHT=" + _WEIGHT +
                ", _HEIGHT=" + _HEIGHT +
                ", glu=" + _GLU +
                ", _CREATE_AT='" + _CREATE_AT + '\'' +
                ", _UPDATE_AT='" + _UPDATE_AT + '\'' +
                ", _DELETE=" + _DELETE +
                '}';
    }

}
