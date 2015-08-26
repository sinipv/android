package com.example.app.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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

    public void showMessage(View view){

        final int id = view.getId();

        switch (id) {
            case R.id.button:
                showToast("This button will launch my Spotify streamer");
                break;

            case R.id.button2:
                showToast("This button will launch my Scores App");
                break;

            case R.id.button3:
                showToast("This button will launch my Library App");
                break;

            case R.id.button4:
                showToast("This button will launch my Build It Bigger App");
                break;

            case R.id.button5:
                showToast("This button will launch my XYZ Reader App");
                break;

            case R.id.button6:
                showToast("This button will launch my Capstone App");
                break;
        }

    }
    public void showToast(String toastMessage){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastMessage, duration);
        toast.show();
    }
}
