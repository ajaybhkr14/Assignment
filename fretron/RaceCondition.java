package com.fretron;

public class RaceCondition implements Runnable{
    int count=0;
    public void increment(){
        try{
            Thread.sleep(10);
        }catch (Exception e){


        }count++;
    }
    public void decrement(){
        count--;
    }
    public int getCount(){
        return count;
    }
    public void run(){
        this.increment();
        System.out.println("result"+Thread.currentThread().getName()+"-"+this.getCount());
        this.decrement();
        System.out.println("result"+Thread.currentThread().getName()+"-"+this.getCount());

    }
public static void main(String g[]){
        RaceCondition a =new RaceCondition();
        Thread t1 =new Thread(a,"T1");
        Thread t2 =new Thread(a,"T2");
        t1.start();
        t2.start();
}}
