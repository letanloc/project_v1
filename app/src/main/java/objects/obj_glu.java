package objects;

import java.io.Serializable;

/**
 * Created by User on 25/03/2015.
 */
public class obj_glu implements Serializable {

    protected int glu_id; // MÃ ĐƯỜNG HUYẾT
    protected String glu_date; // NGÀY ĐO
    protected Double glu; // CHỈ SỐ ĐƯỜNG HUYẾT
    protected String glu_note;
    protected int id_user;

    public obj_glu() {
    }

    public obj_glu(int glu_id, int id_user, String glu_note, Double glu, String glu_date) {
        this.glu_id = glu_id;
        this.id_user = id_user;
        this.glu_note = glu_note;
        this.glu = glu;
        this.glu_date = glu_date;
    }

    public int getGlu_id() {
        return glu_id;
    }

    public void setGlu_id(int glu_id) {
        this.glu_id = glu_id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getGlu_note() {
        return glu_note;
    }

    public void setGlu_note(String glu_note) {
        this.glu_note = glu_note;
    }

    public Double getGlu() {
        return glu;
    }

    public void setGlu(Double glu) {
        this.glu = glu;
    }

    public String getGlu_date() {
        return glu_date;
    }

    public void setGlu_date(String glu_date) {
        this.glu_date = glu_date;
    }


    @Override
    public String toString() {
        return "obj_glu{" +
                "glu_id=" + glu_id +
                ", glu_date='" + glu_date + '\'' +
                ", glu=" + glu +
                ", glu_note='" + glu_note + '\'' +
                ", id_user=" + id_user +
                '}';
    }
}
