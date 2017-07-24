package phaseshift.com.demophase;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.preference.PreferenceManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import phaseshift.com.demophase.Interactor.CallBack;
import phaseshift.com.demophase.Interactor.Manager;
import phaseshift.com.demophase.databinding.AppBarDepartmentBinding;


public class DepartmentActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    public static Manager manager;
    Context context;

    private AppBarDepartmentBinding binding;

    public static final String PREF_KEY_FIRST_START = "com.heinrichreimersoftware.materialintro.demo.PREF_KEY_FIRST_START";
    public static final int REQUEST_CODE_INTRO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.app_bar_department);

        setSupportActionBar(binding.toolbar);

        boolean firstStart = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(PREF_KEY_FIRST_START, true);

        if (firstStart) {
            Intent intent = new Intent(this, SplashIntroActivity.class);
            startActivityForResult(intent, REQUEST_CODE_INTRO);
        }

        setContentView(R.layout.activity_department);
        context=this;
        manager = Manager.getInstance();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.department);


        manager.CallBack(new CallBack() {
            @Override
            public void success() {
                CallMe();
            }

            @Override
            public void failed() {
                Toast toast = Toast.makeText(DepartmentActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT);
                toast.show();
            }

            @Override
            public void noNet() {
                Toast toast = Toast.makeText(DepartmentActivity.this, "No Internet", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        manager.apiCall();
    }

    private void CallMe()
    {

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_finish, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.department) {
//            goToMyUnit(this);

        } else if (id == R.id.category) {
//            goToProjects(context);
        } else if (id == R.id.day) {
//            goToProjectUpdate(context);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_INTRO) {
            if (resultCode == RESULT_OK) {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, false)
                        .apply();
            } else {
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean(PREF_KEY_FIRST_START, true)
                        .apply();
                //User cancelled the intro so we'll finish this activity too.
                finish();
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_reset_first_start) {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                    .putBoolean(PREF_KEY_FIRST_START, true)
                    .apply();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
