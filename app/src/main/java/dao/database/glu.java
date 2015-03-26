package dao.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import database.database;
import objects.obj_glu;

/**
 * Created by User on 25/03/2015.
 */
public class glu {

    final String glu_table = "glu_table";  /*tên bảng*/
    final String glu_id = "glu_id", /*mã glu*/
            glu_date = "glu_date", /*ngày đo*/
            glu = "glu", /*chỉ số đường huyết*/
            glu_note = "glu_note", /*ghi chú*/
            id_user = "id_user"; /*mã người dùng*/

    private SQLiteDatabase db;

    public glu(Context context) {
        database database = new database(context);
        db = database.getWritableDatabase();
    }

    public void insertGlu(obj_glu objGlu) {
        ContentValues cv = new ContentValues();
        cv.put(glu_id, objGlu.getGlu_id());
        cv.put(glu_date, objGlu.getGlu_date());
        cv.put(glu, objGlu.getGlu());
        cv.put(glu_note, objGlu.getGlu_note());
        cv.put(id_user, objGlu.getId_user());
        db.insert(glu_table, null, cv);
    }

    //
    public void deleteGlu(obj_glu objGlu) {

        db.delete(glu_table, glu_id + " = ? ",
                new String[]{String.valueOf(objGlu.getGlu_id())});

    }

    //
    public int updateGlu(obj_glu objGlu) {

        ContentValues cv = new ContentValues();
        cv.put(glu_id, objGlu.getGlu_id());
        cv.put(glu_date, objGlu.getGlu_date());
        cv.put(glu, objGlu.getGlu());
        cv.put(glu_note, objGlu.getGlu_note());
        cv.put(id_user, objGlu.getId_user());
        db.insert(glu_table, null, cv);
        return db.update(glu_table, cv, glu_id + " = ? ",
                new String[]{String.valueOf(objGlu.getGlu_id())});

    }
}
