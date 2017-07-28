package phaseshift.com.demophase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

//        final CompoundButton category=(CompoundButton) findViewById(R.id.Category);
        RadioGroup day=(RadioGroup)findViewById(R.id.Day);
        RadioGroup department=(RadioGroup)findViewById(R.id.Department);
        final Button apply=(Button)findViewById(R.id.applyBtn);

        final CheckBox cb_events = (CheckBox) findViewById(R.id.CB_events);
        final CheckBox cb_workshop = (CheckBox) findViewById(R.id.CB_workshops);
        final boolean[] flag = {false};

//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);
//        RadioButton rb_events = (RadioButton) findViewById(R.id.RB_events);




        department.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup department, int checkedId) {

                if (checkedId != -1)
                    apply.setVisibility(View.VISIBLE);
                else
                    apply.setVisibility(View.INVISIBLE);
            }
        });
        day.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup day, int checkedId) {

                if (checkedId != -1)
                    apply.setVisibility(View.VISIBLE);
                else
                    apply.setVisibility(View.INVISIBLE);
            }
        });
    }


}
