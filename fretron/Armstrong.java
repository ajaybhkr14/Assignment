package com.fretron;

public class Armstrong {

    public static void main(String ag[]){
    int x=371;
    int y=x,z=0;
        while (y!=0){
            int digit=(y%10);
            int p=digit;
            for(int i=1;i<3;i++){
            p=p*digit;}
            z=z+p;
            y=y/10;
        }
        System.out.println(z==x);
    }
}
