package keniu;

import keniu.commands.Command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl(int size) {
        this.commands = new Command[size];
    }

    public void pressButton(int slot) {
        commands[slot].execute();
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }
}
