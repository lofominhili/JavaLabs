package com.lofominhili.labOOAP_1;

import java.util.ArrayList;

public class RemoteController {
    ArrayList<Command> commands;
    ArrayList<Command> undo;
    ArrayList<Command> redo;

    public RemoteController() {
        commands = new ArrayList<>();
        undo = new ArrayList<>();
        redo = new ArrayList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
}

    public void buttonWasPushed(int slot) {
        commands.get(slot).execute();
        undo.add(commands.get(slot));
    }

    public void undoButtonWasPushed(){
        undo.get(undo.size()-1).undo();
        redo.add(undo.get(undo.size()-1));
        undo.remove(undo.size()-1);
    }

    public void redoButtonWasPushed(){
        redo.get(0).redo();
        undo.add(redo.get(0));
        redo.remove(0);
    }
}
