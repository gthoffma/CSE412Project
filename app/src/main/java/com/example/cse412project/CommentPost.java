package com.example.cse412project;

public class CommentPost {
    public int m_commentImage;
    public String m_commentID;
    public String m_time;
    public String m_message;
    public String m_userID;
    public CommentPost(int commentImage, String commentID, String time, String message, String userID){
        m_commentImage = commentImage;
        m_commentID = commentID;
        m_time = time;
        m_message = message;
        m_userID = userID;
    }
}
