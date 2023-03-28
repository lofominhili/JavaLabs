package com.lofominhili.labOOAP_1;

public class Window {
    private State state;
    private final String location;


    public Window(String location) {
        this.location = location;
        this.state = State.CLOSED;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void open() {
        state = State.OPEN;
        System.out.println(location + " window is open");
    }

    public void openOnVentilation() {
        state = State.OPENONVENTILATION;
        System.out.println(location + " window is open on ventilation");
    }

    public void close() {
        state = State.CLOSED;
        System.out.println(location + " window is closed");
    }

}
