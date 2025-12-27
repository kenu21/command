package keniu;

import keniu.commands.*;
import keniu.receivers.Fan;
import keniu.receivers.Light;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();

        RemoteControl remoteControl = new RemoteControl(4);
        remoteControl.setCommand(0, new LightOnCommand(light));
        remoteControl.setCommand(1, new LightOffCommand(light));
        remoteControl.setCommand(2, new FanOnCommand(fan));
        remoteControl.setCommand(3, new FanOffCommand(fan));

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);
    }
}
