package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.instructions;

//语句命令节点类：非终结符表达式
class CommandNode extends Node {
  private Node node;

  public void interpret(Context context) {
    //处理LOOP循环命令
    if (context.currentToken().equals("LOOP")) {
      node = new LoopCommandNode();
      node.interpret(context);
    }
    //处理其他基本命令
    else {
      node = new PrimitiveCommandNode();
      node.interpret(context);
    }
  }

  public void execute() {
    node.execute();
  }
}  