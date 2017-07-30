package phaseshift.com.demophase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import phaseshift.com.demophase.Events.Model.Data;

public class EventDetailActivity extends AppCompatActivity {

    Data data;
    SliderLayout imageSlider;
    TextView eventName;
    TextView dept;
    TextView desc;
    TextView winner;
    TextView runnerUp;
    TextView venue;
    TextView date;
    TextView time;
    TextView coord1;
    TextView num1;
    TextView coord2;
    TextView num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        data = new  Data();

        data = getIntent().getParcelableExtra("event");


        eventName = (TextView) findViewById(R.id.event_name);
        dept = (TextView) findViewById(R.id.dept);
        desc = (TextView) findViewById(R.id.desc);
        winner = (TextView) findViewById(R.id.winner);
        runnerUp = (TextView) findViewById(R.id.runner_up);
        venue = (TextView) findViewById(R.id.venue);
        date = (TextView) findViewById(R.id.date);
        time = (TextView) findViewById(R.id.time);
        coord1 = (TextView) findViewById(R.id.coord_1);
        coord2 = (TextView) findViewById(R.id.coord_2);
        num1 = (TextView) findViewById(R.id.num_1);
        num2 = (TextView) findViewById(R.id.num_2);
        imageSlider = (SliderLayout) findViewById(R.id.slider);

        DefaultSliderView SliderView1 = new DefaultSliderView(this);
        SliderView1
                .image(R.drawable.app_icon);
        DefaultSliderView SliderView2 = new DefaultSliderView(this);
        SliderView2
                .image(R.drawable.app_logo);

        imageSlider.addSlider(SliderView1);
        imageSlider.addSlider(SliderView2);

        imageSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        imageSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        imageSlider.setCustomAnimation(new DesAnimation());
        imageSlider.setDuration(2000);

        populate();
    }

    private void populate() {
        eventName.setText(data.getName_of_event());
        dept.setText(data.getDepartment());
        desc.setText(data.getDescription());
        winner.setText(data.getWinner());
        runnerUp.setText(data.getRunner_up());
        venue.setText(data.getVenue());
        date.setText(data.getDay());
        time.setText(data.getTime());
        coord1.setText(data.getCoordinator_one());
        num1.setText(data.getPhone_one());
        coord2.setText(data.getCoodinator_two());
        num2.setText(data.getPhone_two());
    }
}
