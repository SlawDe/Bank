package Trash.CommandExample.Command;

import Trash.CommandExample.Interface.Command;
import Trash.CommandExample.Interface.ElectronicDevice;

import java.util.List;

public class TurnAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnAllOff(List<ElectronicDevice> theDevices) {
        this.theDevices = theDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : theDevices){
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : theDevices){
            device.on();
        }
    }
}
