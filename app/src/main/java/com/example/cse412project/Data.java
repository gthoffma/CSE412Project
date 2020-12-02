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
        Appusers.add(new Appuser("John Fischer", "1998-05-03", "1", "JFisch@gmail.com", "pass1245", 1, "Lafayette Louisiana"));
        Appusers.add(new Appuser("Bella Lupea", "1999-03-01", "2", "Blup99@gmail.com", "Kilair43", 2, "Phoenix AZ"));
        Appusers.add(new Appuser("Alejandro Alexei", "1987-12-21", "3", "AlejandroAlexei87@hotmail.com", "Panthers06", 3, "Peoria IL"));
        Appusers.add(new Appuser("Armand Hunt", "2001-9-05", "4", "AHunt.3@hotmail.com", "jerusalem393",4, "London UK"));
        Appusers.add(new Appuser("Isadore Jean-Francois", "1973-9-03", "5", "Alphonse3153@gmail.com", "52558000aaa", 5, "Lyon FR"));
        Appusers.add(new Appuser("Jimmy Page", "1981-5-27", "6", "ShipofTheseus145@aol.com", "Iamthelegend1!", 6, "Groningen NL"));
        Appusers.add(new Appuser("Karah Lundh", "1993-6-26", "7", "klundh93@gmail.com", "obstacle25", 7, "Seattle WA"));
        Appusers.add(new Appuser("Jerrome Marcelo", "1992-2-29", "8", "jmarc352@gmail.com", "a1amans0r", 8, "Lisbon PT"));
        Appusers.add(new Appuser("Agna Mackenzie", "2000-9-20", "9", "AgnaMack00@gmail.com", "455tens0rflow", 9, "Nowhere AK"));
        Appusers.add(new Appuser("Jillene Elizabeth", "1991-3-14", "10", "jliz22885@hotmail.com", "password12345", 10, "Seattle WA"));
        Appusers.add(new Appuser("Megan Grier", "1985-2-21", "11", "MGrier@gmail.com", "alax43pass", 11, "Richmond VA"));
        Appusers.add(new Appuser("Francine Zara", "1999-11-11", "12", "Elans.tesoFZ52@gmail.com", "Z1lv1a", 12, "Anaheim CA"));
        Appusers.add(new Appuser("Drake Scott", "1979-01-23", "13", "DrakeScott711@gmail.com", "016294ScottVLV!", 13, "Detroit MI"));
        Appusers.add(new Appuser("Johnathan Price", "1951-04-27", "14", "JPrice@aol.com", "Elizabeth!1", 14, "Fresno CA"));
        Appusers.add(new Appuser("Frederick Guido", "1989-05-08", "15", "FGuido@gmail.com", "teemteem97", 15, "Durham NC"));
        Appusers.add(new Appuser("John Doe", "1998-02-17", "16", "johndoe@gmail.com", "newPassword", 16, "Phoenix, AZ"));

        Befriendeds.add(new Befriended("5", "6", "6", "5", 'Y'));
        Befriendeds.add(new Befriended("1", "2", "2", "1", 'Y'));
        Befriendeds.add(new Befriended("1", "3", "3", "1", 'Y'));
        Befriendeds.add(new Befriended("1", "4", "4", "1", 'N'));
        Befriendeds.add(new Befriended("1", "5", "5", "1", 'N'));
        Befriendeds.add(new Befriended("1", "6", "6", "1", 'Y'));
        Befriendeds.add(new Befriended("1", "7", "7", "1", 'Y'));
        Befriendeds.add(new Befriended("2", "5", "5", "2", 'Y'));
        Befriendeds.add(new Befriended("2", "6", "6", "2", 'Y'));
        Befriendeds.add(new Befriended("10", "12", "12", "10", 'Y'));
        Befriendeds.add(new Befriended("12", "15", "15", "12", 'Y'));
        Befriendeds.add(new Befriended("15", "16", "16", "15", 'Y'));
        Befriendeds.add(new Befriended("16", "10", "10", "16", 'Y'));

        CommentPosts.add(new CommentPost(1, "1", "13:03:00", "I went to the mall today", "2"));
        CommentPosts.add(new CommentPost(17, "2", "17:22:23", "How was your day today?", "3"));
        CommentPosts.add(new CommentPost(18, "3", "20:47:11", "Today was a very productive day", "4"));
        CommentPosts.add(new CommentPost(19, "4", "00:27:11", "I am very tired", "1"));
        CommentPosts.add(new CommentPost(20, "5", "12:23:15", "I slept well", "1"));

        Repliess.add(new Replies("2", "3", "1", "2"));
        Repliess.add(new Replies("2", "3", "3", "4"));
        Repliess.add(new Replies("2", "3", "4", "1"));
        Repliess.add(new Replies("4", "1", "5", "1"));

        Professions.add(new Profession("Student"));
        Professions.add(new Profession("Unemployed"));
        Professions.add(new Profession("Teacher"));
        Professions.add(new Profession("Architect"));
        Professions.add(new Profession("Cashier"));
        Professions.add(new Profession("Engineer"));
        Professions.add(new Profession("Backend Developer"));

        HasProfessions.add(new HasProfession("1", "Student"));
        HasProfessions.add(new HasProfession("1", "Cashier"));
        HasProfessions.add(new HasProfession("2", "Unemployed"));
        HasProfessions.add(new HasProfession("3", "Teacher"));
        HasProfessions.add(new HasProfession("4", "Engineer"));
        HasProfessions.add(new HasProfession("5", "Backend Developer"));
    }
}
