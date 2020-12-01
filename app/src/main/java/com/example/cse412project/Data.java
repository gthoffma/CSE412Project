package com.example.cse412project;

import java.util.ArrayList;

public class Data {
    public ArrayList<Appuser> Appusers = new ArrayList<Appuser>(20);
    public ArrayList<Befriended> Befriendeds = new ArrayList<Befriended>(5);
    public ArrayList<Profession> Professions = new ArrayList<Profession>(5);
    public ArrayList<HasProfession> HasProfessions = new ArrayList<HasProfession>(5);
    public ArrayList<CommentPost> CommentPosts = new ArrayList<CommentPost>(5);
    public ArrayList<Replies> Repliess = new ArrayList<Replies>(5);
    public Data(){
        Appusers.add(new Appuser("John Doe", "123", "1", "123@gmail.com", "pass", 1, "Tempe"));
        Appusers.add(new Appuser("Bella Lupea", "1999-03-01", "2", "Blup99@gmail.com", "Kilair43", 2, "Phoenix AZ"));
        Appusers.add(new Appuser("Alejandro Alexei", "1987-12-21", "3", "AlejandroAlexei87@hotmail.com", "Panthers06", 3, "Peoria IL"));
        Appusers.add(new Appuser("Armand Hunt", "2001-9-05", "4", "AHunt.3@hotmail.com", "jerusalem393",4, "London UK"));
        Appusers.add(new Appuser("Isadore Jean-Francois", "1973-9-03", "5", "Alphonse3153@gmail.com", "52558000aaa", 5, "Lyon FR"));
        

    }
}
