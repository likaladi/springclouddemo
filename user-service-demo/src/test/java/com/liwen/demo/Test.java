package com.liwen.demo;

import java.util.Timer;
import java.util.TimerTask;

public class Test {
    public static  int count = 0;
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("------oooo>--------"+count);
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                count++;
                System.out.println("-------延迟5000毫秒，每1000毫秒执行一次--------"+count);
            }
        }, 500, 1000);

        System.out.println("999");
    }
}
