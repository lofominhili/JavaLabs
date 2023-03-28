package com.lofominhili.labOOAP_1;

import com.lofominhili.labOOAP_1.WindowService.WindowCloseCommand;
import com.lofominhili.labOOAP_1.WindowService.WindowOpenCommand;
import com.lofominhili.labOOAP_1.WindowService.WindowOpenOnVentilationCommand;

public class TestService {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Window window = new Window("Kitchen");
        WindowOpenCommand windowOpenCommand = new WindowOpenCommand(window);
        WindowCloseCommand windowCloseCommand = new WindowCloseCommand(window);
        WindowOpenOnVentilationCommand windowOpenOnVentilationCommand = new WindowOpenOnVentilationCommand(window);
        remoteController.setCommand(windowOpenCommand);
        remoteController.setCommand(windowOpenOnVentilationCommand);
        remoteController.setCommand(windowCloseCommand);

        remoteController.buttonWasPushed(0);
        remoteController.buttonWasPushed(1);
        remoteController.buttonWasPushed(2);
        System.out.println("---------------------");
        remoteController.undoButtonWasPushed();
        System.out.println("---------------------");
        remoteController.undoButtonWasPushed();
        System.out.println("---------------------");
        remoteController.redoButtonWasPushed();

    }
}
