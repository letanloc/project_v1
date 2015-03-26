package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 21/03/2015.
 */
public class database extends SQLiteOpenHelper {

    final String TABLE_USER = "TABLE_USER"; /*Bảng người dùng*/
    final String _ID_USER = "_ID_USER",/*mã người dùng*/
            _NAME = "_NAME",/*tên người dùng*/
            _OLD = "_OLD",/*tuổi*/
            _GLU="_GLU",
            _CALO="_CALO",
            _GENDER="_GENDER",
            _WEIGHT = "_WEIGHT",/*cân năngj*/
            _HEIGHT = "_HEIGHT",/*chiều cao*/
    //            glu1 = "glu" /*chi so duong huyet */,
    _CREATE_AT = "_CREATE_AT",/*ngày tạo*/
            _UPDATE_AT = "_UPDATE_AT",/*ngày cập nhật*/
            _DELETE = "_DELETE";/*xóa*/

    final String TABLE_PLAN = "TABLE_PLAN";/*tên bản kế hoạch ăn uống*/
    final String _ID_PLAN = "_ID_PLAN",/*mã kế hoạch ăn uống*/
            _DATE_SET = "_DATE_SET",/*ngày thiết lập*/
            get_ID_USER = "_ID_USER";/*mã người dùng*/

    final String TABLE_FOOD = "TABLE_FOOD";/*tên bản thực phẩm*/
    final String _ID_FOOD = "_ID_FOOD",/*mã thực phẩm*/
            _FOOD_NAME = "_FOOD_NAME",/*tên thực phẩm*/
            get_ID_PLAN = "_ID_PLAN";/*mã người dùng*/

    final String glu_table = "glu_table"; // tÃªn báº£ng
    final String glu_id = "glu_id" /*mÃ£ glu*/,
            glu_date = "glu_date" /*ngÃ y Ä‘o*/,
            glu = "glu" /*chá»‰ sá»‘ Ä‘Æ°á»?ng huyáº¿t*/,
            glu_note = "glu_note" /*ghi chÃº*/,
            id_user = "id_user";


    final String appoin_table = "appoin_table";
    final String appoin_id = "appoin_id",
            appoin_date = "appoin_date",
            appoin_time = "appoin_time",
            appoin_alarm = "appoin_alarm",
            appoin_where = "appoin_where",
            appoin_note = "appoin_note",
            appoin_status = "appoin_status",
            id_user1 = "id_user";

    public database(Context context) {
        super(context, "data", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Tạo bảng người dùng
        String CREATE_TABLE_USER =" CREATE TABLE "+TABLE_USER+" ("
                                                +_ID_USER+" INTEGER PRIMARY KEY  , "
                                                +_NAME+" TEXT, "
                                                +_OLD+" INTEGER, "
                                                +_WEIGHT+" DOUBLE, "
                                                +_HEIGHT+" DOUBLE, "
                                                +_GLU+" DOUBLE, "
                                                +_CALO+" DOUBLE, "
                                                +_GENDER+" TEXT, "
                                                +_CREATE_AT+" DATE, "
                                                +_UPDATE_AT+" DATE, "
                                                +_DELETE+" BOOLEAN) ";
        db.execSQL(CREATE_TABLE_USER);

        //Tạo bảng kế hoạch ăn uống
        String CREATE_TABLE_PLAN = "CREATE TABLE " + TABLE_PLAN + " ( "
                                                    + _ID_PLAN + " INTEGER PRIMARY KEY  AUTOINCREMENT , "
                                                    + _DATE_SET + " DATE, "
                                                    + get_ID_USER + " INTEGER )";
        db.execSQL(CREATE_TABLE_PLAN);

        //Tạo bảng thực phẩm
        String CREATE_TABLE_FOOD = " CREATE TABLE " + TABLE_FOOD
                + " (" + _ID_FOOD + " INTEGER PRIMARY KEY  AUTOINCREMENT , "
                + _FOOD_NAME + " TEXT, "
                + get_ID_PLAN + " INTEGER) ";
        db.execSQL(CREATE_TABLE_FOOD);

        //
        String create_glu_table = " create table " + glu_table + " ( "
                + glu_id + " Integer Not Null Primary Key Autoincrement, " + glu_date + " Date, "
                + glu + " Double, " + glu_note + " Text, " + id_user + " Integer " + " ) ";
        db.execSQL(create_glu_table);

        //
        String create_appoin_table = " create table " + appoin_table + " ( "
                + appoin_id + " Integer Not Null Primary Key Autoincrement, " + appoin_date +
                " Date, " + appoin_time + " Date, " + appoin_alarm + " Double, " + appoin_where +
                " Text, " + appoin_note + " Text, " + appoin_status + " Double, " + id_user +
                " Integer " + " ) ";
        db.execSQL(create_appoin_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" drop table if exits " + TABLE_USER);
        db.execSQL(" drop table if exits " + TABLE_PLAN);
        db.execSQL(" drop table if exits " + TABLE_FOOD);
        db.execSQL(" drop table if exits " + glu_table);
        db.execSQL(" drop table if exits " + appoin_table);
        onCreate(db);
    }
}
