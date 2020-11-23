package com.example.cse412project;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondFragment extends Fragment {
    //View view;
    //Button button5;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        //view = inflater.inflate(R.layout.fragment_second, container, false);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //create string for URL for the Java Database Connectivity API.
        //We assume the postgresql server is localhost, port is 5432, and database name is cse412project
        String jdbcURL = "jdbc:postgresql://10.0.2.2:5432/cse412project";
        //we need the username and password for the server
        String username = "postgres";
        String password = "XXXXX";
        //Button button5 = (Button)view.findViewById(R.id.button5);
        try{
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            Log.d("Connection established", "Connection established");
            //button5.setText("YES");
            connection.close();
        }
        catch (SQLException e){
            Log.d("ERROR", "ERROR! Could not connect");
            String s = e.getMessage();
            //button5.setText(s);
            Log.e("APP", "exception", e);
        }
        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}