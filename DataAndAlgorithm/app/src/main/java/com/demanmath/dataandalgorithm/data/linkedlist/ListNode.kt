package com.demanmath.dataandalgorithm.data.linkedlist

/*
* @author   deman
* @date     2020/9/2
*/
class ListNode<T>(var `val`:T?) {
    var next:ListNode<T>? = null

    fun dumpList():String{
        var stringBuilder = StringBuilder()
        stringBuilder.append("${this.`val`} ")
        var temp = this.next
        while (temp!=null){
            stringBuilder.append("${temp.`val`} ")
            temp = temp.next
        }
        return stringBuilder.toString()
    }

    fun addEnd(value:T):ListNode<T>{
        val node = ListNode(value)
        node.next = null
        this.next = node
        return node
    }
}