package com.codecool.eventManager;

public enum Event {
    COCKTAILPARTY(5),
    WEDDING(8),
    CONFERENCE(10);

    private int lengh;

    Event(final int length) {
        this.lengh = length;
    }

    public int getLengh() {
        return lengh;
    }
}
