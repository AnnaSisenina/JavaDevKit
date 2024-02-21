package Lecture5.HW;

import java.util.concurrent.atomic.AtomicBoolean;


public class Fork {
    private int number ;
    public volatile AtomicBoolean state;

    public Fork(int number) {
        this.number = number;
        this.state = new AtomicBoolean(true);
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Fork " + number;
    }
}
