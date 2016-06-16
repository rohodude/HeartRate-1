package exhaustedcoders.heartrate;

import android.content.Context;
import android.widget.ImageView;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by cidseuser on 6/7/2016.
 */
public class StoreBPM extends SugarRecord {
    int bpm;
    String date;
    int moodId;
    int exerciseId;
    String comment;

    public StoreBPM(){
    }

    public StoreBPM (int bpm, String date, int moodId, int exerciseId, String comment){
        this.bpm = bpm;
        this.date = date;
        this.moodId = moodId;
        this.exerciseId = exerciseId;
        this.comment = comment;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMoodId() {
        return moodId;
    }

    public void setMoodId(int moodId) {
        this.moodId = moodId;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }
}
