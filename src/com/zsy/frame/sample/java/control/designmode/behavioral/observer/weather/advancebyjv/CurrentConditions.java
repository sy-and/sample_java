package com.zsy.frame.sample.java.control.designmode.behavioral.observer.weather.advancebyjv;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {
  private float mTemperatrue;
  private float mPressure;
  private float mHumidity;

  @Override public void update(Observable arg0, Object arg1) {
    //        用观察者类传递数据
    this.mTemperatrue = ((WeatherData.Data) (arg1)).mTemperatrue;
    this.mPressure = ((WeatherData.Data) (arg1)).mPressure;
    this.mHumidity = ((WeatherData.Data) (arg1)).mHumidity;
    display();
  }

  public void display() {
    System.out.println("***Today mTemperatrue:" + mTemperatrue + "***");
    System.out.println("***Today mPressure:" + mPressure + "***");
    System.out.println("***Today mHumidity:" + mHumidity + "***");
  }
}
