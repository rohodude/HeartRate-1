package exhaustedcoders.heartrate;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by cidseuser on 1/30/2016.
 */
public class Settings extends AppCompatActivity {

    MaterialBetterSpinner materialBetterSpinner;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        ButterKnife.bind(this);

        materialBetterSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner);
        imageView = (ImageView) findViewById(R.id.imageView3);

        String[] list = getResources().getStringArray(R.array.age);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, list);

        materialBetterSpinner.setAdapter(adapter);
        materialBetterSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) imageView.setImageResource(R.drawable.selected_twenty);
                else if (i == 1) imageView.setImageResource(R.drawable.selected_twenty_five);
                else if (i == 2) imageView.setImageResource(R.drawable.selected_thirty);
                else if (i == 3) imageView.setImageResource(R.drawable.selected_thirty_five);
                else if (i == 4) imageView.setImageResource(R.drawable.selected_forty);
                else if (i == 5) imageView.setImageResource(R.drawable.selected_forty_five);
                else if (i == 6) imageView.setImageResource(R.drawable.selected_fifty);
                else if (i == 7) imageView.setImageResource(R.drawable.selected_fifty_five);
                else if (i == 8) imageView.setImageResource(R.drawable.selected_sixty);
                else if (i == 9) imageView.setImageResource(R.drawable.selected_sixty_five);
                else if (i == 10) imageView.setImageResource(R.drawable.selected_seventy);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}