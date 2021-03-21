package com.fretron;
/*
* Problem: What are threads and implement race conditions in java
* Solution : In race condition when two or more threads access the same resource at same time and make changes
* to it this will effect the overall operation.In this program we are taking a count variable and two threads
* will be created which will manipulate this variable by using sleep method we will add delay.
* */
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
