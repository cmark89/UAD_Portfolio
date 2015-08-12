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
        showToast(getString(R.string.button_1_toast));
    }

    public void launchFootballScores(View view) {
        showToast(getString(R.string.button_2_toast));
    }

    public void launchCyberLibrarian(View view) {
        showToast(getString(R.string.button_3_toast));
    }

    public void launchBuildItBigger(View view) {
        showToast(getString(R.string.button_4_toast));
    }

    public void launchXyzReader(View view) {
        showToast(getString(R.string.button_5_toast));
    }

    public void launchCapstone(View view) {
        showToast(getString(R.string.button_6_toast));
    }

    private void showToast(String text) {
        Context c = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(c, text, duration).show();
    }
}
