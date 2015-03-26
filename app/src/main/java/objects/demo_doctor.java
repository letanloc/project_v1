package objects;

/**
 * Created by lee on 23/03/2015.
 */
public class demo_doctor {

    private int id;
    private String Time;
    private String Date;
    private String txtAdress;
    private int ImageItem;
    private boolean Alarm;
    private boolean Status;

    public demo_doctor(int id, String time, String date, String txtNote, int imageItem, boolean Alarm, boolean Status) {

        this.id = id;
        Time = time;
        Date = date;
        this.txtAdress = txtNote;
        ImageItem = imageItem;
        this.Alarm = Alarm;
        this.Status = Status;

    }

    public demo_doctor() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTxtAdress() {
        return txtAdress;
    }

    public void setTxtAdress(String txtAdress) {
        this.txtAdress = txtAdress;
    }

    public int getImageItem() {
        return ImageItem;
    }

    public void setImageItem(int imageItem) {
        ImageItem = imageItem;
    }

    public boolean isAlarm() {
        return Alarm;
    }

    public void setAlarm(boolean alarm) {
        Alarm = alarm;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}
