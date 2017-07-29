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
        RadioGroup day = (RadioGroup) findViewById(R.id.Day);
        RadioGroup department = (RadioGroup) findViewById(R.id.Department);
        final Button apply = (Button) findViewById(R.id.applyBtn);

        final CheckBox cb_events = (CheckBox) findViewById(R.id.CB_events);
        final CheckBox cb_workshop = (CheckBox) findViewById(R.id.CB_workshops);
        final CheckBox cb_day1 = (CheckBox) findViewById(R.id.CB_day1);
        final CheckBox cb_day2 = (CheckBox) findViewById(R.id.CB_day2);

        final CheckBox cb_arch=(CheckBox)findViewById(R.id.CB_arch);
        final CheckBox cb_biotech=(CheckBox)findViewById(R.id.CB_biotech);
        final CheckBox cb_chemEgg=(CheckBox)findViewById(R.id.CB_chemEgg);
        final CheckBox cb_chem=(CheckBox)findViewById(R.id.CB_chem);
        final CheckBox cb_civil=(CheckBox)findViewById(R.id.CB_civil);
        final CheckBox cb_comApp=(CheckBox)findViewById(R.id.CB_compApp);
        final CheckBox cb_compEgg=(CheckBox)findViewById(R.id.CB_compEgg);
        final CheckBox cb_eee=(CheckBox)findViewById(R.id.CB_eee);
        final CheckBox cb_ece=(CheckBox)findViewById(R.id.CB_ece);
        final CheckBox cb_iem=(CheckBox)findViewById(R.id.CB_iem);
        final CheckBox cb_ise=(CheckBox)findViewById(R.id.CB_ise);
        final CheckBox cb_eie=(CheckBox)findViewById(R.id.CB_eie);
        final CheckBox cb_math=(CheckBox)findViewById(R.id.CB_math);
        final CheckBox cb_mech=(CheckBox)findViewById(R.id.CB_mech);
        final CheckBox cb_me=(CheckBox)findViewById(R.id.CB_me);
        final CheckBox cb_phys=(CheckBox)findViewById(R.id.CB_phys);
        final CheckBox cb_tce=(CheckBox)findViewById(R.id.CB_tce);

        final boolean[] flag = {false};
        cb_events.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && cb_workshop.isChecked() == true) {
                    cb_workshop.setChecked(false);
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == true && cb_workshop.isChecked() == false) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_workshop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && cb_events.isChecked() == true) {
                    cb_events.setChecked(false);
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == true && cb_events.isChecked() == false) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_day1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && cb_day2.isChecked() == true) {
                    cb_day2.setChecked(false);
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == true && cb_day2.isChecked() == false) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_day2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && cb_day1.isChecked() == true) {
                    cb_day1.setChecked(false);
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == true && cb_day1.isChecked() == false) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });



        cb_arch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_biotech.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_chemEgg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_chem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_civil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_comApp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()||
                        cb_compEgg.isChecked()|| cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_compEgg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_eee.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_ece.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_iem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_ise.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_eie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_math.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_mech.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_me.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_me.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_phys.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_phys.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_phys.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_tce.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_tce.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb_tce.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true && (cb_arch.isChecked() || cb_biotech.isChecked() || cb_chemEgg.isChecked()|| cb_chem.isChecked()||cb_civil.isChecked()|| cb_comApp.isChecked()||
                        cb_compEgg.isChecked()||cb_eee.isChecked()|| cb_ece.isChecked() || cb_iem.isChecked() || cb_ise.isChecked() || cb_eie.isChecked() || cb_math.isChecked()
                        || cb_mech.isChecked() || cb_me.isChecked() || cb_phys.isChecked()))
                {
                    cb_arch.setChecked(false);
                    cb_biotech.setChecked(false);
                    cb_chemEgg.setChecked(false);
                    cb_chem.setChecked(false);
                    cb_civil.setChecked(false);
                    cb_comApp.setChecked(false);
                    cb_compEgg.setChecked(false);
                    cb_eee.setChecked(false);
                    cb_ece.setChecked(false);
                    cb_iem.setChecked(false);
                    cb_ise.setChecked(false);
                    cb_eie.setChecked(false);
                    cb_math.setChecked(false);
                    cb_mech.setChecked(false);
                    cb_me.setChecked(false);
                    cb_phys.setChecked(false);

                    apply.setVisibility(View.VISIBLE);
                }
                else if (isChecked == true) {
                    apply.setVisibility(View.VISIBLE);
                }
                if (isChecked == false) {
                    apply.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
