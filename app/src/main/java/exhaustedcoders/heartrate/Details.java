package exhaustedcoders.heartrate;

import com.orm.SugarRecord;

/**
 * Created by cidseuser o
 * n 6/9/2016.
 */
public class Details extends SugarRecord {

    String date = "";
    public Details(){

    }

    public Details(String date){
        this.date = date;
    }
}
