package exhaustedcoders.heartrate;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by cidseuser on 1/30/2016.
 */
public class Settings extends Activity {
    @Bind(R.id.age) MaterialEditText age;
    @Bind(R.id.weight) MaterialEditText weight;
    @Bind(R.id.targetHeartRate) TextView targetHeartRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        age.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable mEdit) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

    public double targetHeartRate(int age, int weight) {
        return age * weight;
    }

    public double restingHeartRate(int age, int weight) {
        return 0;
    }
}