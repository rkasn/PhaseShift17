package phaseshift.com.demophase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        RadioGroup category=(RadioGroup)findViewById(R.id.Category);
//        RadioGroup day=(RadioGroup)findViewById(R.id.Day);
//        RadioGroup department=(RadioGroup)findViewById(R.id.Department);
//        final Button apply=(Button)findViewById(R.id.applyBtn);
//        category.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup category, int checkedId) {
//
//                if (checkedId != -1)
//                    apply.setVisibility(View.VISIBLE);
//                else
//                    apply.setVisibility(View.INVISIBLE);
//            }
//        });
//        department.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup department, int checkedId) {
//
//                if (checkedId != -1)
//                    apply.setVisibility(View.VISIBLE);
//                else
//                    apply.setVisibility(View.INVISIBLE);
//            }
//        });
//        day.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup day, int checkedId) {
//
//                if (checkedId != -1)
//                    apply.setVisibility(View.VISIBLE);
//                else
//                    apply.setVisibility(View.INVISIBLE);
//            }
//        });
    }


}
