package objects;

import java.io.Serializable;

/**
 * Created by User on 25/03/2015.
 */
public class obj_appointment implements Serializable {

    protected int appoin_id; // MÃ LỊCH HẸN
    protected String appoin_date; // NGÀY
    protected String appoin_time; // GIỜ
    protected Boolean appoin_alarm; // THÔNG BÁO
    protected String appoin_where; // ĐỊA ĐIỂM
    protected String appoin_note; // GHI CHÚ
    protected Boolean appoin_status; // TRẠNG THÁI
    protected int Id_user; // MÃ NGƯỜI DÙNG

    public obj_appointment() {
    }

    public obj_appointment(int appoin_id, int id_user, Boolean appoin_status, String appoin_note, String appoin_where, Boolean appoin_alarm, String appoin_time, String appoin_date) {
        this.appoin_id = appoin_id;
        Id_user = id_user;
        this.appoin_status = appoin_status;
        this.appoin_note = appoin_note;
        this.appoin_where = appoin_where;
        this.appoin_alarm = appoin_alarm;
        this.appoin_time = appoin_time;
        this.appoin_date = appoin_date;
    }

    public int getAppoin_id() {
        return appoin_id;
    }

    public void setAppoin_id(int appoin_id) {
        this.appoin_id = appoin_id;
    }

    public String getAppoin_date() {
        return appoin_date;
    }

    public void setAppoin_date(String appoin_date) {
        this.appoin_date = appoin_date;
    }

    public String getAppoin_time() {
        return appoin_time;
    }

    public void setAppoin_time(String appoin_time) {
        this.appoin_time = appoin_time;
    }

    public Boolean getAppoin_alarm() {
        return appoin_alarm;
    }

    public void setAppoin_alarm(Boolean appoin_alarm) {
        this.appoin_alarm = appoin_alarm;
    }

    public String getAppoin_where() {
        return appoin_where;
    }

    public void setAppoin_where(String appoin_where) {
        this.appoin_where = appoin_where;
    }

    public String getAppoin_note() {
        return appoin_note;
    }

    public void setAppoin_note(String appoin_note) {
        this.appoin_note = appoin_note;
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int id_user) {
        Id_user = id_user;
    }

    public Boolean getAppoin_status() {
        return appoin_status;
    }

    public void setAppoin_status(Boolean appoin_status) {
        this.appoin_status = appoin_status;
    }

    @Override
    public String toString() {
        return "obj_appointment{" +
                "appoin_id=" + appoin_id +
                ", appoin_date='" + appoin_date + '\'' +
                ", appoin_time='" + appoin_time + '\'' +
                ", appoin_alarm=" + appoin_alarm +
                ", appoin_where='" + appoin_where + '\'' +
                ", appoin_note='" + appoin_note + '\'' +
                ", appoin_status=" + appoin_status +
                ", Id_user=" + Id_user +
                '}';
    }
}
