package dao.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import database.database;
import objects.demo_doctor;
import objects.obj_appointment;


/**
 * Created by User on 25/03/2015.
 */
public class appoin {

    final String appoin_table = "appoin_table"; /*tên bảng*/

    final String appoin_id = "appoin_id", /*mã lịch hẹn*/
            appoin_date = "appoin_date", /*ngày */
            appoin_time = "appoin_time", /*giờ*/
            appoin_alarm = "appoin_alarm", /*thông báo*/
            appoin_where = "appoin_where", /*địa điểm*/
            appoin_note = "appoin_note", /*thông báo*/
            appoin_status = "appoin_status", /*trạng thái*/
            id_user = "id_user"; /*mã người dùng*/

    private SQLiteDatabase db;

    public appoin(Context context) {
        database data = new database(context);
        db = data.getWritableDatabase();
    }

    public void insertAppoin(obj_appointment objAppointment) {
        ContentValues cv = new ContentValues();
        cv.put(appoin_date, objAppointment.getAppoin_date());
        cv.put(appoin_time, objAppointment.getAppoin_time());
        cv.put(appoin_alarm, objAppointment.getAppoin_alarm());
        cv.put(appoin_where, objAppointment.getAppoin_where());
        cv.put(appoin_note, objAppointment.getAppoin_note());
        cv.put(appoin_status, objAppointment.getAppoin_status());
        cv.put(id_user, objAppointment.getId_user());
        db.insert(appoin_table, null, cv);
    }

    //
    public void deleteAppoin(obj_appointment objAppointment) {
        db.delete(appoin_table, appoin_id + " = ? ",
                new String[]{String.valueOf(objAppointment.getAppoin_id())});
    }

    //
    public int updateAppoin(obj_appointment objAppointment) {
        ContentValues cv = new ContentValues();
        cv.put(appoin_date, objAppointment.getAppoin_date());
        cv.put(appoin_time, objAppointment.getAppoin_time());
        cv.put(appoin_alarm, objAppointment.getAppoin_alarm());
        cv.put(appoin_where, objAppointment.getAppoin_where());
        cv.put(appoin_note, objAppointment.getAppoin_note());
        cv.put(appoin_status, objAppointment.getAppoin_status());
        cv.put(id_user, objAppointment.getId_user());
        db.insert(appoin_table, null, cv);
        return db.update(appoin_table, cv, appoin_id + " = ? ",
                new String[]{String.valueOf(objAppointment.getAppoin_id())});

    }

    public ArrayList<demo_doctor> GetListDocter() {
        ArrayList<demo_doctor> List = new ArrayList<>();
        String Select = " SELECT * FROM appoin_table ";
        Cursor cursor = db.rawQuery(Select, null);
        if (cursor.moveToFirst()) {
            do {
                demo_doctor i = new demo_doctor();
                i.setId(cursor.getInt(cursor.getColumnIndex("appoin_id")));
                boolean Alarm = Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex("appoin_alarm")));
                i.setAlarm(Alarm);

            } while (cursor.moveToNext());
        }
        return null;
    }
}
