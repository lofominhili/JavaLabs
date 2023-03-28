package com.lofominhili.labOOAP_1.WindowService;

import com.lofominhili.labOOAP_1.Command;
import com.lofominhili.labOOAP_1.Window;
import com.lofominhili.labOOAP_1.State;

public class WindowCloseCommand implements Command {

    private final Window window;
    private State prevState;

    private State undoState;

    public WindowCloseCommand(Window window) {
        this.window = window;
    }
    @Override
    public void execute() {
        prevState = window.getState();
        window.close();
    }

    @Override
    public void undo() {
        switch (prevState){
            case OPEN:{
                undoState = prevState;
                window.open();
                break;
            }
            case OPENONVENTILATION:{
                undoState = prevState;
                window.openOnVentilation();
                break;
            }
            case CLOSED:{
                undoState = prevState;
                window.close();
                break;
            }
        }
    }

    @Override
    public void redo() {
        switch (undoState){
            case OPEN:{
                prevState = undoState;
                window.open();
                break;
            }
            case OPENONVENTILATION:{
                prevState = undoState;
                window.openOnVentilation();
                break;
            }
            case CLOSED:{
                prevState = undoState;
                window.close();
                break;
            }
        }
    }
}
