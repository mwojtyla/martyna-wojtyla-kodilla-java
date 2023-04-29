package com.kodilla.knight;

public class Knight {
    private Quest quest;

    public Knight(Quest quest){
        this.quest = quest;
    }

    public void operation() {
        this.quest.process();
    }
}