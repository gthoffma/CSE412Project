package com.example.cse412project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        //create string for URL for the Java Database Connectivity API.
        //We assume the postgresql server is localhost, port is 5432, and database name is cse412project
        String jdbcURL = "jdbc:postgresql://localhost:5432/cse412project";
        //we need the username and password for the server
        String username = "postgres";
        String password = "";
        try{
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            System.out.println("Connection established");
            connection.close();
        }
        catch (SQLException e){
            System.out.println("ERROR! Cannot connect");
            e.printStackTrace();
        }

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }
}