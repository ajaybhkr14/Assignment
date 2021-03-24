/*
* Problem: Reverse integer
* */

class ReverseInteger {

    fun reverse(number: Int):Int{
        var rev =0
        var x =number
        while(x!=0){
            rev=rev*10+x%10
            x /= 10
        }
        return rev
    }
}