package exhaustedcoders.heartrate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;

/**
 * Created by cosorio on 1/30/2016.
 */
public class HeartRate extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(HeartRate.this);
        TextView textView;
    }
}
