package com.demanmath.dataandalgorithm.data.linkedlist

/*
* @author   deman
* @date     2020/9/2
* 哨兵结点的链表叫带头链表
*/
class LinkedList<T> {
    lateinit var header:ListNode<T>
    var size:Int = 0

    fun initList(){
        /*init 哨兵模式*/
        header = ListNode(null)
        header.next = null
        size = 0
    }

    fun addNode(v:T){
        /*尾部插入*/
        var temp:ListNode<T>? = header
        while (temp?.next!=null){
            temp = temp?.next
        }
        val e = ListNode(v)
        temp?.next = e
        e.next = null
        size++
    }

    fun deleteNode(v:T):Boolean{
        var temp:ListNode<T>? = header.next
        var preListNode:ListNode<T>? = header
        var flag = false
        loop@ while (temp!=null) {
            temp.`val`?.let {
                if(it == v){
                    /*find value*/
                    preListNode?.next = preListNode?.next?.next
                    flag = true
                    --size
                    return true
                }
            }
            preListNode = temp
            temp = temp.next
        }
        return false
    }

    fun getItem(index:Int):T?{
        require(index>=0){"index is wrong:$index"}
        var temp:ListNode<T>? = header.next
        var a = 0
        while(a<=index&& temp!=null){
            a++
            temp = temp.next
        }
        return temp?.`val`
    }

    fun dumpList():String{
        var temp = header.next
        var stringBuilder = StringBuilder()
        while (temp!=null){
            stringBuilder.append("${temp.`val`}\t")
            temp = temp.next
        }
        return stringBuilder.toString()
    }

}