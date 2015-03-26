package objects;

import java.io.Serializable;

/**
 * Created by MANDN on 26/03/2015.
 */
public class obj_food implements Serializable {

    protected int _ID_FOOD;
    protected String _FOOD_NAME;
    protected int _ID_PLAN;

    public int get_ID_FOOD() {
        return _ID_FOOD;
    }

    public void set_ID_FOOD(int _ID_FOOD) {
        this._ID_FOOD = _ID_FOOD;
    }

    public String get_FOOD_NAME() {
        return _FOOD_NAME;
    }

    public void set_FOOD_NAME(String _FOOD_NAME) {
        this._FOOD_NAME = _FOOD_NAME;
    }

    public int get_ID_PLAN() {
        return _ID_PLAN;
    }

    public void set_ID_PLAN(int _ID_PLAN) {
        this._ID_PLAN = _ID_PLAN;
    }

    public obj_food(int _ID_FOOD, String _FOOD_NAME, int _ID_PLAN) {
        this._ID_FOOD = _ID_FOOD;
        this._FOOD_NAME = _FOOD_NAME;
        this._ID_PLAN = _ID_PLAN;
    }

    public obj_food() {

    }

    @Override
    public String toString() {
        return "obj_food{" +
                "_ID_FOOD=" + _ID_FOOD +
                ", _FOOD_NAME='" + _FOOD_NAME + '\'' +
                ", _ID_PLAN=" + _ID_PLAN +
                '}';
    }
}
