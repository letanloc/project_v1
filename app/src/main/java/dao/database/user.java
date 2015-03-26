package dao.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import database.database;
import objects.obj_user;

/**
 * Created by MANDN on 25/03/2015.
 */
public class user {

    static final String TABLE_USER = "TABLE_USER"; /*Tên bảng người dùng*/


    static final String _ID_USER = "_IA_USER";/*mã người dùng*/
    static final String _NAME = "_NAME";/*tên người dùng*/
    static final String _OLD = "_OLD";/*tuổi*/
    static final String _WEIGHT = "_WEIGHT";/*cân năngj*/
    static final String _HEIGHT = "_HEIGHT";/*chiều cao*/
    static final String _GLU = "_GLU"; /*chỉ số đường huyết*/
    static final String _CALO = "_CALO";
    static final String _GENDER = "_GENDER";
    static final String _CREATE_AT = "_CREATE_AT";/*ngày tạo*/
    static final String _UPDATE_AT = "_UPDATE_AT";/*ngày cập nhật*/
    static String _DELETE = "_DELETE";/*xóa*/

    static final String TABLE_PLAN = "TABLE_PLAN";/*tên bản kế hoạch ăn uống*/

    static final String _ID_PLAN = "_ID_PLAN",/*mã kế hoạch ăn uống*/
            _DATE_SET = "_DATE_SET",/*ngày thiết lập*/
            get_ID_USER = "_ID_USER";/*mã người dùng*/

    static final String TABLE_FOOD = "TABLE_FOOD";/*tên bản thực phẩm*/

    static final String _ID_FOOD = "_ID_FOOD",/*mã thực phẩm*/
            _FOOD_NAME = "_FOOD_NAME",/*tên thực phẩm*/
            get_ID_PLAN = "_ID_PLAN";/*mã người dùng*/

    private SQLiteDatabase db;

    public user(Context context) {
        database database = new database(context);
        db = database.getWritableDatabase();
    }

    public void insertUser(obj_user objUser) {
        ContentValues cv = new ContentValues();
        cv.put(_NAME, objUser.get_NAME());
        cv.put(_OLD, objUser.get_OLD());
        cv.put(_WEIGHT, objUser.get_WEIGHT());
        cv.put(_HEIGHT, objUser.get_HEIGHT());
        cv.put(_GLU, objUser.get_GLU());
        cv.put(_CALO, objUser.get_CALO());
        cv.put(_GENDER, objUser.get_GENDER());
        cv.put(_CREATE_AT, objUser.get_CREATE_AT());
        cv.put(_UPDATE_AT, objUser.get_UPDATE_AT());
        cv.put(_DELETE, objUser.is_DELETE());
        db.insert(TABLE_USER, null, cv);
    }

    public int updateUser(obj_user objUser) {
        ContentValues cv = new ContentValues();
        cv.put(_ID_USER, objUser.get_ID_USER());
        cv.put(_NAME, objUser.get_NAME());
        cv.put(_OLD, objUser.get_OLD());
        cv.put(_WEIGHT, objUser.get_WEIGHT());
        cv.put(_HEIGHT, objUser.get_HEIGHT());
        cv.put(_GLU, objUser.get_GLU());
        cv.put(_CREATE_AT, objUser.get_CREATE_AT());
        cv.put(_UPDATE_AT, objUser.get_UPDATE_AT());
        cv.put(_DELETE, objUser.is_DELETE());
        db.insert(TABLE_USER, null, cv);
        return db.update(TABLE_USER, cv, _ID_USER + " = ? ", new String[]{String.valueOf(objUser.get_ID_USER())});
    }

    public ArrayList<obj_user> getUser() {
        ArrayList<obj_user> List = new ArrayList<>();
        String Select = "  SELECT * FROM TABLE_USER ";
        Cursor cursor = db.rawQuery(Select, null);
        if (cursor.moveToFirst()) {
            do {
                obj_user oju = new obj_user();
                //                oju.set_CALO();
                oju.set_ID_USER(cursor.getInt(0));

                oju.set_NAME(cursor.getString(cursor.getColumnIndex(_NAME)));

                oju.set_OLD(cursor.getInt(cursor.getColumnIndex(_OLD)));

                oju.set_WEIGHT(cursor.getDouble(cursor.getColumnIndex(_WEIGHT)));

                oju.set_HEIGHT(cursor.getDouble(cursor.getColumnIndex(_HEIGHT)));

                oju.set_GLU(cursor.getDouble(cursor.getColumnIndex(_GLU)));
                oju.set_GENDER(cursor.getString(cursor.getColumnIndex(_GENDER)));
                oju.set_CREATE_AT(cursor.getString(cursor.getColumnIndex(_CREATE_AT)));

                oju.set_UPDATE_AT(cursor.getString(cursor.getColumnIndex(_UPDATE_AT)));

                Boolean flag = (cursor.getInt(cursor.getColumnIndex(_DELETE)) == 1 ? true : false);
                oju.set_DELETE(flag);
                List.add(oju);

            } while (cursor.moveToNext());

        }

        return List;
    }
}
