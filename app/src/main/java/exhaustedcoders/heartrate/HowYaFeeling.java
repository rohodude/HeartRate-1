package exhaustedcoders.heartrate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;

/**
 * Created by cidseuser on 2/20/2016.
 */
public class HowYaFeeling extends Activity {
    private int bpm = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.howyafeeling);
        ButterKnife.bind(HowYaFeeling.this);
        TextView textView;

        Intent intent = getIntent();
        bpm = intent.getIntExtra("BPM", 0);
    }
}