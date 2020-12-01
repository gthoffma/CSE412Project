package com.example.cse412project;

public class Befriended {
    public String m_userID1;
    public String m_userID2;
    public String m_sentToUser;
    public String m_sentFromUser;
    public char m_accepted;
    public Befriended(String userID1, String userID2, String sentToUser, String sentFromUser, char accepted){
        m_userID1 = userID1;
        m_userID2 = userID2;
        m_sentToUser = sentToUser;
        m_sentFromUser = sentFromUser;
        m_accepted = accepted;
    }
}
