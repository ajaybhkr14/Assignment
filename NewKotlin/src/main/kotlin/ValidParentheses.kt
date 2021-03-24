/*
* Problem:Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
*  determine if the input string is valid.
*Solution Approach: we first convert the string to char array(charList) and iterate the charList when starting
* parentheses occurs or '{' we add that to new list till ending parentheses comes thats when we remove that from the
* list if removing element is counter part of the latest parentheses then the string is valid .
*
* */

class ValidParentheses {

fun valid(input : String): Boolean{
    var list = mutableListOf<Char>()
    var charlist = input.toCharArray()
    var j=0//for list iteration
    for(i in 0..input.length-1){
        if(charlist[i]=='{' ||charlist[i]=='(' ||charlist[i]=='['){
            if(i==input.length-1){//if the last element is the starting of parentheses then the string will be invalid.
                return false
            }
            list.add(charlist[i])
            j++
        }
        else {
            j--
            if(charlist[i]=='}'){
                if(list[j]!='{'){
                    return false
                }
            }else if(charlist[i]==']'){
                if(list[j]!='['){
                    return false
                }
            }else { if(list[j]!='('){
                return false
            }
            }
            list.removeAt(j)
        }
    }
    return true
}

}