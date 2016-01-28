package com.zsy.frame.sample.java.control.designmode.creational.factory.simplefactory.chart;

//饼状图类：具体产品类
class PieChart implements Chart {  
    public PieChart() {  
        System.out.println("创建饼状图！");  
    }  
      
    public void display() {  
        System.out.println("显示饼状图！");  
    }  
}  