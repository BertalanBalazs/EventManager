package com.codecool.eventManager.employees;

import com.codecool.eventManager.Event;

public class Helper extends Employee {
    int actionTimer;

    public void onEvent(Event event){
        isFree = false;
        switch (event) {
            case WEDDING:
                wedding();
                break;
            case CONFERENCE:
                conference();
                break;
            case COCKTAILPARTY:
                cocktailParty();
                break;
        }
    }

    private void cocktailParty() {

    }

    private void conference() {
    }

    private void wedding() {
    }

    private void smoke(){
        System.out.println("Cigi gigi.");
    }

    private void drinkCoffe(){
        System.out.println("Gigi a francia ágyba Whisky.");
    }

}
