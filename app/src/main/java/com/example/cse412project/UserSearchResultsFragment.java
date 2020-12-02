package com.example.cse412project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;

import androidx.annotation.Nullable;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.snackbar.Snackbar;

import java.lang.*;



public class UserSearchResultsFragment extends Fragment {
    public Appuser currentUser = new Appuser("John Fischer", "1998-05-03", "1", "JFisch@gmail.com", "pass1245", 1, "Lafayette Louisiana");

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_search_results, container, false);
        ImageView profileImage = (ImageView) view.findViewById(R.id.profileImage);
        TextView name = (TextView) view.findViewById(R.id.nameText);
        TextView birthday = (TextView) view.findViewById(R.id.birthdateText);

        name.setText("Bella Lupea");
        birthday.setText("1999-03-01");
        profileImage.setImageResource(R.drawable.dogphoto);

        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Friend request has been sent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        return view;
    }
}
