package com.zsy.frame.sample.java.control.designmode.creational.prototype.weekly.base;

class WeeklyLog implements Cloneable {

  private String name;

  private String date;

  private String content;

  public void setName(String name) {

    this.name = name;
  }

  public void setDate(String date) {

    this.date = date;
  }

  public void setContent(String content) {

    this.content = content;
  }

  public String getName() {

    return (this.name);
  }

  public String getDate() {

    return (this.date);
  }

  public String getContent() {

    return (this.content);
  }

  //克隆方法clone()，此处使用Java语言提供的克隆机制

  public WeeklyLog clone() {
    Object obj = null;
    try {
      obj = super.clone();
      return (WeeklyLog) obj;
    } catch (CloneNotSupportedException e) {
      System.out.println("不支持复制！");
      return null;
    }
  }
}