package com.kodilla.good.patterns.challenges;

public class User {
    private String Name;
    private String Surname;

    public User(final String userName, final String userSurname) {
        this.Name = userName;
        this.Surname = userSurname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setName(String userName) {
        this.Name = userName;
    }

    public void seturname(String userSurname) {
        this.Surname = userSurname;
    }
}
