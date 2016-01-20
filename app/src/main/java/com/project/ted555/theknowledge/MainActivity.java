package com.project.ted555.theknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] days = {"Asean","Asean","Asean","Asean","Asean","Asean","Asean"};
    int[] images = {
            R.drawable.flag_of_asean,
            R.drawable.flag_of_asean,
            R.drawable.flag_of_asean,
            R.drawable.flag_of_asean,
            R.drawable.flag_of_asean,
            R.drawable.flag_of_asean,
    };

    GridCustomAdapter mGridCustomAdapter;
    GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        mGridCustomAdapter = new GridCustomAdapter(getApplicationContext(), days, images);
        mGridView = (GridView)findViewById(R.id.my_grid_view);
        mGridView.setAdapter(mGridCustomAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share){

            Toast.makeText(MainActivity.this,"Share Action",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
