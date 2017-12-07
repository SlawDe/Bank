package Trash.CommandExample.Command;

import Trash.CommandExample.Interface.Command;
import Trash.CommandExample.Interface.ElectronicDevice;

public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
