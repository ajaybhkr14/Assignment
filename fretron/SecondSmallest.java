package com.fretron;
// Problem : To find the second smallest number in the array
/*
* Solution Approach:  Min array length should be 2 else there will be no second smallest number
* Two ways to solve :
* 1> Sort the given array in ascending array the second element will be the second smallest but if second element is
* equal to first element then the next element will be the second smallest
* 2> take 2 variables(x,y in s1 we will store smallest element and in s2 we will store 2nd smalest) assign first element of the array to both variables then traverse the whole array and check if
* the next element in array is smaller then the s1 then we will store value of s1 into s2 and value of that element in
* s1 .
* but if value of element at first element in array is the smallest then we will assign the next element value to s2
* then we have to check if there is any element which is greater then s1 and smaller then s2
* */
public class SecondSmallest {
    int secondSmallest(int ar[]){
        int s1=ar[0];
        int s2=ar[0];
        for(int i = 0 ;i<ar.length;i++){
            if(s1>=s2){
                s2=ar[i];
            }
            if(ar[i]<s1){
                s2=s1;
                s1=ar[i];
            }else if(ar[i]<s2){
                s2=ar[i];
            }
        }

        return s2;
    }
    public static void main(String ag[]){
        int ar[] = {1,2,3,4,5,6,7,-1};
       SecondSmallest a = new SecondSmallest();
       if(ar.length>1) {
           System.out.println(a.secondSmallest(ar));
           System.out.println(a.secondSmallest2(ar));
       }else{
           System.out.println("Length of array should be greater than 1");
       }
    }
    int secondSmallest2(int ar[]){
        BubbleSort x= new BubbleSort();
        x.sort(ar);
        int i=1;
        while(ar[0]==ar[i] && i<ar.length){
            i++;
        }
        return ar[i];
    }
}
