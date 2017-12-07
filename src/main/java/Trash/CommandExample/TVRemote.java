package Trash.CommandExample;

import Trash.CommandExample.Entitie.Television;
import Trash.CommandExample.Interface.ElectronicDevice;

public class TVRemote {

    public static ElectronicDevice getDevice(){
        return new Television();
    }

}
