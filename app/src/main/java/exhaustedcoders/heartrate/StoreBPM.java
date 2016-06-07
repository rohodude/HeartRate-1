package exhaustedcoders.heartrate;

import com.orm.SugarRecord;

/**
 * Created by cidseuser on 6/7/2016.
 */
public class StoreBPM extends SugarRecord {
    int bpm = 0;

    public StoreBPM(){
    }

    public StoreBPM(int bpm){
        this.bpm = bpm;
    }
}
