package exhaustedcoders.heartrate;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by cidseuser on 6/8/2016.
 */
public class MoodExercise extends AppCompatActivity {
    int bpm = -1;
    String date = "";
    int moodId = -1;
    int exerciseId = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood_exercise);
        ButterKnife.bind(MoodExercise.this);
        Intent intent = getIntent();
        bpm = intent.getIntExtra("BPM", 0);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd");
        Date date = new Date();
        this.date = dateFormat.format(date).toString();
    }

    public void onMoodClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.happy:
                if (checked) moodId = 0;
                break;
            case R.id.eh:
                if (checked) moodId = 1;
                break;
            case R.id.sad:
                if (checked) moodId = 2;
                break;

        }
    }

    public void onExerciseClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.running:
                if (checked) exerciseId = 3;
                break;
            case R.id.relaxed:
                if (checked) exerciseId = 4;
                break;
        }
    }

    public void click(View view) {
        Log.e("TAG : -","I was clicked");
        // Toast.makeText(this,"I was clicked",Toast.LENGTH_SHORT).show();
        StoreBPM storeBPM = new StoreBPM(bpm, date, moodId, exerciseId);
        storeBPM.setBpm(bpm);
        storeBPM.setDate(date);
        storeBPM.setMoodId(moodId);
        storeBPM.setExerciseId(exerciseId);
        //Details details = new Details("hello");
        storeBPM.save();
    }
}