package com.demanmath.dataandalgorithm.data.linkedlist

/*
* @author   deman
* @date     2020/9/2
* 哨兵结点的链表叫带头链表
*/
class LinkedList<T> {
    lateinit var header:Node<T>
    var size:Int = 0

    fun initList(){
        /*init 哨兵模式*/
        header = Node(null)
        header.next = null
        size = 0
    }

    fun addNode(v:T){
        /*尾部插入*/
        var temp:Node<T>? = header
        while (temp?.next!=null){
            temp = temp?.next
        }
        val e = Node(v)
        temp?.next = e
        e.next = null
        size++
    }

    fun deleteNode(v:T):Boolean{
        var temp:Node<T>? = header.next
        var preNode:Node<T>? = header
        var flag = false
        loop@ while (temp!=null) {
            temp.value?.let {
                if(it == v){
                    /*find value*/
                    preNode?.next = preNode?.next?.next
                    flag = true
                    --size
                    return true
                }
            }
            preNode = temp
            temp = temp.next
        }
        return false
    }

    fun getItem(index:Int):T?{
        require(index>=0){"index is wrong:$index"}
        var temp:Node<T>? = header.next
        var a = 0
        while(a<=index&& temp!=null){
            a++
            temp = temp.next
        }
        return temp?.value
    }

    fun dumpList():String{
        var temp = header.next
        var stringBuilder = StringBuilder()
        while (temp!=null){
            stringBuilder.append("${temp.value}\t")
            temp = temp.next
        }
        return stringBuilder.toString()
    }

}