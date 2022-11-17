package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(001,"Jan Kowalski", 'M',1990,6,10,0));
        usersList.add(new ForumUser(002,"Tomasz Nowak", 'M',2004,12,7,41));
        usersList.add(new ForumUser(003,"Joanna Kowalska", 'F',1999,1,11,80));
        usersList.add(new ForumUser(004,"Iwona Nowakowska", 'F',1988,5,1,33));
        usersList.add(new ForumUser(005,"Piotr Piotrowski", 'M',2000,9,22,50));
    }
    public List<ForumUser> getUsersList(){
    return new ArrayList<>(usersList);
    }
}
