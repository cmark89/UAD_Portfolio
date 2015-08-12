package com.objectivelyradical.uad_portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchSpotifyStreamer(View view) {
        showToast("Under development.  Maybe forever.");
    }

    public void launchFootballScores(View view) {
        showToast("I don't know how football works, and I refuse to learn.");
    }

    public void launchCyberLibrarian(View view) {
        showToast("TODO: make a piercing sound whenever this app is launched.");
    }

    public void launchBuildItBigger(View view) {
        showToast("The most exciting application of them all!");
    }

    public void launchXyzReader(View view) {
        showToast("ZYX!");
    }

    public void launchCapstone(View view) {
        showToast("Draft idea: flagpole-sitting simulator");
    }

    private void showToast(String text) {
        Context c = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(c, text, duration).show();
    }
}
