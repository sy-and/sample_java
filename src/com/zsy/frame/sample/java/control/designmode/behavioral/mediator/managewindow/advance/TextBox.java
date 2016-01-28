package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.advance;

//文本框类：具体同事类
class TextBox extends Component {
  public void update() {
    System.out.println("客户信息增加成功后文本框清空。");
  }

  public void setText() {
    System.out.println("文本框显示：小龙女。");
  }
}  