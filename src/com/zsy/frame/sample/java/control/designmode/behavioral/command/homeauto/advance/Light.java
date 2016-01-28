package com.zsy.frame.sample.java.control.designmode.behavioral.command.homeauto.advance;

public class Light {

  String loc = "";

  public Light(String loc) {
    this.loc = loc;
  }

  public void On() {

    System.out.println(loc + " On");
  }

  public void Off() {

    System.out.println(loc + " Off");
  }
}
