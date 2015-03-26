package dao.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import database.database;
import objects.obj_plan;

/**
 * Created by MANDN on 26/03/2015.
 */
public class plan {
    static final String TABLE_USER = "TABLE_USER"; /*Tên bảng người dùng*/

    static final String _ID_USER = "_IA_USER",/*mã người dùng*/
            _NAME = "_NAME",/*tên người dùng*/
            _OLD = "_OLD",/*tuổi*/
            _WEIGHT = "_WEIGHT",/*cân năngj*/
            _HEIGHT = "_HEIGHT",/*chiều cao*/
            _CREATE_AT = "_CREATE_AT",/*ngày tạo*/
            _UPDATE_AT = "_UPDATE_AT",/*ngày cập nhật*/
            _DELETE = "_DELETE";/*xóa*/

    static final String TABLE_PLAN = "TABLE_PLAN";/*tên bản kế hoạch ăn uống*/

    static final String _ID_PLAN = "_ID_PLAN",/*mã kế hoạch ăn uống*/
            _DATE_SET = "_DATE_SET",/*ngày thiết lập*/
            get_ID_USER = "_ID_USER";/*mã người dùng*/

    static final String TABLE_FOOD = "TABLE_FOOD";/*tên bản thực phẩm*/

    static final String _ID_FOOD = "_ID_FOOD",/*mã thực phẩm*/
            _FOOD_NAME = "_FOOD_NAME",/*tên thực phẩm*/
            get_ID_PLAN = "_ID_PLAN";/*mã người dùng*/

    private SQLiteDatabase db;

    public plan(Context context) {
        database database = new database(context);
        db = database.getWritableDatabase();
    }

    public void insertPlan(obj_plan objPlan) {
        ContentValues cv = new ContentValues();
        cv.put(_DATE_SET, objPlan.get_DATE_SET());
        cv.put(_ID_USER, objPlan.get_ID_USER());
        db.insert(TABLE_PLAN, null, cv);
    }

    public int updatePlan(obj_plan objPlan) {
        ContentValues cv = new ContentValues();
        cv.put(_ID_PLAN, objPlan.get_ID_PLAN());
        cv.put(_DATE_SET, objPlan.get_DATE_SET());
        cv.put(_ID_USER, objPlan.get_ID_USER());
        db.insert(TABLE_PLAN, null, cv);
        return db.update(TABLE_PLAN, cv, _ID_PLAN + " + ? ", new String[]{String.valueOf(objPlan.get_ID_PLAN())});
    }
}
