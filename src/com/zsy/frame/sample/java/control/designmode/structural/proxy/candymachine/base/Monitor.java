package com.zsy.frame.sample.java.control.designmode.structural.proxy.candymachine.base;

import java.util.ArrayList;

/**
 * 本地糖果机用观察者模式可以处理
 */
public class Monitor {
  private ArrayList<CandyMachine> candyMachinelst;

  public Monitor() {
    candyMachinelst = new ArrayList<CandyMachine>();
  }

  public void addMachine(CandyMachine mCandyMachine) {
    candyMachinelst.add(mCandyMachine);
  }

  public void report() {
    CandyMachine mCandyMachine;
    for (int i = 0, len = candyMachinelst.size(); i < len; i++) {
      mCandyMachine = candyMachinelst.get(i);
      System.out.println("Machine Loc:" + mCandyMachine.getLocation());
      System.out.println("Machine Candy count:" + mCandyMachine.getCount());
      System.out.println("Machine State:" + mCandyMachine.getstate().getstatename());
    }
  }
}
