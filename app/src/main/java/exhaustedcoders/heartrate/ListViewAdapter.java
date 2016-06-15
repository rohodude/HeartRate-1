package exhaustedcoders.heartrate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cidseuser on 6/9/2016.
 */
public class ListViewAdapter extends BaseAdapter {
    String [] result;
    private static LayoutInflater inflater=null;
    Context context;
    List<StoreBPM> storeBPMs;

    public ListViewAdapter(MainActivity mainActivity) {
        // TODO Auto-generated constructor stub
        context=mainActivity;
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        storeBPMs = StoreBPM.listAll(StoreBPM.class);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return storeBPMs.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView dateView, bpmView;
        ImageView exerciseView, moodView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        StoreBPM storeBPM = storeBPMs.get(position);
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.indiv_listview, null);
        holder.dateView=(TextView) rowView.findViewById(R.id.dateView);
        holder.exerciseView=(ImageView) rowView.findViewById(R.id.exerciseView);
        holder.bpmView=(TextView) rowView.findViewById(R.id.bpmView);
        holder.moodView=(ImageView) rowView.findViewById(R.id.moodView);
        holder.dateView.setText(storeBPM.date);
        holder.exerciseView.setImageResource(getImageView(storeBPM.exerciseId));
        holder.moodView.setImageResource(getImageView(storeBPM.moodId));
        holder.bpmView.setText(storeBPM.bpm + " BPM");
        /*rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        }); */
        return rowView;
    }

    private int getImageView(int id) {
        switch (id) {
            case 0:
                return R.mipmap.happy;

            case 1:
                return R.mipmap.eh;

            case 2:
                return R.mipmap.sad;

            case 3:
                return R.mipmap.relaxing_dude;

            case 4:
                return R.mipmap.running_dude;

            default:
                return R.mipmap.eh;
        }
    }
}
