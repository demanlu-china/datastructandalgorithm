package com.demanmath.dataandalgorithm.data.linkedlist

/*
* @author   deman
* @date     2020/9/2
*/
class Node<T>(var value:T?) {
    var next:Node<T>? = null

    fun dumpList():String{
        var stringBuilder = StringBuilder()
        stringBuilder.append("${this.value} ")
        var temp = this.next
        while (temp!=null){
            stringBuilder.append("${temp.value} ")
            temp = temp.next
        }
        return stringBuilder.toString()
    }
}