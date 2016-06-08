package exhaustedcoders.heartrate;

import android.widget.ImageView;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by cidseuser on 6/7/2016.
 */
public class StoreBPM extends SugarRecord {
    int bpm = 0;
    String date = "";
    int moodId = -1;
    int exerciseId = -1;

    public StoreBPM(){
    }

    public StoreBPM(int bpm, String date, int moodId, int exerciseId){
        this.bpm = bpm;
        this.date = date;
        this.moodId = moodId;
        this.exerciseId = exerciseId;
    }
}
