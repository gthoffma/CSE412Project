package com.example.cse412project;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.example.cse412project.ui.login.*;

public class SecondFragment extends Fragment {
    View view;
    Button button;
    Data d = new Data();
    public int currentUserID;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //button = (Button)view.findViewById(R.id.buttontest);
        currentUserID = Integer.parseInt(getArguments().getString("userID"));
        //currentUserID = Integer.parseInt(tv.getText().toString());
        //button.setText(Integer.toString(currentUserID));
        EditText personName = (EditText)view.findViewById(R.id.editTextTextPersonName);
        personName.setText(d.Appusers.get(currentUserID).m_name + " (You)");
        EditText birthdate = (EditText)view.findViewById(R.id.editTextTextPersonName4);
        birthdate.setText("Birthdate: " + d.Appusers.get(currentUserID).m_birthdate);
        EditText email = (EditText)view.findViewById(R.id.editTextTextPersonName5);
        email.setText("Email: " + d.Appusers.get(currentUserID).m_email);
        EditText loc = (EditText)view.findViewById(R.id.editTextTextPersonName6);
        loc.setText("Location: " + d.Appusers.get(currentUserID).m_location);
        EditText profession = (EditText)view.findViewById(R.id.editTextTextPersonName7);
        String Profs = "";
        for(int i = 0; i < d.HasProfessions.size(); i++){
            if(Integer.parseInt(d.HasProfessions.get(i).m_userID) == currentUserID+1){
                String s = "";
                if(Profs.equals(s)){
                    Profs += d.HasProfessions.get(i).m_professionName;
                }
                else{
                    Profs += " and " + d.HasProfessions.get(i).m_professionName;
                }

            }
        }
        profession.setText("Profession(s): " + Profs);

        view.findViewById(R.id.button_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_UserProfileFragment_to_loginFragment);
            }
        });
        view.findViewById(R.id.button_user_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_UserProfileFragment_to_UserSearchFragment);
            }
        });
        view.findViewById(R.id.button_make_post).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id. action_UserProfileFragment_to_newPostFragment);
            }
        });
    }


}