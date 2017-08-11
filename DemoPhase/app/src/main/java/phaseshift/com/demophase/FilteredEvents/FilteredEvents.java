package phaseshift.com.demophase.FilteredEvents;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import phaseshift.com.demophase.AboutBMS.AboutBMSActivity;
import phaseshift.com.demophase.AboutPS.AboutPSActivity;
import phaseshift.com.demophase.EventDetail.EventDetailActivity;
import phaseshift.com.demophase.Events.CustomAdapter;
import phaseshift.com.demophase.Events.EventsActivity;
import phaseshift.com.demophase.Events.Interactor.Manager;
import phaseshift.com.demophase.Events.Model.Data;
import phaseshift.com.demophase.Map.MapsActivity;
import phaseshift.com.demophase.R;
import phaseshift.com.demophase.Team.TeamActivity;
import phaseshift.com.demophase.WorkshopDetail.WorkshopDetailActivity;

public class FilteredEvents extends AppCompatActivity
        implements FilteredEventsRouter,NavigationView.OnNavigationItemSelectedListener{
    Context context;
    public static Manager manager;
    String cat;
    String day;
    String dept;
    Data[] selectedData1;
    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtered_events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        context=this;

        manager = Manager.getInstance();

        String x = getIntent().getStringExtra("Activity");
        cat = getIntent().getStringExtra("Category");
        day = getIntent().getStringExtra("Day");
        dept = getIntent().getStringExtra("Department");

        if(x == null)
        {
            x = "hell";
        }
        if (x.equalsIgnoreCase("filter")==true)
        {
            filter();
        }
    }
    public void filter()
    {
//        Toast toast = Toast.makeText(EventsActivity.this, day+cat+dept, Toast.LENGTH_LONG);
//        toast.show();
        final ArrayList<Data> dataDay = new ArrayList<Data>();
        selectedData1 = new Data[1];

        if(day.equalsIgnoreCase("day1"))
        {
            for(int i = 0;i<manager.DataWrapper.getData().size();i++) {
                if (manager.DataWrapper.getData().get(i).getDay().equalsIgnoreCase("day1"))
                    dataDay.add(manager.DataWrapper.getData().get(i));
            }
        }
        else if(day.equalsIgnoreCase("day2"))
        {
            for(int i = 0;i<manager.DataWrapper.getData().size();i++) {
                if (manager.DataWrapper.getData().get(i).getDay().equalsIgnoreCase("day2"))
                    dataDay.add(manager.DataWrapper.getData().get(i));
            }
        }
        else
        {
            for(int i = 0;i<manager.DataWrapper.getData().size();i++)
            {
                    dataDay.add(manager.DataWrapper.getData().get(i));
            }
        }
        ArrayList<Data> dataCat=new ArrayList<Data>();
        if(cat.equalsIgnoreCase("event"))
        {
            for(int i=0;i<dataDay.size();i++)
            {
                if(dataDay.get(i).getCategory().equalsIgnoreCase("Event"))
                    dataCat.add(dataDay.get(i));
            }
        }
        else if(cat.equalsIgnoreCase("workshop"))
        {
            for(int i=0;i<dataDay.size();i++)
                {
                    if(dataDay.get(i).getCategory().equalsIgnoreCase("Workshop"))
                        dataCat.add(dataDay.get(i));
                }
        }
        else
        {
            for(int i=0;i<dataDay.size();i++)
            {
                dataCat.add(dataDay.get(i));
            }
        }



        final ArrayList<Data> dataDept=new ArrayList<Data>();
        if(dept.equalsIgnoreCase("arch"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Architecture"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("biotech"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Biotechnology"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("ChemEgg"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Chemical Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("chem"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Chemistry"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("civil"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Civil Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("comapp"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("MCA"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("compegg"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Computer Science and Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("eee"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Electronics and Electrical Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("ece"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Electronics and Communication Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("iem"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Industrial Engineering and Management"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("ise"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Information Science and Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("eie"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Electronics and Instrumentation Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("Math"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Mathematics"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("Mech"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Mechanical Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("phys"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Physics"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("Me"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Medical Electronics"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("TCE"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("Telecommunication Engineering"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else if(dept.equalsIgnoreCase("Mba"))
        {
            for(int i=0;i<dataCat.size();i++)
            {
                if(dataCat.get(i).getDepartment().equalsIgnoreCase("MBA"))
                    dataDept.add(dataCat.get(i));
            }
        }
        else
        {
            for(int i=0;i<dataCat.size();i++)
            {
                dataDept.add(dataCat.get(i));
            }
        }
        listView1 = (ListView) findViewById(R.id.filterEventListView);
        populateListView(dataDept);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedData1[0] = dataDept.get(position);
                if(selectedData1[0].getCategory().equalsIgnoreCase("event"))
                    goToEventDetails(context,selectedData1[0]);
                else
                    goToWorkshopDetails(context,selectedData1[0]);
            }
        });
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
    private void populateListView(ArrayList<Data> data) {
        listView1.setAdapter((new CustomAdapter(context,data)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Events) {
            goToEvents(this);
            finish();

        } else if (id == R.id.Team) {
            goToTeam(context);
            finish();
        } else if (id == R.id.Map) {
            goToMaps(context);
            finish();
        }
        else if (id == R.id.AboutBMSCE) {
            goToAboutBMS(context);
            finish();
        }
        else if (id == R.id.AboutPS) {
            goToAboutPS(context);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void goToMaps(Context context) {
        Intent intent=new Intent(context, MapsActivity.class);
        startActivity(intent);

    }

    @Override
    public void goToAboutBMS(Context context) {
        Intent intent=new Intent(context, AboutBMSActivity.class);
        startActivity(intent);

    }

    @Override
    public void goToTeam(Context context) {
        Intent intent=new Intent(context, TeamActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToAboutPS(Context context) {
        Intent intent=new Intent(context, AboutPSActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToEvents(Context context) {
        Intent intent=new Intent(context, EventsActivity.class);
        startActivity(intent);
    }

    public void goToEventDetails(Context context, Data event) {
        Intent intent = new Intent(context,EventDetailActivity.class);
        intent.putExtra("event",event);
        startActivity(intent);
    }
    public void goToWorkshopDetails(Context context, Data data)
    {
        Intent intent = new Intent(context,WorkshopDetailActivity.class);
        intent.putExtra("event",data);
        startActivity(intent);
    }
}

