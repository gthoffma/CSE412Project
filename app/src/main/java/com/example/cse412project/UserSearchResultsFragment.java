package com.example.cse412project;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import java.lang.*;

public class UserSearchResultsFragment extends Fragment {

    public Appuser currentUser = new Appuser("John Fischer", "1998-05-03", "1", "JFisch@gmail.com", "pass1245", 1, "Lafayette Louisiana");


    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        findProfileImage();
        View view = inflater.inflate(R.layout.fragment_user_search_results, container, false);
        ImageView profileImage = (ImageView) view.findViewById(R.id.ProfileImageView);

        if(currentUser.m_profileImage == 1){
            profileImage.setImageResource(R.drawable.dogphoto);
        }else if(currentUser.m_profileImage == 2){
            profileImage.setImageResource(R.drawable.birdphoto);
        }else if(currentUser.m_profileImage == 3){
            profileImage.setImageResource(R.drawable.aleinphoto);
        }else if(currentUser.m_profileImage == 4){
            profileImage.setImageResource(R.drawable.koalaphoto);
        }else if(currentUser.m_profileImage == 5){
            profileImage.setImageResource(R.drawable.owlphoto);
        }else{

        }

        return view;
    }


    public void findProfileImage(){


    }

}
