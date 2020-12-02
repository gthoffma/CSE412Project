package com.example.cse412project;

import android.media.Image;

public class Appuser {
    public String m_name;
    public String m_birthdate;
    public String m_userid;
    public String m_email;
    public String m_password;
    public int m_profileImage;
    public String m_location;
    public Appuser(String name, String birthdate, String userid, String email, String password, int profileImage, String location){
        m_name = name;
        m_birthdate = birthdate;
        m_userid = userid;
        m_email = email;
        m_password = password;
        m_profileImage = profileImage;
        m_location = location;
    }
}
