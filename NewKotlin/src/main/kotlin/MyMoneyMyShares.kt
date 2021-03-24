import java.util.Scanner
/*
* Problem:My Money My SharesRam , sham and rahim went shopping for apples. Theyboughtapples worth 100 rupees.
*  Ram paid 50 rupees, shampaid 30rupees  and rahim paid 20 rupees. Each apple is taggedwith itsweight on it.
* Write a program to distribute applessuch that thequantity of apple they get is in best proportionateto the
* amountthey paid.Note : you cannot cut an apple into pieces and haveto allocatethe whole apple to one of them.
* For example :If there is 8 apple  of  400g , 100g  , 400g , 300g, 200g , 300g ,100g ,200g  then we can distribute
*  them asRam :  400g , 400g , 200g  (total 1kg , 50%)Sham :  300g , 300g (tatal 600g , 30%)rahim , 200g , 100g , 100g (tatal 400g , 20%)Expected program output :run distribute_appleEnter apple weight in gram (-1 to stop ) :
*  400Enter apple weight in gram (-1 to stop ) :  100
* Enter apple weight in gram (-1 to stop ) :
* 400Enter apple weight in gram (-1 to stop ) :  300
* Enter apple weight in gram (-1 to stop ) :
* 200Enter apple weight in gram (-1 to stop ) :  300
* Enter apple weight in gram (-1 to stop ) :
* 100Enter apple weight in gram (-1 to stop ) :  200
* Enter apple weight in gram (-1 to stop ) :  -1
Distribution Result :Ram : 400, 400, 200Sham : 300 , 300Rahim  : 200 , 100 , 1002.
*
* Solution Approach: first we will sort the list in descending order in order to give apples to person
* with bigger share (because it will be difficult or impossible to give bigger size apple to person with
* smaller share )
* first will allot the apples to the person with bigger share by traversing the list (0-end)and adding the apples in the
* person's list till it becomes full or till the list ends and we replaces the list item to 0 which is been added
* to the person's list
*
* */
class MyMoneyMyShares {
   fun Shares(){
       var AppleList = mutableListOf<Int>()
       val ram =50
       val sham =30
       val rahim =20
       var Ram = mutableListOf<Int>()
       var Sham = mutableListOf<Int>()
       var Rahim = mutableListOf<Int>()
       val input = Scanner(System.`in`)
       var y = input.nextInt()
       var sum =0
       while(y!=-1){
        AppleList.add(y)
        sum+=y
        y= input.nextInt()
       }
       AppleList.sortDescending()
       var r=0
       var s=0
       var r1=0
       for(i in 0..(AppleList.size-1)){
           if(r+AppleList[i]<=(ram*sum)/100 && AppleList[i]!=0){
               r=r+AppleList[i]
               Ram.add(AppleList[i])
               AppleList.set(i,0)
           }
       }
       for(i in 0..(AppleList.size-1)){
           if(s+AppleList[i]<=(sham*sum)/100 && AppleList[i]!=0){
               s=s+AppleList[i]
               Sham.add(AppleList[i])
               AppleList.set(i,0)
           }
       }
       for(i in 0..(AppleList.size-1)){
           if(r1+AppleList[i]<=(rahim*sum)/100 && AppleList[i]!=0){
               r1=r1+AppleList[i]
               Rahim.add(AppleList[i])
               AppleList.set(i,0)
           }
       }
       println(Ram)
       println(Sham)
       println(Rahim)
   }
}