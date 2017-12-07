package Trash.CommandExample;

import Trash.CommandExample.Interface.Command;

public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void press(){
        theCommand.execute();
    }

    public void pressUndu(){
        theCommand.undo();
    }
}
