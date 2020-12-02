package com.example.cse412project;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog deviceAlreadyRegistered = new AlertDialog.Builder(MainActivity.this).create();
                deviceAlreadyRegistered.setTitle("Friend Request");
                deviceAlreadyRegistered.setMessage("You have a friend request from Drake Scott");
                deviceAlreadyRegistered.setButton(AlertDialog.BUTTON_POSITIVE, "Accept",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        deviceAlreadyRegistered.dismiss();
                    }
                });
                deviceAlreadyRegistered.setButton(AlertDialog.BUTTON_NEGATIVE, "Decline",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        deviceAlreadyRegistered.dismiss();
                    }
                });
                deviceAlreadyRegistered.show();
            }
        });
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
}