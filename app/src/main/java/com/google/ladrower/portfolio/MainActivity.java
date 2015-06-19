package com.google.ladrower.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Random;
import java.util.logging.Logger;


public class MainActivity extends ActionBarActivity {

    private static final String LOG = MainActivity.class.getName();

    protected Toast toast;

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

    public void onLaunchClick(View view) {
        view.getId();
        switch (view.getId()) {
            case R.id.buttonSpotify:
                showToast("This will launch Spotify App");
                break;
            case R.id.buttonScores:
                showToast("This will launch Scores App");
                break;
            case R.id.buttonLibrary:
                showToast("This will launch Library App");
                break;
            case R.id.buttonBuildItBigger:
                showToast("This will launch Build It Bigger App");
                break;
            case R.id.buttonReader:
                showToast("This will launch Reader App");
                break;
            case R.id.buttonMyApp:
                showToast("This will launch My App");
                break;
        }
    }

    protected void showToast(String text) {
        if (toast!= null) {
            toast.cancel();
        }
        Context context = getApplicationContext();
        toast = Toast.makeText(context, text , Toast.LENGTH_SHORT);
        toast.show();
    }
}
