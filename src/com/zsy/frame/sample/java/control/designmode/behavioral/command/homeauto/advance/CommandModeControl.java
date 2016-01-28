package com.zsy.frame.sample.java.control.designmode.behavioral.command.homeauto.advance;

import java.util.Stack;

/**
 * //     定义请求发送者   命令封装
 */
public class CommandModeControl implements Control {
  private Command[] onCommands;
  private Command[] offCommands;
  private Stack<Command> stack = new Stack<Command>();

  public CommandModeControl() {
    onCommands = new Command[5];
    offCommands = new Command[5];

    Command noCommand = new NoCommand();

    for (int i = 0, len = onCommands.length; i < len; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  @Override public void onButton(int slot) {
    onCommands[slot].execute();
    stack.push(onCommands[slot]);
  }

  @Override public void offButton(int slot) {
    offCommands[slot].execute();
    stack.push(offCommands[slot]);
  }

  @Override public void undoButton() {
    stack.pop().undo();
  }
}
